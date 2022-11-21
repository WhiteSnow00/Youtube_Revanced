import android.view.Window;
import android.view.WindowInsetsAnimation$Callback;
import android.os.Build$VERSION;
import android.content.DialogInterface$OnShowListener;
import android.content.res.Configuration;
import android.content.DialogInterface;
import android.view.View$OnLayoutChangeListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View$OnClickListener;
import android.view.accessibility.AccessibilityManager;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewOutlineProvider;
import android.widget.ProgressBar;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import java.util.Iterator;
import android.view.View$OnApplyWindowInsetsListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.WindowInsets$Type;
import android.view.WindowInsets;
import android.app.Activity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.app.Dialog;
import android.widget.FrameLayout;
import android.view.View;
import java.util.List;
import android.widget.RelativeLayout;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class actz extends advk
{
    public boolean aA;
    protected boolean aB;
    Optional aC;
    protected RelativeLayout aD;
    public int aE;
    private final List ae;
    private Optional af;
    public boolean aq;
    public boolean ar;
    public boolean as;
    public int at;
    public View au;
    public View av;
    public View aw;
    public FrameLayout ax;
    public Dialog ay;
    public ViewGroup az;
    
    public actz() {
        this.ae = new ArrayList();
        this.aq = false;
        this.ar = false;
        this.as = false;
        this.aE = 1;
        this.aA = false;
        this.aB = true;
        this.aC = Optional.empty();
        this.af = Optional.empty();
    }
    
    private final RelativeLayout aK(final Context context) {
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        final RelativeLayout al = aL(context);
        final RelativeLayout$LayoutParams layoutParams2 = new RelativeLayout$LayoutParams(-1, -2);
        final View av = this.av;
        if (av != null) {
            av.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            al.addView(this.av);
        }
        al.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        al.setBackgroundColor(tqf.cr(context, 2130970843));
        return al;
    }
    
    private static RelativeLayout aL(final Context context) {
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -2));
        return relativeLayout;
    }
    
    private final void aM(final BottomSheetBehavior bottomSheetBehavior, final Activity activity) {
        final int bc = tqf.bc((Context)activity);
        final int ba = tqf.ba((Context)activity);
        if (this.at > 0 && bc >= 600) {
            bottomSheetBehavior.e = tqf.aZ(activity.getResources().getDisplayMetrics(), Math.min(this.at, bc));
        }
        else {
            int dimensionPixelSize;
            if (this.aA && bc >= 600) {
                dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131165520);
            }
            else {
                dimensionPixelSize = -1;
            }
            bottomSheetBehavior.e = dimensionPixelSize;
        }
        if (this.aA && ba < 600) {
            this.ar = false;
        }
    }
    
    private static final int aN(final Activity activity) {
        return tqf.bb((Context)activity) - activity.getResources().getDimensionPixelSize(2131165549);
    }
    
    private static final int aO(final Activity activity) {
        final double n = tqf.bb((Context)activity);
        Double.isNaN(n);
        return (int)(n * 0.6);
    }
    
    public static final int bd(final WindowInsets windowInsets) {
        final int bottom = windowInsets.getInsets(WindowInsets$Type.systemBars()).bottom;
        final int bottom2 = windowInsets.getInsets(WindowInsets$Type.ime()).bottom;
        if (bottom2 > bottom) {
            return bottom2 - bottom;
        }
        return 0;
    }
    
    public View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final bu oa = ((br)this).oa();
        oa.getClass();
        final View aw = (View)this.aW().orElse((Object)null);
        this.aw = aw;
        if (aw != null) {
            aw.setId(View.generateViewId());
        }
        this.av = (View)this.aV().orElse((Object)null);
        this.au = (View)this.aU().orElse((Object)null);
        final FrameLayout az = new FrameLayout((Context)oa);
        az.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)acts.a);
        az.setFitsSystemWindows(true);
        if (this.aA) {
            az.addView((View)this.aX((Context)oa));
        }
        else {
            az.addView((View)this.aY((Context)oa));
        }
        return (View)(this.az = (ViewGroup)az);
    }
    
    public void T(final Bundle bundle) {
        super.T(bundle);
        if (this.aA) {
            final View o = ((br)this).O;
            if (o != null && o.getParent() instanceof View) {
                ((View)((br)this).O.getParent()).setBackgroundResource(17170445);
            }
        }
    }
    
    public void W() {
        super.W();
        final Iterator iterator = this.ae.iterator();
        while (iterator.hasNext()) {
            ((acuf)iterator.next()).d();
        }
    }
    
    protected int aS() {
        return 0;
    }
    
    protected abstract Optional aU();
    
    protected abstract Optional aV();
    
    protected abstract Optional aW();
    
    public final LinearLayout aX(final Context context) {
        Object o;
        if (this.aB) {
            o = new LinearLayout(context);
        }
        else {
            o = new acty(context);
        }
        ((LinearLayout)o).setOrientation(1);
        ((LinearLayout)o).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -2));
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165546);
        final View aw = this.aw;
        if (aw != null) {
            ((LinearLayout)o).addView(aw);
            final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, -2);
            int n;
            if (!this.aB) {
                n = dimensionPixelSize;
            }
            else {
                n = 0;
            }
            layoutParams.setMargins(0, n, 0, -this.aS());
            this.aw.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        final View au = this.au;
        if (au != null) {
            ((LinearLayout)o).addView(au);
            final LinearLayout$LayoutParams layoutParams2 = new LinearLayout$LayoutParams(-1, -2, 1.0f);
            if (this.aw != null) {
                this.au.setPadding(0, this.aS(), 0, 0);
            }
            else if (!this.aB) {
                final View au2 = this.au;
                if (au2 instanceof RecyclerView) {
                    au2.setPadding(0, dimensionPixelSize, 0, 0);
                }
                else {
                    layoutParams2.setMargins(0, dimensionPixelSize, 0, 0);
                }
            }
            this.au.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        }
        if (this.av != null) {
            final RelativeLayout ak = this.aK(context);
            ((View)ak).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
            ((LinearLayout)o).addView((View)ak);
        }
        if (this.av == null && this.aw == null && this.au == null) {
            int n2;
            if (!this.aB) {
                n2 = dimensionPixelSize;
            }
            else {
                n2 = 0;
            }
            final RelativeLayout ad = new RelativeLayout(context);
            final ProgressBar progressBar = new ProgressBar(context);
            final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-2, -2);
            relativeLayout$LayoutParams.addRule(14);
            ad.addView((View)progressBar, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
            ad.setPadding(0, n2 + n2, 0, n2);
            ((ViewGroup)o).addView((View)(this.aD = ad));
        }
        if (this.aB) {
            ((LinearLayout)o).setBackgroundResource(2131233191);
            ((LinearLayout)o).setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        }
        else {
            ((LinearLayout)o).setOutlineProvider((ViewOutlineProvider)new actu(dimensionPixelSize));
            ((LinearLayout)o).setClipToOutline(true);
            ((LinearLayout)o).setBackgroundColor(tqf.cr(context, 2130970891));
            final View view = new View(context);
            view.setBackgroundResource(2131233244);
            final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, dimensionPixelSize);
            linearLayout$LayoutParams.setMargins(0, 0, 0, -dimensionPixelSize);
            ((LinearLayout)o).addView(view, 0, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131165543);
        tqf.aF((View)o, tqf.ay(dimensionPixelSize2, 0, dimensionPixelSize2, dimensionPixelSize2), (Class)ViewGroup$MarginLayoutParams.class);
        return (LinearLayout)o;
    }
    
    public final RelativeLayout aY(final Context context) {
        final RelativeLayout al = aL(context);
        final View au = this.au;
        if (au != null) {
            al.addView(au);
        }
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -2);
        final View aw = this.aw;
        if (aw != null && this.au != null) {
            layoutParams.addRule(3, aw.getId());
            this.au.setPadding(0, this.aS(), 0, 0);
        }
        else if (this.au != null) {
            layoutParams.addRule(10);
        }
        final View au2 = this.au;
        if (au2 != null) {
            au2.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        final View aw2 = this.aw;
        if (aw2 != null) {
            al.addView(aw2);
            final RelativeLayout$LayoutParams layoutParams2 = new RelativeLayout$LayoutParams(-1, -2);
            layoutParams2.addRule(10);
            layoutParams2.setMargins(0, 0, 0, -this.aS());
            final View aw3 = this.aw;
            if (aw3 != null) {
                aw3.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            }
        }
        al.setBackgroundColor(tqf.cr(context, 2130970843));
        return al;
    }
    
    public final void aZ(final acuf acuf) {
        this.ae.add(acuf);
    }
    
    public final void ba(final Dialog dialog, final Activity activity, final int n, int measuredHeight) {
        if (dialog == null) {
            return;
        }
        final BottomSheetBehavior a = ((advj)dialog).a();
        final AccessibilityManager accessibilityManager = (AccessibilityManager)activity.getSystemService("accessibility");
        final View aw = this.aw;
        final boolean aa = this.aA;
        int n2 = 0;
        final int n3 = 0;
        Label_0158: {
            Label_0155: {
                if (!aa) {
                    final View au = this.au;
                    if (au != null) {
                        if (aw == null) {
                            measuredHeight = au.getMeasuredHeight();
                        }
                        else {
                            measuredHeight = au.getMeasuredHeight() + aw.getMeasuredHeight();
                        }
                        n2 = measuredHeight;
                        break Label_0155;
                    }
                }
                final ViewGroup az = this.az;
                if (az != null) {
                    final int measuredHeight2 = az.getMeasuredHeight();
                    if (measuredHeight != -1) {
                        int n4 = n3;
                        if (measuredHeight < measuredHeight2) {
                            n4 = 1;
                        }
                        final int min = Math.min(measuredHeight2, measuredHeight);
                        measuredHeight = n4;
                        n2 = min;
                        break Label_0158;
                    }
                    n2 = measuredHeight2;
                }
            }
            measuredHeight = 0;
        }
        if (this.ar && !accessibilityManager.isEnabled()) {
            a.H(Math.min(n, n2));
            if (this.aA) {
                a.I(4);
                if (n2 > n) {
                    a.f = n2;
                }
            }
            return;
        }
        if (this.aA) {
            if (measuredHeight != 0) {
                a.H(n2);
                a.f = n2;
            }
            else {
                a.H(n2);
                a.f = -1;
            }
        }
        a.I(3);
    }
    
    public final void bb(final Activity activity) {
        final Dialog ay = this.ay;
        if (!this.aA && this.av != null && ay != null) {
            final FrameLayout frameLayout = (FrameLayout)ay.findViewById(2131428419);
            frameLayout.setImportantForAccessibility(2);
            frameLayout.setFocusable(false);
            final View av = this.av;
            if (av != null) {
                frameLayout.addView((View)this.aK((Context)activity));
                av.post((Runnable)new abse(this, ay, 14));
            }
            frameLayout.setOnClickListener((View$OnClickListener)new zhw(this, 19));
        }
        if ((this.au != null || (this.aD != null && this.aA)) && ay != null) {
            final int ao = aO(activity);
            if (!this.aA) {
                this.au.post((Runnable)new gko(this, ay, activity, ao, 13));
            }
            else {
                final int an = aN(activity);
                final ViewGroup az = this.az;
                View view2;
                final View view = view2 = null;
                if (az != null) {
                    if (!(((View)az).getParent() instanceof View)) {
                        view2 = view;
                    }
                    else {
                        final View view3 = (View)((View)az).getParent();
                        if (!(view3.getParent() instanceof CoordinatorLayout)) {
                            view2 = view;
                        }
                        else {
                            view2 = (View)view3.getParent();
                        }
                    }
                }
                if (view2 != null) {
                    if (this.af.isPresent()) {
                        view2.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this.af.get());
                    }
                    final Optional of = Optional.of((Object)new actw(this, ao, an));
                    this.af = of;
                    view2.addOnLayoutChangeListener((View$OnLayoutChangeListener)of.get());
                    view2.requestLayout();
                }
            }
            if (this.aA) {
                final BottomSheetBehavior a = ((advj)ay).a();
                if (this.aC.isPresent()) {
                    a.C((advd)this.aC.get());
                }
                final Optional of2 = Optional.of((Object)new actx((View)this.az));
                this.aC = of2;
                a.A((advd)of2.get());
            }
        }
        if (!this.aA && this.av == null && this.aw == null && this.au == null && ay != null) {
            final FrameLayout ax = (FrameLayout)ay.findViewById(2131428419);
            if (ax != null) {
                final RelativeLayout ad = new RelativeLayout((Context)activity);
                final ProgressBar progressBar = new ProgressBar((Context)activity);
                final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-2, -2);
                relativeLayout$LayoutParams.addRule(13);
                ad.addView((View)progressBar, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
                ax.addView((View)ad);
                this.aD = ad;
                this.ax = ax;
            }
        }
    }
    
    public final void bc() {
        final ViewGroup az = this.az;
        if (az == null) {
            ((bi)this).dismiss();
            return;
        }
        az.post((Runnable)new acan(this, 10));
    }
    
    public final void be() {
        this.aB = false;
    }
    
    public void nj() {
        super.nj();
        this.ax = null;
        this.aD = null;
        this.ay = null;
        this.az = null;
    }
    
    public void ol(final Bundle bundle) {
        super.ol(bundle);
        final Iterator iterator = this.ae.iterator();
        while (iterator.hasNext()) {
            ((acuf)iterator.next()).c();
        }
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        final Iterator iterator = this.ae.iterator();
        while (iterator.hasNext()) {
            ((acuf)iterator.next()).b();
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final int ae = this.aE;
        final int n = ae - 1;
        if (ae == 0) {
            throw null;
        }
        boolean b = true;
        Label_0071: {
            Label_0066: {
                Label_0062: {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                break Label_0071;
                            }
                            break Label_0066;
                        }
                        else if (configuration.orientation == 2) {
                            break Label_0062;
                        }
                    }
                    else if (configuration.orientation == 1) {
                        break Label_0062;
                    }
                    b = false;
                }
                if (!b) {
                    break Label_0071;
                }
            }
            ((bi)this).dismiss();
            return;
        }
        final bu oa = ((br)this).oa();
        oa.getClass();
        final int ao = aO((Activity)oa);
        if (!this.aA) {
            this.ba(((bi)this).d, (Activity)oa, ao, -1);
            return;
        }
        if (this.aC.isPresent()) {
            final actx actx = (actx)this.aC.get();
            actx.b = 0;
            tqf.aF(actx.a, tqf.aq(0), (Class)ViewGroup$MarginLayoutParams.class);
        }
        final Dialog ay = this.ay;
        if (ay instanceof advj) {
            final BottomSheetBehavior a = ((advj)ay).a();
            a.f = -1;
            this.aM(a, (Activity)oa);
        }
        if (this.af.isPresent()) {
            final actw actw = (actw)this.af.get();
            final int an = aN((Activity)oa);
            actw.a = ao;
            actw.b = an;
        }
    }
    
    @Override
    public final Dialog pM(final Bundle bundle) {
        final bu oa = ((br)this).oa();
        oa.getClass();
        final int navigationBarColor = ((Activity)oa).getWindow().getNavigationBarColor();
        int n;
        if (!this.aA) {
            n = 2132084264;
        }
        else {
            n = 2132084307;
        }
        final advj ay = new advj((Context)oa, n);
        (this.ay = (Dialog)ay).setOnShowListener((DialogInterface$OnShowListener)new szj(this, (Activity)oa, 3));
        final Window window = ((Dialog)ay).getWindow();
        if (window != null) {
            if (!this.aA || Build$VERSION.SDK_INT < 29) {
                window.setNavigationBarColor(navigationBarColor);
            }
            if (Build$VERSION.SDK_INT >= 30) {
                final View decorView = window.getDecorView();
                if (decorView != null) {
                    final View viewById = decorView.findViewById(16908290);
                    if (viewById != null) {
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)viewById.getLayoutParams();
                        if (viewGroup$MarginLayoutParams != null) {
                            decorView.setWindowInsetsAnimationCallback((WindowInsetsAnimation$Callback)new actv(this, viewGroup$MarginLayoutParams.bottomMargin, viewById, decorView, viewGroup$MarginLayoutParams));
                            decorView.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new actt(this, viewGroup$MarginLayoutParams, viewById));
                        }
                    }
                }
            }
        }
        final BottomSheetBehavior a = ay.a();
        a.x = this.as;
        this.aM(a, (Activity)oa);
        return (Dialog)ay;
    }
}
