import j$.util.Optional;
import android.text.Spanned;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbh
{
    public final Spanned a;
    public final Spanned b;
    public final atir c;
    public final atit d;
    public final ashe e;
    public final boolean f;
    private final wxz g;
    private boolean h;
    
    public jbh(final Spanned a, final Spanned b, final jbc jbc, final wxz g) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.f = jbc.b();
        final atir ar = atir.aR((Object)false);
        this.c = ar;
        this.d = atit.aa();
        this.e = ((ashe)ar).ak((asjc)new inw(this, jbc, 6)).af().aP().d();
    }
    
    final Optional a(final wwv wwv, final boolean b) {
        if (!this.h) {
            if (!b) {
                return Optional.empty();
            }
            wwv.D(this.g);
            this.h = true;
        }
        return Optional.of((Object)this.g);
    }
    
    public final void b() {
        this.c.tr((Object)false);
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
