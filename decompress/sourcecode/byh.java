import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

final class byh
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    
    static {
        a = Pattern.compile("\\{([^}]*)\\}");
        b = Pattern.compile(baw.M("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        c = Pattern.compile(baw.M("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        d = Pattern.compile("\\\\an(\\d+)");
    }
}
