import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.graphics.Color;
import android.content.Context;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aayl extends abtz
{
    public aayj a;
    public final Animation b;
    public final Animation c;
    public final Animation$AnimationListener d;
    public final ColorDrawable e;
    private final ValueAnimator f;
    private boolean g;
    private final long h;
    
    public aayl(final Context context) {
        super(context);
        this.e = new ColorDrawable(Color.argb(140, 0, 0, 0));
        this.g = false;
        final long n = context.getResources().getInteger(17694720);
        this.h = n;
        (this.b = (Animation)new AlphaAnimation(0.0f, 1.0f)).setDuration(n);
        final AlphaAnimation c = new AlphaAnimation(1.0f, 0.0f);
        (this.c = (Animation)c).setDuration(n);
        ((Animation)c).setAnimationListener(this.d = (Animation$AnimationListener)new aayk((View)this, 0));
        final ValueAnimator f = new ValueAnimator();
        (this.f = f).setDuration(n);
        f.setFloatValues(new float[] { 0.0f, 1.0f });
        f.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new uub(this, 13));
        anb.ax((View)this);
        this.e();
    }
    
    public static void c(final ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); ++i) {
            final View child = viewGroup.getChildAt(i);
            child.clearAnimation();
            if (child instanceof ViewGroup) {
                c((ViewGroup)child);
            }
        }
    }
    
    public final ViewGroup$LayoutParams a() {
        return new abud(-1, -1, false);
    }
    
    public final void e() {
        this.removeAllViews();
        this.setVisibility(8);
    }
    
    public final void f(final boolean g) {
        if (this.g == g) {
            return;
        }
        int n;
        if (!(this.g = g)) {
            n = 0;
        }
        else {
            n = 4;
        }
        anb.X((View)this, n);
        if (g) {
            this.f.start();
            this.setForeground((Drawable)this.e);
            return;
        }
        this.clearAnimation();
        this.animate().alpha(1.0f).setDuration(this.h).start();
        this.setForeground((Drawable)null);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.g;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!super.onTouchEvent(motionEvent)) {
            final aayj a = this.a;
            if (a != null) {
                a.l(motionEvent);
            }
        }
        return false;
    }
}
