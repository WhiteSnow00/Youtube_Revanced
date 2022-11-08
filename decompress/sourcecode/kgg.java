import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.view.View;
import app.revanced.integrations.patches.HideMixPlaylistsPatch;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgg extends acja
{
    public final Context a;
    public final vax b;
    public final aceo c;
    kgf d;
    public final uyi e;
    private final giz f;
    private final acnj g;
    private final FrameLayout h;
    private final acng i;
    private kgf j;
    private kgf k;
    
    public kgg(final Context a, final aceo c, final giz f, final vax b, final acnj g, final acng i, final uyi e) {
        this.a = a;
        f.getClass();
        this.f = f;
        this.c = c;
        this.b = b;
        this.g = g;
        final FrameLayout h = new FrameLayout(a);
        HideMixPlaylistsPatch.hideMixPlaylists((View)h);
        this.h = h;
        this.i = i;
        this.e = e;
        f.c((View)h);
    }
    
    public final View a() {
        return this.f.a;
    }
    
    public final void c(final acir acir) {
        final kgf d = this.d;
        if (d != null) {
            d.c(acir);
        }
    }
    
    public final int f() {
        return this.a.getResources().getConfiguration().orientation;
    }
    
    final kgf g(final int n) {
        return new kgf(this, this.a, this.c, n, this.f, this.b, this.g, this.i);
    }
}
