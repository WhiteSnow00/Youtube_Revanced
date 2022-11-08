import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Region;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class gm extends Drawable implements Drawable$Callback
{
    private final Drawable a;
    
    public gm(final Drawable a) {
        final Drawable a2 = this.a;
        if (a2 != null) {
            a2.setCallback((Drawable$Callback)null);
        }
        (this.a = a).setCallback((Drawable$Callback)this);
    }
    
    public void draw(final Canvas canvas) {
        this.a.draw(canvas);
    }
    
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
    
    public final Drawable getCurrent() {
        return this.a.getCurrent();
    }
    
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }
    
    public final int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }
    
    public final int getOpacity() {
        return this.a.getOpacity();
    }
    
    public final boolean getPadding(final Rect rect) {
        return this.a.getPadding(rect);
    }
    
    public final int[] getState() {
        return this.a.getState();
    }
    
    public final Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        return aio.e(this.a);
    }
    
    public final boolean isStateful() {
        return this.a.isStateful();
    }
    
    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }
    
    protected final void onBoundsChange(final Rect bounds) {
        this.a.setBounds(bounds);
    }
    
    protected final boolean onLevelChange(final int level) {
        return this.a.setLevel(level);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int alpha) {
        this.a.setAlpha(alpha);
    }
    
    public final void setAutoMirrored(final boolean b) {
        aio.d(this.a, b);
    }
    
    public final void setChangingConfigurations(final int changingConfigurations) {
        this.a.setChangingConfigurations(changingConfigurations);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
    
    public final void setDither(final boolean dither) {
        this.a.setDither(dither);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        this.a.setFilterBitmap(filterBitmap);
    }
    
    public void setHotspot(final float n, final float n2) {
        aip.d(this.a, n, n2);
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        aip.e(this.a, n, n2, n3, n4);
    }
    
    public boolean setState(final int[] state) {
        return this.a.setState(state);
    }
    
    public final void setTint(final int n) {
        aip.f(this.a, n);
    }
    
    public final void setTintList(final ColorStateList list) {
        aip.g(this.a, list);
    }
    
    public final void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        aip.h(this.a, porterDuff$Mode);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.a.setVisible(b, b2);
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
