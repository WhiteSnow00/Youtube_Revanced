// 
// Decompiled by Procyon v0.6.0
// 

final class gxa
{
    private float a;
    private String b;
    private String c;
    private int d;
    private String e;
    private byte f;
    
    public gxa() {
    }
    
    public final gxb a() {
        if (this.f == 3) {
            final String b = this.b;
            if (b != null) {
                final String c = this.c;
                if (c != null) {
                    final String e = this.e;
                    if (e != null) {
                        return new gxb(this.a, b, c, this.d, e);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.f & 0x1) == 0x0) {
            sb.append(" speed");
        }
        if (this.b == null) {
            sb.append(" animationTitle");
        }
        if (this.c == null) {
            sb.append(" text");
        }
        if ((this.f & 0x2) == 0x0) {
            sb.append(" icon");
        }
        if (this.e == null) {
            sb.append(" contentDescription");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final String b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null animationTitle");
    }
    
    public final void c(final String e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null contentDescription");
    }
    
    public final void d(final int d) {
        this.d = d;
        this.f |= 0x2;
    }
    
    public final void e(final float a) {
        this.a = a;
        this.f |= 0x1;
    }
    
    public final void f(final String c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null text");
    }
}
