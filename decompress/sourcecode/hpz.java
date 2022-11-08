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

public final class hpz
{
    public final aceo a;
    public final vax b;
    public final wwu c;
    public final acng d;
    public final abzk e;
    public final acae f;
    public final fap g;
    View h;
    View i;
    public View j;
    public LottieAnimationView k;
    public ImageView l;
    public View m;
    public ViewGroup n;
    public acex o;
    public boolean p;
    public ajkj q;
    public final uyi r;
    
    public hpz(final aceo a, final vax b, final wwu c, final acng d, final atjj atjj, final acae f, final fap g, final uyi r) {
        this.p = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (abzk)atjj.a();
        this.f = f;
        this.n = null;
        this.g = g;
        this.r = r;
    }
    
    public static View a(final ViewGroup viewGroup, final int n) {
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(n, viewGroup, false);
        viewGroup.addView(inflate);
        iba.e(inflate, true);
        return inflate;
    }
    
    public static void b(final ViewGroup viewGroup, final View view) {
        if (viewGroup != null) {
            final ViewParent parent = view.getParent();
            if (parent instanceof ViewManager) {
                ((ViewManager)parent).removeView(view);
            }
            viewGroup.addView(view);
        }
    }
    
    public final void c() {
        final View i = this.i;
        if (i != null) {
            iba.e(i, false);
            this.i.setOnClickListener((View$OnClickListener)null);
        }
        final View h = this.h;
        if (h != null) {
            iba.e(h, false);
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
            iba.e((View)this.n, false);
            this.n = null;
        }
        this.e.c((acir)null);
        this.q = null;
    }
}
