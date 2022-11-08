import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzf implements gzk
{
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final Rect e;
    public long f;
    public long g;
    private final hyc h;
    
    public gzf(final hyc h, final String a, final long d, final int b, final int c, final long f, final long g, final byte[] array, final byte[] array2) {
        this.e = new Rect();
        this.h = h;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = g;
    }
    
    public final long a() {
        return this.d;
    }
    
    public final void b(final long g) {
        this.g = g;
        ((two)this.h.c).n(this.d, g);
    }
    
    public final void c(final long f) {
        this.f = f;
        ((two)this.h.c).o(this.d, f);
    }
}
