import android.view.View;
import app.revanced.integrations.patches.HideMixPlaylistsPatch;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kod extends acja
{
    koc a;
    private final Context b;
    private final giz c;
    private final vax d;
    private final aceo e;
    private final acnj f;
    private final FrameLayout g;
    private final acng h;
    private koc i;
    private koc j;
    
    public kod(final Context b, final aceo e, final giz c, final vax d, final acnj f, final acng h) {
        this.b = b;
        c.getClass();
        this.c = c;
        this.e = e;
        this.d = d;
        this.f = f;
        final FrameLayout g = new FrameLayout(b);
        HideMixPlaylistsPatch.hideMixPlaylists((View)g);
        this.g = g;
        this.h = h;
        c.c((View)g);
    }
    
    public final View a() {
        return this.c.a;
    }
    
    public final void c(final acir acir) {
        final koc a = this.a;
        if (a != null) {
            a.c(acir);
        }
    }
    
    final koc f(final int n) {
        return new koc(this.b, this.e, n, this.c, this.d, this.f, this.h);
    }
}
