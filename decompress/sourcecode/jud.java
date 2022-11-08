import androidx.viewpager.widget.ViewPager;
import android.view.View;
import java.util.Iterator;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import android.view.ViewGroup;
import java.util.List;
import java.util.ArrayList;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jud implements fzu
{
    public final arhr a;
    public final RtlAwareViewPager b;
    public final ArrayList c;
    public final List d;
    private final arhr e;
    private final arhr f;
    private final jub g;
    private int h;
    private final ArrayList i;
    private juc j;
    
    public jud(final arhr f, final arhr a, final arhr e, final RtlAwareViewPager b) {
        this.h = -1;
        f.getClass();
        this.f = f;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        this.e = e;
        this.i = new ArrayList(10);
        this.c = new ArrayList(10);
        ((ViewGroup)e.a()).setVisibility(8);
        ((tms)a.a()).k = (tmq)new ugp(this, 1);
        ((ViewPager)b).k(this.g = new jub(this));
        b.j = (cku)new tor(this, 1);
        this.d = new ArrayList();
    }
    
    private final void o(final fzo fzo) {
        final ViewGroup viewGroup = (ViewGroup)this.e.a();
        int visibility;
        if (((tms)this.a.a()).j() > 1) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        viewGroup.setVisibility(visibility);
        final juc juc = new juc();
        for (final fyv fyv : fzo.b) {
            if (fyv.d()) {
                juc.d((RecyclerView)fyv.a());
            }
            else {
                fyv.b(new jvk(juc, 1));
            }
        }
        this.c.add(fzo.a);
        this.i.add(juc);
        this.g.m();
    }
    
    @Override
    public final int a() {
        return ((ViewPager)this.b).a();
    }
    
    @Override
    public final View b(final int n) {
        return ((tms)this.a.a()).k(n);
    }
    
    @Override
    public final void c(final fzt fzt) {
        this.d.add(fzt);
    }
    
    @Override
    public final void d() {
        this.c.clear();
        this.g.m();
        this.i.clear();
        this.j = null;
    }
    
    @Override
    public final void e() {
        final juc j = this.j;
        if (j != null) {
            final Iterator iterator = j.a.iterator();
            while (iterator.hasNext()) {
                ((RecyclerView)iterator.next()).aa(0);
            }
            ((fyx)this.f.a()).q();
        }
    }
    
    @Override
    public final void f(final fzt fzt) {
        this.d.remove(fzt);
    }
    
    @Override
    public final void g() {
        final juc j = this.j;
        if (j != null) {
            final Iterator iterator = j.a.iterator();
            while (iterator.hasNext()) {
                ((RecyclerView)iterator.next()).aj(0);
            }
            ((fyx)this.f.a()).q();
        }
    }
    
    @Override
    public final void h() {
        this.g();
    }
    
    @Override
    public final boolean i() {
        final juc j = this.j;
        boolean b = false;
        if (j != null) {
            final Iterator iterator = j.a.iterator();
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
        ((fyx)this.f.a()).q();
    }
    
    @Override
    public final void k(final int n) {
        if (n >= 0) {
            if (n < ((tms)this.a.a()).j()) {
                if (n == ((ViewPager)this.b).a()) {
                    this.n(n, true);
                }
                ((ViewPager)this.b).m(n, false);
            }
        }
    }
    
    @Override
    public final View l(final int n, final boolean b, final CharSequence charSequence, final fzo fzo) {
        final View g = ((DefaultTabsBar)this.a.a()).g(n, b, charSequence);
        this.o(fzo);
        return g;
    }
    
    @Override
    public final View m(final CharSequence charSequence, final CharSequence charSequence2, final boolean b, final fzo fzo) {
        final View h = ((DefaultTabsBar)this.a.a()).h(charSequence, charSequence2, b);
        this.o(fzo);
        return h;
    }
    
    public final void n(final int h, final boolean b) {
        final int h2 = this.h;
        if (h2 != -1) {
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                if (!((fzt)iterator.next()).f(h2)) {
                    iterator.remove();
                }
            }
        }
        ((tms)this.a.a()).m(h, false);
        this.h = h;
        this.j = this.i.get(h);
        final Iterator iterator2 = this.d.iterator();
        while (iterator2.hasNext()) {
            ((fzt)iterator2.next()).pM(h, b);
        }
    }
}
