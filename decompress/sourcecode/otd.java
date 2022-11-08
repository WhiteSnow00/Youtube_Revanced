// 
// Decompiled by Procyon v0.6.0
// 

public abstract class otd
{
    public abstract void a(final int p0, final String p1, final orz p2, final Throwable p3);
    
    @Deprecated
    public final void b(final int n, final String s) {
        this.a(n, s, orz.a, null);
    }
    
    public final void c(final int n, final String s, final orz orz) {
        this.a(n, s, orz, null);
    }
    
    @Deprecated
    public final void d(final int n, final String s, final Throwable t) {
        this.a(n, s, orz.a, t);
    }
}
