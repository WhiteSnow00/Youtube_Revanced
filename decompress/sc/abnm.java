// 
// Decompiled by Procyon v0.6.0
// 

public final class abnm
{
    public static final abnm a;
    private static final abnm d;
    public final abkh b;
    public final int c;
    
    static {
        a = new abnm(1, null);
        d = new abnm(3, null);
    }
    
    private abnm(final int c, final abkh b) {
        this.c = c;
        this.b = b;
    }
    
    public static void a(final tcc tcc, final abkh abkh) {
        tcc.b((Object)null, (Object)new abnm(2, abkh));
    }
    
    public static void b(final tcc tcc) {
        tcc.b((Object)null, (Object)abnm.d);
    }
}
