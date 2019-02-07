package inter;

import symbols.Type;

public class If extends Stmt {
    Expr expr;
    Stmt stmt;

    public If(Expr x, Stmt s) {
        expr = x;
        stmt = s;
        if (expr.type != Type.Bool)
            expr.error("boolean required in if");
    }

    public void gen(int b, int a) {
        int label = newlabel(); // stmt的代码标号
        expr.jumping(0, a);  //  为true时控制流穿越，为false转向a
        emitlabel(label);
        stmt.gen(label, a);
    }
}
