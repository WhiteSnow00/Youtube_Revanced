import java.io.EOFException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btl implements bug
{
    private final byte[] a;
    
    public btl() {
        this.a = new byte[4096];
    }
    
    public final int a(final ayc ayc, final int n, final boolean b) {
        return bht.h((bug)this, ayc, n, b);
    }
    
    public final void b(final ayh ayh) {
    }
    
    public final void c(final bat bat, final int n) {
        bht.i((bug)this, bat, n);
    }
    
    public final void d(final bat bat, final int n, final int n2) {
        bat.H(n);
    }
    
    public final void e(final long n, final int n2, final int n3, final int n4, final buf buf) {
    }
    
    public final int f(final ayc ayc, int n, final boolean b) {
        n = Math.min(4096, n);
        n = ayc.a(this.a, 0, n);
        if (n != -1) {
            return n;
        }
        if (b) {
            return -1;
        }
        throw new EOFException();
    }
}
