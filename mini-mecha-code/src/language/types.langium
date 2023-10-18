
interface Model {
	statements: Statement[]
}

interface Statement {
}

interface Expression extends Statement {
}

interface UnitOperator extends Expression {
	left: Expression
	unit: Unit
}

type Type = 'number' | 'boolean' | 'void';

Type returns Type:
    NumberType | BooleanType | VoidType
;

NumberType returns string:
    'number';
BooleanType returns string:
    'boolean';
VoidType returns string:
    'void';


type Unit = 'mm' | 'cm' | 'm';

Unit returns Unit:
    MmUnit | MUnit | CmUnit
;

MmUnit returns string:
    'mm';
MUnit returns string:
    'cm';
CmUnit returns string:
    'm';

interface VarAssignment extends Statement {
	name: string
	value: Expression
}

interface DefVariable extends Statement {
	name: string
	value: Expression
	varType: Type
}

interface Minus extends MechaMath {
}

interface MechaMath extends BinaryOperator {
}

interface BinaryOperator extends Expression {
	right: Expression
	left: Expression
}

interface Multi extends MechaMath {
}

interface Div extends MechaMath {
}

interface NumberLitteral extends Expression {
	value: number
}

interface Plus extends MechaMath {
}

interface RefVariable extends Expression {
	name: string
}

interface BooleanLitteral extends Expression {
	value: boolean
}

interface DefFunction extends Statement {
	name: string
	returnType: Type
	statements: Statement[]
	parameters: FunctionParameter[]
}

interface FunctionParameter {
	name: string
	^type: Type
}

interface Loop extends Statement {
	condition: Expression
	statements: Statement[]
}

interface Greater extends BooleanOperation {
}

interface BooleanOperation extends BinaryOperator {
}

interface Less extends BooleanOperation {
}

interface Equal extends BooleanOperation {
}

interface Or extends BooleanOperation {
}

interface And extends BooleanOperation {
}

interface Not extends UnaryOperator {
}

interface UnaryOperator extends Expression {
	right: Expression
}

interface FunctionCall extends Expression {
	name: string
	parameters: Expression[]
}

interface Mm extends UnitOperator {
}

interface Cm extends UnitOperator {
}

interface Rotate extends Action {
	angle: Expression
}

interface Action extends Statement {
}

interface Forward extends Action {
	distance: Expression
}

interface Convertion extends Expression {
	left: Expression
	unit: Unit
}
