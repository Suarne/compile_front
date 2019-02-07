package inter;

import lexer.Token;

public class Or extends Logical {
    public Or(Token tok, Expr x1, Expr x2) { super(tok, x1, x2); }
    // 生成一个布尔表达式 B = B1 || B2 的跳转代码
    public void jumping(int t, int f) {
        int label = (t != 0) ? t : newlabel();
        expr1.jumping(label, 0);
        expr2.jumping(t, f);
        if (t == 0) emitlabel(label);
    }
}
