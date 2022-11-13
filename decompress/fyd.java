import android.graphics.ColorFilter;
import android.graphics.Rect;
import java.util.Iterator;
import android.animation.Animator;
import android.graphics.Outline;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import java.util.HashSet;
import android.animation.ValueAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyd extends Drawable implements Drawable$Callback, Animator$AnimatorListener, ValueAnimator$AnimatorUpdateListener
{
    private static final TimeInterpolator e;
    public final ValueAnimator a;
    public fyc b;
    public fyc c;
    public fyc d;
    private final HashSet f;
    
    static {
        new ColorDrawable(0);
        e = (TimeInterpolator)new fyn();
    }
    
    public fyd(final fyc fyc, final int n) {
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
        (this.a = ofInt).setIntValues(new int[] { 255, 0 });
        ofInt.setDuration((long)n);
        ofInt.setStartDelay(1L);
        ofInt.setInterpolator(fyd.e);
        ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)this);
        ofInt.addListener((Animator$AnimatorListener)this);
        this.f = new HashSet();
        tbi.f();
        if (ofInt.isStarted()) {
            ofInt.end();
        }
        this.i(null);
        this.h(fyc);
        this.e(null);
        this.c();
        this.c();
    }
    
    private final void h(final fyc b) {
        b.getClass();
        this.b = b;
        b.a.setCallback((Drawable$Callback)this);
        b.a.setBounds(this.getBounds());
        b.a.setAlpha(255);
    }
    
    private final void i(final fyc c) {
        this.c = c;
        if (c != null) {
            c.a.setCallback((Drawable$Callback)this);
            c.a.setBounds(this.getBounds());
            c.a.setAlpha(255);
        }
    }
    
    private final boolean j() {
        return this.c != null && this.b != null && this.d == null;
    }
    
    private final boolean k() {
        return this.c == null && this.b != null && this.d == null;
    }
    
    private static final void l(final fyb fyb) {
        if (fyb != null) {
            fyb.a();
        }
    }
    
    public final fyc a() {
        final fyc d = this.d;
        if (d != null) {
            return d;
        }
        return this.b;
    }
    
    public final void b(final fyb fyb) {
        this.f.add(fyb);
    }
    
    public final void c() {
        final fyc c = this.c;
        final boolean b = true;
        adkp.R(c == null, "previousDrawableHolder must be null in static state.");
        adkp.R(this.b != null, "currentDrawableHolder must not be null in static state.");
        adkp.R(this.d == null && b, "nextDrawableHolder must be null in static state.");
        adkp.Q(this.k());
        final boolean f = this.f();
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("All drawables must be unique. Previous ");
        sb.append(value);
        sb.append(", current ");
        sb.append(value2);
        sb.append(", next ");
        sb.append(value3);
        adkp.R(f, sb.toString());
    }
    
    public final void d(final fyc fyc, final fyb fyb) {
        String.valueOf(fyc);
        if (this.k()) {
            l(fyb);
            this.e(null);
            return;
        }
        if (this.g()) {
            this.a.cancel();
            l(fyb);
            return;
        }
        if (this.j()) {
            this.b(fyb);
            return;
        }
        throw new RuntimeException("In a bad state.");
    }
    
    public final void draw(final Canvas canvas) {
        this.b.a.draw(canvas);
        final fyc c = this.c;
        if (c != null) {
            c.a.draw(canvas);
        }
    }
    
    public final void e(final fyc d) {
        this.d = d;
        if (d != null) {
            d.a.setCallback((Drawable$Callback)this);
            d.a.setBounds(this.getBounds());
            d.a.setAlpha(255);
        }
    }
    
    public final boolean f() {
        final fyc c = this.c;
        Drawable a = null;
        Drawable a2;
        if (c != null) {
            a2 = c.a;
        }
        else {
            a2 = null;
        }
        final fyc b = this.b;
        Drawable a3;
        if (b != null) {
            a3 = b.a;
        }
        else {
            a3 = null;
        }
        final fyc d = this.d;
        if (d != null) {
            a = d.a;
        }
        final boolean b2 = false;
        if (a2 != null && a3 != null) {
            final boolean b3 = b2;
            if (a2 == a3) {
                return b3;
            }
        }
        if (a2 != null && a != null) {
            final boolean b3 = b2;
            if (a2 == a) {
                return b3;
            }
        }
        boolean b3;
        if (a3 != null && a != null) {
            if (a3 != a) {
                return true;
            }
            b3 = b2;
        }
        else {
            b3 = true;
        }
        return b3;
    }
    
    public final boolean g() {
        return this.c == null && this.b != null && this.d != null;
    }
    
    public final int getIntrinsicHeight() {
        return this.a().a.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        return this.a().a.getIntrinsicWidth();
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void getOutline(final Outline outline) {
        outline.setRect(this.getBounds());
        outline.setAlpha(this.getAlpha() / 255.0f);
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isStateful() {
        return true;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.h(this.c);
        this.i(null);
        this.e(null);
        this.c();
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.i(null);
        this.e(null);
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            l((fyb)iterator.next());
        }
        this.f.clear();
        this.c();
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        throw new UnsupportedOperationException("crossFadeAnimator should never repeat.");
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.i(this.b);
        this.h(this.d);
        this.e(null);
        final fyc c = this.c;
        final boolean b = true;
        adkp.R(c != null, "previousDrawableHolder must not be null in static state.");
        adkp.R(this.b != null, "currentDrawableHolder must not be null in static state.");
        adkp.R(this.d == null && b, "nextDrawableHolder must be null in static state.");
        adkp.Q(this.j());
        final boolean f = this.f();
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("All drawables must be unique. Previous ");
        sb.append(value);
        sb.append(", current ");
        sb.append(value2);
        sb.append(", next ");
        sb.append(value3);
        adkp.R(f, sb.toString());
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final fyc c = this.c;
        if (c != null) {
            c.a.setAlpha((int)valueAnimator.getAnimatedValue());
            this.invalidateSelf();
        }
        final fyc a = this.a();
        final float animatedFraction = valueAnimator.getAnimatedFraction();
        final fyc c2 = this.c;
        for (final fyb fyb : this.f) {
            if (fyb != null) {
                fyb.b(animatedFraction, c2, a);
            }
        }
    }
    
    protected final void onBoundsChange(final Rect bounds) {
        this.b.a.setBounds(bounds);
        final fyc c = this.c;
        if (c != null) {
            c.a.setBounds(bounds);
        }
        final fyc d = this.d;
        if (d != null) {
            d.a.setBounds(bounds);
        }
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int n) {
        throw new UnsupportedOperationException("Set alpha on the inner drawables instead.");
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        throw new UnsupportedOperationException("Set color filter on the inner drawables instead.");
    }
    
    public final boolean setState(final int[] state) {
        if (this.k() && this.b.a.setState(state)) {
            this.invalidateSelf();
            return true;
        }
        return false;
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
