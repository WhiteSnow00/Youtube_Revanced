import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class gh extends anm
{
    final gk a;
    
    public gh(final gk a) {
        this.a = a;
    }
    
    public final void a(View f) {
        final gk a = this.a;
        if (a.k) {
            f = a.f;
            if (f != null) {
                f.setTranslationY(0.0f);
                this.a.c.setTranslationY(0.0f);
            }
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        final gk a2 = this.a;
        a2.n = null;
        final hl i = a2.i;
        if (i != null) {
            i.a(a2.h);
            a2.h = null;
            a2.i = null;
        }
        final ActionBarOverlayLayout b = this.a.b;
        if (b != null) {
            anb.L((View)b);
        }
    }
}
