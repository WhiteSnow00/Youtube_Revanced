import j$.util.Optional;
import android.text.Spanned;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcg
{
    public final Spanned a;
    public final Spanned b;
    public final atjm c;
    public final atjo d;
    public final asht e;
    public final boolean f;
    private final wzz g;
    private boolean h;
    
    public jcg(final Spanned a, final Spanned b, final jcb jcb, final wzz g) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.f = jcb.b();
        final atjm aw = atjm.aW((Object)false);
        this.c = aw;
        this.d = atjo.aa();
        this.e = ((asht)aw).aq((asjr)new iov(this, jcb, 6)).al().aU().d();
    }
    
    final Optional a(final wyw wyw, final boolean b) {
        if (!this.h) {
            if (!b) {
                return Optional.empty();
            }
            wyw.D(this.g);
            this.h = true;
        }
        return Optional.of((Object)this.g);
    }
    
    public final void b() {
        this.c.tu((Object)false);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String string = this.g.toString();
        final boolean f = this.f;
        final StringBuilder sb = new StringBuilder("MessageTransientOverlayModel{title=");
        sb.append(value);
        sb.append(", subtitle=");
        sb.append(value2);
        sb.append(", visualElementContainer=");
        sb.append(string);
        sb.append(", shouldHighlightTimelineWhileShown=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
