// 
// Decompiled by Procyon v0.6.0
// 

final class ccm extends axi
{
    final /* synthetic */ ccn b;
    
    public ccm(final ccn b, final int n, final int n2, final int n3, final String s) {
        this.b = b;
        super(n, n2, n3, s);
    }
    
    public final void b(final int n) {
        this.b.c.j.post((Runnable)new ccl(this, n, 2));
    }
    
    public final void c(final int n) {
        this.b.c.j.post((Runnable)new ccl(this, n, 0));
    }
}
