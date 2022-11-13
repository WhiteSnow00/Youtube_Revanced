import android.content.ContentResolver;
import java.util.concurrent.Executor;
import android.database.ContentObserver;
import com.google.android.apps.youtube.app.datasaving.DefaultNetworkDataUsageMonitor;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixl implements ashk
{
    public final Object a;
    private final int b;
    
    public ixl(final Context a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixl(final SwipeRefreshLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixl(final DefaultNetworkDataUsageMonitor a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixl(final jcv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixl(final jcw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixl(final jcz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixl(final jdf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final ashj e) {
        final int b = this.b;
        if (b == 0) {
            final Context context = (Context)this.a;
            final ContentResolver contentResolver = context.getContentResolver();
            final ixm ixm = new ixm(context, e);
            contentResolver.registerContentObserver(ixm.a, true, (ContentObserver)ixm);
            e.d((asjl)new tqz(contentResolver, ixm, 1));
            return;
        }
        if (b != 1) {
            if (b == 2) {
                final jcv jcv = (jcv)this.a;
                jcv.c = e;
                final asiq b2 = jcv.b;
                asir asir;
                if (((vai)jcv.a.ci().g).bx()) {
                    asir = jcv.a.Q().an((asjm)new jce(jcv, 9), ixp.p);
                }
                else {
                    asir = jcv.a.P().R().P(asil.a()).an((asjm)new jce(jcv, 9), ixp.p);
                }
                b2.c(asir);
                jcv.c();
                e.ty(asfn.d((asjg)new jcc(jcv, 2)));
                return;
            }
            if (b == 3) {
                final jcw jcw = (jcw)this.a;
                jcw.d = e;
                final asiq c = jcw.c;
                asir asir2;
                if (((vai)jcw.a.ci().g).bx()) {
                    asir2 = jcw.a.Q().an((asjm)new jce(jcw, 11), ixp.q);
                }
                else {
                    asir2 = jcw.a.P().an((asjm)new jce(jcw, 11), ixp.q);
                }
                c.c(asir2);
                jcw.c();
                e.ty(asfn.d((asjg)new jcc(jcw, 3)));
                return;
            }
            if (b == 4) {
                final jcz jcz = (jcz)this.a;
                jcz.m = e;
                jcz.a.l(jcz.h);
                jcz.b.a(jcz.f);
                jcz.c.addOnLayoutChangeListener(jcz.g);
                jcz.i = ger.f(jcz.d.a());
                jcz.j = jcz.b.g();
                jcz.d(jcz.a.j());
                jcz.k = glb.n(jcz.e.a(), 1.0f);
                jcz.c();
                e.ty(asfn.d((asjg)new jcc(jcz, 4)));
                return;
            }
            if (b != 5) {
                final Object a = this.a;
                final frh a2 = new frh(e, 2);
                final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)a;
                swipeRefreshLayout.a = (chr)a2;
                e.ty(asfn.d((asjg)new lkp(swipeRefreshLayout, 9)));
                return;
            }
            final Object a3 = this.a;
            final jdf jdf = (jdf)a3;
            jdf.d = e;
            jdf.a.g(a3);
            e.ty(asfn.d((asjg)new jcc(jdf, 5)));
            jdf.d();
        }
        else {
            final DefaultNetworkDataUsageMonitor defaultNetworkDataUsageMonitor = (DefaultNetworkDataUsageMonitor)this.a;
            defaultNetworkDataUsageMonitor.e = e;
            if (!defaultNetworkDataUsageMonitor.f.bE()) {
                e.c(gmw.a);
                return;
            }
            teu.k(defaultNetworkDataUsageMonitor.b.a(), (Executor)afum.a, (tes)gnn.b, (tet)new esc(e, 12));
        }
    }
}
