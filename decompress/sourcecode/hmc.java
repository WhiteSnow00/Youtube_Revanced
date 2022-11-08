import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelPlayerView;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelRecyclerView;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelSnackbarController;
import android.view.View;
import java.util.Iterator;
import j$.util.Optional;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmc extends iw
{
    public final /* synthetic */ hmk a;
    private int b;
    
    public hmc(final hmk a) {
        this.a = a;
        this.b = -1;
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, int n) {
        final Iterator iterator = this.a.m.iterator();
        while (iterator.hasNext()) {
            ((hmh)iterator.next()).p(n);
        }
        final hmk a = this.a;
        if ((a.v = n) != 0) {
            if (n != 1) {
                a.n.c();
                final hmk a2 = this.a;
                a2.x = a2.i.c();
                final hmk a3 = this.a;
                n = a3.C;
                if (n == -1) {
                    final hmj o = a3.o;
                    final View b = ((nm)o).b((nw)o.b.r);
                    if (b != null) {
                        final hmk b2 = o.b;
                        n = hme.bo(b);
                    }
                    else {
                        n = -1;
                    }
                }
                final hmk a4 = this.a;
                final hma p2 = a4.p;
                Label_0442: {
                    if (p2 != null) {
                        if (a4.d != null) {
                            final long e = p2.E(n);
                            final hmk a5 = this.a;
                            final long z = a5.z;
                            if (n != -1 && e >= 0L && e != z) {
                                final anqt anqt = (anqt)a5.d.a();
                                if (anqt == null || !anqt.y) {
                                    final uyi h = this.a.H;
                                    if (h == null || !(boolean)h.l(45378741L).aG() || e <= this.a.z) {
                                        break Label_0442;
                                    }
                                }
                                this.b = n;
                                this.a.q.a(true);
                                if (this.a.e().isEmpty() || ((hml)this.a.e().get()).g == null || !((hml)this.a.e().get()).g.J()) {
                                    this.d(n);
                                    return;
                                }
                                final hng g = ((hml)this.a.e().get()).g;
                                if (g == null) {
                                    return;
                                }
                                final hqo f = g.F();
                                if (f == null) {
                                    return;
                                }
                                if (f.f().isEmpty()) {
                                    this.d(n);
                                    return;
                                }
                                final hpt hpt = (hpt)f.f().get();
                                hpt.a(this.a.F.d, Optional.of((Object)new wif(this, hpt, n)));
                                return;
                            }
                        }
                    }
                }
                this.b = this.a.B;
                return;
            }
            this.b = a.B;
            final ReelSnackbarController h2 = a.h;
            if (h2 != null) {
                h2.g();
            }
        }
        else {
            a.y = a.i.c();
            final Optional e2 = this.a.e();
            if (this.a.w && e2.isPresent() && ((hml)e2.get()).b() != null) {
                final hmk a6 = this.a;
                if (a6.g != null && !(boolean)a6.H.cr().aG()) {
                    this.a.g.g(((hml)e2.get()).b().e, this.a.y);
                    this.a.y = -1L;
                }
            }
            final ReelRecyclerView q = this.a.q;
            if (q != null) {
                q.a(false);
            }
            final hmk a7 = this.a;
            if (a7.w) {
                a7.w = false;
                final ReelPlayerView f2 = a7.F;
                if (f2 != null) {
                    ((View)f2).setScrollX(0);
                    ((View)this.a.F).setScrollY(0);
                }
                final trg l = this.a.L;
                if (l != null && l.b != null) {
                    final hml hml = (hml)l.c;
                    final String e3 = hml.b().e;
                    final akok f3 = hml.f;
                    final boolean z2 = iba.z(hml.b());
                    if (f3 != null) {
                        ((hqo)this.a.L.b).k(e3, f3, hml.a, z2, hml.c, hml.b());
                    }
                    ((hqo)this.a.L.b).i();
                }
            }
            else {
                final hme r = a7.r;
                if (r != null) {
                    n = ((LinearLayoutManager)r).J();
                }
                else {
                    n = -1;
                }
                final hma p3 = this.a.p;
                int y = n;
                if (p3 != null) {
                    y = n;
                    if (p3.D() != -1 && (y = n) == 0) {
                        y = p3.y();
                    }
                }
                if (y != -1) {
                    final hmk a8 = this.a;
                    a8.B = y;
                    a8.l(this.b);
                    this.b = -1;
                    this.a.j(false);
                }
            }
            if (this.a.H.cr().aG()) {
                this.a.k();
            }
        }
    }
    
    public final void d(int b) {
        final hmk a = this.a;
        a.w = true;
        a.B = b;
        a.l(this.b);
        this.b = -1;
        final hmk a2 = this.a;
        a2.C = -1;
        a2.j(true);
        final hmk a3 = this.a;
        final ReelPlayerView f = a3.F;
        if (f != null) {
            if (a3.u) {
                b = ((View)f).getScrollY();
                final int height = ((View)a3.F).getHeight();
                if (a3.A) {
                    ((View)a3.F).setScrollY(b - height);
                    return;
                }
                ((View)a3.F).setScrollY(b + height);
            }
            else {
                final int scrollX = ((View)f).getScrollX();
                b = ((View)a3.F).getWidth();
                if (a3.A) {
                    ((View)a3.F).setScrollX(scrollX - b);
                    return;
                }
                ((View)a3.F).setScrollX(scrollX + b);
            }
        }
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        final ReelPlayerView f = this.a.F;
        ((View)f).setScrollX(((View)f).getScrollX() + n);
        ((View)f).setScrollY(((View)f).getScrollY() + n2);
    }
}
