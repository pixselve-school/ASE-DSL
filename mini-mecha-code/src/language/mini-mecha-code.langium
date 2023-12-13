grammar MiniMechaCode
import 'Terminals'
import 'types'

entry Model returns Model:
    {Model} functions+=DefFunction*
;

Statement returns Statement:
    DefVariable | Loop | FunctionCall | Rotate | Forward | VarAssignment
;

VarAssignment returns VarAssignment:
    ref=[DefVariable:ID] '=' value=Expression
;

Expression returns Expression:
    PrimaryExpression | Plus | Minus | Multi | Div | Greater | Less | Equal | Or | And | UnitOperator | Convertion | Not | '(' Expression ')'
;

PrimaryExpression returns Expression:
    NumberLitteral | RefVariable | BooleanLitteral | FunctionCall | '(' Expression ')'
;

UnitOperator returns UnitOperator:
    left=PrimaryExpression unit=Unit
;

DefVariable returns DefVariable:
    'var' varType=Type name=ID '=' value=Expression
;

FunctionParameter returns DefVariable:
    varType=Type name=ID
;



NumberLitteral returns NumberLitteral:
    value=NUMBER
;

RefVariable returns RefVariable:
    ref=[DefVariable:ID]
;

BooleanLitteral returns BooleanLitteral:
    value=BOOLEAN
;

DefFunction returns DefFunction:
    'let' returnType=Type name=ID '(' (parameters+=FunctionParameter  ("," parameters+=FunctionParameter  )*)? ')' '{' statements+=Statement* ('return' returnValue=Expression)? '}'
;


Loop returns Loop:
    'loop' condition=Expression '{'  statements+=Statement* '}'
;

Minus returns Minus:
    left=PrimaryExpression '-' right=Expression
;

Multi returns Multi:
    left=PrimaryExpression '*' right=Expression
;

Div returns Div:
    left=PrimaryExpression '/' right=Expression
;

Plus returns Plus:
    left=PrimaryExpression '+' right=Expression
;


Greater returns Greater:
    left=PrimaryExpression '>' right=Expression
;

Less returns Less:
    left=PrimaryExpression '<' right=Expression
;

Equal returns Equal:
    left=PrimaryExpression '==' right=Expression
;

Or returns Or:
    left=PrimaryExpression '|' right=Expression
;

And returns And:
    left=PrimaryExpression '&' right=Expression
;

Not returns Not:
    '!' right=Expression
;

FunctionCall returns FunctionCall:
    ref=[DefFunction:ID] '(' (parameters+=Expression  ("," parameters+=Expression  )*)? ')'
;

Rotate returns Rotate:
    'Clock' angle=Expression
;

Forward returns Forward:
    'Forward' distance=Expression
;

Convertion returns Convertion:
    left=PrimaryExpression 'in' unit=Unit
;

