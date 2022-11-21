import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsf
{
    public static final Charset a;
    
    static {
        final Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        a = forName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
