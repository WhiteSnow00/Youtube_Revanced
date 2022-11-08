// 
// Decompiled by Procyon v0.6.0
// 

public final class abgs extends abgr
{
    private final aepj g;
    
    public abgs(final String s, final aepj g, final byte[] array, final byte[] array2) {
        super("$N", 0, s, 0L);
        this.g = g;
    }
    
    public final int a(long m) {
        final Object a = ((agjt)this.g.a).a;
        if (a != null) {
            m = ((abta)a).m(m);
        }
        else {
            m = -1L;
        }
        return (int)m;
    }
    
    public final int c() {
        final Object a = ((agjt)this.g.a).a;
        long m;
        if (a != null) {
            m = ((abta)a).m(((abta)a).s().o().h);
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
