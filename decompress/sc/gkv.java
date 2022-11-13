// 
// Decompiled by Procyon v0.6.0
// 

public enum gkv
{
    a("LIGHT", 0, 1, 2), 
    b("DARK", 1, 2, 3);
    
    private static final gkv[] e;
    public final int c;
    public final int d;
    
    private gkv(final String s, final int n, final int c, final int d) {
        this.c = c;
        this.d = d;
    }
    
    public static aezp a(final int n) {
        for (final gkv gkv : values()) {
            if (gkv.c == n) {
                return aezp.k((Object)gkv);
            }
        }
        return (aezp)aeyo.a;
    }
    
    public final String b() {
        final int d = this.d;
        final String av = aefb.av(d);
        if (d != 0) {
            return av;
        }
        throw null;
    }
}
