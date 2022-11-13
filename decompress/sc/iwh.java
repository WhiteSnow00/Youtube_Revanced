import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwh
{
    public final int a;
    public final ControlsState b;
    public final glm c;
    public final fkr d;
    public final iwi e;
    public final boolean f;
    public final ControlsOverlayStyle g;
    private final String h;
    
    public iwh() {
    }
    
    public iwh(final int a, final ControlsState b, final glm c, final fkr d, final String h, final iwi e, final boolean f, final ControlsOverlayStyle g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static iwg a() {
        final iwg iwg = new iwg();
        iwg.e(fkr.a);
        iwg.b(ControlsState.b());
        iwg.c(0);
        iwg.b = null;
        iwg.a = null;
        iwg.f(iwi.a(0L, 0L, 0L, 0L));
        iwg.c = null;
        iwg.d(false);
        return iwg;
    }
    
    public final iwg b() {
        final iwg iwg = new iwg();
        iwg.e(this.d);
        iwg.f(this.e);
        iwg.c(this.a);
        iwg.a = this.c;
        iwg.b = this.h;
        iwg.b(this.b);
        iwg.c = this.g;
        iwg.d(this.f);
        return iwg;
    }
    
    public final aezp c() {
        return aezp.j((Object)this.c).b((aezf)iny.m);
    }
    
    public final aezp d() {
        return aezp.j((Object)this.c).b((aezf)iny.n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iwh) {
            final iwh iwh = (iwh)o;
            if (this.a == iwh.a && this.b.equals((Object)iwh.b)) {
                final glm c = this.c;
                if (c == null) {
                    if (iwh.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(iwh.c)) {
                    return false;
                }
                if (this.d.equals(iwh.d)) {
                    final String h = this.h;
                    if (h == null) {
                        if (iwh.h != null) {
                            return false;
                        }
                    }
                    else if (!h.equals(iwh.h)) {
                        return false;
                    }
                    if (this.e.equals(iwh.e) && this.f == iwh.f) {
                        final ControlsOverlayStyle g = this.g;
                        final ControlsOverlayStyle g2 = iwh.g;
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
        final glm c = this.c;
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
