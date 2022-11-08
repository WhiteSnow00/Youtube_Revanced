import android.view.ViewGroup$MarginLayoutParams;
import java.util.Collection;
import android.animation.AnimatorInflater;
import android.animation.Animator;
import java.util.ArrayList;
import java.util.List;
import android.animation.AnimatorSet;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class izo implements izg, fti
{
    protected final aceo a;
    protected final Context b;
    protected View c;
    protected View d;
    protected View e;
    protected ImageView f;
    protected View g;
    protected View h;
    protected agyc i;
    protected agyc j;
    protected AnimatorSet k;
    protected AnimatorSet l;
    protected AnimatorSet m;
    protected AnimatorSet n;
    protected AnimatorSet o;
    protected AnimatorSet p;
    protected AnimatorSet q;
    public Object r;
    public roi s;
    protected boolean t;
    protected boolean u;
    public int v;
    protected int w;
    protected int x;
    protected int y;
    private final wwv z;
    
    public izo(final Context b, final aceo a, final wwv z) {
        this.u = false;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.z = z;
        this.d();
    }
    
    public final void a(final Object o, final List list) {
        final roi s = this.s;
        if (s != null) {
            s.l(o, list);
        }
    }
    
    public final void b(final View view) {
        try {
            if (this.c != null) {
                return;
            }
            new tnw(this.b);
            this.h(view);
            final ArrayList<Animator> list = new ArrayList<Animator>();
            this.k = new AnimatorSet();
            final Animator clone = AnimatorInflater.loadAnimator(this.b, 2130837564).clone();
            clone.setTarget((Object)this.f);
            list.add(clone);
            this.k.playTogether((Collection)list);
            final ArrayList<Animator> list2 = new ArrayList<Animator>();
            this.l = new AnimatorSet();
            final Animator clone2 = AnimatorInflater.loadAnimator(this.b, 2130837526).clone();
            clone2.setTarget((Object)this.f);
            list2.add(clone2);
            this.l.playTogether((Collection)list2);
            final ArrayList<Animator> list3 = new ArrayList<Animator>();
            this.m = new AnimatorSet();
            final Animator clone3 = AnimatorInflater.loadAnimator(this.b, 2130837563).clone();
            clone3.setTarget((Object)this.d);
            list3.add(clone3);
            final Animator clone4 = AnimatorInflater.loadAnimator(this.b, 2130837565).clone();
            clone4.setTarget((Object)this.e);
            list3.add(clone4);
            this.m.playTogether((Collection)list3);
            this.n = new AnimatorSet();
            final ArrayList<Animator> list4 = new ArrayList<Animator>();
            final Animator clone5 = AnimatorInflater.loadAnimator(this.b, 2130837525).clone();
            clone5.setTarget((Object)this.d);
            list4.add(clone5);
            final Animator clone6 = AnimatorInflater.loadAnimator(this.b, 2130837527).clone();
            clone6.setTarget((Object)this.e);
            list4.add(clone6);
            this.n.playTogether((Collection)list4);
            final ArrayList<Animator> list5 = new ArrayList<Animator>();
            this.o = new AnimatorSet();
            final Animator clone7 = AnimatorInflater.loadAnimator(this.b, 2130837562).clone();
            clone7.setTarget((Object)this.h);
            list5.add(clone7);
            this.o.playTogether((Collection)list5);
            final ArrayList<Animator> list6 = new ArrayList<Animator>();
            this.p = new AnimatorSet();
            final Animator clone8 = AnimatorInflater.loadAnimator(this.b, 2130837524).clone();
            clone8.setTarget((Object)this.h);
            list6.add(clone8);
            this.p.playTogether((Collection)list6);
            final ArrayList<AnimatorSet> list7 = new ArrayList<AnimatorSet>();
            this.q = new AnimatorSet();
            list7.add(this.l.clone());
            list7.add(this.n.clone());
            list7.add(this.p.clone());
            this.q.playTogether((Collection)list7);
            this.q.setDuration(0L);
            this.k();
            this.l();
            this.i();
        }
        catch (final Exception ex) {
            zjp.c(zjo.a, zjn.a, "Error inflating YouTubeBaseCollapsibleAdCtaInnerOverlay:", (Throwable)ex);
        }
    }
    
    public void c() {
        final View c = this.c;
        if (c != null) {
            int n;
            if (!this.u) {
                n = 0;
            }
            else {
                n = 30;
            }
            tmy.aF(c, tmy.aq(n), (Class)ViewGroup$MarginLayoutParams.class);
        }
    }
    
    public void d() {
        this.v = 1;
        this.w = 1;
        this.x = 1;
        this.y = 1;
        if (this.c != null) {
            this.i();
            this.k();
            this.l();
        }
        this.s = null;
        this.t = false;
        this.r = null;
    }
    
    public final void e(final boolean u) {
        this.u = u;
    }
    
    public final void f(final roi s) {
        this.s = s;
    }
    
    public final void g(int v, final boolean t) {
        if (this.f == null) {
            return;
        }
        final int v2 = this.v;
        if (v2 != v || this.t != t) {
            this.w = v2;
            this.v = v;
            this.t = t;
            this.k();
            this.l();
            v = this.v;
            final int n = v - 1;
            if (v == 0) {
                throw null;
            }
            if (n == 1) {
                this.j(this.t);
                return;
            }
            if (n == 2) {
                this.i();
                return;
            }
            if (n != 3) {
                if (n == 4) {
                    final boolean t2 = this.t;
                    this.j(false);
                    final ArrayList list = new ArrayList();
                    list.add(this.o.clone());
                    if (this.w == 4) {
                        list.add(this.n.clone());
                    }
                    final AnimatorSet set = new AnimatorSet();
                    if (!t2) {
                        set.setDuration(0L);
                    }
                    set.playTogether((Collection)list);
                    set.start();
                    final agyc j = this.j;
                    if (j != null) {
                        this.z.t((wxz)new wws(j), (alff)null);
                    }
                }
            }
            else {
                final boolean t3 = this.t;
                this.j(false);
                final ArrayList list2 = new ArrayList();
                list2.add(this.m.clone());
                if (this.w == 5) {
                    list2.add(this.p.clone());
                }
                final AnimatorSet set2 = new AnimatorSet();
                if (!t3) {
                    set2.setDuration(0L);
                }
                set2.playTogether((Collection)list2);
                set2.start();
                final agyc i = this.i;
                if (i != null) {
                    this.z.t((wxz)new wws(i), (alff)null);
                }
            }
        }
    }
    
    protected abstract void h(final View p0);
    
    protected final void i() {
        this.q.start();
    }
    
    protected final void j(final boolean b) {
        final AnimatorSet clone = this.k.clone();
        if (!b) {
            ((Animator)clone).setDuration(0L);
        }
        ((Animator)clone).start();
    }
    
    protected final void k() {
        this.h.setClickable(false);
        this.f.setClickable(false);
        final boolean clickable = this.v == 5;
        if (this.y == 2) {
            this.h.setClickable(clickable);
            this.f.setClickable(false);
        }
        if (this.y == 3) {
            this.h.setClickable(clickable);
            this.f.setClickable(clickable);
        }
    }
    
    protected final void l() {
        this.g.setClickable(false);
        this.d.setClickable(false);
        final boolean clickable = this.v == 4;
        if (this.x == 2) {
            this.g.setClickable(clickable);
            this.d.setClickable(false);
        }
        if (this.x == 3) {
            this.g.setClickable(clickable);
            this.d.setClickable(clickable);
        }
    }
}
