import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbf extends bbd
{
    private final byte[] a;
    private Uri b;
    private int c;
    private int d;
    private boolean e;
    
    public bbf(final byte[] a) {
        boolean b = false;
        super(false);
        if (a.length > 0) {
            b = true;
        }
        dk.f(b);
        this.a = a;
    }
    
    public final int a(final byte[] array, final int n, int min) {
        if (min == 0) {
            return 0;
        }
        final int d = this.d;
        if (d == 0) {
            return -1;
        }
        min = Math.min(min, d);
        System.arraycopy(this.a, this.c, array, n, min);
        this.c += min;
        this.d -= min;
        this.g(min);
        return min;
    }
    
    public final long b(final bbp bbp) {
        this.b = bbp.a;
        this.i(bbp);
        final long g = bbp.g;
        final int length = this.a.length;
        if (g > length) {
            throw new bbm(2008);
        }
        final int c = (int)g;
        this.c = c;
        final int d = length - c;
        this.d = d;
        final long h = bbp.h;
        if (h != -1L) {
            this.d = (int)Math.min(d, h);
        }
        this.e = true;
        this.j(bbp);
        final long h2 = bbp.h;
        if (h2 != -1L) {
            return h2;
        }
        return this.d;
    }
    
    public final Uri c() {
        return this.b;
    }
    
    public final void f() {
        if (this.e) {
            this.e = false;
            this.h();
        }
        this.b = null;
    }
}
