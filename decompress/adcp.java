import java.util.Set;
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

public class adcp extends adcg implements View$OnClickListener, adbd, adal, wyv
{
    static final long af;
    public dax aA;
    public SharedPreferences aB;
    public vcy aC;
    public oby aD;
    public tvr aE;
    public vaf aF;
    public addo aG;
    public aeea aH;
    public aeea aI;
    public aeea aJ;
    private adbe aK;
    private vcy aL;
    private ActivityIndicatorFrameLayout aM;
    private View aN;
    private FloatingActionButton aO;
    private Snackbar aP;
    private Animation aQ;
    private Animation aR;
    private adat aS;
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
    public adco am;
    public final Runnable an;
    public addm ao;
    public arkg ap;
    public arkg aq;
    public Handler ar;
    public Executor as;
    public wyw at;
    public tqd au;
    public tgd av;
    public ScheduledExecutorService aw;
    public afvs ax;
    public acgs ay;
    public vox az;
    
    static {
        af = TimeUnit.SECONDS.toMillis(2L);
    }
    
    public adcp() {
        this.an = (Runnable)new adap(this, 2);
    }
    
    static void aM(final adcp adcp) {
        adcp.pO();
    }
    
    static void aN(final adcp adcp) {
        adcp.pO();
    }
    
