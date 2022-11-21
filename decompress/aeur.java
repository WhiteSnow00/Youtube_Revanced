// 
// Decompiled by Procyon v0.6.0
// 

public final class aeur implements aevl
{
    public final aevl a;
    public final aevl b;
    public final aevk c;
    public final agnl d;
    
    public aeur(final agnl d, final aevl a, final aevl b, final aevk c, final byte[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void close() {
        final agnl d = this.d;
        final aevl a = this.a;
        final aevl b = this.b;
        final aevk c = this.c;
        a.close();
        final Object a2 = d.a;
        if (a2 != null) {
            ((aevl)a2).close();
        }
        if (b != null) {
            b.close();
        }
        aewp.n(c);
    }
}
