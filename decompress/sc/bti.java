import java.io.EOFException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bti implements bud
{
    private final byte[] a;
    
    public bti() {
        this.a = new byte[4096];
    }
    
    public final int a(final ayb ayb, final int n, final boolean b) {
        return bhq.f((bud)this, ayb, n, b);
    }
    
    public final void b(final ayg ayg) {
    }
    
    public final void c(final bas bas, final int n) {
        bhq.g((bud)this, bas, n);
    }
    
    public final void d(final bas bas, final int n, final int n2) {
        bas.H(n);
    }
    
    public final void e(final long n, final int n2, final int n3, final int n4, final buc buc) {
    }
    
    public final int f(final ayb ayb, int n, final boolean b) {
        n = Math.min(4096, n);
        n = ayb.a(this.a, 0, n);
        if (n != -1) {
            return n;
        }
        if (b) {
            return -1;
        }
        throw new EOFException();
    }
}
