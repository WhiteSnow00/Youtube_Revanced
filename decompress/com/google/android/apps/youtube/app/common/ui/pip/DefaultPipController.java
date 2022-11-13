// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.pip;

import java.util.Set;
import android.app.Activity;
import java.util.function.Function;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import java.util.List;
import android.app.PictureInPictureParams$Builder;
import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import android.util.Rational;

public class DefaultPipController implements gii
{
    public static final Rational a;
    public gip A;
    public final hzm B;
    public final eg C;
    public pvh D;
    private final atke E;
    private final atke F;
    private final atke G;
    private final arkg H;
    private final boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private final vaf N;
    private final arwh O;
    public final bu b;
    public final atke c;
    public final atke d;
    public final atke e;
    public final atke f;
    public final atke g;
    public final atke h;
    public final arkg i;
    public final asiq j;
    public final boolean k;
    public abtx l;
    public View m;
    public xnr n;
    public View$OnLayoutChangeListener o;
    public boolean p;
    public boolean q;
    public PlayerResponseModel r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Rational v;
    public AtomicBoolean w;
    public boolean x;
    public abty y;
    public gin z;
    
    static {
        a = new Rational(16, 9);
    }
    
    public DefaultPipController(final bu b, final hzm b2, final atke c, final atke e, final atke f, final atke g, final atke d, final atke e2, final atke f2, final atke g2, final atke h, final arkg i, final arkg h2, final eg c2, final vaf n, final arwh o, final vai vai, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.j = new asiq();
        this.v = DefaultPipController.a;
        this.w = new AtomicBoolean();
        this.A = gip.b();
        this.b = b;
        this.B = b2;
        this.c = c;
        this.E = e;
        this.F = f;
        this.G = g;
        this.d = d;
        this.e = e2;
        this.f = f2;
        this.N = n;
        this.O = o;
        this.k = aeo.f();
        this.i = i;
        this.H = h2;
        this.C = c2;
        this.I = vai.cB();
        this.g = g2;
        this.h = h;
    }
    
    public final abpq g() {
        if (this.l()) {
            return this.B.m();
        }
        return (abpq)this.E.a();
    }
    
    @Override
    public final ListenableFuture h(final View view) {
        final boolean q = ((cyb)this.h.a()).q();
        this.w.get();
        boolean enterPictureInPictureMode = false;
        final Boolean value = false;
        if (view == null || !this.p || (q && this.w.get())) {
            return afwm.m((Object)value);
        }
        if (((twn)this.i.a()).a() != twl.a) {
            return afwm.m((Object)value);
        }
        if (((PlayBilling)this.H.a()).d.isPresent()) {
            return afwm.m((Object)value);
        }
        final xnm g = ((xnt)this.f.a()).g();
        if (g != null && g.a() == 1) {
            return afwm.m((Object)value);
        }
        final abvx p = this.g().p();
        if (gim.c(p) && this.I) {
            return afwm.m((Object)value);
        }
        final gim gim = (gim)this.G.a();
        if (!gim.a.isInPictureInPictureMode()) {
            if (!gim.a.isChangingConfigurations()) {
                if (p != null && gim.g(p) && gim.d(p.d(), gim.d.m().f(), gim.b.b)) {
                    final PictureInPictureParams$Builder pictureInPictureParams$Builder = new PictureInPictureParams$Builder();
                    pictureInPictureParams$Builder.setAspectRatio(this.v);
                    pictureInPictureParams$Builder.setActions((List)((gif)this.e.a()).a());
                    if (!fbu.aQ(this.O)) {
                        final Rect sourceRectHint = new Rect();
                        view.getGlobalVisibleRect(sourceRectHint);
                        fbu.B(this.v.floatValue(), sourceRectHint, sourceRectHint);
                        pictureInPictureParams$Builder.setSourceRectHint(sourceRectHint);
                    }
                    else if (this.A.a) {
                        final Rect sourceRectHint2 = new Rect();
                        view.getRootView().getGlobalVisibleRect(sourceRectHint2);
                        fbu.C(this.v.floatValue(), sourceRectHint2, sourceRectHint2);
                        pictureInPictureParams$Builder.setSourceRectHint(sourceRectHint2);
                    }
                    ((gij)this.d.a()).b();
                    final bu b = this.b;
                    final PictureInPictureParams build = pictureInPictureParams$Builder.build();
                    try {
                        enterPictureInPictureMode = ((Activity)b).enterPictureInPictureMode(build);
                    }
                    catch (final IllegalStateException ex) {
                        zlm.c(zll.b, zlk.y, "Error entering picture and picture", (Throwable)ex);
                    }
                    return afwm.m((Object)enterPictureInPictureMode);
                }
            }
        }
        ListenableFuture listenableFuture;
        if (p == null) {
            listenableFuture = afwm.m((Object)value);
        }
        else {
            if (this.A.e && gim.g(p) && !gim.f(p) && !gim.c(p)) {
                final abpq g2 = this.g();
                ((gij)this.d.a()).a(p, g2.r(), g2.i());
            }
            listenableFuture = afwm.m((Object)value);
        }
        return listenableFuture;
    }
    
