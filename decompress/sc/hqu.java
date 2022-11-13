import android.view.View$OnClickListener;
import android.view.ViewParent;
import android.view.ViewManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqu
{
    public final acgs a;
    public final vcy b;
    public final wyv c;
    public final acpk d;
    public final acbm e;
    public final accf f;
    public final fat g;
    View h;
    View i;
    public View j;
    public LottieAnimationView k;
    public ImageView l;
    public View m;
    public ViewGroup n;
    public achb o;
    public boolean p;
    public ajmo q;
    public final vai r;
    
    public hqu(final acgs a, final vcy b, final wyv c, final acpk d, final atke atke, final accf f, final fat g, final vai r) {
        this.p = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (acbm)atke.a();
        this.f = f;
        this.n = null;
        this.g = g;
        this.r = r;
    }
    
    public static View a(final ViewGroup viewGroup, final int n) {
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(n, viewGroup, false);
        viewGroup.addView(inflate);
        hnu.f(inflate, true);
        return inflate;
    }
    
    public static void b(final ViewGroup viewGroup, final View view) {
        final ViewParent parent = view.getParent();
        if (parent instanceof ViewManager) {
            ((ViewManager)parent).removeView(view);
        }
        viewGroup.addView(view);
    }
    
    public final void c() {
        final View i = this.i;
        if (i != null) {
            hnu.f(i, false);
            this.i.setOnClickListener((View$OnClickListener)null);
        }
        final View h = this.h;
        if (h != null) {
            hnu.f(h, false);
            this.h.setOnClickListener((View$OnClickListener)null);
        }
        this.o = null;
        this.p = false;
        this.h = null;
        this.i = null;
        this.k = null;
        this.m = null;
        this.l = null;
        final ViewGroup n = this.n;
        if (n != null) {
            n.removeAllViews();
            hnu.f((View)this.n, false);
            this.n = null;
        }
        this.e.c((acku)null);
        this.q = null;
    }
}
