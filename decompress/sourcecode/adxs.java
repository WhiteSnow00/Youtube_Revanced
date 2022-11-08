import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxs extends LinearLayout
{
    public ValueAnimator a;
    final /* synthetic */ TabLayout b;
    
    public adxs(final TabLayout b, final Context context) {
        this.b = b;
        super(context);
        this.setWillNotDraw(false);
    }
    
    public final void a() {
        final View child = this.getChildAt(this.b.a());
        final TabLayout b = this.b;
        final Drawable l = b.l;
        final RectF aa = adwd.aa(b, child);
        l.setBounds((int)aa.left, l.getBounds().top, (int)aa.right, l.getBounds().bottom);
    }
    
    public final void b(final int n) {
        final Rect bounds = this.b.l.getBounds();
        this.b.l.setBounds(bounds.left, 0, bounds.right, n);
        this.requestLayout();
    }
    
    public final void c(final View view, final View view2, final float n) {
        if (view != null && view.getWidth() > 0) {
            final TabLayout b = this.b;
            b.B.ab(b, view, view2, n, b.l);
        }
        else {
            final Drawable l = this.b.l;
            l.setBounds(-1, l.getBounds().top, -1, this.b.l.getBounds().bottom);
        }
        ana.H((View)this);
    }
    
    public final void d(final boolean b, final int n, final int n2) {
        final View child = this.getChildAt(this.b.a());
        final View child2 = this.getChildAt(n);
        if (child2 == null) {
            this.a();
            return;
        }
        final adxr adxr = new adxr(this, child, child2, 0);
        if (b) {
            final ValueAnimator a = new ValueAnimator();
            (this.a = a).setInterpolator(this.b.z);
            a.setDuration((long)n2);
            a.setFloatValues(new float[] { 0.0f, 1.0f });
            a.addUpdateListener((ValueAnimator$AnimatorUpdateListener)adxr);
            a.start();
            return;
        }
        this.a.removeAllUpdateListeners();
        this.a.addUpdateListener((ValueAnimator$AnimatorUpdateListener)adxr);
    }
    
    public final void draw(final Canvas canvas) {
        int n;
        if ((n = this.b.l.getBounds().height()) < 0) {
            n = this.b.l.getIntrinsicHeight();
        }
        final int t = this.b.t;
        int n3;
        if (t != 0) {
            if (t != 1) {
                final int n2 = n3 = 0;
                if (t != 2) {
                    if (t != 3) {
                        n = 0;
                        n3 = n2;
                    }
                    else {
                        n = this.getHeight();
                        n3 = n2;
                    }
                }
            }
            else {
                n3 = (this.getHeight() - n) / 2;
                n = (this.getHeight() + n) / 2;
            }
        }
        else {
            n3 = this.getHeight() - n;
            n = this.getHeight();
        }
        if (this.b.l.getBounds().width() > 0) {
            final Rect bounds = this.b.l.getBounds();
            this.b.l.setBounds(bounds.left, n3, bounds.right, n);
            this.b.l.draw(canvas);
        }
        super.draw(canvas);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final ValueAnimator a = this.a;
        if (a != null && a.isRunning()) {
            this.d(false, this.b.a(), -1);
            return;
        }
        this.a();
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (View$MeasureSpec.getMode(n) != 1073741824) {
            return;
        }
        final TabLayout b = this.b;
        if (b.r == 1 || b.u == 2) {
            final int childCount = this.getChildCount();
            final int n3 = 0;
            int i = 0;
            int width = 0;
            while (i < childCount) {
                final View child = this.getChildAt(i);
                int max = width;
                if (child.getVisibility() == 0) {
                    max = Math.max(width, child.getMeasuredWidth());
                }
                ++i;
                width = max;
            }
            if (width <= 0) {
                return;
            }
            final int n4 = (int)adwd.p(this.getContext(), 16);
            if (width * childCount <= this.getMeasuredWidth() - (n4 + n4)) {
                boolean b2 = false;
                for (int j = n3; j < childCount; ++j) {
                    final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.getChildAt(j).getLayoutParams();
                    if (linearLayout$LayoutParams.width != width || linearLayout$LayoutParams.weight != 0.0f) {
                        linearLayout$LayoutParams.width = width;
                        linearLayout$LayoutParams.weight = 0.0f;
                        b2 = true;
                    }
                }
                if (!b2) {
                    return;
                }
            }
            else {
                final TabLayout b3 = this.b;
                b3.r = 0;
                b3.n(false);
            }
            super.onMeasure(n, n2);
        }
    }
}
