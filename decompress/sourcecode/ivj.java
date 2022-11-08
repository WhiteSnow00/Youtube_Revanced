import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivj
{
    public final int a;
    public final ControlsState b;
    public final gle c;
    public final fkk d;
    public final ivk e;
    public final boolean f;
    public final ControlsOverlayStyle g;
    private final String h;
    
    public ivj() {
    }
    
    public ivj(final int a, final ControlsState b, final gle c, final fkk d, final String h, final ivk e, final boolean f, final ControlsOverlayStyle g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static ivi a() {
        final ivi ivi = new ivi();
        ivi.e(fkk.a);
        ivi.b(ControlsState.b());
        ivi.c(0);
        ivi.b = null;
        ivi.a = null;
        ivi.f(ivk.a(0L, 0L, 0L, 0L));
        ivi.c = null;
        ivi.d(false);
        return ivi;
    }
    
    public final ivi b() {
        final ivi ivi = new ivi();
        ivi.e(this.d);
        ivi.f(this.e);
        ivi.c(this.a);
        ivi.a = this.c;
        ivi.b = this.h;
        ivi.b(this.b);
        ivi.c = this.g;
        ivi.d(this.f);
        return ivi;
    }
    
    public final aexq c() {
        return aexq.j(this.c).b((aexg)imx.m);
    }
    
    public final aexq d() {
        return aexq.j(this.c).b((aexg)imx.n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ivj) {
            final ivj ivj = (ivj)o;
            if (this.a == ivj.a && this.b.equals((Object)ivj.b)) {
                final gle c = this.c;
                if (c == null) {
                    if (ivj.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(ivj.c)) {
                    return false;
                }
                if (this.d.equals(ivj.d)) {
                    final String h = this.h;
                    if (h == null) {
                        if (ivj.h != null) {
                            return false;
                        }
                    }
                    else if (!h.equals(ivj.h)) {
                        return false;
                    }
                    if (this.e.equals(ivj.e) && this.f == ivj.f) {
                        final ControlsOverlayStyle g = this.g;
                        final ControlsOverlayStyle g2 = ivj.g;
                        if (g == null) {
                            if (g2 != null) {
                                return false;
                            }
                        }
                        else if (!g.equals(g2)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final gle c = this.c;
        int hashCode2 = 0;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final int hashCode4 = this.d.hashCode();
        final String h = this.h;
        int hashCode5;
        if (h == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = h.hashCode();
        }
        final int hashCode6 = this.e.hashCode();
        int n;
        if (!this.f) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final ControlsOverlayStyle g = this.g;
        if (g != null) {
            hashCode2 = g.hashCode();
        }
        return (((((((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ n) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final String h = this.h;
        final String value4 = String.valueOf(this.e);
        final boolean f = this.f;
        final String value5 = String.valueOf(this.g);
        final StringBuilder sb = new StringBuilder("Model{inlinePlaybackState=");
        sb.append(a);
        sb.append(", controlsState=");
        sb.append(value);
        sb.append(", currentInlineVideo=");
        sb.append(value2);
        sb.append(", playerViewMode=");
        sb.append(value3);
        sb.append(", errorMessage=");
        sb.append(h);
        sb.append(", videoTimes=");
        sb.append(value4);
        sb.append(", isVideoAdPlaying=");
        sb.append(f);
        sb.append(", controlsOverlayStyle=");
        sb.append(value5);
        sb.append("}");
        return sb.toString();
    }
}
