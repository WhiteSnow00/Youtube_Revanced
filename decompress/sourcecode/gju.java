import android.text.TextUtils;
import android.widget.TextView;
import android.view.View$OnLayoutChangeListener;
import android.animation.LayoutTransition$TransitionListener;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.content.res.Resources;
import android.content.Context;
import android.animation.LayoutTransition;
import android.animation.AnimatorSet;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import android.view.ViewGroup;
import android.animation.Animator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gju
{
    private final wwu A;
    private final long B;
    private int C;
    private Animator D;
    private Runnable E;
    private final sin F;
    public final gau a;
    public final int b;
    public final int c;
    public final int d;
    public ViewGroup e;
    public ViewGroup f;
    public SlimStatusBar g;
    public SlimStatusBar h;
    public int i;
    public AnimatorSet j;
    public Runnable k;
    public Runnable l;
    public Runnable m;
    public Runnable n;
    public Runnable o;
    public Runnable p;
    public Runnable q;
    public Runnable r;
    public Runnable s;
    public Runnable t;
    public Runnable u;
    public Runnable v;
    public Runnable w;
    public LayoutTransition x;
    public LayoutTransition y;
    public final qpt z;
    
    public gju(final Context context, final sin f, final wwu a, final gau a2, final byte[] array, final byte[] array2, final byte[] array3) {
        this.F = f;
        this.A = a;
        this.a = a2;
        final Resources resources = context.getResources();
        this.b = resources.getColor(2131102086);
        this.c = resources.getColor(2131102087);
        this.d = resources.getColor(2131102088);
        this.B = resources.getInteger(17694722);
        this.z = new qpt(this);
    }
    
    public static boolean t(final ViewGroup viewGroup, final SlimStatusBar slimStatusBar) {
        return viewGroup.indexOfChild((View)slimStatusBar) >= 0;
    }
    
    private static Animator u(final SlimStatusBar slimStatusBar) {
        return (Animator)ObjectAnimator.ofPropertyValuesHolder((Object)slimStatusBar, new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("top", new int[] { slimStatusBar.getTop(), slimStatusBar.getBottom() }) });
    }
    
    private final void v(final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            this.k();
        }
        else {
            this.j();
        }
        this.i();
        final ViewGroup c = this.c(b);
        final SlimStatusBar d = this.d(b);
        this.i = 3;
        d.a(2132018834);
        if (!b) {
            (this.D = fah.t((View)d, this.c, this.b, 250L)).addListener((Animator$AnimatorListener)new gjs(this, d, 0));
            this.D.start();
        }
        else {
            d.setBackgroundColor(this.b);
        }
        Runnable runnable;
        if (b) {
            runnable = this.o;
            runnable.getClass();
        }
        else {
            runnable = this.k;
            runnable.getClass();
        }
        c.post(runnable);
        if (b2 && !b) {
            final Runnable u = this.u;
            u.getClass();
            c.postDelayed(u, 2000L);
        }
        else if (b3 && !b) {
            final Runnable e = this.E;
            e.getClass();
            c.postDelayed(e, 2000L);
        }
        else {
            Runnable runnable2;
            if (b) {
                runnable2 = this.q;
                runnable2.getClass();
            }
            else {
                runnable2 = this.m;
                runnable2.getClass();
            }
            c.postDelayed(runnable2, 2000L);
        }
        this.F.l(false);
    }
    
    private final Runnable w(final String s) {
        return new fsa(this, s, 8);
    }
    
    public final LayoutTransition a(final boolean b) {
        final LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(1, 0L);
        layoutTransition.setDuration(this.B);
        if (b) {
            layoutTransition.addTransitionListener((LayoutTransition$TransitionListener)new jlh(1));
        }
        return layoutTransition;
    }
    
    public final View$OnLayoutChangeListener b() {
        return (View$OnLayoutChangeListener)new fta(this, 8);
    }
    
    public final ViewGroup c(final boolean b) {
        ViewGroup viewGroup;
        if (b) {
            viewGroup = this.f;
            viewGroup.getClass();
        }
        else {
            viewGroup = this.e;
            viewGroup.getClass();
        }
        return viewGroup;
    }
    
    public final SlimStatusBar d(final boolean b) {
        SlimStatusBar slimStatusBar;
        if (b) {
            slimStatusBar = this.h;
            slimStatusBar.getClass();
        }
        else {
            slimStatusBar = this.g;
            slimStatusBar.getClass();
        }
        return slimStatusBar;
    }
    
    public final Runnable e(final ViewGroup viewGroup, final SlimStatusBar slimStatusBar, final boolean b, final boolean b2, final boolean b3) {
        return new gjr(this, viewGroup, slimStatusBar, b, b2, b3);
    }
    
    public final Runnable f(final boolean b) {
        return (Runnable)new dmu(this, b, 4);
    }
    
    public final Runnable g(final boolean b) {
        return (Runnable)new dmu(this, b, 5);
    }
    
    public final Runnable h(final ViewGroup viewGroup, final SlimStatusBar slimStatusBar) {
        return (Runnable)new vo(this, viewGroup, slimStatusBar, 15);
    }
    
    public final void i() {
        final Animator d = this.D;
        if (d != null) {
            d.cancel();
            this.D = null;
        }
        final AnimatorSet j = this.j;
        if (j != null) {
            j.cancel();
            this.j = null;
        }
    }
    
    public final void j() {
        final ViewGroup e = this.e;
        e.getClass();
        final Runnable l = this.l;
        l.getClass();
        e.removeCallbacks(l);
        final ViewGroup e2 = this.e;
        final Runnable k = this.k;
        k.getClass();
        e2.removeCallbacks(k);
        final ViewGroup e3 = this.e;
        final Runnable m = this.m;
        m.getClass();
        e3.removeCallbacks(m);
        final ViewGroup e4 = this.e;
        final Runnable n = this.n;
        n.getClass();
        e4.removeCallbacks(n);
        final ViewGroup e5 = this.e;
        final Runnable s = this.s;
        s.getClass();
        e5.removeCallbacks(s);
        final ViewGroup e6 = this.e;
        final Runnable u = this.u;
        u.getClass();
        e6.removeCallbacks(u);
        final ViewGroup e7 = this.e;
        final Runnable w = this.w;
        w.getClass();
        e7.removeCallbacks(w);
    }
    
    public final void k() {
        final ViewGroup f = this.f;
        f.getClass();
        final Runnable p = this.p;
        p.getClass();
        f.removeCallbacks(p);
        final ViewGroup f2 = this.f;
        final Runnable o = this.o;
        o.getClass();
        f2.removeCallbacks(o);
        final ViewGroup f3 = this.f;
        final Runnable q = this.q;
        q.getClass();
        f3.removeCallbacks(q);
        final ViewGroup f4 = this.f;
        final Runnable r = this.r;
        r.getClass();
        f4.removeCallbacks(r);
        final ViewGroup f5 = this.f;
        final Runnable v = this.v;
        v.getClass();
        f5.removeCallbacks(v);
    }
    
    public final void l(final boolean b) {
        if (b) {
            this.k();
            return;
        }
        this.j();
    }
    
    public final void m(final int n) {
        ++this.C;
        final wwv n2 = this.A.n();
        n2.l(xkm.aq(n2.h((Object)this.C, wya.c(n), this.C)));
    }
    
    public final void n(final boolean b, final long n) {
        this.i = 1;
        final ViewGroup c = this.c(b);
        Runnable runnable;
        if (b) {
            runnable = this.r;
            runnable.getClass();
        }
        else {
            runnable = this.n;
            runnable.getClass();
        }
        c.postDelayed(runnable, n);
    }
    
    public final void o(final boolean b, final boolean b2) {
        if (b2) {
            this.k();
        }
        else {
            this.j();
        }
        this.i();
        final ViewGroup c = this.c(b2);
        final SlimStatusBar d = this.d(b2);
        d.a(2132018833);
        d.setBackgroundColor(this.c);
        Runnable runnable;
        if (b2) {
            runnable = this.p;
            runnable.getClass();
        }
        else {
            runnable = this.l;
            runnable.getClass();
        }
        c.post(runnable);
        if (b2) {
            this.i = 4;
            final Runnable q = this.q;
            q.getClass();
            c.postDelayed(q, 5000L);
        }
        if (b) {
            this.F.l(true);
        }
    }
    
    public final void p(final boolean b) {
        if (b) {
            this.k();
        }
        else {
            this.j();
        }
        final ViewGroup c = this.c(b);
        final SlimStatusBar d = this.d(b);
        d.a(2132017563);
        d.setBackgroundColor(this.c);
        Runnable runnable;
        if (!b) {
            runnable = this.s;
            runnable.getClass();
        }
        else {
            runnable = this.t;
            runnable.getClass();
        }
        c.post(runnable);
        if (b) {
            this.i = 4;
            final Runnable q = this.q;
            q.getClass();
            c.postDelayed(q, 5000L);
        }
    }
    
    public final void q(final boolean b, final String text) {
        if (!b && text != null) {
            this.j();
            this.i();
            final ViewGroup c = this.c(false);
            final SlimStatusBar d = this.d(false);
            final TextView a = d.a;
            if (a != null) {
                a.setText((CharSequence)text);
            }
            d.setBackgroundColor(this.c);
            this.i = 6;
            final Runnable w = this.w;
            w.getClass();
            c.post(w);
            return;
        }
        this.k();
        this.i();
        this.i = 0;
    }
    
    public final void r(final ViewGroup viewGroup, final SlimStatusBar slimStatusBar) {
        if (viewGroup == this.e) {
            final LayoutTransition x = this.x;
            x.getClass();
            x.setAnimator(3, u(slimStatusBar));
            return;
        }
        final LayoutTransition y = this.y;
        y.getClass();
        y.setAnimator(3, u(slimStatusBar));
    }
    
    public final void s(final boolean b, final boolean b2, final boolean b3, final String s) {
        final boolean b4 = TextUtils.isEmpty((CharSequence)s) ^ true;
        final ViewGroup e = this.e;
        e.getClass();
        final LayoutTransition x = this.x;
        x.getClass();
        e.setLayoutTransition(x);
        final ViewGroup f = this.f;
        f.getClass();
        final LayoutTransition y = this.y;
        y.getClass();
        f.setLayoutTransition(y);
        final int i = this.i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        if (i != 5) {
                            if (!b2) {
                                this.l(b);
                                this.o(true, b);
                                return;
                            }
                            if (b3) {
                                this.p(b);
                                return;
                            }
                            if (!b4) {
                                if (b) {
                                    this.k();
                                }
                                else {
                                    this.j();
                                }
                                final ViewGroup c = this.c(b);
                                Runnable runnable;
                                if (b) {
                                    runnable = this.q;
                                    runnable.getClass();
                                }
                                else {
                                    runnable = this.m;
                                    runnable.getClass();
                                }
                                c.post(runnable);
                                return;
                            }
                            this.q(b, s);
                        }
                        else {
                            if (!b2) {
                                this.l(b);
                                this.o(true, b);
                                return;
                            }
                            if (b4) {
                                this.q(b, s);
                                return;
                            }
                            if (!b3) {
                                this.j();
                                final ViewGroup c2 = this.c(false);
                                final Runnable m = this.m;
                                m.getClass();
                                c2.post(m);
                                return;
                            }
                            this.p(b);
                        }
                    }
                    else {
                        if (!b2) {
                            this.l(b);
                            this.o(true, b);
                            return;
                        }
                        if (b3) {
                            this.p(b);
                            return;
                        }
                        if (b4) {
                            this.q(b, s);
                        }
                    }
                }
                else {
                    this.l(b);
                    if (b2) {
                        this.E = this.w(s);
                        this.v(b, b3, b4);
                        return;
                    }
                    this.o(true, b);
                }
            }
            else if (b2) {
                this.l(b);
                this.i = 0;
                if (b3) {
                    this.p(b);
                    return;
                }
                if (b4) {
                    this.q(b, s);
                }
            }
            return;
        }
        this.l(b);
        if (b2) {
            if (b4) {
                this.q(b, s);
            }
            else if (b3) {
                this.p(b);
            }
            else if (b) {
                this.E = this.w(s);
                this.v(true, false, false);
            }
            this.F.l(false);
            return;
        }
        if (b) {
            this.o(true, true);
            return;
        }
        this.n(false, 3000L);
    }
}
