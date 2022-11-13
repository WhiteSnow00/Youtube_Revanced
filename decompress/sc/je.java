import java.util.Iterator;
import android.view.ViewTreeObserver;
import java.util.Set;
import com.google.android.apps.youtube.app.common.csi.WatchUiActionLatencyLogger;
import android.text.Layout;
import android.widget.TextView;
import com.google.apps.tiktok.account.AccountId;
import android.support.v7.widget.AppCompatEditText;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import java.util.function.Consumer;
import java.util.List;
import java.util.concurrent.Executor;
import com.google.protos.youtube.api.innertube.ImageCarouselEditorRendererOuterClass;
import com.google.protos.youtube.api.innertube.ImagePollEditorRendererOuterClass$ImagePollEditorRenderer;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.apps.youtube.app.common.tutorial.ClingView;
import android.support.v7.widget.AppCompatSpinner;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class je implements ViewTreeObserver$OnGlobalLayoutListener
{
    final Object a;
    private final int b;
    
    public je(final AppCompatSpinner a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final cbo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final ClingView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final DefaultWatchPanelViewController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final hxa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final ig a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final iup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final jf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final knb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final ku a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final pxr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final rkw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final ssq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final ssx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final stv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final szo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final txw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public je(final tzd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        final int b = this.b;
        boolean g = false;
        switch (b) {
            default: {
                final tzd tzd = (tzd)this.a;
                final View o = tzd.f.O;
                if (o == null) {
                    return;
                }
                final Rect rect = new Rect();
                tzd.d.getGlobalVisibleRect(rect);
                final Rect rect2 = new Rect();
                o.getGlobalVisibleRect(rect2);
                tpe.aF(o.findViewById(2131431486), tpe.aq(Math.max((rect2.height() - rect.height()) / 2 - tzd.f.nZ().getDimensionPixelSize(2131169668) - tzd.f.nZ().getDimensionPixelSize(2131166871), 0)), (Class)ViewGroup$MarginLayoutParams.class);
                tzd.d.getViewTreeObserver().removeOnGlobalLayoutListener(tzd.n);
                return;
            }
            case 19: {
                final txw txw = (txw)this.a;
                final View a = txw.a;
                if (a != null) {
                    a.getWindowVisibleDisplayFrame(txw.c);
                    final int bottom = txw.c.bottom;
                    if (bottom != txw.f) {
                        if (bottom == txw.e) {
                            g = true;
                        }
                        txw.g = g;
                        if (g) {
                            if (txw.h) {
                                a.getViewTreeObserver().removeOnGlobalLayoutListener(txw.b);
                            }
                            else {
                                final txv d = txw.d;
                                if (d != null) {
                                    ((uho)d).f();
                                }
                            }
                        }
                        final int[] array = new int[2];
                        a.getLocationOnScreen(array);
                        tpe.aF(a, tpe.at(bottom - array[1]), (Class)ViewGroup$LayoutParams.class);
                        txw.f = bottom;
                    }
                }
                return;
            }
            case 18: {
                if (((szo)this.a).a.getParent() == null) {
                    return;
                }
                ((szo)this.a).a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                final View a2 = ((szo)this.a).a;
                a2.measure(View$MeasureSpec.makeMeasureSpec(((View)a2.getParent()).getMeasuredWidth(), 1073741824), 0);
                if (((szo)this.a).b.getMeasuredWidth() > ((szo)this.a).a.getMeasuredWidth() / 2) {
                    ((szo)this.a).f(1);
                }
                else {
                    ((szo)this.a).f(0);
                }
                ((szo)this.a).a.requestLayout();
                return;
            }
            case 17: {
                final stv stv = (stv)this.a;
                if (stv.bh.getWidth() == stv.bg) {
                    return;
                }
                final float dimension = stv.nZ().getDimension(2131166892);
                final float n = stv.bh.getWidth() / (dimension + dimension + stv.nZ().getDimension(2131166887));
                final svf svf = (svf)stv.bh.m;
                if (svf != null) {
                    svf.x();
                }
                final aujg by = stv.by;
                anuv anuv;
                if ((anuv = stv.ay.P) == null) {
                    anuv = anuv.a;
                }
                final ImagePollEditorRendererOuterClass$ImagePollEditorRenderer imagePollEditorRendererOuterClass$ImagePollEditorRenderer = (ImagePollEditorRendererOuterClass$ImagePollEditorRenderer)((ahbc)anuv).rx((ahaq)ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.imagePollEditorRenderer);
                ankw ankw;
                if ((ankw = stv.ay.Q) == null) {
                    ankw = ankw.a;
                }
                final int n2 = (int)(dimension * n);
                final int h = ankw.h;
                final ssj ssj = (ssj)((atke)by.b).a();
                ssj.getClass();
                final vcy vcy = (vcy)((atke)by.c).a();
                vcy.getClass();
                final vai vai = (vai)((atke)by.a).a();
                vai.getClass();
                imagePollEditorRendererOuterClass$ImagePollEditorRenderer.getClass();
                final svf svf2 = new svf(ssj, vcy, vai, imagePollEditorRendererOuterClass$ImagePollEditorRenderer, n2, h);
                if (stv.bh.d() > 0) {
                    stv.bh.ax();
                }
                stv.bh.aC((hy)new svh(stv.bh.getWidth() - (n2 + n2), stv.nZ().getDimensionPixelSize(2131166888)));
                stv.bh.ac((nq)svf2);
                stv.bg = stv.bh.getWidth();
                return;
            }
            case 16: {
                final stv stv2 = (stv)this.a;
                if (stv2.bf == null && stv2.aC.getWidth() != 0) {
                    final sva ak = stv2.ak;
                    anuv anuv2;
                    if ((anuv2 = stv2.ay.H) == null) {
                        anuv2 = anuv.a;
                    }
                    final akdu akdu = (akdu)((ahbc)anuv2).rx((ahaq)ImageCarouselEditorRendererOuterClass.imageCarouselEditorRenderer);
                    final float n3 = (float)stv2.aC.getWidth();
                    final AppCompatEditText ac = stv2.aC;
                    final cl supportFragmentManager = stv2.od().getSupportFragmentManager();
                    final AccountId ax = stv2.ax;
                    final aiqj bh = stv.bh(stv2.ai);
                    final ablw ablw = (ablw)((atke)ak.a).a();
                    ablw.getClass();
                    final vcy vcy2 = (vcy)((atke)ak.b).a();
                    vcy2.getClass();
                    final tlc tlc = (tlc)((atke)ak.c).a();
                    tlc.getClass();
                    final vai vai2 = (vai)((atke)ak.d).a();
                    final ulb ulb = (ulb)((atke)ak.e).a();
                    ulb.getClass();
                    final Executor executor = (Executor)((atke)ak.f).a();
                    executor.getClass();
                    akdu.getClass();
                    ac.getClass();
                    supportFragmentManager.getClass();
                    ax.getClass();
                    bh.getClass();
                    stv2.bf = new suz(ablw, vcy2, tlc, vai2, ulb, executor, akdu, (int)(n3 * 0.65f), (View)ac, supportFragmentManager, ax, bh, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                    stv2.bb.ac((nq)stv2.bf);
                    stv2.aC.getViewTreeObserver().removeOnGlobalLayoutListener(stv2.bj);
                    if (stv2.bn && !stv2.bv.m().isEmpty()) {
                        final ablw bv = stv2.bv;
                        bv.t((List)bv.m());
                        stv2.bn = false;
                    }
                }
                return;
            }
            case 15: {
                final stv stv3 = (stv)this.a;
                if (stv3.bd()) {
                    final TextView ar = stv3.aR;
                    if (ar != null) {
                        ar.getViewTreeObserver().removeOnGlobalLayoutListener(stv3.bi);
                        final Layout layout = stv3.aR.getLayout();
                        if (layout != null && layout.getLineCount() == 1 && layout.getEllipsisCount(0) > 0) {
                            tpe.v((View)stv3.aR, false);
                            return;
                        }
                        tpe.v((View)stv3.aR, true);
                    }
                }
                return;
            }
            case 14: {
                final ssx ssx = (ssx)this.a;
                ssx.f((View)ssx.t);
                final ssx ssx2 = (ssx)this.a;
                ssx2.f((View)ssx2.u);
                final ssx ssx3 = (ssx)this.a;
                ssx3.f((View)ssx3.v);
                final ssx ssx4 = (ssx)this.a;
                ssx4.f((View)ssx4.w);
                ((ssx)this.a).s.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                return;
            }
            case 13: {
                final ssq ssq = (ssq)this.a;
                final View c = ssq.c;
                final int d2 = ssq.d;
                qdt.W(c, d2, 0, d2, 0);
                ((ssq)this.a).b.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                return;
            }
            case 12: {
                if (((rkw)this.a).a.getVisibility() == 0) {
                    final rkw rkw = (rkw)this.a;
                    if (!rkw.c) {
                        final vmt b2 = rkw.b;
                        if (b2 != null && b2.o()) {
                            ((rkw)this.a).a.requestFocus();
                            ((rkw)this.a).a.sendAccessibilityEvent(8);
                            ((rkw)this.a).c = true;
                        }
                    }
                }
                return;
            }
            case 11: {
                ((pxr)this.a).r();
                return;
            }
            case 10: {
                final xan x = ((DefaultWatchPanelViewController)this.a).x;
                if (x != null) {
                    x.c("wnl");
                }
                final WatchUiActionLatencyLogger f = ((DefaultWatchPanelViewController)this.a).f;
                f.a.ifPresent((Consumer)fgu.c);
                f.n();
                ((DefaultWatchPanelViewController)this.a).y.f();
                ((DefaultWatchPanelViewController)this.a).l.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                return;
            }
            case 9: {
                final knb knb = (knb)this.a;
                knb.k = true;
                if (!knb.l && knb.f != null) {
                    knb.b();
                }
                return;
            }
            case 8: {
                ((iup)this.a).a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                ((iup)this.a).f();
                return;
            }
            case 7: {
                ((hxa)this.a).al.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                ((hxa)this.a).aM(true);
                return;
            }
            case 6: {
                ((hxa)this.a).ah.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                ((hxa)this.a).aj.setAlpha(0.0f);
                ((hxa)this.a).aj.animate().alpha(1.0f).setDuration((long)((hxa)this.a).af).start();
                ((hxa)this.a).an = false;
                final TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float)((hxa)this.a).ai.getHeight(), 0.0f);
                ((Animation)translateAnimation).setDuration((long)((hxa)this.a).ae);
                ((Animation)translateAnimation).setInterpolator((Interpolator)new LinearInterpolator());
                ((hxa)this.a).ai.startAnimation((Animation)translateAnimation);
                return;
            }
            case 5: {
                ((ClingView)this.a).postInvalidate();
                return;
            }
            case 4: {
                ((cbo)this.a).n.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                final cbo cbo = (cbo)this.a;
                final Set q = cbo.q;
                if (q != null && q.size() != 0) {
                    final cbi animationListener = new cbi(cbo, 1);
                    final int firstVisiblePosition = cbo.n.getFirstVisiblePosition();
                    int i = 0;
                    int n4 = 0;
                    while (i < cbo.n.getChildCount()) {
                        final View child = cbo.n.getChildAt(i);
                        final cct cct = (cct)cbo.o.getItem(firstVisiblePosition + i);
                        int n5 = n4;
                        if (cbo.q.contains(cct)) {
                            final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            ((Animation)alphaAnimation).setDuration((long)cbo.Q);
                            ((Animation)alphaAnimation).setFillEnabled(true);
                            ((Animation)alphaAnimation).setFillAfter(true);
                            if (n4 == 0) {
                                ((Animation)alphaAnimation).setAnimationListener((Animation$AnimationListener)animationListener);
                            }
                            child.clearAnimation();
                            child.startAnimation((Animation)alphaAnimation);
                            n5 = 1;
                        }
                        ++i;
                        n4 = n5;
                    }
                    return;
                }
                cbo.m(true);
                return;
            }
            case 3: {
                final ku ku = (ku)this.a;
                final AppCompatSpinner d3 = ku.d;
                if (anb.am((View)d3) && ((View)d3).getGlobalVisibleRect(ku.c)) {
                    ((ku)this.a).n();
                    ku.l((ku)this.a);
                    return;
                }
                ((nb)this.a).m();
                return;
            }
            case 2: {
                if (!((AppCompatSpinner)this.a).b.x()) {
                    ((AppCompatSpinner)this.a).b();
                }
                final ViewTreeObserver viewTreeObserver = ((AppCompatSpinner)this.a).getViewTreeObserver();
                if (viewTreeObserver != null) {
                    kp.a(viewTreeObserver, (ViewTreeObserver$OnGlobalLayoutListener)this);
                }
                return;
            }
            case 1: {
                if (((ig)this.a).x() && ((ig)this.a).b.size() > 0 && !((nb)((ig)this.a).b.get(0).b).p) {
                    final View d4 = ((ig)this.a).d;
                    if (d4 != null && d4.isShown()) {
                        final Iterator iterator = ((ig)this.a).b.iterator();
                        while (iterator.hasNext()) {
                            ((nb)((ttl)iterator.next()).b).v();
                        }
                    }
                    else {
                        ((ig)this.a).m();
                    }
                }
                return;
            }
            case 0: {
                if (((jf)this.a).x()) {
                    final jf jf = (jf)this.a;
                    if (!((nb)jf.a).p) {
                        final View c2 = jf.c;
                        if (c2 != null && c2.isShown()) {
                            ((nb)((jf)this.a).a).v();
                            return;
                        }
                        ((jf)this.a).m();
                    }
                }
            }
        }
    }
}
