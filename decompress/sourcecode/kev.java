import android.text.Spanned;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import java.util.List;
import android.widget.RelativeLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kev extends acja
{
    private final Context a;
    private final aceo b;
    private final vax c;
    private final acnj d;
    private final acih e;
    private final acng f;
    private final acio g;
    private final FrameLayout h;
    private keu i;
    private keu j;
    
    public kev(final Context a, final aceo b, final giz g, final vax c, final acnj d, final acng f) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        g.getClass();
        this.g = (acio)g;
        d.getClass();
        this.d = d;
        this.f = f;
        g.c((View)(this.h = new FrameLayout(a)));
        this.e = new acih(c, (acio)g);
    }
    
    public final View a() {
        return ((giz)this.g).a;
    }
    
    public final void c(final acir acir) {
        this.e.c();
    }
    
    final keu f(final int n) {
        return new keu(this.a, this.b, this.c, this.d, n, this.g, this.f);
    }
}
