import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.animation.ArgbEvaluator;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.concurrent.Callable;
import android.os.Build$VERSION;
import android.support.v7.widget.Toolbar;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.ui.actionbar.MainScrollingViewBehavior;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;
import com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxc implements fxt, fyx
{
    private static final int[] t;
    private final fzd A;
    private final ggs B;
    private fzw C;
    private fyw D;
    private final FrameLayout E;
    private final wwu F;
    private adqs G;
    private final arud H;
    public final ElevatedAppBarLayout b;
    final jwz c;
    final jvz d;
    final jvz e;
    public final jvz f;
    public final MainCollapsingToolbarLayout g;
    public final toa h;
    final fxv i;
    final jwa j;
    public View k;
    public RecyclerView l;
    public int m;
    public boolean n;
    public boolean o;
    public int p;
    public Integer q;
    public View r;
    private final fa u;
    private final atjj v;
    private final int w;
    private final jvz x;
    private final jwb y;
    private final MainScrollingViewBehavior z;
    
    static {
        t = new int[] { 2130968584 };
    }
    
    public jxc(final fa u, final AppTabsBar appTabsBar, final ViewGroup viewGroup, final ConstraintLayout constraintLayout, final jwb y, final atjj v, final atjj atjj, final wwu f, final uyf uyf, final fzd a, final jxd x, final jxh d, final jym e, final aexq aexq, final ElevatedAppBarLayout b, final fyy fyy, final bx bx, final arud h, final asho asho, final kzd kzd, final mrm mrm, final ggs b2, final toa h2, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.n = true;
        v.getClass();
        this.v = v;
        u.getClass();
        this.u = u;
        f.getClass();
        this.F = f;
        b.getClass();
        this.b = b;
        y.getClass();
        this.y = y;
        final fzw c = y.c();
        c.getClass();
        this.C = c;
        this.A = a;
        final MainCollapsingToolbarLayout g = (MainCollapsingToolbarLayout)b.findViewById(2131432123);
        this.g = g;
        this.E = (FrameLayout)b.findViewById(2131428265);
        g.a = (fyx)this;
        ((adqt)g).m(false);
        this.x = (jvz)x;
        d.getClass();
        this.d = (jvz)d;
        e.getClass();
        this.e = (jvz)e;
        final jvz f2 = (jvz)((aexw)aexq).a;
        this.f = f2;
        final Toolbar supportActionBar = (Toolbar)b.findViewById(2131432122);
        supportActionBar.getClass();
        ajpg ajpg;
        if ((ajpg = h.f().A) == null) {
            ajpg = ajpg.a;
        }
        final agza builder = ajph.a.createBuilder();
        builder.copyOnWrite();
        ajph.a((ajph)builder.instance);
        final ajph ajph = (ajph)builder.build();
        final ahas b3 = ajpg.b;
        final Long value = 45375139L;
        ajph ajph2 = ajph;
        if (b3.containsKey(value)) {
            ajph2 = b3.get(value);
        }
        if (ajph2.b == 1 && (boolean)ajph2.c) {
            supportActionBar.setImportantForAccessibility(1);
            if (Build$VERSION.SDK_INT >= 28) {
                supportActionBar.setScreenReaderFocusable(false);
            }
            else {
                supportActionBar.setFocusable(false);
            }
        }
        u.setSupportActionBar(supportActionBar);
        this.B = b2;
        this.h = h2;
        this.H = h;
        mrm.A((Callable)new imb(this, kzd, 14));
        final ep supportActionBar2 = u.getSupportActionBar();
        supportActionBar2.getClass();
        final Resources resources = supportActionBar2.b().getResources();
        final fzw c2 = this.C;
        this.j = new jwa(u, this, fyy, resources, supportActionBar, g, (AppBarLayout)b, atjj, uyf, c2.a, c2.j, c2.l, c2.m, c2.n, c2.o, c2.g);
        final aej aej = (aej)viewGroup.getLayoutParams();
        agot.D(aej.a instanceof MainScrollingViewBehavior);
        final MainScrollingViewBehavior z = (MainScrollingViewBehavior)aej.a;
        this.z = z;
        final TypedArray obtainStyledAttributes = ((Activity)u).getTheme().obtainStyledAttributes(new int[] { 16843857 });
        final int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.w = color;
        final int integer = resources.getInteger(2131492869);
        final fzw c3 = this.C;
        this.D = this.C(c3.j, c3.k, c3.q);
        b.setBackground((Drawable)(this.i = new fxv((fxu)this.D, integer)));
        ajpg ajpg2;
        if ((ajpg2 = h.f().A) == null) {
            ajpg2 = ajpg.a;
        }
        final agza builder2 = ajph.a.createBuilder();
        builder2.copyOnWrite();
        ajph.a((ajph)builder2.instance);
        final ajph ajph3 = (ajph)builder2.build();
        final ahas b4 = ajpg2.b;
        final Long value2 = 45371839L;
        ajph ajph4 = ajph3;
        if (b4.containsKey(value2)) {
            ajph4 = b4.get(value2);
        }
        if (ajph4.b == 1 && (boolean)ajph4.c) {
            ((AppBarLayout)b).i((adqn)new jxb(this));
        }
        ajpg ajpg3;
        if ((ajpg3 = h.f().A) == null) {
            ajpg3 = ajpg.a;
        }
        final agza builder3 = ajph.a.createBuilder();
        builder3.copyOnWrite();
        ajph.a((ajph)builder3.instance);
        final ajph ajph5 = (ajph)builder3.build();
        final ahas b5 = ajpg3.b;
        final Long value3 = 45374785L;
        ajph ajph6 = ajph5;
        if (b5.containsKey(value3)) {
            ajph6 = b5.get(value3);
        }
        if (ajph6.b == 1 && (boolean)ajph6.c) {
            ((AppBarLayout)b).i((adqn)(this.G = new adqs(this, 1)));
        }
        final jwz c4 = new jwz((Context)u, this, appTabsBar, constraintLayout, (arhr)new gva(b, 5), g, z, atjj, y, uyf, bx, h, b2, f2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.c = c4;
        final aej aej2 = (aej)((AppBarLayout)c4.b.a()).getLayoutParams();
        final aeh a2 = aej2.a;
        AppBarLayout$Behavior appBarLayout$Behavior;
        if (a2 instanceof AppBarLayout$Behavior) {
            appBarLayout$Behavior = (AppBarLayout$Behavior)a2;
        }
        else {
            appBarLayout$Behavior = new AppBarLayout$Behavior();
            aej2.b((aeh)appBarLayout$Behavior);
        }
        appBarLayout$Behavior.c = new aepj(c4);
        mrm.A((Callable)new ojj(this, uyi, mrm, b, asho, h2, viewGroup, 1, (byte[])null, (byte[])null, (byte[])null));
    }
    
    private final int A(final ActionBarColor actionBarColor) {
        return actionBarColor.mt((Context)this.u);
    }
    
    private final View B(final View view) {
        if (view == null) {
            return null;
        }
        final Object tag = view.getTag(2131430535);
        if (tag != null && ((String)tag).equals(this.u.getString(2132019181))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View b = this.B(viewGroup.getChildAt(i));
            if (b != null) {
                return b;
            }
        }
        return null;
    }
    
    private final fyw C(final ActionBarColor actionBarColor, final ActionBarColor actionBarColor2, final boolean b) {
        final int a = this.A(actionBarColor);
        final int a2 = this.A(actionBarColor2);
        int n = a;
        if (tqt.e((Context)this.u)) {
            n = a;
            if (!b) {
                n = (a | 0xFF000000);
            }
        }
        final fyw d = this.D;
        if (d != null && d.b(n, a2)) {
            return d;
        }
        return new fyw(n, a2);
    }
    
    private final fzw D(final fzw fzw) {
        final fzn c = fzw.c;
        int m;
        if (c != null && c.a) {
            m = 1;
        }
        else {
            m = this.m;
        }
        final fzv b = fzw.b();
        b.n((aexg)new fqk(m, 8));
        final fzw a = b.a();
        this.j.b(a.a, a.j, a.l, a.m, a.n, a.o, a.g);
        final fzv b2 = this.C.b();
        b2.b(a.a);
        this.C = b2.a();
        return a;
    }
    
    private final void E(final acil acil, final Object o) {
        if (acil != null) {
            final acij q = actc.q(acil.a());
            q.a(this.F.n());
            acil.mN(q, o);
        }
    }
    
    private final void F(final ActionBarColor actionBarColor, final boolean b, final fzh fzh) {
        if (this.x()) {
            this.H();
            final ViewGroup viewGroup = (ViewGroup)this.k.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.k);
                ((acir)this.v.a()).b(this.k);
                this.k = null;
                this.K(actionBarColor, b, fzh);
                this.J();
            }
        }
    }
    
    private final void G(final ViewGroup viewGroup) {
        final ViewGroup viewGroup2 = (ViewGroup)this.k.getParent();
        if (viewGroup2 != null && viewGroup2 != viewGroup) {
            viewGroup2.removeView(this.k);
        }
    }
    
    private final void H() {
        this.E.setPadding(0, 0, 0, 0);
    }
    
    private final void I(final ActionBarColor actionBarColor, final fzh fzh, final boolean b) {
        final int c = fzh.c;
        if (c != 0) {
            if (c == 1) {
                this.G((ViewGroup)this.b);
                this.H();
                if (this.k.getParent() == null) {
                    this.b.addView(this.k, -1, -2);
                    ((adqo)this.k.getLayoutParams()).a = 0;
                }
            }
            else {
                this.G((ViewGroup)this.E);
                if (this.k.getParent() == null) {
                    if (c == 2) {
                        this.E.setPadding(0, this.c(), 0, 0);
                    }
                    ajpg ajpg;
                    if ((ajpg = this.H.f().A) == null) {
                        ajpg = ajpg.a;
                    }
                    final agza builder = ajph.a.createBuilder();
                    builder.copyOnWrite();
                    ajph.a((ajph)builder.instance);
                    final ajph ajph = (ajph)builder.build();
                    final ahas b2 = ajpg.b;
                    final Long value = 45375139L;
                    ajph ajph2 = ajph;
                    if (b2.containsKey(value)) {
                        ajph2 = b2.get(value);
                    }
                    if (ajph2.b == 1 && (boolean)ajph2.c) {
                        this.k.setAccessibilityTraversalAfter(2131432122);
                    }
                    this.E.addView(this.k);
                }
                this.m();
            }
            this.K(actionBarColor, b, fzh);
            this.J();
            return;
        }
        throw null;
    }
    
    private final void J() {
        final jwz c = this.c;
        if (c.h.t()) {
            c.k(false);
            this.q();
            final jwz c2 = this.c;
            Label_0250: {
                if ((c2.e.getParent() != ((jvz)c2).d() || !((jvz)c2).j()) && !c2.h.x()) {
                    final PaneDescriptor d = c2.f.d();
                    Label_0230: {
                        if (!tqt.e(((jvz)c2).a)) {
                            alvl alvl;
                            if ((alvl = c2.j.b().e) == null) {
                                alvl = alvl.a;
                            }
                            if (!alvl.aO) {
                                final jvz i = c2.i;
                                if (!gkt.ao(c2.k).h()) {
                                    break Label_0230;
                                }
                                final boolean equals = "always".equals(gkt.ao(c2.k).c());
                                final boolean b = "chip_bar_present".equals(gkt.ao(c2.k).c()) && ((jvz)c2.i).j();
                                if (!equals && !b) {
                                    break Label_0230;
                                }
                            }
                            if (d != null && c2.l.V(d) && !tmy.bq(((jvz)c2).a)) {
                                break Label_0250;
                            }
                        }
                    }
                    ((adqo)this.g.getLayoutParams()).a = 0;
                    this.n = false;
                    return;
                }
            }
            this.u();
            return;
        }
        if (!ana.an((View)c.g)) {
            c.l();
            return;
        }
        final ViewTreeObserver viewTreeObserver = c.g.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new gzz(c, viewTreeObserver, 7));
    }
    
    private final void K(final ActionBarColor actionBarColor, final boolean b, final fzh c) {
        final int a = this.A(actionBarColor);
        Label_0078: {
            if (this.w() || this.s()) {
                final int c2 = c.c;
                if (c2 == 0) {
                    throw null;
                }
                if (c2 == 1) {
                    ((adqt)this.g).j(a | 0xFF000000);
                    this.g.a(b);
                    break Label_0078;
                }
            }
            ((adqt)this.g).i((Drawable)null);
            this.g.a(false);
        }
        this.g.c = c;
    }
    
    private final void L(final fzw fzw) {
        this.d.h(fzw);
        if (fzw.b != null) {
            final fzv b = this.C.b();
            b.a = fzw.b;
            this.C = b.a();
        }
    }
    
    private final int z(final fxu fxu) {
        if (fxu instanceof fyw) {
            return ((fyw)fxu).c;
        }
        return this.w;
    }
    
    public final void a() {
        this.A.b(fzc.a, this.z(this.D));
    }
    
    public final void b(final float n, final fxu fxu, final fxu fxu2) {
        this.A.b(fzc.a, (int)new ArgbEvaluator().evaluate(n, (Object)this.z(fxu), (Object)this.z(fxu2)));
    }
    
    public final int c() {
        final TypedArray obtainStyledAttributes = this.u.getTheme().obtainStyledAttributes(jxc.t);
        final float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        return (int)dimension;
    }
    
    public final int d() {
        return this.D.b;
    }
    
    public final int e() {
        return this.D.c;
    }
    
    public final int f() {
        return this.C.a.e;
    }
    
    public final Parcelable g() {
        ajpg ajpg;
        if ((ajpg = this.H.f().A) == null) {
            ajpg = ajpg.a;
        }
        final agza builder = ajph.a.createBuilder();
        builder.copyOnWrite();
        ajph.a((ajph)builder.instance);
        final ajph ajph = (ajph)builder.build();
        final ahas b = ajpg.b;
        final Long value = 45374785L;
        ajph ajph2 = ajph;
        if (b.containsKey(value)) {
            ajph2 = b.get(value);
        }
        if (ajph2.b == 1 && (boolean)ajph2.c) {
            final Bundle bundle = new Bundle();
            bundle.putInt("instance-offset", this.p);
            return (Parcelable)bundle;
        }
        return null;
    }
    
    public final void h() {
        ((tms)this.c.d).mu();
    }
    
    public final void i() {
        if (!this.t()) {
            return;
        }
        ((AppBarLayout)this.b).setVisibility(8);
        this.J();
    }
    
    public final void j() {
        final fzv b = this.C.b();
        b.a = null;
        final fzw a = b.a();
        this.L(a);
        this.C = a;
    }
    
    public final void k(final Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            return;
        }
        ajpg ajpg;
        if ((ajpg = this.H.f().A) == null) {
            ajpg = ajpg.a;
        }
        final agza builder = ajph.a.createBuilder();
        builder.copyOnWrite();
        ajph.a((ajph)builder.instance);
        final ajph ajph = (ajph)builder.build();
        final ahas b = ajpg.b;
        final Long value = 45374785L;
        ajph ajph2 = ajph;
        if (b.containsKey(value)) {
            ajph2 = b.get(value);
        }
        if (ajph2.b == 1 && (boolean)ajph2.c) {
            this.q = ((Bundle)parcelable).getInt("instance-offset", 0);
            ((AppBarLayout)this.b).m(true, false);
        }
    }
    
    public final void l() {
        final fzw b = this.y.b();
        b.getClass();
        final fzw c = this.C;
        final ActionBarColor j = c.j;
        final ActionBarColor i = b.j;
        if (j != i || c.f != b.f || c.g != b.g) {
            final boolean g = b.g;
            final boolean f = b.f;
            final boolean q = b.q;
            final fzh k = b.i;
            this.z.b = (f && (q || !tqt.e((Context)this.u)));
            this.K(i, g, k);
            this.b.b(this.s());
        }
        final fyw c2 = this.C(b.j, b.k, b.q);
        this.D = c2;
        final fxv l = this.i;
        szc.f();
        Label_0444: {
            if (!c2.a(l.b)) {
                if (l.a.isRunning()) {
                    l.a.cancel();
                }
                if (c2.a(l.b)) {
                    l.c();
                }
                else {
                    l.e((fxu)c2);
                    l.b((fxt)this);
                    agot.E(l.c == null, (Object)"previousDrawableHolder must be null in static state.");
                    agot.E(l.b != null, (Object)"currentDrawableHolder must not be null in static state.");
                    agot.E(l.d != null, (Object)"nextDrawableHolder must not be null in static state.");
                    agot.D(l.g());
                    final boolean f2 = l.f();
                    final String value = String.valueOf(l.c);
                    final String value2 = String.valueOf(l.b);
                    final String value3 = String.valueOf(l.d);
                    final StringBuilder sb = new StringBuilder("All drawables must be unique. Previous ");
                    sb.append(value);
                    sb.append(", current ");
                    sb.append(value2);
                    sb.append(", next ");
                    sb.append(value3);
                    agot.E(f2, (Object)sb.toString());
                    if (!l.a.isStarted()) {
                        l.a.start();
                    }
                    break Label_0444;
                }
            }
            l.d((fxu)c2, (fxt)this);
        }
        final Object h = b.h;
        final ActionBarColor m = b.j;
        final fzh i2 = b.i;
        final boolean g2 = b.g;
        if (h == null) {
            this.F(m, g2, i2);
        }
        else if (this.x() && actc.p(this.k) == ((acir)this.v.a()).c(h)) {
            this.I(m, i2, g2);
            this.E(actc.s(this.k), h);
        }
        else {
            this.F(m, g2, i2);
            final acir acir = (acir)this.v.a();
            final int c3 = i2.c;
            if (c3 == 0) {
                throw null;
            }
            Object o;
            if (c3 == 1) {
                o = this.b;
            }
            else {
                o = this.g;
            }
            final aexq u = actc.u(acir, h, (ViewGroup)o);
            if (!u.h()) {
                this.k = null;
            }
            else {
                final acil acil = (acil)u.c();
                this.E(acil, h);
                this.k = acil.a();
                this.I(m, i2, g2);
            }
        }
        this.c.h(b);
        this.x.h(b);
        this.L(b);
        this.e.h(b);
        final fzw c4 = this.C;
        if (b != c4) {
            if (b.c != null) {
                final fzv b2 = c4.b();
                b2.b = b.c;
                this.C = b2.a();
            }
        }
        this.f.h(b);
        if (b.d != null) {
            final fzv b3 = this.C.b();
            b3.c = b.d;
            this.C = b3.a();
        }
        final fzw d = this.D(b);
        final boolean r = this.C.r;
        final boolean r2 = d.r;
        if (r != r2) {
            if (r2) {
                ((AppBarLayout)this.b).setVisibility(0);
            }
            else {
                ((AppBarLayout)this.b).setVisibility(8);
            }
        }
        this.J();
        this.C = d;
    }
    
    public final void m() {
        final View b = this.B((View)this.b);
        if (b == null) {
            return;
        }
        this.r = b;
        this.b.requestLayout();
    }
    
    public final void n(final RecyclerView l) {
        this.l = l;
        if (l != null) {
            this.g.b(l);
        }
    }
    
    public final void o() {
        if (!this.t()) {
            if (this.C.r) {
                ((AppBarLayout)this.b).setVisibility(0);
                this.J();
            }
        }
    }
    
    public final void p(final fzl a) {
        final fzv b = this.C.b();
        b.a = a;
        this.L(b.a());
    }
    
    public final void q() {
        if (!this.y()) {
            if (!this.v()) {
                final boolean s = this.s();
                boolean b = false;
                if (!s) {
                    b = b;
                    if (!this.x()) {
                        b = true;
                    }
                }
                ((AppBarLayout)this.b).m(true, b);
            }
        }
    }
    
    public final void r() {
        this.m = this.B.c();
        final fzv b = this.C.b();
        b.n((aexg)new joy(this, 9));
        this.D(b.a());
    }
    
    public final boolean s() {
        return this.z.b;
    }
    
    public final boolean t() {
        return this.b.getVisibility() == 0;
    }
    
    public final void u() {
        final adqo adqo = (adqo)this.g.getLayoutParams();
        int a;
        if (this.w()) {
            final int c = this.g.c.c;
            a = 3;
            if (c == 3) {
                a = 19;
            }
        }
        else {
            a = 21;
        }
        adqo.a = a;
        this.n = true;
    }
    
    public final boolean v() {
        if (this.w()) {
            final int e = this.g.e();
            if (e == 0) {
                throw null;
            }
            if (e != 1) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean w() {
        return this.x() && this.k.getParent() == this.E;
    }
    
    public final boolean x() {
        return this.k != null;
    }
    
    public final boolean y() {
        if (this.w()) {
            final MainCollapsingToolbarLayout g = this.g;
            if (((adqt)g).f != null && g.b) {
                return true;
            }
        }
        return false;
    }
}
