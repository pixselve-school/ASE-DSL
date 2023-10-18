grammar MiniMechaCode
import 'Terminals'
import 'types'

entry Model returns Model:
    {Model} statements+=Statement*
;

Statement returns Statement:
    DefVariable | DefFunction | Loop | FunctionCall | Rotate | Forward
;

Expression returns Expression:
    PrimaryExpression | Plus | Minus | Multi | Div | Greater | Less | Equal | Or | And | Mm | Cm | Convertion
;

PrimaryExpression returns Expression:
    NumberLitteral | RefVariable | BooleanLitteral | FunctionCall
;

UnitOperator returns UnitOperator:
    Mm | Cm
;

DefVariable returns DefVariable:
    'var' varType=Type name=ID '=' value=Expression
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


NumberLitteral returns NumberLitteral:
    value=INT
;

RefVariable returns RefVariable:
    name=ID
;

BooleanLitteral returns BooleanLitteral:
    value=BOOLEAN
;

DefFunction returns DefFunction:
    'let' returnType=Type name=ID '(' (parameters+=FunctionParameter  ("," parameters+=FunctionParameter  )*)? ')' '{' statements+=Statement* '}'
;

Loop returns Loop:
    'loop' condition=Expression '{'  statements+=Statement* '}'
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
    name=ID '(' (parameters+=Expression  ("," parameters+=Expression  )*)? ')'
;

Mm returns Mm:
    left=PrimaryExpression 'mm'
;
Cm returns Cm:
    left=PrimaryExpression 'cm'
;

Rotate returns Rotate:
    'Clock' angle=Expression
;

Forward returns Forward:
    'Forward' distance=Expression
;

Convertion returns Convertion:
    left=PrimaryExpression 'in' unit=UnitOperator
;


FunctionParameter returns FunctionParameter:
    type=Type name=ID
;

