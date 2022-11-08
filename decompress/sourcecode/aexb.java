import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexb
{
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    
    static {
        a = Charset.forName("US-ASCII");
        b = Charset.forName("ISO-8859-1");
        c = Charset.forName("UTF-8");
        Charset.forName("UTF-16BE");
        d = Charset.forName("UTF-16LE");
        e = Charset.forName("UTF-16");
    }
}
