import java.util.List;
import com.facebook.litho.ComponentTree;
import java.util.Iterator;
import java.util.WeakHashMap;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edz extends nq implements eec
{
    public final eeb a;
    
    public edz(final eeb a) {
        this.a = a;
        this.s(false);
    }
    
    public final int a() {
        return this.a.b.size();
    }
    
    public final void b(final int n, final int n2) {
        this.a.G(n, n2);
    }
    
    public final int d(final int n) {
        final eei d = this.a.b.get(n).d();
        if (d.k()) {
            return this.a.H.c;
        }
        final edp d2 = this.a.d;
        if (d2 != null) {
            return ((nq)((acuh)d2).b).d(n);
        }
        return d.b();
    }
    
    public final on g(final ViewGroup viewGroup, final int n) {
        final eeb a = this.a;
        final eej h = a.H;
        if (n == h.c) {
            return (on)new edw((View)new dvu(this.a.g), true);
        }
        final edp d = a.d;
        if (d != null) {
            return (on)((acuh)d).b.x(viewGroup, n);
        }
        final ebh ebh = (ebh)h.a.get(n);
        final Context b = this.a.g.b;
        return (on)new edw(ebh.a(), false);
    }
    
    public final long mR(final int n) {
        return this.a.b.get(n).a;
    }
    
    public final void q(final on on, int v) {
        final boolean b = dvq.b(null);
        boolean b2 = true;
        final boolean b3 = b && !this.a.C.isEmpty();
        final ebt ebt = this.a.b.get(v);
        final eei d = ebt.d();
        if (d.k()) {
            final dvu dvu = (dvu)on.a;
            dvu.C(this.a.l);
            final int q = this.a.q(ebt);
            final int p2 = this.a.p(ebt);
            if (!ebt.r(q, p2)) {
                final eeb a = this.a;
                final int w = a.w;
                if (w != -1) {
                    final int x = a.x;
                    if (x != -1) {
                        final int n = x - w;
                        if (v > x) {
                            a.y(v, v + n, eeg.a);
                        }
                        else if (v < w) {
                            a.y(v - n, v, eeg.b);
                        }
                    }
                }
                ebt.i(this.a.g, q, p2, new dwq());
            }
            final int i = this.a.e.i();
            int size;
            if (View$MeasureSpec.getMode(q) == 1073741824) {
                size = View$MeasureSpec.getSize(q);
            }
            else if (i != 0) {
                size = -1;
            }
            else {
                size = -2;
            }
            int size2;
            if (View$MeasureSpec.getMode(p2) == 1073741824) {
                size2 = View$MeasureSpec.getSize(p2);
            }
            else if (i != 0) {
                size2 = -2;
            }
            else {
                size2 = -1;
            }
            d.i();
            dvu.setLayoutParams((ViewGroup$LayoutParams)new eea(size, size2, q, p2));
            dvu.B(ebt.b());
            dvu.post((Runnable)new dmc(dvu, 11));
            ebt.d().n();
            if (b3) {
                final eeb a2 = this.a;
                final boolean[] d2 = a2.D;
                final boolean[] e = a2.E;
                final boolean b4 = v == this.a();
                if (i == 0) {
                    b2 = false;
                }
                dvu.q = new dvt(d2, e, b4, b2);
            }
            else {
                dvu.y();
            }
            final acxl k = this.a.K;
            if (k != null) {
                for (final ackp ackp : ((acui)k.b).a.a) {
                    if (ackp instanceof gjx) {
                        ((gjx)ackp).a.aq();
                    }
                }
                final acxl j = this.a.K;
                final View a3 = on.a;
                final Object a4 = j.a;
                if (a4 != null) {
                    final Object item = ((acui)j.b).a.getItem(v);
                    if (item instanceof acbj) {
                        final acbj acbj = (acbj)item;
                        ajmp ajmp;
                        if ((ajmp = acbj.a.d) == null) {
                            ajmp = ajmp.a;
                        }
                        if ((ajmp.b & 0x80000) != 0x0) {
                            final hyx hyx = (hyx)a4;
                            final Object a5 = hyx.a;
                            ajmp ajmp2;
                            if ((ajmp2 = acbj.a.d) == null) {
                                ajmp2 = ajmp.a;
                            }
                            ajmq ajmq;
                            if ((ajmq = ajmp2.j) == null) {
                                ajmq = ajmq.a;
                            }
                            ((IntersectionEngine)a5).setEnableProminenceForGroup(ajmq.e, false);
                            final vcy vcy = (vcy)((atke)((cya)hyx.c).a).a();
                            vcy.getClass();
                            acbj.getClass();
                            final gji gji = new gji(vcy, acbj);
                            ((WeakHashMap)hyx.d).put(a3, gji);
                            ((gjl)hyx.b).n(a3, gji);
                        }
                    }
                }
            }
        }
        else {
            final edp d3 = this.a.d;
            if (d3 != null) {
                ((acuh)d3).b.y((ackt)on, v);
            }
            else {
                final edw edw = (edw)on;
                final ebg d4 = d.d();
                v = edw.v;
                edw.u = d4;
                final View a6 = edw.a;
                d4.a();
            }
        }
        final boolean a7 = dyp.a;
    }
    
    public final void r(final on on) {
        if (on instanceof edw) {
            final edw edw = (edw)on;
            final int v = edw.v;
            if (edw.t) {
                final dvu dvu = (dvu)on.a;
                dvu.E();
                dvu.B((ComponentTree)null);
                dvu.C((List)null);
                dvu.y();
            }
            else {
                final ebg u = edw.u;
            }
        }
        else {
            ((acuh)this.a.d).b.z((ackt)on);
        }
        final acxl k = this.a.K;
        if (k != null) {
            final View a = on.a;
            final Object a2 = k.a;
            if (a2 != null) {
                final hyx hyx = (hyx)a2;
                ((gjl)hyx.b).s(a);
                ((WeakHashMap)hyx.d).remove(a);
            }
        }
    }
}
