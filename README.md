# tiny-compiler

## Grammar
GOAL -> Expr

Expr -> term Expr'

Expr' -> + Term Expr'  | - Term Expr' | e

Term -> Factor Term'

Term' -> x Factor Term'  | / Factor Term'  | e

Factor -> ( Expr ) | num