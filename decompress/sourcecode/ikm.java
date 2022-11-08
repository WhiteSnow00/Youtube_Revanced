import android.view.View$OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikm extends ijy
{
    private final atjj b;
    private final String c;
    private Boolean d;
    private final int e;
    
    public ikm(final fml fml, final atjj b, final String c, final OfflineArrowView offlineArrowView, final int e, final View$OnClickListener view$OnClickListener) {
        super(fml, b, 1, c, offlineArrowView, view$OnClickListener);
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public final void a() {
        if (!this.c()) {
            final int e = this.e;
            if (e == 3) {
                super.a.aj();
                return;
            }
            if (e == 2) {
                super.a.an();
                return;
            }
        }
        super.a();
    }
    
    public final void b(final ijk ijk) {
        if (!ijk.a && (((zzu)this.b.a()).a().i().a(this.c) > 0 || Boolean.FALSE.equals(this.d))) {
            final fzo a = super.a;
            a.ak();
            ((OfflineArrowView)a.a).d(2131231853);
            a.al(2132017317);
            return;
        }
        if (ijk.a) {
            final int e = this.e;
            if (e == 3) {
                super.a.aj();
                return;
            }
            if (e == 2) {
                super.a.an();
                return;
            }
        }
        super.b(ijk);
    }
    
    public final void d(final Boolean d) {
        this.d = d;
        this.a();
    }
}
