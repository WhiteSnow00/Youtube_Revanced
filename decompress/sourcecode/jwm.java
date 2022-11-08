import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwm extends iw
{
    final /* synthetic */ MainCollapsingToolbarLayout a;
    
    public jwm(final MainCollapsingToolbarLayout a) {
        this.a = a;
    }
    
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        final MainCollapsingToolbarLayout a = this.a;
        final boolean laidOut = a.isLaidOut();
        boolean b = false;
        if (laidOut) {
            b = b;
            if (!a.isInEditMode()) {
                b = true;
            }
        }
        if (!a.d(b)) {
            this.a.b(null);
        }
    }
}
