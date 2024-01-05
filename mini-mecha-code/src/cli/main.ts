import type { Model } from "../language/generated/ast.js";
import chalk from "chalk";
import { Command } from "commander";
import { MiniMechaCodeLanguageMetaData } from "../language/generated/module.js";
import { createMiniMechaCodeServices } from "../language/mini-mecha-code-module.js";
import { extractAstNode } from "./cli-util.js";
import { generateArduinoCode } from "./generator.js";
import { NodeFileSystem } from "langium/node";
import * as url from "node:url";
import * as fs from "node:fs/promises";
import * as path from "node:path";
const __dirname = url.fileURLToPath(new URL(".", import.meta.url));

const packagePath = path.resolve(__dirname, "..", "..", "package.json");
const packageContent = await fs.readFile(packagePath, "utf-8");

export const generateAction = async (
  fileName: string,
  opts: GenerateOptions,
): Promise<void> => {
  const services = createMiniMechaCodeServices(NodeFileSystem).MiniMechaCode;
  const model = await extractAstNode<Model>(fileName, services);
  const generatedFilePath = generateArduinoCode(
    model,
    fileName,
    opts.destination,
  );
  console.log(
    chalk.green(`Arduino code generated successfully: ${generatedFilePath}`),
  );
};

export type GenerateOptions = {
  destination?: string;
};

export default function (): void {
  const program = new Command();

  program.version(JSON.parse(packageContent).version);

  const fileExtensions =
    MiniMechaCodeLanguageMetaData.fileExtensions.join(", ");
  program
    .command("generate")
    .argument(
      "<file>",
      `source file (possible file extensions: ${fileExtensions})`,
    )
    .option("-d, --destination <dir>", "destination directory of generating")
    .description("generates Arduino code")
    .action(generateAction);

  program.parse(process.argv);
}
