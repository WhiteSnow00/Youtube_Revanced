// 
// Decompiled by Procyon v0.6.0
// 

public final class abim extends abil
{
    private final afhd g;
    
    public abim(final String s, final afhd g, final byte[] array, final byte[] array2, final byte[] array3) {
        super("$N", 0, s, 0L);
        this.g = g;
    }
    
    public final int a(long m) {
        final Object a = ((aglu)this.g.a).a;
        if (a != null) {
            m = ((abvb)a).m(m);
        }
        else {
            m = -1L;
        }
        return (int)m;
    }
    
    public final int c() {
        final Object a = ((aglu)this.g.a).a;
        long m;
        if (a != null) {
            m = ((abvb)a).m(((abvb)a).s().o().h);
        }
        else {
            m = -1L;
        }
        return (int)m;
    }
    
    public final int d() {
        return Integer.MAX_VALUE;
    }
}
