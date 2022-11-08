import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class gkd extends iw
{
    final /* synthetic */ gkh a;
    
    public gkd(final gkh a) {
        this.a = a;
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, int l) {
        if (l == 0) {
            final gkh a = this.a;
            a.c();
            l = a.d.l();
            if (fah.p(l, 32)) {
                final gkg h = a.h;
                if (!((oj)h).e && !((oj)h).f) {
                    final View b = a.b(a.a.n);
                    if (b != null) {
                        final float a2 = a.a(l, b, a.g);
                        if (a2 > 0.0f && a2 < 1.0f) {
                            ((oj)a.h).b = a.d.m();
                            final gkg h2 = a.h;
                            if (a2 < 0.5f) {
                                l = (int)a.g;
                            }
                            else {
                                l = 0;
                            }
                            h2.a = l;
                            a.a.n.bf((oj)h2);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        if (n2 == 0) {
            final gkh a = this.a;
            final boolean q = a.q;
            a.q = false;
            if (!q && a.p != a.g()) {
                return;
            }
        }
        this.a.f();
    }
}
