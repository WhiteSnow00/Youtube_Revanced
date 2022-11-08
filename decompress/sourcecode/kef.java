import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class kef implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ float a;
    final /* synthetic */ kei b;
    
    public kef(final kei b, final float a) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean onPreDraw() {
        this.b.d.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        final int n = (int)Math.ceil(this.b.d.getMeasuredHeight() * this.a);
        tmy.aG((View)this.b.p, (atjj)new ixt(n, 4), tmy.aE(n, -1), (Class)FrameLayout$LayoutParams.class);
        float x = (this.b.d.getMeasuredWidth() - n) / 2.0f;
        if (ana.f((View)this.b.d) == 1) {
            x = -x;
        }
        this.b.p.setX(x);
        return true;
    }
}
