import android.util.DisplayMetrics;
import android.widget.TextView;
import java.util.Map;
import java.util.Collections;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcp extends acja
{
    public final Context a;
    public final acng b;
    public final ackz c;
    public final gko d;
    public final zhb e;
    private final ViewGroup f;
    private final aceo g;
    private kco h;
    private kco i;
    private final int j;
    
    public kcp(final Context a, final fyx fyx, final acng b, final ackz c, final zhb e, final aceo g, final gko d, final byte[] array) {
        this.a = a;
        this.b = b;
        this.f = (ViewGroup)new FrameLayout(a);
        this.c = c;
        this.e = e;
        this.g = g;
        this.d = d;
        this.j = fyx.c();
    }
    
    public static int f(final Context context) {
        if (context.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            return 2131165492;
        }
        if (context.getResources().getConfiguration().orientation == 2 && context.getResources().getConfiguration().screenWidthDp >= 480) {
            return 2131165493;
        }
        return 2131165491;
    }
    
    private static View g(final ahwm ahwm, final Context context) {
        ahwn ahwn;
        if ((ahwn = ahwm.j) == null) {
            ahwn = ahwn.a;
        }
        final ahwk h = h(ahwn);
        if (h == ahwk.d) {
            final View inflate = View.inflate(context, 2131624069, (ViewGroup)null);
            final int dimensionPixelSize = context.getResources().getDimensionPixelSize(f(context));
            inflate.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            return inflate;
        }
        if (h == ahwk.e) {
            final View inflate2 = View.inflate(context, 2131624066, (ViewGroup)null);
            final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(f(context));
            inflate2.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            return inflate2;
        }
        if (context.getResources().getConfiguration().orientation == 2) {
            if (context.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
                return View.inflate(context, 2131624067, (ViewGroup)null);
            }
            if (context.getResources().getConfiguration().screenWidthDp >= 480) {
                return View.inflate(context, 2131624068, (ViewGroup)null);
            }
        }
        final View inflate3 = View.inflate(context, 2131624065, (ViewGroup)null);
        final int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(f(context));
        inflate3.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        return inflate3;
    }
    
    private static ahwk h(final ahwn ahwn) {
        ahwk ahwk;
        if (ahwn == null) {
            ahwk = ahwk.a;
        }
        else if ((ahwk = ahwk.b(ahwn.c)) == null) {
            ahwk = ahwk.a;
        }
        return ahwk;
    }
    
    public final View a() {
        return (View)this.f;
    }
    
    public final void c(final acir acir) {
        final kco h = this.h;
        if (h != null) {
            h.a();
        }
        final kco i = this.i;
        if (i != null) {
            i.a();
        }
        this.h = null;
        this.i = null;
    }
}
