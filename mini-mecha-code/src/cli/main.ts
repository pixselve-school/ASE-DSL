import type { Model } from "../language/generated/ast.js";
import chalk from "chalk";
import { Command } from "commander";
import { MiniMechaCodeLanguageMetaData } from "../language/generated/module.js";
import { createMiniMechaCodeServices } from "../language/mini-mecha-code-module.js";
import { extractAstNode } from "./cli-util.js";
import { generateJavaScript } from "./generator.js";
import { NodeFileSystem } from "langium/node";
import * as url from "node:url";
import * as fs from "node:fs/promises";
import * as path from "node:path";
import { interpretMiniMechaCode } from "../interpretor/interpretor.js";
const __dirname = url.fileURLToPath(new URL(".", import.meta.url));

export const generateAction = async (
  fileName: string,
  opts: GenerateOptions,
): Promise<void> => {
  const services = createMiniMechaCodeServices(NodeFileSystem).MiniMechaCode;
  const model = await extractAstNode<Model>(fileName, services);
  const generatedFilePath = generateJavaScript(
    model,
    fileName,
    opts.destination,
  );
  console.log(
    chalk.green(`JavaScript code generated successfully: ${generatedFilePath}`),
  );
};

export const generateCmds = async (fileName: string): Promise<void> => {
  console.log("Generating commands...");
  const services = createMiniMechaCodeServices(NodeFileSystem).MiniMechaCode;
  const model = await extractAstNode<Model>(fileName, services);
  // directly output these commands to the console
  console.log(interpretMiniMechaCode(model).robot);
};

export type GenerateOptions = {
  destination?: string;
};

export default async function (): Promise<void> {
  const program = new Command();

  const packagePath = path.resolve(__dirname, "..", "..", "package.json");
  const packageContent = await fs.readFile(packagePath, "utf-8");
  const version = JSON.parse(packageContent).version;
  program.version(version);

  const fileExtensions =
    MiniMechaCodeLanguageMetaData.fileExtensions.join(", ");

  program
    .command("generate")
    .argument(
      "<file>",
      `source file (possible file extensions: ${fileExtensions})`,
    )
    .option("-d, --destination <dir>", "destination directory of generating")
    .description(
      'generates JavaScript code that prints "Hello, {name}!" for each greeting in a source file',
    )
    .action(generateAction);

  // generate commands
  program
    .command("generate-cmds")
    .argument(
      "<file>",
      `source file (possible file extensions: ${fileExtensions})`,
    )
    .description(
      "Generates Minilogo drawing commands, suitable for consumption by a simple stack-based drawing machine",
    )
    .action(generateCmds);

  program.parse(process.argv);
}
