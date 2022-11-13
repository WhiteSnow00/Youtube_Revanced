import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwi
{
    public final List a;
    public final double b;
    private final char c;
    private final String d;
    private final String e;
    
    public cwi(final List a, final char c, final double b, final String d, final String e) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    public static int a(final char c, final String s, final String s2) {
        return (c * '\u001f' + s.hashCode()) * 31 + s2.hashCode();
    }
    
    @Override
    public final int hashCode() {
        return a(this.c, this.e, this.d);
    }
}
