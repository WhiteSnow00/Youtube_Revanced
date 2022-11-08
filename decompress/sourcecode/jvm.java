import java.util.Iterator;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import android.support.constraint.ConstraintLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvm implements fzu
{
    private final DefaultTabsBar a;
    private final ViewGroup b;
    private final ViewGroup c;
    private final arhr d;
    private View e;
    private final List f;
    private jvl g;
    
    public jvm(final arhr d, final AppTabsBar a, final ConstraintLayout b, final ViewGroup c) {
        this.d = d;
        this.c = c;
        this.a = (DefaultTabsBar)a;
        (this.b = (ViewGroup)b).setVisibility(8);
        this.f = new ArrayList();
    }
    
    private final void n(final fzo fzo) {
        final jvl g = new jvl();
        for (final fyv fyv : fzo.b) {
            if (fyv.d()) {
                g.d((RecyclerView)fyv.a());
            }
            else {
                fyv.b(new jvk(g, 0));
            }
        }
        final View e = (View)fzo.a;
        this.e = e;
        this.c.addView(e);
        this.g = g;
    }
    
    @Override
    public final int a() {
        return 0;
    }
    
    @Override
    public final View b(final int n) {
        return ((tms)this.a).k(n);
    }
    
    @Override
    public final void c(final fzt fzt) {
        this.f.add(fzt);
    }
    
    @Override
    public final void d() {
        this.e = null;
        this.g = null;
    }
    
    @Override
    public final void e() {
        final jvl g = this.g;
        if (g != null) {
            final Iterator iterator = g.a.iterator();
            while (iterator.hasNext()) {
                ((RecyclerView)iterator.next()).aa(0);
            }
            ((fyx)this.d.a()).q();
        }
    }
    
    @Override
    public final void f(final fzt fzt) {
        this.f.remove(fzt);
    }
    
    @Override
    public final void g() {
        final jvl g = this.g;
        if (g != null) {
            final Iterator iterator = g.a.iterator();
            while (iterator.hasNext()) {
                ((RecyclerView)iterator.next()).aa(0);
            }
            ((fyx)this.d.a()).q();
        }
    }
    
    @Override
    public final void h() {
        final jvl g = this.g;
        if (g != null) {
            final Iterator iterator = g.a.iterator();
            while (iterator.hasNext()) {
                ((RecyclerView)iterator.next()).aj(0);
            }
            ((fyx)this.d.a()).q();
        }
    }
    
    @Override
    public final boolean i() {
        final jvl g = this.g;
        boolean b = false;
        if (g != null) {
            final Iterator iterator = g.a.iterator();
            RecyclerView recyclerView;
            do {
                b = b;
                if (!iterator.hasNext()) {
                    return b;
                }
                recyclerView = (RecyclerView)iterator.next();
            } while (recyclerView.computeVerticalScrollOffset() <= 0 || recyclerView.n.bh());
            b = true;
        }
        return b;
    }
    
    @Override
    public final void j() {
        ((fyx)this.d.a()).q();
    }
    
    @Override
    public final void k(final int n) {
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            ((fzt)iterator.next()).pM(n, true);
        }
    }
    
    @Override
    public final View l(final int n, final boolean b, final CharSequence charSequence, final fzo fzo) {
        final View g = this.a.g(n, b, charSequence);
        this.n(fzo);
        return g;
    }
    
    @Override
    public final View m(final CharSequence charSequence, final CharSequence charSequence2, final boolean b, final fzo fzo) {
        final View h = this.a.h(charSequence, charSequence2, b);
        this.n(fzo);
        return h;
    }
}
