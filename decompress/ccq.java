// 
// Decompiled by Procyon v0.6.0
// 

final class ccq extends axk
{
    final ccr b;
    
    public ccq(final ccr b, final int n, final int n2, final int n3, final String s) {
        this.b = b;
        super(n, n2, n3, s);
    }
    
    @Override
    public final void b(final int n) {
        this.b.c.j.post((Runnable)new ccp(this, n, 2));
    }
    
    @Override
    public final void c(final int n) {
        this.b.c.j.post((Runnable)new ccp(this, n, 0));
    }
}
