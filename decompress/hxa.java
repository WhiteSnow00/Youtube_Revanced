import android.view.View$OnLayoutChangeListener;
import android.content.res.Configuration;
import java.util.Map;
import android.content.Context;
import android.animation.Animator$AnimatorListener;
import android.view.animation.LinearInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.app.Activity;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.protos.youtube.api.innertube.AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;
import android.view.Window;
import android.app.Dialog;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.view.View$OnApplyWindowInsetsListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.widget.LinearLayoutManager;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import com.google.android.apps.youtube.app.playlist.ui.OnAnimationEndRelativeLayout;
import android.view.View;
import android.animation.ValueAnimator;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxa extends hxr implements View$OnClickListener, ktw, wyv, acay, tgg
{
    private bu aA;
    private String aB;
    private boolean aC;
    private ValueAnimator aD;
    public int ae;
    public int af;
    public int ag;
    public View ah;
    public OnAnimationEndRelativeLayout ai;
    public View aj;
    public TopPeekingScrollView ak;
    public RecyclerView al;
    public ackz am;
    public boolean an;
    public wyw ao;
    public tvr ap;
    public tgd aq;
    public gbc ar;
    public gbu as;
    public vai at;
    public fzw au;
    public fzw av;
    public qcy aw;
    public aeea ax;
    private int ay;
    private int az;
    
    public hxa() {
        this.ag = 0;
    }
    
    static void aK(final hxa hxa) {
        hxa.pO();
    }
    
    static void aL(final hxa hxa) {
        hxa.pO();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131625036, viewGroup, false);
        this.ah = inflate;
        this.aj = inflate.findViewById(2131430218);
        this.ak = (TopPeekingScrollView)this.ah.findViewById(2131432154);
        (this.al = (RecyclerView)this.ah.findViewById(2131429576)).af((nw)new LinearLayoutManager());
        this.al.setVisibility(4);
        if (this.at.aU()) {
            this.al.setBackgroundColor(tpe.cr(this.nT(), 2130970893));
        }
        this.ai = (OnAnimationEndRelativeLayout)this.ah.findViewById(2131427548);
        final int dimensionPixelSize = this.ah.getResources().getDimensionPixelSize(2131165346);
        if (dimensionPixelSize > 0) {
            tpe.aF((View)this.ai, tpe.aD(dimensionPixelSize), (Class)ViewGroup$LayoutParams.class);
        }
        else if (this.at.aU()) {
            final Dialog d = super.d;
            if (d != null) {
                final Window window = d.getWindow();
                if (window != null) {
                    window.setNavigationBarColor(tpe.cr(this.nT(), 2130970893));
                }
            }
        }
        this.ai.setOnClickListener((View$OnClickListener)new hrb(this, 17));
        this.ai.a = new hvt(this, 4);
        if (this.at.aU()) {
            tpe.r((View)this.ai, (Drawable)new ColorDrawable(tpe.cr(this.nT(), 2130970893)));
        }
        else {
            final OnAnimationEndRelativeLayout ai = this.ai;
            tpe.r((View)ai, ai.getBackground());
        }
        this.ah.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new jni(this, 1));
        this.aj.setOnClickListener((View$OnClickListener)this);
        this.ak.f(this.nT().getResources().getDisplayMetrics().heightPixels - this.ag);
        final TopPeekingScrollView ak = this.ak;
        ak.l = this.aj;
        ak.m = (View)this.al;
        this.ay = this.nZ().getInteger(2131492864);
        this.az = this.nZ().getInteger(2131492865);
        this.ae = this.nZ().getInteger(2131492865);
        this.af = this.nZ().getInteger(17694720);
        this.ar.f((BottomUiContainer)this.ah.findViewById(2131427886));
        this.ah.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new je(this, 6));
        return this.ah;
    }
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        final String b = ((AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint)((ahbc)vdb.b(super.m.getByteArray("navigation_endpoint"))).rx((ahaq)AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint)).b;
        final qcy aw = this.aw;
        final bu aa = this.aA;
        final Object f = aw.f;
        final tqd tqd = (tqd)((atke)aw.e).a();
        tqd.getClass();
        final aeea aeea = (aeea)((atke)aw.d).a();
        final ziy ziy = (ziy)((atke)aw.c).a();
        final tgd tgd = (tgd)((atke)aw.g).a();
        tgd.getClass();
        final vdr vdr = (vdr)((atke)aw.a).a();
        vdr.getClass();
        final e e = (e)((atke)aw.b).a();
        aa.getClass();
        b.getClass();
        final ktx ktx = new ktx((atke)f, tqd, aeea, ziy, tgd, vdr, e, (Activity)aa, (ktw)this, b, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        final vuf vuf = (vuf)ktx.a.a();
        final vub vub = new vub(vuf.c, vuf.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        vub.a.add(ktx.c);
        ((vkk)vub).i();
        ((vuf)ktx.a.a()).g.e((vls)vub, (zpf)ktx);
    }
    
    public final void W() {
        super.W();
        this.aq.m((Object)this);
        this.aq.d((Object)new hwz(false));
    }
    
    public final void Y() {
        super.Y();
        this.av.j(this.aB);
    }
    
    public final void aM(final boolean b) {
        final nq m = this.al.m;
        if (m != null) {
            final acjn e = ((ackz)m).e;
            final int a = e.a();
            int n = 0;
            int n2 = 0;
            Object o = null;
            Label_0161: {
                int n3;
                while (true) {
                    n3 = a;
                    if (n >= e.a()) {
                        break;
                    }
                    if (e.c(n) instanceof anhu) {
                        n3 = n;
                        break;
                    }
                    if (this.al.getChildAt(n) == null) {
                        o = aeyo.a;
                        break Label_0161;
                    }
                    n2 += this.al.getChildAt(n).getHeight();
                    ++n;
                }
                final View child = this.al.getChildAt(n3);
                if (child == null) {
                    o = aeyo.a;
                }
                else {
                    o = aezp.k((Object)(n2 + child.getHeight() * (this.al.m.a() - n3)));
                }
            }
            int az;
            if (((aezp)o).h()) {
                az = tpe.aZ(this.nT().getResources().getDisplayMetrics(), 365);
            }
            else {
                az = Integer.MAX_VALUE;
            }
            final int intValue = (int)((aezp)o).e((Object)Integer.MAX_VALUE);
            final int max = Math.max(0, this.ah.getHeight() - this.ai.getHeight() - Math.min(az, intValue));
            final int min = Math.min(Math.max(intValue - az, 0), max);
            final TopPeekingScrollView ak = this.ak;
            if (max == ak.k) {
                return;
            }
            if (b) {
                (this.aD = new ValueAnimator()).setIntValues(new int[] { this.ak.k, max });
                this.aD.setInterpolator((TimeInterpolator)new ats());
                this.aD.setDuration((long)this.ay);
                this.aD.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hwx(this, min, 0));
                this.aD.start();
                return;
            }
            ak.g(max, min, true);
        }
    }
    
    public final void aN() {
        if (this.am != null) {
            if (!this.aC) {
                this.al.setVisibility(0);
                this.al.ac((nq)this.am);
                this.am = null;
                this.al.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new je(this, 7));
            }
        }
    }
    
    public final void aO(final boolean b) {
        if (b) {
            this.dismiss();
            return;
        }
        super.pO();
    }
    
    public final void aa() {
        super.aa();
        this.aB = this.av.i();
    }
    
    public final void dismiss() {
        this.aj.animate().alpha(0.0f).setDuration((long)this.af).start();
        this.ai.animate().translationY((float)this.ai.getHeight()).setDuration((long)this.ae).setStartDelay((long)this.az).setInterpolator((TimeInterpolator)new LinearInterpolator()).setListener((Animator$AnimatorListener)new hwy(this)).start();
        final ValueAnimator ad = this.aD;
        if (ad != null) {
            ad.cancel();
        }
        this.aC = true;
        this.ak.animate().translationY((float)(this.ah.getHeight() - this.ak.k - this.ai.getHeight() + this.ak.getScrollY())).setDuration((long)this.az).setInterpolator((TimeInterpolator)new LinearInterpolator()).start();
    }
    
    @Override
    public final void lP(final Context context) {
        super.lP(context);
        this.aA = (bu)context;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final uzm uzm = (uzm)o;
            final boolean h = uzm.e().h();
            array = null;
            if (h) {
                this.as.n((acwd)this.au.a((amrl)uzm.e().c(), null).a());
                return null;
            }
        }
        else {
            array = new Class[] { uzm.class };
        }
        return array;
    }
    
    public final void no() {
        super.no();
        final Window window = super.d.getWindow();
        window.addFlags(2);
        window.setDimAmount(0.0f);
        this.ax.ap((acay)this);
    }
    
    public final void np() {
        super.np();
        this.ax.as((acay)this);
    }
    
    public final void nu() {
        this.dismiss();
    }
    
    public final void onClick(final View view) {
        if (view == this.aj) {
            this.dismiss();
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ah.addOnLayoutChangeListener((View$OnLayoutChangeListener)new acsz(this, this.ah.getHeight(), 1));
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        this.nc(2, this.ap.a);
        this.aq.g((Object)this);
        this.aq.d((Object)new hwz(true));
    }
    
    public final wyw pF() {
        return this.ao;
    }
}
