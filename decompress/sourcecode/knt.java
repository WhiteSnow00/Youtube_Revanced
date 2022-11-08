import java.util.Iterator;
import android.view.ViewStub;
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

public final class knt extends acja
{
    private final Context a;
    private final aceo b;
    private final vax c;
    private final acio d;
    private final acnj e;
    private final acng f;
    private final FrameLayout g;
    private kns h;
    private kns i;
    private final uyi j;
    private final cxz k;
    
    public knt(final Context a, final aceo b, final vax c, final giz d, final acnj e, final acng f, final cxz k, final uyi j, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = (acio)d;
        e.getClass();
        this.e = e;
        this.f = f;
        this.k = k;
        this.j = j;
        d.c((View)(this.g = new FrameLayout(a)));
        d.b(true);
    }
    
    private final kns f(final int n) {
        return new kns(this.a, this.b, this.c, this.e, n, this.d, this.f, this.k, this.j, null, null, null);
    }
    
    public final View a() {
        return ((giz)this.d).a;
    }
    
    public final void c(final acir acir) {
        final kns i = this.i;
        if (i != null) {
            i.c(acir);
        }
        final kns h = this.h;
        if (h != null) {
            h.c(acir);
        }
    }
}
