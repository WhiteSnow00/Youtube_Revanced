import android.view.View$OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;

// 
// Decompiled by Procyon v0.6.0
// 

public class ikv implements iky
{
    public final jki a;
    private final fmr b;
    private final atke c;
    private final int d;
    private final String e;
    
    public ikv(final fmr b, final atke c, final int d, final String e, final OfflineArrowView offlineArrowView, final View$OnClickListener view$OnClickListener) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = new jki(offlineArrowView, view$OnClickListener);
    }
    
    public void a() {
        if (!this.c()) {
            this.a.f();
            return;
        }
        final int d = this.d;
        if (d == 0) {
            final String e = this.e;
            tvb.n(e);
            this.b(ikg.b(((aabo)this.c.a()).a().l().e(e)));
            return;
        }
        if (d == 1) {
            final String e2 = this.e;
            tvb.n(e2);
            this.b(ikg.a((aaau)((aabo)this.c.a()).a().i().d(e2)));
            return;
        }
        if (d == 2) {
            final String e3 = this.e;
            tvb.n(e3);
            this.b(ikg.a((aaau)((aabo)this.c.a()).a().j().a(e3)));
            return;
        }
        if (d != 3) {
            this.b(ikg.a((aaau)((aabo)this.c.a()).a().l().f()));
            return;
        }
        this.b(ikg.a((aaau)((aabo)this.c.a()).a().l().c()));
    }
    
    public void b(final ikg ikg) {
        if (!this.c() || ikg.a) {
            this.a.f();
            return;
        }
        if (ikg.b) {
            final jki a = this.a;
            int n;
            if (this.d != 0) {
                n = 2132017312;
            }
            else {
                n = 2132017313;
            }
            a.d();
            ((OfflineArrowView)a.b).e();
            ((ioh)a.b).l();
            a.e(n);
            return;
        }
        if (ikg.e) {
            final jki a2 = this.a;
            a2.d();
            final OfflineArrowView offlineArrowView = (OfflineArrowView)a2.b;
            offlineArrowView.c(offlineArrowView.b);
            ((ioh)a2.b).l();
            return;
        }
        final jki a3 = this.a;
        final int f = ikg.f;
        final boolean c = ikg.c;
        final boolean d = ikg.d;
        a3.d();
        if (c) {
            if (d) {
                ((OfflineArrowView)a3.b).h();
            }
            else {
                ((OfflineArrowView)a3.b).i();
            }
            ((OfflineArrowView)a3.b).j(f);
        }
        else {
            ((OfflineArrowView)a3.b).f();
            ((ioh)a3.b).l();
        }
        a3.e(2132017309);
    }
    
    protected final boolean c() {
        final int d = this.d;
        if (d == 1) {
            return this.b.k();
        }
        if (d == 2) {
            return this.b.n();
        }
        if (d != 3) {
            return this.b.i() && !this.b.o();
        }
        return this.b.l();
    }
}
