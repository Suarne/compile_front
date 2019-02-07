package inter;

import lexer.Token;
import symbols.Type;

// 实现双目算术运算符
public class Arith extends Op{
    public Expr expr1, expr2;

    public Arith(Token tok, Expr x1, Expr x2) {
        super(tok, null);
        expr1 = x1; expr2 = x2;
        type = Type.max(expr1.type, expr2.type);
        if (type == null)
            error("type error!");
    }
    // 生成一个项，生成一个指令把这个项赋值给一个新的临时名字，并返回该临时名字
    // 把表达式归约为地址，并将表达式的运算符作用于这些地址，从而构造出一个三地址指令的右部
    public Expr gen() {
        return new Arith(op, expr1.reduce(), expr2.reduce());
    }

    public String toString() {
        return expr1.toString() +" " + op.toString() + " " + expr2.toString();
    }
}
