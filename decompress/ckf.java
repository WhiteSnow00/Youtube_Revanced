import android.graphics.PorterDuff$Mode;
import android.graphics.Region;
import android.graphics.Rect;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class ckf extends Drawable
{
    public Drawable e;
    
    public ckf() {
    }
    
    public void applyTheme(final Resources$Theme resources$Theme) {
        final Drawable e = this.e;
        if (e != null) {
            air.b(e, resources$Theme);
        }
    }
    
    public final void clearColorFilter() {
        final Drawable e = this.e;
        if (e != null) {
            e.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }
    
    public final Drawable getCurrent() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getCurrent();
        }
        return super.getCurrent();
    }
    
    public final int getMinimumHeight() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }
    
    public final boolean getPadding(final Rect rect) {
        final Drawable e = this.e;
        if (e != null) {
            return e.getPadding(rect);
        }
        return super.getPadding(rect);
    }
    
    public final int[] getState() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getState();
        }
        return super.getState();
    }
    
    public final Region getTransparentRegion() {
        final Drawable e = this.e;
        if (e != null) {
            return e.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }
    
    public final void jumpToCurrentState() {
        final Drawable e = this.e;
        if (e != null) {
            e.jumpToCurrentState();
        }
    }
    
    protected void onBoundsChange(final Rect bounds) {
        final Drawable e = this.e;
        if (e != null) {
            e.setBounds(bounds);
            return;
        }
        super.onBoundsChange(bounds);
    }
    
    protected boolean onLevelChange(final int level) {
        final Drawable e = this.e;
        if (e != null) {
            return e.setLevel(level);
        }
        return super.onLevelChange(level);
    }
    
    public final void setChangingConfigurations(final int n) {
        final Drawable e = this.e;
        if (e != null) {
            e.setChangingConfigurations(n);
            return;
        }
        super.setChangingConfigurations(n);
    }
    
    public final void setColorFilter(final int n, final PorterDuff$Mode porterDuff$Mode) {
        final Drawable e = this.e;
        if (e != null) {
            e.setColorFilter(n, porterDuff$Mode);
            return;
        }
        super.setColorFilter(n, porterDuff$Mode);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        final Drawable e = this.e;
        if (e != null) {
            e.setFilterBitmap(filterBitmap);
        }
    }
    
    public final void setHotspot(final float n, final float n2) {
        final Drawable e = this.e;
        if (e != null) {
            air.d(e, n, n2);
        }
    }
    
    public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Drawable e = this.e;
        if (e != null) {
            air.e(e, n, n2, n3, n4);
        }
    }
    
    public final boolean setState(final int[] array) {
        final Drawable e = this.e;
        if (e != null) {
            return e.setState(array);
        }
        return super.setState(array);
    }
}
