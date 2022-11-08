import android.view.View$OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikb extends ijy
{
    public ikb(final fml fml, final atjj atjj, final int n, final String s, final OfflineArrowView offlineArrowView, final View$OnClickListener view$OnClickListener) {
        super(fml, atjj, n, s, offlineArrowView, view$OnClickListener);
    }
    
    public final void a() {
        if (!this.c()) {
            super.a.aj();
            return;
        }
        super.a();
    }
    
    public final void b(final ijk ijk) {
        if (this.c() && !ijk.a) {
            super.b(ijk);
            return;
        }
        super.a.aj();
    }
}
