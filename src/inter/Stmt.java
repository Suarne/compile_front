package inter;

public class Stmt extends Node {
    public Stmt() { }

    public static Stmt Null = new Stmt();
    // 调用时的参数是语句开始处的标号和语句的下一条指令的标号
    public void gen(int a, int b) { }
    // 保存语句的下一条指令的标号
    int after = 0;
    // 用于break语句
    public static Stmt Enclosing = Stmt.Null;
}
