import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkz
{
    public boolean a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public byte f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    
    public abkz() {
    }
    
    public abkz(final byte[] array) {
        this.i = Optional.empty();
        this.j = Optional.empty();
    }
    
    public final abla a() {
        if (this.f != 31) {
            final StringBuilder sb = new StringBuilder();
            if ((this.f & 0x1) == 0x0) {
                sb.append(" shouldUseQueuedVideoForNavigation");
            }
            if ((this.f & 0x2) == 0x0) {
                sb.append(" watchNextResponseProcessingDelay");
            }
            if ((this.f & 0x4) == 0x0) {
                sb.append(" watchNextResponseParsingDelay");
            }
            if ((this.f & 0x8) == 0x0) {
                sb.append(" shouldPauseOnLastFrame");
            }
            if ((this.f & 0x10) == 0x0) {
                sb.append(" mediaSessionDisabled");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new abla((xbt)this.g, this.a, this.b, this.c, this.d, this.e, (zfe)this.h, (Optional)this.i, (Optional)this.j);
    }
    
    public final void b(final boolean e) {
        this.e = e;
        this.f |= 0x10;
    }
    
    public final void c(final boolean d) {
        this.d = d;
        this.f |= 0x8;
    }
    
    public final void d(final boolean a) {
        this.a = a;
        this.f |= 0x1;
    }
    
    public final void e() {
        this.c = -1;
        this.f |= 0x4;
    }
    
    public final void f(final int b) {
        this.b = b;
        this.f |= 0x2;
    }
    
    public final void g(final boolean e) {
        this.e = e;
        this.f |= 0x8;
    }
    
    public final void h(final boolean d) {
        this.d = d;
        this.f |= 0x2;
    }
    
    public final void i() {
        this.f |= 0x10;
    }
    
    public final void j(final int c) {
        this.c = c;
        this.f |= 0x4;
    }
    
    public final void k(final int b) {
        this.b = b;
        this.f |= 0x1;
    }
}
