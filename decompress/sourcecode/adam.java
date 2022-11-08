import java.util.Set;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import java.util.Arrays;
import android.content.res.Configuration;
import android.view.Window;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ValueAnimator;
import android.view.View$OnLayoutChangeListener;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.support.v7.widget.LinearLayoutManager;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup$LayoutParams;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
import android.content.Context;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.animation.Animation;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import android.view.View;
import com.google.android.libraries.youtube.share.ui.ActivityIndicatorFrameLayout;
import android.content.SharedPreferences;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public class adam extends adac implements View$OnClickListener, acza, acyj, wwu
{
    static final long af;
    public daw aA;
    public SharedPreferences aB;
    public vax aC;
    public oas aD;
    public ttn aE;
    public uyf aF;
    public adbl aG;
    public aeby aH;
    public aeby aI;
    public aeby aJ;
    private aczb aK;
    private vax aL;
    private ActivityIndicatorFrameLayout aM;
    private View aN;
    private FloatingActionButton aO;
    private Snackbar aP;
    private Animation aQ;
    private Animation aR;
    private acyq aS;
    private ViewTreeObserver$OnGlobalLayoutListener aT;
    private int aU;
    private int aV;
    private Context aW;
    private bu ae;
    public View ag;
    public View ah;
    public AnchorableTopPeekingScrollView ai;
    public ViewGroup aj;
    public RecyclerView ak;
    public RecyclerView al;
    public adal am;
    public final Runnable an;
    public adbj ao;
    public arhr ap;
    public arhr aq;
    public Handler ar;
    public Executor as;
    public wwv at;
    public tny au;
    public tdz av;
    public ScheduledExecutorService aw;
    public aftr ax;
    public aceo ay;
    public vmt az;
    
    static {
        af = TimeUnit.SECONDS.toMillis(2L);
    }
    
    public adam() {
        this.an = new adaj(this, 1);
    }
    
    private static boolean aP(final View view) {
        return view != null && view.getLayoutParams() != null;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.aW = layoutInflater.getContext();
        final View inflate = layoutInflater.inflate(2131625656, viewGroup, false);
        this.ag = inflate;
        this.ah = inflate.findViewById(2131430218);
        this.ai = (AnchorableTopPeekingScrollView)this.ag.findViewById(2131432151);
        this.aM = (ActivityIndicatorFrameLayout)this.ag.findViewById(2131430664);
        final int dimensionPixelSize = this.ag.getResources().getDimensionPixelSize(2131169520);
        if (dimensionPixelSize > 0) {
            tmy.aF((View)this.ai, tmy.aD(dimensionPixelSize), (Class)ViewGroup$LayoutParams.class);
        }
        this.aN = this.ag.findViewById(2131430667);
        this.aj = (ViewGroup)this.ag.findViewById(2131428424);
        this.ak = (RecyclerView)this.ag.findViewById(2131429196);
        this.al = (RecyclerView)this.ag.findViewById(2131429576);
        this.aO = (FloatingActionButton)this.ag.findViewById(2131431373);
        this.aP = (Snackbar)this.ag.findViewById(2131431594);
        this.aS = new acyq((Context)this.ae, this.ao, this.ay, this.ag.findViewById(2131431349), this.ag.findViewById(2131429853));
        final Resources resources = this.ae.getResources();
        this.aU = 0;
        this.ah.setOnClickListener((View$OnClickListener)this);
        if (this.l()) {
            this.aU = resources.getDimensionPixelSize(2131169531);
            ((TopPeekingScrollView)this.ai).f(Math.max(((br)this).nT().getResources().getDisplayMetrics().heightPixels - resources.getDimensionPixelSize(2131169522), 0));
        }
        else {
            ((TopPeekingScrollView)this.ai).f(((br)this).nT().getResources().getDisplayMetrics().heightPixels);
        }
        final AnchorableTopPeekingScrollView ai = this.ai;
        ((TopPeekingScrollView)ai).l = this.ah;
        ((TopPeekingScrollView)ai).m = (View)this.al;
        new ColorDrawable(tmy.ct(this.aW, 2130970897).orElse(0)).setBounds(0, 0, 1, 1);
        this.ak.af((nw)new LinearLayoutManager());
        final adae adae = new adae(this);
        ((nw)adae).x = false;
        this.al.af((nw)adae);
        this.aO.setOnClickListener((View$OnClickListener)this);
        this.aQ = AnimationUtils.loadAnimation((Context)this.ae, 2130772035);
        this.aR = AnimationUtils.loadAnimation((Context)this.ae, 2130772036);
        this.ag.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new zdj(this, 5));
        this.aj.setVisibility(4);
        this.aV = qaw.i((Context)this.ae);
        return this.ag;
    }
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        final aioe c = vba.c(((br)this).m.getByteArray("navigation_endpoint"));
        this.aL = (vax)new www(this.aC, (wwu)this);
        final Resources nz = ((br)this).nZ();
        final vmt az = this.az;
        final wwv at = this.at;
        final tny au = this.au;
        final ScheduledExecutorService aw = this.aw;
        final tdz av = this.av;
        final aceo ay = this.ay;
        amga amga;
        if ((amga = this.aF.b().i) == null) {
            amga = amga.a;
        }
        ahsb ahsb;
        if ((ahsb = amga.m) == null) {
            ahsb = ahsb.a;
        }
        this.aK = new aczb(c, az, at, au, aw, av, ay, ahsb, this.aW, this.aL, this.ao, this, this, this.aG, this.aA, this.aJ, this.aS, this.aB, this.aI, this.aH, nz.getDimensionPixelSize(2131169533), nz.getDimensionPixelSize(2131169532), this.as, this.ax, null, null, null, null, null);
        (this.am = new adal(this.aK, this.ar)).a(adak.a);
        final aczb ak = this.aK;
        ak.l = ak.d.submit((Callable<Object>)new adbx(ak, 1));
        ak.q.i(ak.k);
        ak.e.g((Object)ak);
        ak.r.aj((abyw)ak);
        final ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint = (ShareEndpointOuterClass$ShareEntityEndpoint)((agzd)ak.a).rr((agyr)ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
        if (!shareEndpointOuterClass$ShareEntityEndpoint.d.isEmpty()) {
            ak.h.b(false);
            ak.c(new adof(shareEndpointOuterClass$ShareEntityEndpoint.d));
            return;
        }
        if (!shareEndpointOuterClass$ShareEntityEndpoint.c.isEmpty()) {
            final String c2 = shareEndpointOuterClass$ShareEntityEndpoint.c;
            ak.e.d((Object)new ffj());
            ak.h.b(true);
            ak.b.d(c2, adbp.e(ak.a(), ak.f), (znj)new waj(ak, 7), false);
            return;
        }
        throw new IllegalArgumentException("Invalid share entity endpoint provided.");
    }
    
    public void Y() {
        super.Y();
        final adbl ag = this.aG;
        szc.f();
        ((Set)ag.c).remove(this);
    }
    
    public final void a(final ajzl ajzl, final View view, final Object o) {
        if (this.ae == null) {
            trn.g("Did not show hint tooltip because the share panel fragment was not attached to an activity.");
            return;
        }
        final acyo acyo = (acyo)this.aq.a();
        acyo.b = this.aL;
        if (acyo.a(view)) {
            acyo.b(ajzl, view, o);
            return;
        }
        view.addOnLayoutChangeListener((View$OnLayoutChangeListener)new acym(acyo, view, ajzl, o));
    }
    
    public final void aO(final boolean b) {
        final int height = this.ak.getHeight();
        final int n = this.al.getChildCount() - 1;
        int i = 0;
        int n2 = 0;
        while (i < n) {
            final View child = this.al.getChildAt(i);
            int n3 = n2;
            if (aP(child)) {
                final nw n4 = this.al.n;
                n3 = n2 + nw.bl(child);
            }
            ++i;
            n2 = n3;
        }
        final View child2 = this.al.getChildAt(n);
        int bl;
        if (aP(child2)) {
            final nw n5 = this.al.n;
            bl = nw.bl(child2);
        }
        else {
            bl = 0;
        }
        float n6;
        if (!this.l()) {
            n6 = 0.5f;
        }
        else {
            n6 = 0.7f;
        }
        final int n7 = this.ag.getHeight() - (height + n2 + (int)(bl * n6) + this.aV);
        final int max = Math.max(n7, this.aU);
        if (b) {
            if (max >= ((TopPeekingScrollView)this.ai).k && this.l()) {
                this.am.a(adak.d);
            }
            else {
                final ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(new int[] { ((TopPeekingScrollView)this.ai).k, max });
                valueAnimator.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
                valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new usg(this, 20));
                valueAnimator.addListener((Animator$AnimatorListener)new adai(this));
                valueAnimator.start();
            }
        }
        else if (max < ((TopPeekingScrollView)this.ai).k || !this.l()) {
            ((TopPeekingScrollView)this.ai).h(max);
        }
        if (n7 >= this.aU) {
            this.ai.i(true);
        }
    }
    
    public void aa() {
        super.aa();
        final adbl ag = this.aG;
        szc.f();
        ((Set<adam>)ag.c).add(this);
    }
    
    public final void b(final boolean b) {
        final nq m = this.ak.m;
        if (m == null || m.a() <= 0) {
            final nq i = this.al.m;
            if (i == null || i.a() <= 0) {
                if (b) {
                    this.aN.setVisibility(0);
                    return;
                }
                this.aN.setVisibility(8);
                return;
            }
        }
        if (b) {
            final ActivityIndicatorFrameLayout am = this.aM;
            am.b = true;
            am.a.start();
            am.invalidate();
            return;
        }
        final ActivityIndicatorFrameLayout am2 = this.aM;
        am2.b = false;
        am2.a.stop();
        am2.invalidate();
    }
    
    public final void d(final aciw aciw, final aciw aciw2) {
        this.aj.setAlpha(0.0f);
        this.aj.setVisibility(0);
        this.aj.setTranslationY(100.0f);
        this.aj.animate().setListener((Animator$AnimatorListener)new adah(this)).alpha(1.0f).translationY(0.0f).start();
        this.ak.ac((nq)aciw);
        this.al.ac((nq)aciw2);
        this.aj.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new zdj(this, 6));
    }
    
    public final void dismiss() {
        this.ah.animate().alpha(0.0f).setDuration(250L).start();
        this.ai.animate().translationY((float)this.ag.getHeight()).setDuration(250L).setListener((Animator$AnimatorListener)new adag(this)).start();
    }
    
    public final void h() {
        this.dismiss();
    }
    
    public final void i(final boolean b) {
        if (b == this.ai.n) {
            return;
        }
        if (b) {
            this.aT = (ViewTreeObserver$OnGlobalLayoutListener)new zdj(this, 4);
            this.al.getViewTreeObserver().addOnGlobalLayoutListener(this.aT);
            this.ai.i(true);
            return;
        }
        if (this.aT != null) {
            this.al.getViewTreeObserver().removeOnGlobalLayoutListener(this.aT);
        }
        this.aT = null;
        this.ai.i(false);
    }
    
    public final void k(final uxp uxp) {
        adio.ab(this.aD, this.aP, uxp, adam.af, (vax)null, (Integer)null);
    }
    
    public final boolean l() {
        final Context nt = ((br)this).nT();
        if (nt == null) {
            return true;
        }
        final int be = tmy.be(nt);
        return be != 3 && be != 4;
    }
    
    public final wwv n() {
        return this.at;
    }
    
    public final void nm() {
        super.nm();
        final aczb ak = this.aK;
        ak.m = true;
        ak.r.am((abyw)ak);
        ak.q.k(ak.k);
        final Iterator iterator = ak.i.iterator();
        while (iterator.hasNext()) {
            ((acys)iterator.next()).rU();
        }
        ak.e.m((Object)ak);
        ak.e.d((Object)new ffk());
        if (((agzd)ak.a).rs((agyr)ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)) {
            ak.j.e(vmy.w(((ShareEndpointOuterClass$ShareEntityEndpoint)((agzd)ak.a).rr((agyr)ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)).c, adbp.e(ak.a(), ak.f), (String)null));
        }
    }
    
    public final void no() {
        super.no();
        final Window window = super.d.getWindow();
        window.addFlags(2);
        window.setDimAmount(0.0f);
    }
    
    public final void onClick(final View view) {
        if (view == this.ah) {
            this.dismiss();
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final Iterator iterator = this.aK.i.iterator();
        while (iterator.hasNext()) {
            ((acys)iterator.next()).lI(configuration);
        }
        final adal am = this.am;
        am.b.removeAll(Arrays.asList(adak.a));
        am.c = false;
        if (this.l()) {
            ((TopPeekingScrollView)this.ai).h(((br)this).nZ().getDimensionPixelSize(2131169531));
        }
        else {
            this.ag.addOnLayoutChangeListener((View$OnLayoutChangeListener)new acqv(this, this.ag.getHeight(), 2));
        }
        this.am.a(adak.a);
        final acyl acyl = (acyl)this.ap.a();
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.ae = ((br)this).od();
        this.nc(2, this.aE.a);
    }
}
