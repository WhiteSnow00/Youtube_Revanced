import j$.util.Optional;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbf extends iw
{
    final /* synthetic */ kbo a;
    
    public kbf(final kbo a) {
        this.a = a;
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, final int n) {
        final kbo a = this.a;
        final kbk y = a.y;
        if (y == a.f && n != 0) {
            a.g();
            return;
        }
        final kbg g = a.g;
        if (y == g) {
            agot.v(true, (Object)a.b((kbk)g));
            agot.u(a.s.isPresent());
            if (n == 1) {
                a.h((kbk)a.c);
                return;
            }
            if (n == 0) {
                agot.u(a.v.isPresent());
                if (a.v.isPresent()) {
                    if (!a.m((int)a.v.get(), ((gee)a.s.get()).l())) {
                        a.h((kbk)a.c);
                        return;
                    }
                    a.u = a.v;
                    a.v = Optional.empty();
                    if (a.t.isPresent()) {
                        a.k((ged)a.t.get());
                        a.h((kbk)a.f);
                    }
                }
            }
        }
        else if (y == a.h && a.w.isPresent() && !this.a.q.isPresent() && n == 0) {
            final kbo a2 = this.a;
            a2.e((String)a2.w.get());
        }
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        final kbo a = this.a;
        if (a.y == a.f) {
            a.g();
        }
    }
}
