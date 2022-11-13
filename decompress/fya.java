import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import android.widget.ProgressBar;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fya implements View$OnLayoutChangeListener
{
    private final ProgressBar a;
    private final pee b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    
    public fya(final ProgressBar a, final pee b, final int c, final int d, final int e, final int f, final int g) {
        final boolean b2 = true;
        adkp.H(d >= c);
        adkp.H(f >= e && b2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void onLayoutChange(final View view, int g, int d, int n, int e, int n2, int f, final int n3, final int n4) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.a.getLayoutParams();
        n2 = this.g;
        e = e - d - n2;
        d = this.d;
        n = 0;
        if (e >= d) {
            g = this.f;
        }
        else {
            g = this.c;
            if (e <= g) {
                e = this.e;
                d = g;
                g = e;
            }
            else {
                n = n2 / 2;
                f = this.f;
                n2 = this.e;
                g = Math.round((f - n2) / (float)(d - g) * (e - g) + n2);
                d = -1;
            }
        }
        viewGroup$MarginLayoutParams.height = d;
        viewGroup$MarginLayoutParams.bottomMargin = n;
        viewGroup$MarginLayoutParams.topMargin = n;
        final pee b = this.b;
        if (g != b.g) {
            b.g = g;
            b.invalidateSelf();
        }
    }
}
