grammar MiniMechaCode
import 'Terminals'
import 'ecoreIntro-types'

entry Model returns Model:
    {Model} statements+=Statement  
;

Statement returns Statement:
    DefVariable | DefFunction | Loop | FunctionCall | Rotate | Forward
;

Expression returns Expression:
    Minus | Multi | Div | NumberLitteral | Plus | RefVariable | BooleanLitteral | Greater | Less | Equal | Or | And | Not | FunctionCall | Mm | Cm | Convertion 
;

UnitOperator returns UnitOperator:
    Mm | Cm 
;

DefVariable returns DefVariable:
    'var' varType=Type name=ID '=' value=Expression
;

Minus returns Minus:
    right=Expression '➖' left=Expression
;

Multi returns Multi:
     right=Expression '✖️' left=Expression
;

Div returns Div:
     right=Expression '➗' left=Expression
;

Plus returns Plus:
    right=Expression '➕' left=Expression
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
     right=Expression '>' left=Expression
;

Less returns Less:
    right=Expression '<' left=Expression 
;

Equal returns Equal:
    right=Expression '==' left=Expression 
;

Or returns Or:
    right=Expression '|' left=Expression
;

And returns And:
    right=Expression '&' left=Expression
;

Not returns Not:
    '!' right=Expression
;

FunctionCall returns FunctionCall:
    name=ID '(' (parameters+=Expression  ("," parameters+=Expression  )*)? ')'
;
Mm returns Mm:
    left=Expression 'mm'
;

Cm returns Cm:
    left=Expression 'cm'
;

Rotate returns Rotate:
    'Clock' angle=Expression
;

Forward returns Forward:
    'Forward' distance=Expression
;

Convertion returns Convertion:
    left=Expression 'in' unit=UnitOperator
;


FunctionParameter returns FunctionParameter:
    type=Type name=ID 
;

