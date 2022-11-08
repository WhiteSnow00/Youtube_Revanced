// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.view.View$MeasureSpec;
import java.util.function.Predicate;
import android.widget.FrameLayout$LayoutParams;
import java.util.Iterator;
import j$.util.Optional;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewStub;
import android.content.res.TypedArray;
import app.revanced.integrations.sponsorblock.PlayerController;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import com.google.android.apps.youtube.app.watch.nextgenwatch.overscroll.WatchPanelBehavior;
import com.google.android.apps.youtube.app.watch.nextgenwatch.overscroll.WatchOverscrollBehavior;
import android.widget.RelativeLayout;
import android.view.View;
import android.graphics.Point;
import android.graphics.Paint;
import java.util.ArrayList;

public class NextGenWatchLayout extends lbe implements lbl, kzg, kzk
{
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final kzi G;
    private final kzl H;
    private final ArrayList I;
    private final Paint J;
    private final tnz K;
    private final Point L;
    private final asib M;
    private final atid N;
    private final atid O;
    private final atid P;
    private final asgt Q;
    private final asgt R;
    private final asgt S;
    private View T;
    private View U;
    private View V;
    private View W;
    public lbn a;
    private atjj aa;
    private RelativeLayout ab;
    private ArrayList ac;
    private lbt ad;
    private lbu ae;
    private lbq af;
    private WatchOverscrollBehavior ag;
    private WatchPanelBehavior ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private boolean am;
    private boolean an;
    private boolean ao;
    public lcf b;
    public lbb c;
    public UpForFullController d;
    public utk e;
    public lbz f;
    public iye g;
    public kzj h;
    public jai i;
    public PlayerRotationLatencyLoggerController j;
    public final int k;
    public final atie l;
    public View m;
    lbp n;
    lbr o;
    public boolean p;
    public hob q;
    public lfh r;
    public a s;
    public final xxn t;
    public a u;
    public c v;
    public c w;
    public qpt x;
    private final fxw y;
    private final atid z;
    
    public NextGenWatchLayout(final Context context) {
        this(context, null);
    }
    
