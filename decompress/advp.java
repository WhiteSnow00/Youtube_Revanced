// 
// Decompiled by Procyon v0.6.0
// 

public final class advp
{
    public static final adzu a;
    public final adzu b;
    public final adzu c;
    public final adzu d;
    public final adzu e;
    
    static {
        a = (adzu)new adzs(0.0f);
    }
    
    public advp(final adzu b, final adzu e, final adzu c, final adzu d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static advp a(final advp advp) {
        final adzu b = advp.b;
        final adzu e = advp.e;
        final adzu a = advp.a;
        return new advp(b, e, a, a);
    }
    
    public static advp b(final advp advp) {
        final adzu a = advp.a;
        return new advp(a, a, advp.c, advp.d);
    }
}
