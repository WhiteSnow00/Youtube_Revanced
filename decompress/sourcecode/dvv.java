import android.graphics.ColorFilter;
import android.graphics.Region;
import android.graphics.drawable.RippleDrawable;
import android.graphics.Matrix;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.MotionEvent;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvv extends Drawable implements Drawable$Callback, dwy
{
    private Drawable a;
    private dug b;
    private boolean c;
    
    private final void f(final boolean b, final boolean b2) {
        final Drawable a = this.a;
        if (a == null || a.isVisible() == b) {
            return;
        }
        try {
            this.a.setVisible(b, b2);
        }
        catch (final NullPointerException ex) {}
    }
    
    public final void a(final int n, final int n2) {
        final Drawable a = this.a;
        if (a == null) {
            return;
        }
        a.setBounds(0, 0, n, n2);
    }
    
    public final void b(final Drawable a, final dug b) {
        final Drawable a2 = this.a;
        if (a2 == a) {
            return;
        }
        boolean c = false;
        if (a2 != null) {
            this.f(false, false);
            this.a.setCallback((Drawable$Callback)null);
        }
        if ((this.a = a) != null) {
            this.f(this.isVisible(), false);
            this.a.setCallback((Drawable$Callback)this);
        }
        this.b = b;
        if ((b != null && b.a) || this.a instanceof InsetDrawable) {
            c = true;
        }
        this.c = c;
        this.invalidateSelf();
    }
    
    public final void c() {
        if (this.a != null) {
            this.f(false, false);
            this.a.setCallback((Drawable$Callback)null);
        }
        this.a = null;
        this.b = null;
        this.c = false;
    }
    
    public final boolean d(final MotionEvent motionEvent, final View view) {
        final Rect bounds = this.getBounds();
        this.a.setHotspot((float)((int)motionEvent.getX() - bounds.left), (float)((int)motionEvent.getY() - bounds.top));
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        if (this.a == null) {
            return;
        }
        final Rect bounds = this.getBounds();
        final int save = canvas.save();
        canvas.translate((float)bounds.left, (float)bounds.top);
        if (this.c) {
            canvas.clipRect(0, 0, bounds.width(), bounds.height());
        }
        final dug b = this.b;
        if (b != null) {
            canvas.concat((Matrix)b);
        }
        this.a.draw(canvas);
        canvas.restoreToCount(save);
    }
    
    public final boolean e(final MotionEvent motionEvent) {
        final Drawable a = this.a;
        return a != null && a instanceof RippleDrawable && motionEvent.getActionMasked() == 0 && this.getBounds().contains((int)motionEvent.getX(), (int)motionEvent.getY());
    }
    
    public final int getChangingConfigurations() {
        final Drawable a = this.a;
        if (a == null) {
            return -1;
        }
        return a.getChangingConfigurations();
    }
    
    public final Drawable getCurrent() {
        final Drawable a = this.a;
        if (a == null) {
            return null;
        }
        return a.getCurrent();
    }
    
    public final int getIntrinsicHeight() {
        final Drawable a = this.a;
        if (a == null) {
            return -1;
        }
        return a.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        final Drawable a = this.a;
        if (a == null) {
            return -1;
        }
        return a.getIntrinsicWidth();
    }
    
    public final int getMinimumHeight() {
        final Drawable a = this.a;
        if (a == null) {
            return -1;
        }
        return a.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        final Drawable a = this.a;
        if (a == null) {
            return -1;
        }
        return a.getMinimumWidth();
    }
    
    public final int getOpacity() {
        final Drawable a = this.a;
        if (a == null) {
            return -1;
        }
        return a.getOpacity();
    }
    
    public final boolean getPadding(final Rect rect) {
        final Drawable a = this.a;
        return a != null && a.getPadding(rect);
    }
    
    public final int[] getState() {
        final Drawable a = this.a;
        if (a == null) {
            return null;
        }
        return a.getState();
    }
    
    public final Region getTransparentRegion() {
        final Drawable a = this.a;
        if (a == null) {
            return null;
        }
        return a.getTransparentRegion();
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isStateful() {
        final Drawable a = this.a;
        return a != null && a.isStateful();
    }
    
    protected final boolean onLevelChange(final int level) {
        final Drawable a = this.a;
        return a != null && a.setLevel(level);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int alpha) {
        final Drawable a = this.a;
        if (a == null) {
            return;
        }
        a.setAlpha(alpha);
    }
    
    public final void setChangingConfigurations(final int changingConfigurations) {
        final Drawable a = this.a;
        if (a == null) {
            return;
        }
        a.setChangingConfigurations(changingConfigurations);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        final Drawable a = this.a;
        if (a == null) {
            return;
        }
        a.setColorFilter(colorFilter);
    }
    
    public final void setDither(final boolean dither) {
        final Drawable a = this.a;
        if (a == null) {
            return;
        }
        a.setDither(dither);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        final Drawable a = this.a;
        if (a == null) {
            return;
        }
        a.setFilterBitmap(filterBitmap);
    }
    
    public final boolean setState(final int[] state) {
        final Drawable a = this.a;
        return a != null && a.setState(state);
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        this.f(b, b2);
        return setVisible;
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
