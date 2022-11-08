import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.Iterator;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class eeg
{
    static final nt a;
    
    static {
        a = (nt)new lx((char[])null);
    }
    
    static eel a(final Context context) {
        return new eel(context, (RecyclerView)new ecv(context));
    }
    
    protected static void b(final dsw dsw, final int n) {
        final int r = ede.R;
        if (dsw.e == null) {
            return;
        }
        dsw.r(new ardu(0, new Object[] { n + 1 }), "updateState:Recycler.onUpdateMeasure");
    }
    
    protected static boolean c(@dyi final dua dua, @dyi final dua dua2, @dyi final dua dua3, @dyi final dua dua4, @dyi final dua dua5, @dyi final dua dua6, @dyi final dua dua7, @dyi(a = dyj.g) final dua dua8, @dyi(a = dyj.g) final dua dua9, @dyi final dua dua10, @dyi final dua dua11, @dyi final dua dua12, @dyi final dua dua13, @dyi final dua dua14, @dyi(a = dyj.h) final dua dua15, @dyi final dua dua16, final dua dua17) {
        if ((int)dua17.a == (int)dua17.b && dua.a == dua.b && ((Boolean)dua2.a).equals(dua2.b) && ((Boolean)dua3.a).equals(dua3.b) && ((Integer)dua4.a).equals(dua4.b) && ((Integer)dua5.a).equals(dua5.b) && ((Integer)dua6.a).equals(dua6.b) && ((Integer)dua7.a).equals(dua7.b) && ((Boolean)dua10.a).equals(dua10.b) && ((Integer)dua11.a).equals(dua11.b) && ((Boolean)dua13.a).equals(dua13.b) && ((Boolean)dua14.a).equals(dua14.b) && ((Integer)dua15.a).equals(dua15.b)) {
            final Integer n = (Integer)dua8.a;
            final Integer n2 = (Integer)dua8.b;
            Label_0278: {
                if (n == null) {
                    if (n2 == null) {
                        break Label_0278;
                    }
                }
                else if (n.equals(n2)) {
                    break Label_0278;
                }
                return true;
            }
            if (((Integer)dua9.a).equals(dua9.b)) {
                final nt nt = (nt)dua16.a;
                final nt nt2 = (nt)dua16.b;
                Label_0342: {
                    if (nt == null) {
                        if (nt2 == null) {
                            break Label_0342;
                        }
                    }
                    else if (nt.getClass().equals(nt2.getClass())) {
                        break Label_0342;
                    }
                    return true;
                }
                final hy hy = (hy)dua12.a;
                final hy hy2 = (hy)dua12.b;
                if (hy == null) {
                    if (hy2 == null) {
                        return false;
                    }
                }
                else if (hy.equals(hy2)) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }
    
    static void d(final dta dta, @dyi final ebj ebj) {
        ebj.g(dta.H(), dta.a());
    }
    
    static void e(final dsw dsw, final int n, final int n2, final dwp dwp, @dyi final ebj ebj) {
        dum m;
        if (!ebj.i()) {
            ebj.l();
            m = null;
        }
        else {
            final int r = ede.R;
            m = ede.M((Class)ede.class, "Recycler", dsw, 946341036, new Object[] { dsw });
        }
        ebj.ag(dwp, n, n2, m);
    }
    
    static void f(final eel eel, @dyi final ebj ebj, @dyi final nz nz) {
        final RecyclerView l = eel.l;
        if (l != null) {
            l.setId(-1);
            ebj.ai((ViewGroup)l);
            if (nz != null) {
                nz.e((RecyclerView)null);
            }
            eel.l.ae(eel.n);
            eel.n = null;
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
    }
    
    static void g(final eel eel, @dyi final ebj ebj, @dyi final boolean b, @dyi final int n, @dyi final int n2, @dyi final int n3, @dyi final int n4, @dyi(a = dyj.g) final int n5, @dyi final boolean b2, @dyi final boolean b3, @dyi(a = dyj.h) final int fadingEdgeLength, @dyi final int id, @dyi final int overScrollMode, @dyi final CharSequence contentDescription, @dyi nt nt) {
        final RecyclerView l = eel.l;
        if (l != null) {
            l.setContentDescription(contentDescription);
            l.s = true;
            l.setClipToPadding(b);
            eel.setClipToPadding(b);
            ana.ab((View)l, n, n3, n2, n4);
            l.setClipChildren(b2);
            eel.setClipChildren(b2);
            l.setNestedScrollingEnabled(b3);
            ((SwipeRefreshLayout)eel).setNestedScrollingEnabled(b3);
            l.setScrollBarStyle(0);
            l.setHorizontalFadingEdgeEnabled(false);
            l.setVerticalFadingEdgeEnabled(false);
            l.setFadingEdgeLength(fadingEdgeLength);
            l.setId(id);
            l.setOverScrollMode(overScrollMode);
            ((SwipeRefreshLayout)eel).i(new int[] { n5 });
            if (nt == eeg.a) {
                nt = (nt)new lx((char[])null);
            }
            final RecyclerView i = eel.l;
            eel.n = i.E;
            i.ae(nt);
            ebj.ah((ViewGroup)l);
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout");
    }
    
    protected static void h(@dyi final ebj ebj) {
        ebj.l();
    }
    
    protected static void i(final elw elw) {
        elw.a = 0;
    }
    
    protected static void j(final int n, final elw elw) {
        elw.a = n;
    }
    
    static void k(final eel eel, @dyi final ebj ebj, @dyi final athj athj, @dyi final oa oa, @dyi final List list) {
        final RecyclerView l = eel.l;
        if (l != null) {
            ebj.k();
            if (athj != null) {
                athj.c = null;
            }
            if (list != null) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    l.aH((iw)iterator.next());
                }
            }
            if (oa != null) {
                l.Y(oa);
            }
            if (oa != null) {
                l.Y(oa);
            }
            ((ecv)l).aa = null;
            ((SwipeRefreshLayout)eel).a = null;
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
    }
    
    protected static void l(final eel c, @dyi final ebj ebj, @dyi final athj athj, @dyi final List list, @dyi final nz nz, @dyi final boolean b, @dyi final elw aa, @dyi final oa oa, @dyi final dum dum) {
        Object a = null;
        c.setContentDescription((CharSequence)null);
        ((SwipeRefreshLayout)c).setEnabled(b && dum != null);
        if (dum != null) {
            a = new fqy(dum, 1);
        }
        ((SwipeRefreshLayout)c).a = (chq)a;
        final RecyclerView l = c.l;
        if (l != null) {
            if (list != null) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    l.aE((iw)iterator.next());
                }
            }
            if (aa != null) {
                ((ecv)l).aa = aa;
            }
            if (oa != null) {
                l.u(oa);
            }
            if (nz != null && l.H == null) {
                nz.e(l);
            }
            ebj.j();
            if (athj != null) {
                athj.c = c;
            }
            if (c.m) {
                l.requestLayout();
                c.m = false;
            }
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
    }
}
