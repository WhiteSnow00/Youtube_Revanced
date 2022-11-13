// 
// Decompiled by Procyon v0.6.0
// 

final class ccn extends axj
{
    final cco b;
    
    public ccn(final cco b, final int n, final int n2, final int n3, final String s) {
        this.b = b;
        super(n, n2, n3, s);
    }
    
    public final void b(final int n) {
        this.b.c.j.post((Runnable)new ccm(this, n, 2));
    }
    
    public final void c(final int n) {
        this.b.c.j.post((Runnable)new ccm(this, n, 0));
    }
}
