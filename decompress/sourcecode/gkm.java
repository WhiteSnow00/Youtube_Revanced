// 
// Decompiled by Procyon v0.6.0
// 

public enum gkm
{
    a("LIGHT", 0, 1, 2), 
    b("DARK", 1, 2, 3);
    
    public final int c;
    public final int d;
    
    private gkm(final String s, final int n, final int c, final int d) {
        this.c = c;
        this.d = d;
    }
    
    public static aexq a(final int n) {
        for (final gkm gkm : values()) {
            if (gkm.c == n) {
                return aexq.k((Object)gkm);
            }
        }
        return aewp.a;
    }
    
    public final String b() {
        final int d = this.d;
        final String az = aesy.aZ(d);
        if (d != 0) {
            return az;
        }
        throw null;
    }
}
