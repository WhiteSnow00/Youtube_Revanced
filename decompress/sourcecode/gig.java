// 
// Decompiled by Procyon v0.6.0
// 

public final class gig
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    
    public gig() {
    }
    
    public gig(final boolean a, final boolean b, final boolean c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static gif a() {
        return new gif();
    }
    
    public static gig b() {
        final gif gif = new gif();
        gif.f(false);
        gif.b(false);
        gif.d(false);
        gif.e(false);
        gif.c(false);
        return gif.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gig) {
            final gig gig = (gig)o;
            if (this.a == gig.a && this.b == gig.b && this.c == gig.c && this.d == gig.d && this.e == gig.e) {
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