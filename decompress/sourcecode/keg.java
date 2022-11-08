import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class keg implements View$OnAttachStateChangeListener
{
    final /* synthetic */ acij a;
    final /* synthetic */ int b;
    final /* synthetic */ kei c;
    
    public keg(final kei c, final acij a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onViewAttachedToWindow(View viewById) {
        this.c.d.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this.c.d.getParent()).getMeasuredWidth(), 1073741824);
        final FixedAspectRatioFrameLayout d = this.c.d;
        boolean b = false;
        d.measure(measureSpec, 0);
        final int n = (int)(this.c.d.getMeasuredWidth() / this.c.h(this.a));
        final int b2 = this.b;
        final kei c = this.c;
        viewById = c.d.findViewById(2131428989);
        int n2;
        if (viewById.getVisibility() == 8) {
            n2 = 0;
        }
        else {
            n2 = viewById.getMeasuredHeight() + c.a.getResources().getDimensionPixelOffset(2131168680);
        }
        final int measuredHeight = this.c.e.getMeasuredHeight();
        final kei c2 = this.c;
        final int c3 = c2.c;
        final ImageView n3 = c2.n;
        if (measuredHeight + (c3 + c3) <= n - b2 - n2) {
            b = true;
        }
        tmy.v((View)n3, b);
        this.c.d.requestLayout();
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
