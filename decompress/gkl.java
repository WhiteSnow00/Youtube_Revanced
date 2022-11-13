import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class gkl extends iw
{
    final gkp a;
    
    public gkl(final gkp a) {
        this.a = a;
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, int l) {
        if (l == 0) {
            final gkp a = this.a;
            a.c();
            l = a.d.l();
            if (fal.n(l, 32)) {
                final gko h = a.h;
                if (!h.e && !h.f) {
                    final View b = a.b(a.a.n);
                    if (b != null) {
                        final float a2 = a.a(l, b, a.g);
                        if (a2 > 0.0f && a2 < 1.0f) {
                            a.h.b = a.d.m();
                            final gko h2 = a.h;
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
    public final void py(final RecyclerView recyclerView, final int n, final int n2) {
        if (n2 == 0) {
            final gkp a = this.a;
            final boolean q = a.q;
            a.q = false;
            if (!q && a.p != a.g()) {
                return;
            }
        }
        this.a.f();
    }
}