    private static boolean aP(final View view) {
        return view != null && view.getLayoutParams() != null;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.aW = layoutInflater.getContext();
        final View inflate = layoutInflater.inflate(2131625661, viewGroup, false);
        this.ag = inflate;
        this.ah = inflate.findViewById(2131430218);
        this.ai = (AnchorableTopPeekingScrollView)this.ag.findViewById(2131432154);
        this.aM = (ActivityIndicatorFrameLayout)this.ag.findViewById(2131430667);
        final int dimensionPixelSize = this.ag.getResources().getDimensionPixelSize(2131169519);
        if (dimensionPixelSize > 0) {
            tpe.aF((View)this.ai, tpe.aD(dimensionPixelSize), (Class)ViewGroup$LayoutParams.class);
        }
        this.aN = this.ag.findViewById(2131430670);
        this.aj = (ViewGroup)this.ag.findViewById(2131428424);
        this.ak = (RecyclerView)this.ag.findViewById(2131429196);
        this.al = (RecyclerView)this.ag.findViewById(2131429576);
        this.aO = (FloatingActionButton)this.ag.findViewById(2131431376);
        this.aP = (Snackbar)this.ag.findViewById(2131431597);
        this.aS = new adat((Context)this.ae, (acpk)this.ao, this.ay, this.ag.findViewById(2131431352), this.ag.findViewById(2131429853));
        final Resources resources = this.ae.getResources();
        this.aU = 0;
        this.ah.setOnClickListener((View$OnClickListener)this);
        if (this.l()) {
            this.aU = resources.getDimensionPixelSize(2131169530);
            this.ai.f(Math.max(((br)this).nT().getResources().getDisplayMetrics().heightPixels - resources.getDimensionPixelSize(2131169521), 0));
        }
        else {
            this.ai.f(((br)this).nT().getResources().getDisplayMetrics().heightPixels);
        }
        final AnchorableTopPeekingScrollView ai = this.ai;
        ai.l = this.ah;
        ai.m = (View)this.al;
        new ColorDrawable(tpe.cx(this.aW, 2130970897).orElse(0)).setBounds(0, 0, 1, 1);
        this.ak.af((nw)new LinearLayoutManager());
        final adci adci = new adci(this);
        ((nw)adci).x = false;
        this.al.af((nw)adci);
        this.aO.setOnClickListener((View$OnClickListener)this);
        this.aQ = AnimationUtils.loadAnimation((Context)this.ae, 2130772035);
        this.aR = AnimationUtils.loadAnimation((Context)this.ae, 2130772036);
        this.ag.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new zfc(this, 5));
        this.aj.setVisibility(4);
        this.aV = qcg.u((Context)this.ae);
        return this.ag;
    }
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        final aiqj c = vdb.c(((br)this).m.getByteArray("navigation_endpoint"));
        this.aL = (vcy)new wyx(this.aC, (wyv)this);
        final Resources nz = ((br)this).nZ();
        final vox az = this.az;
        final wyw at = this.at;
        final tqd au = this.au;
        final ScheduledExecutorService aw = this.aw;
        final tgd av = this.av;
        final acgs ay = this.ay;
        amie amie;
        if ((amie = this.aF.b().i) == null) {
            amie = amie.a;
        }
        ahtz ahtz;
        if ((ahtz = amie.m) == null) {
            ahtz = ahtz.a;
        }
        this.aK = new adbe(c, az, at, au, aw, av, ay, ahtz, this.aW, this.aL, (acpk)this.ao, (adbd)this, (adal)this, this.aG, this.aA, this.aJ, this.aS, this.aB, this.aI, this.aH, nz.getDimensionPixelSize(2131169532), nz.getDimensionPixelSize(2131169531), this.as, this.ax, null, null, null, null, null, null);
        (this.am = new adco(this.aK, this.ar)).a(new adcn[] { adcn.a });
        final adbe ak = this.aK;
        ak.l = ak.d.submit((Callable<Object>)new zup(ak, 8));
        ak.q.i((adcu)ak.k);
        ak.e.g((Object)ak);
        ak.r.ap((acay)ak);
        final ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint = (ShareEndpointOuterClass$ShareEntityEndpoint)((ahbc)ak.a).rx((ahaq)ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
        if (!shareEndpointOuterClass$ShareEntityEndpoint.d.isEmpty()) {
            ak.h.b(false);
            ak.c(new adqh(shareEndpointOuterClass$ShareEntityEndpoint.d));
            return;
        }
        if (!shareEndpointOuterClass$ShareEntityEndpoint.c.isEmpty()) {
            final String c2 = shareEndpointOuterClass$ShareEntityEndpoint.c;
            ak.e.d((Object)new ffp());
            ak.h.b(true);
            ak.b.d(c2, adds.b((Collection)ak.a(), ak.f), (zpf)new wci(ak, 9), false);
            return;
        }
        throw new IllegalArgumentException("Invalid share entity endpoint provided.");
    }
    
    public void Y() {
        super.Y();
        final addo ag = this.aG;
        tbi.f();
        ((Set)ag.c).remove(this);
    }
    
    public final void a(final akbo akbo, final View view, final Object o) {
        if (this.ae == null) {
            ttr.g("Did not show hint tooltip because the share panel fragment was not attached to an activity.");
            return;
        }
        final adar adar = (adar)this.aq.a();
        adar.b = this.aL;
        if (adar.a(view)) {
            adar.b(akbo, view, o);
            return;
        }
        view.addOnLayoutChangeListener((View$OnLayoutChangeListener)new adao(adar, view, akbo, o));
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
            if (max >= this.ai.k && this.l()) {
                this.am.a(new adcn[] { adcn.d });
            }
            else {
                final ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(new int[] { this.ai.k, max });
                valueAnimator.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
                valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new uub(this, 20));
                valueAnimator.addListener((Animator$AnimatorListener)new adcm(this));
                valueAnimator.start();
            }
        }
        else if (max < this.ai.k || !this.l()) {
            this.ai.h(max);
        }
        if (n7 >= this.aU) {
            this.ai.i(true);
        }
    }
    
    public void aa() {
        super.aa();
        final addo ag = this.aG;
        tbi.f();
        ((Set<adcp>)ag.c).add(this);
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
    
    public final void d(final ackz ackz, final ackz ackz2) {
        this.aj.setAlpha(0.0f);
        this.aj.setVisibility(0);
        this.aj.setTranslationY(100.0f);
        this.aj.animate().setListener((Animator$AnimatorListener)new adcl(this)).alpha(1.0f).translationY(0.0f).start();
        this.ak.ac((nq)ackz);
        this.al.ac((nq)ackz2);
        this.aj.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new zfc(this, 6));
    }
    
    public final void dismiss() {
        this.ah.animate().alpha(0.0f).setDuration(250L).start();
        this.ai.animate().translationY((float)this.ag.getHeight()).setDuration(250L).setListener((Animator$AnimatorListener)new adck(this)).start();
    }
    
    public final void h() {
        ((bi)this).dismiss();
    }
    
    public final void i(final boolean b) {
        if (b == this.ai.n) {
            return;
        }
        if (b) {
            this.aT = (ViewTreeObserver$OnGlobalLayoutListener)new zfc(this, 4);
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
    
    public final void k(final uzm uzm) {
        adds.g(this.aD, this.aP, uzm, adcp.af, (vcy)null, (Integer)null);
    }
    
    public final boolean l() {
        final Context nt = ((br)this).nT();
        if (nt == null) {
            return true;
        }
        final int be = tpe.be(nt);
        return be != 3 && be != 4;
    }
    
    public final void nm() {
        super.nm();
        final adbe ak = this.aK;
        ak.m = true;
        ak.r.as((acay)ak);
        ak.q.k((adcu)ak.k);
        final Iterator iterator = ak.i.iterator();
        while (iterator.hasNext()) {
            ((adav)iterator.next()).sa();
        }
        ak.e.m((Object)ak);
        ak.e.d((Object)new ffq());
        if (((ahbc)ak.a).ry((ahaq)ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)) {
            ak.j.e(vpc.w(((ShareEndpointOuterClass$ShareEntityEndpoint)((ahbc)ak.a).rx((ahaq)ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)).c, adds.b((Collection)ak.a(), ak.f), (String)null));
        }
    }
    
    public final void no() {
        super.no();
        final Window window = ((bi)this).d.getWindow();
        window.addFlags(2);
        window.setDimAmount(0.0f);
    }
    
    public final void onClick(final View view) {
        if (view == this.ah) {
            ((bi)this).dismiss();
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final Iterator iterator = this.aK.i.iterator();
        while (iterator.hasNext()) {
            ((adav)iterator.next()).lI(configuration);
        }
        final adco am = this.am;
        am.b.removeAll(Arrays.asList(adcn.a));
        am.c = false;
        if (this.l()) {
            this.ai.h(((br)this).nZ().getDimensionPixelSize(2131169530));
        }
        else {
            this.ag.addOnLayoutChangeListener((View$OnLayoutChangeListener)new acsz(this, this.ag.getHeight(), 2));
        }
        this.am.a(new adcn[] { adcn.a });
        final adan adan = (adan)this.ap.a();
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.ae = ((br)this).od();
        ((bi)this).nc(2, this.aE.a);
    }
    
    public final wyw pF() {
        return this.at;
    }
}
