import android.widget.LinearLayout;
import android.graphics.PorterDuff$Mode;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwx implements ValueAnimator$AnimatorUpdateListener
{
    public final int a;
    public final Object b;
    private final int c;
    
    public hwx(final gdg b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hwx(final hxa b, final int a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        if (this.c != 0) {
            final Object b = this.b;
            final int a = this.a;
            final LinearLayout a2 = ((gdg)b).a;
            if (a2 != null) {
                a2.getBackground().setColorFilter(tpe.b(a, (int)valueAnimator.getAnimatedValue()), PorterDuff$Mode.SRC_ATOP);
            }
            return;
        }
        ((hxa)this.b).ak.g((int)valueAnimator.getAnimatedValue(), this.a, false);
    }
}
