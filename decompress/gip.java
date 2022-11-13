// 
// Decompiled by Procyon v0.6.0
// 

public final class gip
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    
    public gip() {
    }
    
    public gip(final boolean a, final boolean b, final boolean c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static gio a() {
        return new gio();
    }
    
    public static gip b() {
        final gio gio = new gio();
        gio.f(false);
        gio.b(false);
        gio.d(false);
        gio.e(false);
        gio.c(false);
        return gio.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gip) {
            final gip gip = (gip)o;
            if (this.a == gip.a && this.b == gip.b && this.c == gip.c && this.d == gip.d && this.e == gip.e) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.b) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        int n4;
        if (!this.c) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        int n5;
        if (!this.d) {
            n5 = 1237;
        }
        else {
            n5 = 1231;
        }
        if (this.e) {
            n = 1231;
        }
        return ((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final StringBuilder sb = new StringBuilder("PipPlayerViewState{shouldGetRootViewBounds=");
        sb.append(a);
        sb.append(", canEnterPictureInPicture=");
        sb.append(b);
        sb.append(", didPlayerViewSettle=");
        sb.append(c);
        sb.append(", isPlayerViewSettled=");
        sb.append(d);
        sb.append(", canShowPictureInPictureNotification=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
