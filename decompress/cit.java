import java.util.List;
import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import java.util.Collection;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class cit implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener
{
    final ciq a;
    final ViewGroup b;
    
    public cit(final ciq a, final ViewGroup b) {
        this.a = a;
        this.b = b;
    }
    
    private final void a() {
        this.b.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        this.b.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
    
    public final boolean onPreDraw() {
        this.a();
        if (!ciu.a.remove(this.b)) {
            return true;
        }
        final abi a = ciu.a();
        final ArrayList list = (ArrayList)((abp)a).get((Object)this.b);
        ArrayList list2 = null;
        List list3 = null;
        Label_0097: {
            if (list == null) {
                list2 = new ArrayList();
                ((abp)a).put((Object)this.b, (Object)list2);
            }
            else {
                list2 = list;
                if (list.size() > 0) {
                    list3 = new ArrayList(list);
                    list2 = list;
                    break Label_0097;
                }
            }
            list3 = null;
        }
        list2.add(this.a);
        this.a.w((cip)new cis(this, a));
        this.a.m(this.b, false);
        if (list3 != null) {
            for (int size = list3.size(), i = 0; i < size; ++i) {
                ((ciq)list3.get(i)).r((View)this.b);
            }
        }
        final ciq a2 = this.a;
        final ViewGroup b = this.b;
        a2.h = new ArrayList();
        a2.i = new ArrayList();
        final dev n = a2.n;
        dev o = a2.o;
        final abi abi = new abi((abp)n.d);
        final abi abi2 = new abi((abp)o.d);
        int n2 = 0;
        while (true) {
            final int[] g = a2.g;
            if (n2 >= 4) {
                break;
            }
            final int n3 = g[n2];
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        dev dev;
                        if (n3 != 4) {
                            dev = o;
                        }
                        else {
                            final Object a3 = n.a;
                            final Object a4 = o.a;
                            final abm abm = (abm)a3;
                            final int c = abm.c();
                            int n4 = 0;
                            while (true) {
                                dev = o;
                                if (n4 >= c) {
                                    break;
                                }
                                final View view = (View)abm.g(n4);
                                if (view != null && a2.v(view)) {
                                    final View view2 = (View)((abm)a4).e(abm.d(n4));
                                    if (view2 != null && a2.v(view2)) {
                                        final cjc cjc = (cjc)((abp)abi).get((Object)view);
                                        final cjc cjc2 = (cjc)((abp)abi2).get((Object)view2);
                                        if (cjc != null && cjc2 != null) {
                                            a2.h.add(cjc);
                                            a2.i.add(cjc2);
                                            ((abp)abi).remove((Object)view);
                                            ((abp)abi2).remove((Object)view2);
                                        }
                                    }
                                }
                                ++n4;
                            }
                        }
                        o = dev;
                    }
                    else {
                        final Object c2 = n.c;
                        final dev dev2 = o;
                        final Object c3 = dev2.c;
                        final SparseArray sparseArray = (SparseArray)c2;
                        final int size2 = sparseArray.size();
                        int n5 = 0;
                        while (true) {
                            o = dev2;
                            if (n5 >= size2) {
                                break;
                            }
                            final View view3 = (View)sparseArray.valueAt(n5);
                            if (view3 != null && a2.v(view3)) {
                                final View view4 = (View)((SparseArray)c3).get(sparseArray.keyAt(n5));
                                if (view4 != null && a2.v(view4)) {
                                    final cjc cjc3 = (cjc)((abp)abi).get((Object)view3);
                                    final cjc cjc4 = (cjc)((abp)abi2).get((Object)view4);
                                    if (cjc3 != null && cjc4 != null) {
                                        a2.h.add(cjc3);
                                        a2.i.add(cjc4);
                                        ((abp)abi).remove((Object)view3);
                                        ((abp)abi2).remove((Object)view4);
                                    }
                                }
                            }
                            ++n5;
                        }
                    }
                }
                else {
                    final dev dev3 = o;
                    final Object b2 = n.b;
                    final Object b3 = dev3.b;
                    final abp abp = (abp)b2;
                    final int d = abp.d;
                    int n6 = 0;
                    while (true) {
                        o = dev3;
                        if (n6 >= d) {
                            break;
                        }
                        final View view5 = (View)abp.f(n6);
                        if (view5 != null && a2.v(view5)) {
                            final View view6 = (View)((abp)b3).get(abp.c(n6));
                            if (view6 != null && a2.v(view6)) {
                                final cjc cjc5 = (cjc)((abp)abi).get((Object)view5);
                                final cjc cjc6 = (cjc)((abp)abi2).get((Object)view6);
                                if (cjc5 != null && cjc6 != null) {
                                    a2.h.add(cjc5);
                                    a2.i.add(cjc6);
                                    ((abp)abi).remove((Object)view5);
                                    ((abp)abi2).remove((Object)view6);
                                }
                            }
                        }
                        ++n6;
                    }
                }
            }
            else {
                final dev dev4 = o;
                int d2 = ((abp)abi).d;
                while (true) {
                    --d2;
                    o = dev4;
                    if (d2 < 0) {
                        break;
                    }
                    final View view7 = (View)((abp)abi).c(d2);
                    if (view7 == null || !a2.v(view7)) {
                        continue;
                    }
                    final cjc cjc7 = (cjc)((abp)abi2).remove((Object)view7);
                    if (cjc7 == null || !a2.v(cjc7.b)) {
                        continue;
                    }
                    a2.h.add(((abp)abi).d(d2));
                    a2.i.add(cjc7);
                }
            }
            ++n2;
        }
        for (int j = 0; j < ((abp)abi).d; ++j) {
            final cjc cjc8 = (cjc)((abp)abi).f(j);
            if (a2.v(cjc8.b)) {
                a2.h.add(cjc8);
                a2.i.add(null);
            }
        }
        for (int k = 0; k < ((abp)abi2).d; ++k) {
            final cjc cjc9 = (cjc)((abp)abi2).f(k);
            if (a2.v(cjc9.b)) {
                a2.i.add(cjc9);
                a2.h.add(null);
            }
        }
        final abi g2 = ciq.g();
        int d3 = ((abp)g2).d;
        final cjv e = cjh.e((View)b);
        while (--d3 >= 0) {
            final Animator animator = (Animator)((abp)g2).c(d3);
            if (animator != null) {
                final blx blx = (blx)((abp)g2).get((Object)animator);
                if (blx == null || blx.e == null || !e.equals(blx.c)) {
                    continue;
                }
                final Object d4 = blx.d;
                final Object e2 = blx.e;
                final View view8 = (View)e2;
                final cjc l = a2.j(view8, true);
                cjc m;
                final cjc cjc10 = m = a2.i(view8, (boolean)(1 != 0));
                if (l == null && (m = cjc10) == null) {
                    m = (cjc)((abp)a2.o.d).get(e2);
                }
                if ((l == null && m == null) || !((ciq)blx.b).u((cjc)d4, m)) {
                    continue;
                }
                if (!animator.isRunning() && !animator.isStarted()) {
                    ((abp)g2).remove((Object)animator);
                }
                else {
                    animator.cancel();
                }
            }
        }
        a2.H(b, a2.n, a2.o, a2.h, a2.i);
        a2.s();
        return true;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.a();
        ciu.a.remove(this.b);
        final ArrayList list = (ArrayList)((abp)ciu.a()).get((Object)this.b);
        if (list != null && list.size() > 0) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                ((ciq)list.get(i)).r((View)this.b);
            }
        }
        this.a.n(true);
    }
}