    public NextGenWatchLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public NextGenWatchLayout(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        PlayerController.addSkipSponsorView15((View)this);
        this.y = new fxw();
        this.z = atid.aD();
        this.ai = 0;
        (this.J = new Paint()).setColor(tmy.ct(context, 2130970845).orElse(0));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lca.b);
        n = obtainStyledAttributes.getResourceId(6, 0);
        this.A = n;
        agot.D(n != 0);
        this.B = obtainStyledAttributes.getResourceId(3, 0);
        this.C = obtainStyledAttributes.getResourceId(4, 0);
        this.E = obtainStyledAttributes.getResourceId(7, -1);
        n = obtainStyledAttributes.getResourceId(5, 0);
        this.D = n;
        agot.D(n != 0);
        agot.D(obtainStyledAttributes.getResourceId(1, 0) != 0);
        n = obtainStyledAttributes.getResourceId(2, 0);
        this.k = n;
        agot.D(n != 0);
        n = obtainStyledAttributes.getResourceId(8, 0);
        this.F = n;
        agot.D(n != 0);
        obtainStyledAttributes.recycle();
        this.I = new ArrayList();
        this.K = tmy.c(context, 200, 20);
        this.t = new xxn(context, this.q, (byte[])null);
        this.ao = true;
        this.L = new Point();
        this.M = new asib();
        final qpt x = this.x;
        final kzl h = new kzl((lbn)((era)x.a).a.aH.a(), (UpForFullController)((era)x.a).a.fl.a(), (lbb)((era)x.a).a.bV.a(), (FullscreenExitController)((era)x.a).a.cz.a(), (ghj)((era)x.a).a.cA.a(), (lfh)((era)x.a).a.bW.a(), (jaz)((era)x.a).a.bX.a(), (kza)((era)x.a).a.aG.a(), (a)((era)x.a).a.as.a(), this, null, null, null, null);
        this.H = h;
        final kzj h2 = this.h;
        final lbn lbn = (lbn)h2.a.a();
        lbn.getClass();
        final lcf lcf = (lcf)h2.b.a();
        lcf.getClass();
        final lbb lbb = (lbb)h2.c.a();
        lbb.getClass();
        final UpForFullController upForFullController = (UpForFullController)h2.d.a();
        upForFullController.getClass();
        final wwv wwv = (wwv)h2.e.a();
        wwv.getClass();
        final blt blt = (blt)h2.f.a();
        blt.getClass();
        final hob hob = (hob)h2.g.a();
        hob.getClass();
        final ghg ghg = (ghg)h2.h.a();
        ghg.getClass();
        final uyi uyi = (uyi)h2.i.a();
        uyi.getClass();
        final PlayerRotationLatencyLoggerController playerRotationLatencyLoggerController = (PlayerRotationLatencyLoggerController)h2.j.a();
        playerRotationLatencyLoggerController.getClass();
        final ghd ghd = (ghd)h2.k.a();
        ghd.getClass();
        final lfh lfh = (lfh)h2.l.a();
        lfh.getClass();
        final abrx abrx = (abrx)h2.m.a();
        abrx.getClass();
        final a a = (a)h2.n.a();
        a.getClass();
        this.G = new kzi(lbn, lcf, lbb, upForFullController, wwv, blt, hob, ghg, uyi, playerRotationLatencyLoggerController, ghd, lfh, abrx, a, h, this, null, null, null, null, null, null);
        final atid ad = atid.aD();
        this.N = ad;
        final atid ae = atid.aE((Object)0);
        this.O = ae;
        this.l = ((atie)atig.aD()).aK();
        this.P = atid.aD();
        this.Q = ((asgt)ad).B((asjd)kbz.u).L((asjc)kzo.m);
        final asgt ad2 = ((asgt)ae).p().ax().aD();
        this.R = ad2;
        this.S = ad2.L((asjc)kzo.n).Y((asjc)new kpm(this, 20)).ax().aD();
    }
    
    private final kxs E() {
        final kyz b = kyv.b(this.a.d(1));
        if (b instanceof kxs) {
            return (kxs)b;
        }
        if (b instanceof kyw) {
            final kyw kyw = (kyw)b;
            final kyz a = kyw.a;
            if (a instanceof kxs) {
                return (kxs)a;
            }
            final kyz b2 = kyw.b;
            if (b2 instanceof kxs) {
                return (kxs)b2;
            }
        }
        return null;
    }
    
    private final void F() {
        super.bringChildToFront(this.T);
        super.bringChildToFront(this.m);
        super.bringChildToFront(this.V);
        final View w = this.W;
        if (w instanceof ViewStub) {
            super.bringChildToFront(w);
        }
        if (!this.p) {
            super.bringChildToFront((View)this.aa.a());
        }
        for (int size = this.I.size(), i = 0; i < size; ++i) {
            super.bringChildToFront((View)this.I.get(i));
        }
        if (this.p) {
            super.bringChildToFront((View)this.aa.a());
        }
        super.bringChildToFront(this.U);
    }
    
    private final void G(final boolean b) {
        final ViewParent parent = this.getParent();
        if (parent == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(b);
    }
    
    private final void H(final int n, final MotionEvent motionEvent) {
        if (!this.K()) {
            return;
        }
        this.G(false);
        this.al = -this.K.c(motionEvent);
        if (!this.u.o()) {
            this.G.e(n, this.ai, this.ak);
        }
        this.ai = 0;
        this.P.tr((Object)n);
        final atid n2 = this.N;
        final Integer value = 0;
        n2.tr((Object)value);
        this.O.tr((Object)value);
    }
    
    private final void I() {
        final boolean g = this.a.b.g();
        tmy.v(this.m, g);
        for (int size = this.I.size(), i = 0; i < size; ++i) {
            tmy.v((View)this.I.get(i), g);
        }
        tmy.v(this.T, this.a.q());
        tmy.v(this.U, lbn.s(this.a.c().o()));
        tmy.v(this.V, this.a.p());
        tmy.v((View)this.aa.a(), this.a.p());
        if (this.a.r()) {
            if (tmy.bq(this.getContext())) {
                final View w = this.W;
                if (w instanceof ViewStub && w.getParent() instanceof ViewGroup) {
                    final View inflate = ((ViewStub)this.W).inflate();
                    this.W = inflate;
                    this.y.c((View)inflate);
                }
            }
            if (!this.y.d()) {
                final View w2 = this.W;
                if (!(w2 instanceof ViewStub) && w2 != null) {
                    this.y.c((View)w2);
                }
            }
        }
        final View w3 = this.W;
        if (w3 != null && !(w3 instanceof ViewStub)) {
            tmy.v(w3, this.a.r());
        }
    }
    
    private final boolean J(final Canvas canvas, final View view, final long n) {
        final xxn t = this.t;
        if (view == t.d) {
            if (view.getVisibility() == 0) {
                if (!t.k()) {
                    ((Drawable)t.b).draw(canvas);
                }
                ((Drawable)t.a).draw(canvas);
            }
        }
        return super.drawChild(canvas, view, n);
    }
    
    private final boolean K() {
        return this.ai != 0;
    }
    
    private final boolean L(final int e, final int f) {
        this.a.l((kyy)this);
        final lbn a = this.a;
        final int f2 = ana.f((View)this);
        final int n = 0;
        final boolean b = true;
        final boolean b2 = f2 == 1;
        final kyv g = a.g;
        if (g != null) {
            g.c(b2);
        }
        for (int i = 0; i < a.c.size(); ++i) {
            ((kyv)a.c.valueAt(i)).c(b2);
        }
        final lbn a2 = this.a;
        boolean b3 = b;
        if (e == a2.e) {
            b3 = (f != a2.f && b);
        }
        a2.e = e;
        a2.f = f;
        final kyv g2 = a2.g;
        int j = n;
        if (g2 != null) {
            g2.A(e, f);
            j = n;
        }
        while (j < a2.c.size()) {
            ((kyv)a2.c.valueAt(j)).A(a2.e, a2.f);
            ++j;
        }
        this.a.i((kyy)this);
        return b3;
    }
    
    public final void A() {
        final boolean p = this.p;
        int i = 0;
        int n;
        if (!p || this.an) {
            n = 0;
        }
        else {
            n = 4;
        }
        this.m.setImportantForAccessibility(n);
        for (ArrayList j = this.I; i < j.size(); ++i) {
            ((View)j.get(i)).setImportantForAccessibility(n);
        }
        this.F();
    }
    
    public final void B(final RelativeLayout relativeLayout, final RelativeLayout a) {
        ((ViewGroup)this.aa.a()).addView((View)a);
        this.o.a = (View)a;
        ((ViewGroup)this.aa.a()).addView((View)relativeLayout, new ViewGroup$LayoutParams(-1, -1));
        this.ab = relativeLayout;
        final lbp n = this.n;
        n.e = (View)relativeLayout;
        n.b.c(asgt.e((aujo)n.a.g().o, (aujo)n.f.e, (asit)kwo.k).al((asix)new kzx(n, 9)));
        if (this.ag != null) {
            this.e.g().b.w(this.e.g(), (View)relativeLayout);
            ((aej)relativeLayout.getLayoutParams()).b((aeh)this.ag);
        }
        this.z.tr((Object)true);
    }
    
    public final void C(final RelativeLayout relativeLayout, final RelativeLayout relativeLayout2) {
        ((ViewGroup)this.aa.a()).removeView((View)relativeLayout2);
        final lbr o = this.o;
        if (o.a == relativeLayout2) {
            o.a = null;
        }
        ((ViewGroup)this.aa.a()).removeView((View)relativeLayout);
        final lbp n = this.n;
        if (n.e == relativeLayout) {
            n.e = null;
            n.b.b();
        }
        this.ab = null;
        this.z.tr((Object)false);
    }
    
    public final void D() {
        if (!this.ao) {
            this.ao = true;
            this.invalidate();
        }
    }
    
    public final void addChildrenForAccessibility(final ArrayList list) {
        super.addChildrenForAccessibility(list);
        if (!this.a.f()) {
            if (!this.a.t()) {
                Collections.sort((List<Object>)list, new lbi(this, 0));
            }
        }
    }
    
    public final asgt b() {
        return (asgt)this.P;
    }
    
    public final int c() {
        return this.al;
    }
    
    public final FlexyBehavior d() {
        final kxs e = this.E();
        if (e != null) {
            return e.e;
        }
        return null;
    }
    
    protected final boolean drawChild(final Canvas canvas, final View view, final long n) {
        if (view == this.T) {
            final int save = canvas.save();
            final boolean j = this.J(canvas, view, n);
            canvas.restoreToCount(save);
            return j;
        }
        if (view != this.V && view != this.W && view != this.aa.a()) {
            return this.J(canvas, view, n);
        }
        Rect rect;
        if (view == this.W) {
            rect = this.ae.c();
        }
        else if (view == this.aa.a()) {
            rect = ((lbt)this.af).c();
        }
        else if (view == this.ab) {
            rect = ((lbt)this.n).c();
        }
        else {
            rect = this.ad.c();
        }
        float n2;
        if (view == this.W) {
            n2 = this.ae.a();
        }
        else if (view == this.aa) {
            n2 = ((lbt)this.af).a();
        }
        else if (view == this.ab) {
            n2 = ((lbt)this.n).a();
        }
        else {
            n2 = this.ad.a();
        }
        final int save2 = canvas.save();
        canvas.clipRect(rect);
        if (view != this.aa.a() && this.p() && n2 > 0.0f && n2 < 1.0f) {
            canvas.drawRect(rect, this.J);
        }
        final boolean i = this.J(canvas, view, n);
        canvas.restoreToCount(save2);
        return i;
    }
    
    public final asgt e() {
        return this.R;
    }
    
    public final asgt f() {
        return this.S;
    }
    
    public final asgt g() {
        return this.Q;
    }
    
    public final kxm h() {
        return (kxm)this.E();
    }
    
    public final View i() {
        return this.T;
    }
    
    public final View j() {
        return this.U;
    }
    
    public final void k(final kyy kyy) {
        this.a.i(kyy);
    }
    
    public final WatchPanelBehavior l() {
        return this.ah;
    }
    
    public final void m(final int n) {
        if (!this.a.b.h(n) && !this.r.e()) {
            return;
        }
        final kzi g = this.G;
        final kzn f = g.f;
        if (f != null) {
            f.c();
        }
        g.f = null;
        g.i.d(Optional.empty());
        g.a.n((kyz)null);
        final xxn t = this.t;
        float n2;
        if (n == 2) {
            n2 = 1.0f;
        }
        else {
            n2 = 0.0f;
        }
        t.j(n2);
    }
    
    public final boolean n() {
        final lbb c = this.c;
        if (!c.b() || !c.b.u() || c.j || c.d.c()) {
            if (!this.a.f() && !this.a.e()) {
                return false;
            }
        }
        final jai i = this.i;
        if (i.f) {
            final fkk j = i.a.j();
            if (j == fkk.d || j.c()) {
                if (i.j()) {
                    return false;
                }
                final tmt f = ((jad)i.c.a()).f;
                if (f != null && f.d()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final boolean o() {
        return this.am;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gej.b();
        final lbn a = this.a;
        final kyv g = a.g;
        int i;
        final int n = i = 0;
        if (g != null) {
            g.y();
            i = n;
        }
        while (i < a.c.size()) {
            ((kyv)a.c.get(i)).y();
            ++i;
        }
        final lbz f = this.f;
        f.c.c(asgt.e((aujo)f.b.a(), (aujo)f.a.k().i(asgm.e), (asit)kwo.l).p().al((asix)new kzx(f, 10)));
        if (gkt.au(f.i)) {
            final asib c = f.c;
            asic asic;
            if (((uyi)f.f.cd().h).bx()) {
                asic = f.f.R().am((asix)new kzx(f, 11), (asix)kul.r);
            }
            else {
                asic = f.f.Q().R().P(f.g).am((asix)new kzx(f, 11), (asix)kul.r);
            }
            c.c(asic);
        }
        this.M.b();
        this.M.c(this.e.g().o.L((asjc)new kpm(this, 19)).p().al((asix)new kzx(this, 8)));
        for (final lcd lcd : this.v.a) {
            if (lcd.c()) {
                lcd.a();
            }
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gej.b();
        final lbn a = this.a;
        final kyv g = a.g;
        int i;
        final int n = i = 0;
        if (g != null) {
            g.z();
            i = n;
        }
        while (i < a.c.size()) {
            ((kyv)a.c.get(i)).z();
            ++i;
        }
        this.f.c.b();
        this.M.b();
        for (final lcd lcd : this.v.a) {
            if (lcd.c()) {
                lcd.b();
            }
        }
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        final View viewById = this.findViewById(this.A);
        this.m = viewById;
        if (viewById instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)viewById;
            viewGroup.setDescendantFocusability(262144);
            final View view = new View(this.getContext());
            view.setImportantForAccessibility(2);
            view.setFocusable(true);
            viewGroup.addView(view, 0, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(1, 1));
        }
        this.V = this.findViewById(this.D);
        this.W = this.findViewById(this.E);
        this.T = this.findViewById(this.B);
        this.aa = (atjj)new lbj(this);
        this.m.setFocusableInTouchMode(true);
        ana.N(this.m, (akv)new lbk(this));
        this.U = this.findViewById(this.C);
        final lbn a = this.a;
        this.ad = new lbt(a, this.V);
        this.ae = new lbu(a, (fyv)this.y);
        (this.ac = new ArrayList()).add(this.ad);
        this.ac.add(this.ae);
        final lbq af = new lbq(this.a, (View)this.aa.a());
        this.af = af;
        this.ac.add(af);
        final lbp n = new lbp(this.a, this.e, this.q, this.af, (byte[])null);
        this.n = n;
        this.ac.add(n);
        final lbr o = new lbr(this.a);
        this.o = o;
        this.ac.add(o);
        final FlexyBehavior d = this.d();
        if (d != null) {
            final utk utk = (utk)((atjj)this.w.a).a();
            utk.getClass();
            this.ag = new WatchOverscrollBehavior(utk, d);
            this.ah = new WatchPanelBehavior(this.getContext(), d, this.G);
            if (this.u.o()) {
                final a s = this.s;
                ((atjd)s.b).tp((Object)new c(new kzr[] { (kzr)this, this.ah, (kzr)s.a }));
            }
        }
        final View viewById2 = this.findViewById(this.F);
        if (viewById2 instanceof ViewStub) {
            final View m = this.g.m((ViewStub)viewById2, (Predicate)kzw.c);
            this.I.add(m);
            if (m instanceof ViewGroup) {
                ((ViewGroup)m).setDescendantFocusability(393216);
            }
        }
        final xxn t = this.t;
        View view3;
        final View view2 = view3 = this.T;
        if (view2 instanceof ViewStub) {
            view3 = ((ViewStub)view2).inflate();
        }
        t.d = view3;
        this.T = view3;
        final xxn t2 = this.t;
        View view5;
        final View view4 = view5 = this.U;
        if (view4 instanceof ViewStub) {
            view5 = ((ViewStub)view4).inflate();
        }
        t2.c = view5;
        this.U = view5;
        this.F();
        this.I();
        final lbz f = this.f;
        final View i = this.m;
        ana.N(f.d = i, (akv)new lby(f, i));
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        gej.b();
        final int n = (int)motionEvent.getX();
        final int n2 = (int)motionEvent.getY();
        final boolean h = this.r.h();
        final boolean b = true;
        if (h) {
            return true;
        }
        if (this.n() && this.isEnabled()) {
            if (this.ab != null && this.e.w() && this.a.p()) {
                if (this.K.f == -1) {
                    if (this.e.g().u) {
                        return false;
                    }
                    if (((lbt)this.n).c().contains(n, n2)) {
                        return false;
                    }
                }
            }
            final int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    final int n3 = 3;
                    int ai = 2;
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return this.K();
                        }
                    }
                    else {
                        if (this.K()) {
                            return true;
                        }
                        this.a.f();
                        int d = this.K.d(motionEvent, 1);
                        final int a = this.G.g.a(d);
                        if (a == 0) {
                            return this.K();
                        }
                        final kzi g = this.G;
                        final Point l = this.L;
                        if (a == 128 || a == 512) {
                            final lbb c = g.c;
                            final lbc g2 = c.g;
                            if (!g2.c || Math.abs(motionEvent.getX() - g2.d) >= Math.abs(motionEvent.getY() - g2.e)) {
                                if (!c.i || !c.k || motionEvent.getPointerCount() != 1) {
                                    return this.K();
                                }
                            }
                            final lbc g3 = c.g;
                            if (l.x >= c.b.a().width() - g3.b || l.y <= g3.a) {
                                return this.K();
                            }
                        }
                        if (this.K.i(motionEvent, 1) && !this.r.e()) {
                            if (d != 1) {
                                if (d == 3) {
                                    d = n3;
                                }
                                else {
                                    ai = 1;
                                }
                            }
                            this.ai = ai;
                            this.aj = 0;
                            this.ak = 0;
                            this.al = 0;
                            this.O.tr((Object)ai);
                            this.N.tr((Object)d);
                            if (!this.u.o()) {
                                this.G.g(d);
                            }
                            this.G(true);
                            return this.K();
                        }
                        return this.K();
                    }
                }
                this.H(0, motionEvent);
                this.K.g();
            }
            else {
                final kyz c2 = this.a.c();
                final boolean contains = c2.u().contains(n, n2);
                final boolean b2 = this.a.q() && c2.t().contains(n, n2);
                boolean am = b;
                if (!contains) {
                    am = (b2 && b);
                }
                this.am = am;
                if (am) {
                    this.K.h(motionEvent);
                    this.L.set(n, n2);
                }
            }
            return this.K();
        }
        return false;
    }
    
    protected final void onLayout(final boolean b, int i, int n, int n2, int n3) {
        if (this.a.t()) {
            return;
        }
        final ArrayList ac = this.ac;
        lbo lbo;
        Rect b2;
        for (n = ac.size(), i = 0; i < n; ++i) {
            lbo = (lbo)ac.get(i);
            if (lbo.g()) {
                b2 = lbo.b();
                if (b2.width() > 0 && b2.height() > 0) {
                    lbo.e().layout(0, 0, b2.width(), b2.height());
                }
                lbo.f();
                lbo.e().setAlpha(lbo.a());
            }
        }
        final kyz c = this.a.c();
        final Rect u = c.u();
        lkn.t(this.m, b, u.left, u.top, u.left + this.m.getMeasuredWidth(), u.top + this.m.getMeasuredHeight());
        View view;
        for (n = this.I.size(), i = 0; i < n; ++i) {
            view = this.I.get(i);
            lkn.t(view, b, u.left, u.top, u.left + view.getMeasuredWidth(), u.top + view.getMeasuredHeight());
        }
        if (this.a.q()) {
            final Rect t = c.t();
            lkn.t(this.T, b, t.left, t.top, t.left + this.T.getMeasuredWidth(), t.top + this.T.getMeasuredHeight());
        }
        final xxn t2 = this.t;
        if (t2.k()) {
            if (t2.c != null) {
                final Rect u2 = c.u();
                final Object c2 = t2.c;
                n = u2.left;
                final int top = u2.top;
                n2 = u2.left;
                n3 = ((View)t2.c).getMeasuredWidth();
                final int top2 = u2.top;
                i = ((View)t2.c).getMeasuredHeight();
                lkn.t((View)c2, true, n, top, n2 + n3, top2 + i);
            }
        }
        else if (t2.c != null) {
            final Rect t3 = c.t();
            final Object c3 = t2.c;
            final int left = t3.left;
            i = t3.top;
            n2 = t3.left;
            n = ((View)t2.c).getMeasuredWidth();
            n3 = t3.top;
            lkn.t((View)c3, true, left, i, n2 + n, n3 + ((View)t2.c).getMeasuredHeight());
        }
        if (b) {
            final PlayerRotationLatencyLoggerController j = this.j;
            Label_0706: {
                if (j.d) {
                    if (((j.a.b() != 3 || j.h != 1 || ((fai)j.b.a()).j()) && (j.a.b() != 1 || j.h != 3 || j.i) && (j.a.b() != 3 || j.h != 3 || !j.g.g())) || j.j == j.k) {
                        if (!j.l) {
                            break Label_0706;
                        }
                        if (!j.f) {
                            break Label_0706;
                        }
                    }
                    j.l = false;
                    j.k();
                    j.c.b();
                    return;
                }
            }
            if ((j.k != j.j && j.a.b() != j.h) || j.j == 0) {
                j.k();
                return;
            }
            if (j.d && j.a.b() == j.h) {
                j.c.a();
            }
        }
    }
    
    protected final void onMeasure(int i, int n) {
        View$MeasureSpec.getSize(i);
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(i);
        super.onMeasure(i, n);
        final Object[] array = null;
        final boolean l = this.L(size2, size);
        this.I();
        if (this.a.t() && !l) {
            return;
        }
        final ArrayList ac = this.ac;
        final int size3 = ac.size();
        n = 0;
        lbo lbo;
        Rect b;
        for (i = 0; i < size3; ++i) {
            lbo = (lbo)ac.get(i);
            if (lbo.g()) {
                b = lbo.b();
                lbo.e().measure(View$MeasureSpec.makeMeasureSpec(b.width(), 1073741824), View$MeasureSpec.makeMeasureSpec(b.height(), 1073741824));
            }
        }
        final kyz c = this.a.c();
        if (this.a.q()) {
            final Rect t = c.t();
            this.T.measure(View$MeasureSpec.makeMeasureSpec(t.width(), 1073741824), View$MeasureSpec.makeMeasureSpec(t.height(), 1073741824));
            final xxn t2 = this.t;
            if (t2.c != null) {
                Rect rect;
                if (t2.k()) {
                    rect = c.u();
                }
                else {
                    rect = c.t();
                }
                final Object c2 = t2.c;
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(rect.width(), 1073741824);
                i = View$MeasureSpec.makeMeasureSpec(rect.height(), 1073741824);
                ((View)c2).measure(measureSpec, i);
            }
        }
        final Rect u = c.u();
        final int width = u.width();
        final int height = u.height();
        this.m.measure(View$MeasureSpec.makeMeasureSpec(width, 1073741824), View$MeasureSpec.makeMeasureSpec(height, 1073741824));
        int size4;
        for (size4 = this.I.size(), i = n; i < size4; ++i) {
            this.I.get(i).measure(View$MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
        }
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.L(n, n2);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        gej.b();
        if (this.r.h()) {
            this.K.g();
            return true;
        }
        final boolean k = this.K();
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        if (!k) {
            return false;
        }
        this.K.e(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                final int n4 = 3;
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.H(0, motionEvent);
                        this.K.g();
                    }
                }
                else {
                    final int ai = this.ai;
                    int n5;
                    if (ai == 1) {
                        final tnz i = this.K;
                        final int pointerIndex = motionEvent.findPointerIndex(i.f);
                        if (pointerIndex >= 0) {
                            final float y = motionEvent.getY(pointerIndex);
                            n3 = (int)(i.e - y);
                            i.e = y;
                        }
                        n5 = -n3;
                    }
                    else {
                        n5 = n;
                        if (ai == 2) {
                            n5 = -this.K.b(motionEvent);
                        }
                    }
                    Label_0378: {
                        if (!this.r.h()) {
                            final int ai2 = this.ai;
                            if (ai2 == 1) {
                                this.ak += n5;
                                if (this.d.j()) {
                                    final lbn a = this.a;
                                    if (a != null && a.e()) {
                                        if (this.r.c() == 1) {
                                            break Label_0378;
                                        }
                                    }
                                }
                            }
                            else if (ai2 == 2) {
                                this.aj += n5;
                                if (!this.u.o()) {
                                    final kzi g = this.G;
                                    int n6 = n4;
                                    if (this.aj < 0) {
                                        n6 = 1;
                                    }
                                    g.g(n6);
                                }
                            }
                            final atie l = this.l;
                            int n7;
                            if (this.ai == 1) {
                                n7 = this.ak;
                            }
                            else {
                                n7 = this.aj;
                            }
                            l.tr((Object)n7);
                            if (!this.u.o()) {
                                this.G.f(this.s());
                            }
                        }
                    }
                    if (this.r.e() && this.s() >= 0.25f && ((Optional)this.r.e).filter((Predicate)krp.s).isPresent()) {
                        if (this.r.c() == 64) {
                            this.H(1, motionEvent);
                        }
                        else {
                            this.H(2, motionEvent);
                        }
                        this.K.g();
                    }
                }
            }
            else {
                final int ai3 = this.ai;
                int n8;
                if (ai3 == 1) {
                    n8 = this.K.j(motionEvent, 1);
                }
                else {
                    n8 = n2;
                    if (ai3 == 2) {
                        n8 = this.K.j(motionEvent, 2);
                    }
                }
                this.H(n8, motionEvent);
                this.K.g();
            }
        }
        else {
            this.K.h(motionEvent);
        }
        return true;
    }
    
    public final void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        if (view == null) {
            return;
        }
        if (this.m == view) {
            throw new IllegalStateException("Player view must not be removed.");
        }
        if (this.V != view) {
            this.I.remove(view);
            return;
        }
        throw new IllegalStateException("Metadata view must not be removed.");
    }
    
    public final boolean p() {
        return this.t.k();
    }
    
    public final void qA(final kyz kyz) {
        gej.b();
        if (this.an != this.a.u()) {
            this.an = this.a.u();
            this.A();
        }
        if (this.isInLayout()) {
            this.post((Runnable)new kxw(this, 2));
        }
        else {
            this.requestLayout();
        }
        if (this.a.p()) {
            final ArrayList ac = this.ac;
            for (int size = ac.size(), i = 0; i < size; ++i) {
                ((lbo)ac.get(i)).f();
            }
        }
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        super.requestDisallowInterceptTouchEvent(b);
        this.K.g();
    }
    
    public final float s() {
        final int a = this.G.a(this.ai);
        final int min = Math.min(0, a);
        final int max = Math.max(0, a);
        final int ai = this.ai;
        int n;
        if (ai == 1) {
            n = aeh.t(this.ak, min, max);
            this.ak = n;
        }
        else {
            if (ai != 2) {
                return 0.0f;
            }
            n = aeh.t(this.aj, min, max);
            this.aj = n;
        }
        return n / (float)a;
    }
    
    public final View t() {
        return this.m;
    }
    
    public final fyv u() {
        return (fyv)this.y;
    }
    
    public final kzi v() {
        return this.G;
    }
    
    public final kzl w() {
        return this.H;
    }
    
    public final lbn x() {
        return this.a;
    }
    
    public final void y(final int n) {
        final kzi g = this.G;
        final int b = g.g.b(n);
        final boolean g2 = g.a.b.g();
        float d = 0.0f;
        int n2;
        if (!g2 && g.j.S(32, b)) {
            g.b.b(g.g.b(2), b, 0.0f);
            g.h.m(2);
            n2 = g.c(2, 32, n, b);
        }
        else {
            n2 = g.b(n, b);
        }
        if (n2 == 2) {
            this.m(n);
            return;
        }
        final kzn f = g.f;
        f.getClass();
        if (n2 == 1) {
            d = f.d.d;
        }
        f.f(d, new kzh(g, g.d, g.e));
    }
    
    public final void z(final int n) {
        this.m(n);
    }
}
