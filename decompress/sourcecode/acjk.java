// 
// Decompiled by Procyon v0.6.0
// 

public final class acjk
{
    private acil a;
    private long b;
    private Runnable c;
    private Runnable d;
    private int e;
    private int f;
    private int g;
    private int h;
    private byte i;
    
    public final acjl a() {
        if (this.i == 31) {
            final acil a = this.a;
            if (a != null) {
                final Runnable c = this.c;
                if (c != null) {
                    final Runnable d = this.d;
                    if (d != null) {
                        return new acjl(a, this.b, c, d, this.e, this.f, this.g, this.h);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" presenter");
        }
        if ((this.i & 0x1) == 0x0) {
            sb.append(" duration");
        }
        if (this.c == null) {
            sb.append(" onStart");
        }
        if (this.d == null) {
            sb.append(" onEnd");
        }
        if ((this.i & 0x2) == 0x0) {
            sb.append(" fromX");
        }
        if ((this.i & 0x4) == 0x0) {
            sb.append(" fromY");
        }
        if ((this.i & 0x8) == 0x0) {
            sb.append(" toX");
        }
        if ((this.i & 0x10) == 0x0) {
            sb.append(" toY");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final long b) {
        this.b = b;
        this.i |= 0x1;
    }
    
    public final void c(final int e) {
        this.e = e;
        this.i |= 0x2;
    }
    
    public final void d(final int f) {
        this.f = f;
        this.i |= 0x4;
    }
    
    public final void e(final Runnable d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null onEnd");
    }
    
    public final void f(final Runnable c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null onStart");
    }
    
    public final void g(final acil a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null presenter");
    }
    
    public final void h(final int g) {
        this.g = g;
        this.i |= 0x8;
    }
    
    public final void i(final int h) {
        this.h = h;
        this.i |= 0x10;
    }
}
