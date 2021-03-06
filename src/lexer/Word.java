package lexer;

// 管理在中间代码中运算符的书写形式
public class Word extends Token {
    public String lexeme = "";
    public Word(String s, int tag) { super(tag); lexeme = s; }
    public String toString() { return lexeme; }
    public static final Word
        and = new Word("&&", Tag.AND ),  or = new Word("||", Tag.OR),
        eq  = new Word("==", Tag.EQ  ),  ne = new Word("!=", Tag.NE),
        le  = new Word("<=", Tag.LE  ),  ge = new Word(">=", Tag.NE),
        minus = new Word("minus", Tag.MINUS ),
        temp  = new Word("t",  Tag.TEMP  ),
        True  = new Word("true",  Tag.TRUE  ),
        False = new Word("false", Tag.FALSE );
}
