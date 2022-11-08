// 
// Decompiled by Procyon v0.6.0
// 

public final class gif
{
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private byte f;
    
    public final gig a() {
        if (this.f != 31) {
            final StringBuilder sb = new StringBuilder();
            if ((this.f & 0x1) == 0x0) {
                sb.append(" shouldGetRootViewBounds");
            }
            if ((this.f & 0x2) == 0x0) {
                sb.append(" canEnterPictureInPicture");
            }
            if ((this.f & 0x4) == 0x0) {
                sb.append(" didPlayerViewSettle");
            }
            if ((this.f & 0x8) == 0x0) {
                sb.append(" isPlayerViewSettled");
            }
            if ((this.f & 0x10) == 0x0) {
                sb.append(" canShowPictureInPictureNotification");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new gig(this.a, this.b, this.c, this.d, this.e);
    }
    
    public final void b(final boolean b) {
        this.b = b;
        this.f |= 0x2;
    }
    
    public final void c(final boolean e) {
        this.e = e;
        this.f |= 0x10;
    }
    
    public final void d(final boolean c) {
        this.c = c;
        this.f |= 0x4;
    }
    
    public final void e(final boolean d) {
        this.d = d;
        this.f |= 0x8;
    }
    
    public final void f(final boolean a) {
        this.a = a;
        this.f |= 0x1;
    }
}
