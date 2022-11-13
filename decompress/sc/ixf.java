import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixf
{
    public final boolean a;
    public final boolean b;
    public final abbx c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final ControlsOverlayStyle n;
    public final boolean o;
    public final boolean p;
    
    public ixf() {
    }
    
    public ixf(final boolean a, final boolean b, final abbx c, final boolean d, final boolean e, final boolean f, final boolean g, final boolean h, final boolean i, final boolean j, final boolean k, final boolean l, final boolean m, final ControlsOverlayStyle n, final boolean o, final boolean p16) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ixf) {
            final ixf ixf = (ixf)o;
            if (this.a == ixf.a && this.b == ixf.b && this.c.equals((Object)ixf.c) && this.d == ixf.d && this.e == ixf.e && this.f == ixf.f && this.g == ixf.g && this.h == ixf.h && this.i == ixf.i && this.j == ixf.j && this.k == ixf.k && this.l == ixf.l && this.m == ixf.m && this.n.equals(ixf.n) && this.o == ixf.o && this.p == ixf.p) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        int n2;
        if (!this.b) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        final int hashCode = this.c.hashCode();
        int n3;
        if (!this.d) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        int n4;
        if (!this.e) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        int n5;
        if (!this.f) {
            n5 = 1237;
        }
        else {
            n5 = 1231;
        }
        int n6;
        if (!this.g) {
            n6 = 1237;
        }
        else {
            n6 = 1231;
        }
        int n7;
        if (!this.h) {
            n7 = 1237;
        }
        else {
            n7 = 1231;
        }
        int n8;
        if (!this.i) {
            n8 = 1237;
        }
        else {
            n8 = 1231;
        }
        int n9;
        if (!this.j) {
            n9 = 1237;
        }
        else {
            n9 = 1231;
        }
        int n10;
        if (!this.k) {
            n10 = 1237;
        }
        else {
            n10 = 1231;
        }
        int n11;
        if (!this.l) {
            n11 = 1237;
        }
        else {
            n11 = 1231;
        }
        int n12;
        if (!this.m) {
            n12 = 1237;
        }
        else {
            n12 = 1231;
        }
        final int hashCode2 = this.n.hashCode();
        int n13;
        if (!this.o) {
            n13 = 1237;
        }
        else {
            n13 = 1231;
        }
        int n14;
        if (!this.p) {
            n14 = 1237;
        }
        else {
            n14 = 1231;
        }
        return (((((((((((((((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ hashCode) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ hashCode2) * 1000003 ^ n13) * 1000003 ^ n14;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final String value = String.valueOf(this.c);
        final boolean d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final boolean h = this.h;
        final boolean i = this.i;
        final boolean j = this.j;
        final boolean k = this.k;
        final boolean l = this.l;
        final boolean m = this.m;
        final String value2 = String.valueOf(this.n);
        final boolean o = this.o;
        final boolean p = this.p;
        final StringBuilder sb = new StringBuilder("MidUiModel{isControlsOverlayVisible=");
        sb.append(a);
        sb.append(", isMagicWindowMidUiEduVisible=");
        sb.append(b);
        sb.append(", videoState=");
        sb.append(value);
        sb.append(", isFullscreen=");
        sb.append(d);
        sb.append(", hasNext=");
        sb.append(e);
        sb.append(", hasPrevious=");
        sb.append(f);
        sb.append(", isUserScrubbing=");
        sb.append(g);
        sb.append(", isSeekEDUVisible=");
        sb.append(h);
        sb.append(", isQuickSeekVisible=");
        sb.append(i);
        sb.append(", isFineScrubbingEDUVisible=");
        sb.append(j);
        sb.append(", isFullscreenEngagementViewVisible=");
        sb.append(k);
        sb.append(", isStickyControlsEnabled=");
        sb.append(l);
        sb.append(", isAutonavToggleEnabled=");
        sb.append(m);
        sb.append(", style=");
        sb.append(value2);
        sb.append(", isSingletonVod=");
        sb.append(o);
        sb.append(", isClip=");
        sb.append(p);
        sb.append("}");
        return sb.toString();
    }
}