    @Override
    public final void i(final boolean b) {
        if (b) {
            this.g().ab(2);
        }
        else if (this.J && !this.q) {
            this.g().aj(15);
        }
        final gif gif = (gif)this.e.a();
        if (b) {
            gif.d();
        }
        else {
            gif.e();
        }
        this.q = false;
    }
    
    @Override
    public final void j(final boolean l) {
        if (this.b.isInPictureInPictureMode() && !this.u) {
            if (this.L != l) {
                final abpq g = this.g();
                boolean k;
                final boolean b = k = false;
                if (l) {
                    k = b;
                    if (g.f()) {
                        k = true;
                    }
                }
                if (k) {
                    g.a();
                }
                else if (!l && this.K && !g.f()) {
                    g.C();
                }
                this.K = k;
                this.L = l;
            }
        }
    }
    
    public final void k(final Function... array) {
        final PictureInPictureParams$Builder pictureInPictureParams$Builder = new PictureInPictureParams$Builder();
        int i = 0;
        boolean b = false;
        while (i < array.length) {
            b |= array[i].apply(pictureInPictureParams$Builder);
            ++i;
        }
        if (b) {
            this.b.setPictureInPictureParams(pictureInPictureParams$Builder.build());
        }
    }
    
    public final boolean l() {
        ansd ansd;
        if ((ansd = this.N.b().A) == null) {
            ansd = ansd.a;
        }
        return ansd.g;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final boolean m(final PictureInPictureParams$Builder pictureInPictureParams$Builder) {
        if (!this.k) {
            return false;
        }
        final boolean m = this.M;
        this.M = (!this.s && gim.d(this.r, this.t, this.A.b) && (!this.u || !this.I) && (!((cyb)this.h.a()).q() || !this.w.get()) && !this.x);
        this.w.get();
        final boolean i = this.M;
        if (m == i) {
            return false;
        }
        pictureInPictureParams$Builder.setAutoEnterEnabled(i);
        return true;
    }
    
    public final void mM(final aun aun) {
        if (this.p) {
            final gif gif = (gif)this.e.a();
            gif.r.q(gif.s);
        }
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        this.J = false;
        this.p = false;
        teu.p(aun, ((eg)this.F.a()).M(), (ttg)etg.l, (ttg)new ghz(this));
    }
    
    public final void oX(final aun aun) {
        this.J = true;
        if (this.p) {
            this.j.b();
            final abtx l = this.l;
            if (l != null) {
                final abty y = this.y;
                if (y != null) {
                    y.f(l);
                }
            }
            final xnr n = this.n;
            if (n != null) {
                ((xnt)this.f.a()).k(n);
                this.n = null;
            }
            final View$OnLayoutChangeListener o = this.o;
            if (o != null) {
                final View m = this.m;
                if (m != null) {
                    m.removeOnLayoutChangeListener(o);
                    this.o = null;
                    this.m = null;
                }
            }
            ((gif)this.e.a()).D = null;
            final gif gif = (gif)this.e.a();
            gif.c.j(gif.p);
            final aaol t = gif.t;
            if (t != null) {
                ((Set)gif.b.j.b).remove(t);
            }
            gif.d.b();
            gif.e();
        }
    }
}
