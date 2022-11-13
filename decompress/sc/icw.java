import android.content.res.Configuration;
import java.util.function.Consumer;
import j$.util.Optional;
import android.view.View$OnLayoutChangeListener;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class icw extends ibs
{
    public ick a;
    int b;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131624802, viewGroup, false);
        final ick a = this.a;
        a.k = this.b;
        if (!a.o) {
            inflate.getClass();
            final ViewGroup n = (ViewGroup)inflate.findViewById(2131429760);
            n.getClass();
            a.n = n;
            a.l.c(n);
            final ViewGroup viewGroup2 = (ViewGroup)inflate.findViewById(2131429761);
            viewGroup2.getClass();
            final MdxWatchDrawerLayout m = (MdxWatchDrawerLayout)inflate.findViewById(2131429759);
            m.getClass();
            a.m = m;
            a.c.b(viewGroup2);
            a.a.g((Object)a);
            a.a.g((Object)a.c);
            a.b();
            final Object a2 = a.r.a;
            if (a2 != null) {
                final kyq g = ((DefaultWatchPanelViewController)a2).g;
                int c;
                if (g instanceof kyw) {
                    c = ((kyw)g).c();
                }
                else {
                    c = -1;
                }
                a.c(c);
            }
            a.b.i((xnr)a.p);
            n.addOnLayoutChangeListener((View$OnLayoutChangeListener)a.q);
            m.a.add(a.s);
            m.b = a.e;
            m.j = a.k;
            ((kyq)a.h.a()).k((kyo)a);
            a.g.a((laf)a);
            a.f.p(new ici(a));
            a.d.b((icu)a);
            a.o = true;
            a.i.tu((Object)Optional.of((Object)m));
        }
        return inflate;
    }
    
    public final void n(final int j) {
        this.b = j;
        final ick a = this.a;
        if (a != null) {
            a.k = j;
            final MdxWatchDrawerLayout m = a.m;
            if (m != null) {
                m.j = j;
                if (m.getMeasuredHeight() != 0) {
                    if (!m.k) {
                        m.i();
                        m.requestLayout();
                        return;
                    }
                    m.l = true;
                }
            }
        }
    }
    
    public final void nm() {
        super.nm();
        final ick a = this.a;
        if (!a.o) {
            return;
        }
        a.d.b((icu)null);
        a.b.k((xnr)a.p);
        final ViewGroup n = a.n;
        if (n != null) {
            n.removeOnLayoutChangeListener((View$OnLayoutChangeListener)a.q);
        }
        final MdxWatchDrawerLayout m = a.m;
        if (m != null) {
            m.a.remove(a.s);
            a.m.b = null;
        }
        a.g.b((laf)a);
        a.a.m((Object)a.c);
        final icf c = a.c;
        if (c.m) {
            final icd q = c.q;
            if (q != null) {
                q.a.k((xnr)q);
                q.b.ifPresent((Consumer)new iau(q, 6));
            }
            ((xsj)c.c.a()).c((xsh)c);
            c.s.b();
            final idd d = c.d;
            final boolean a2 = d.a();
            d.a = null;
            if (d.a() != a2) {
                ((wzy)d).b();
            }
            c.k = null;
            c.l = null;
            c.o = null;
            c.n = null;
            c.p = null;
            c.q = null;
            c.m = false;
        }
        a.a.m((Object)a);
        final ibz l = a.l;
        if (l.f) {
            ((xsj)l.b.a()).c((xsh)l);
            l.d = null;
            l.e = null;
            l.f = false;
        }
        a.g(0.0f);
        a.o = false;
        a.i.tu((Object)Optional.empty());
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final icf c = this.a.c;
    }
}
