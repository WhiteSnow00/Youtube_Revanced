// 
// Decompiled by Procyon v0.6.0
// 

public final class acls
{
    private acko a;
    private acko b;
    private long c;
    private Runnable d;
    private Runnable e;
    private Runnable f;
    private Runnable g;
    private int h;
    private int i;
    private int j;
    private int k;
    private byte l;
    
    public final aclt a() {
        if (this.l == 31) {
            final acko a = this.a;
            if (a != null) {
                final acko b = this.b;
                if (b != null) {
                    final Runnable d = this.d;
                    if (d != null) {
                        final Runnable e = this.e;
                        if (e != null) {
                            final Runnable f = this.f;
                            if (f != null) {
                                final Runnable g = this.g;
                                if (g != null) {
                                    return new aclt(a, b, this.c, d, e, f, g, this.h, this.i, this.j, this.k);
                                }
                            }
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" oldPresenter");
        }
        if (this.b == null) {
            sb.append(" newPresenter");
        }
        if ((this.l & 0x1) == 0x0) {
            sb.append(" duration");
        }
        if (this.d == null) {
            sb.append(" oldOnStart");
        }
        if (this.e == null) {
            sb.append(" oldOnEnd");
        }
        if (this.f == null) {
            sb.append(" newOnStart");
        }
        if (this.g == null) {
            sb.append(" newOnEnd");
        }
        if ((this.l & 0x2) == 0x0) {
            sb.append(" fromX");
        }
        if ((this.l & 0x4) == 0x0) {
            sb.append(" fromY");
        }
        if ((this.l & 0x8) == 0x0) {
            sb.append(" toX");
        }
        if ((this.l & 0x10) == 0x0) {
            sb.append(" toY");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final long c) {
        this.c = c;
        this.l |= 0x1;
    }
    
    public final void c(final int h) {
        this.h = h;
        this.l |= 0x2;
    }
    
    public final void d(final int i) {
        this.i = i;
        this.l |= 0x4;
    }
    
    public final void e(final Runnable g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null newOnEnd");
    }
    
    public final void f(final Runnable f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null newOnStart");
    }
    
    public final void g(final acko b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null newPresenter");
    }
    
    public final void h(final Runnable e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null oldOnEnd");
    }
    
    public final void i(final Runnable d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null oldOnStart");
    }
    
    public final void j(final acko a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null oldPresenter");
    }
    
    public final void k(final int j) {
        this.j = j;
        this.l |= 0x8;
    }
    
    public final void l(final int k) {
        this.k = k;
        this.l |= 0x10;
    }
}
