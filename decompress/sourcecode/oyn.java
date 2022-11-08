import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

final class oyn
{
    public Rect a;
    public Rect b;
    public Integer c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double j;
    private double k;
    private double l;
    private afcr m;
    private short n;
    
    public oyn() {
    }
    
    public final oyo a() {
        if (this.n == 511) {
            final afcr m = this.m;
            if (m != null) {
                return new oyo(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.a, this.b, this.c, m);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.n & 0x1) == 0x0) {
            sb.append(" exposure");
        }
        if ((this.n & 0x2) == 0x0) {
            sb.append(" maxExposure");
        }
        if ((this.n & 0x4) == 0x0) {
            sb.append(" minExposure");
        }
        if ((this.n & 0x8) == 0x0) {
            sb.append(" volume");
        }
        if ((this.n & 0x10) == 0x0) {
            sb.append(" maxVolume");
        }
        if ((this.n & 0x20) == 0x0) {
            sb.append(" minVolume");
        }
        if ((this.n & 0x40) == 0x0) {
            sb.append(" screenShare");
        }
        if ((this.n & 0x80) == 0x0) {
            sb.append(" maxScreenShare");
        }
        if ((this.n & 0x100) == 0x0) {
            sb.append(" minScreenShare");
        }
        if (this.m == null) {
            sb.append(" mtosBuckets");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final double d) {
        this.d = d;
        this.n |= 0x1;
    }
    
    public final void c(final double e) {
        this.e = e;
        this.n |= 0x2;
    }
    
    public final void d(final double k) {
        this.k = k;
        this.n |= 0x80;
    }
    
    public final void e(final double h) {
        this.h = h;
        this.n |= 0x10;
    }
    
    public final void f(final double f) {
        this.f = f;
        this.n |= 0x4;
    }
    
    public final void g(final double l) {
        this.l = l;
        this.n |= 0x100;
    }
    
    public final void h(final double i) {
        this.i = i;
        this.n |= 0x20;
    }
    
    public final void i(final afcr m) {
        if (m != null) {
            this.m = m;
            return;
        }
        throw new NullPointerException("Null mtosBuckets");
    }
    
    public final void j(final double j) {
        this.j = j;
        this.n |= 0x40;
    }
    
    public final void k(final double g) {
        this.g = g;
        this.n |= 0x8;
    }
}
