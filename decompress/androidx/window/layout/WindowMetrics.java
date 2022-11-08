// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import android.os.Build$VERSION;
import android.graphics.Rect;
import androidx.window.core.Bounds;

public final class WindowMetrics
{
    private final Bounds _bounds;
    private final aoa _windowInsetsCompat;
    
    public WindowMetrics(final Rect rect, final aoa aoa) {
        rect.getClass();
        aoa.getClass();
        this(new Bounds(rect), aoa);
    }
    
    public WindowMetrics(final Bounds bounds, final aoa windowInsetsCompat) {
        bounds.getClass();
        windowInsetsCompat.getClass();
        this._bounds = bounds;
        this._windowInsetsCompat = windowInsetsCompat;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final Class<? extends WindowMetrics> class1 = this.getClass();
        Class<?> class2;
        if (o != null) {
            class2 = o.getClass();
        }
        else {
            class2 = null;
        }
        if (!atnh.c(class1, class2)) {
            return false;
        }
        o.getClass();
        final WindowMetrics windowMetrics = (WindowMetrics)o;
        return atnh.c(this._bounds, windowMetrics._bounds) && atnh.c(this._windowInsetsCompat, windowMetrics._windowInsetsCompat);
    }
    
    public final Rect getBounds() {
        return this._bounds.toRect();
    }
    
    public final aoa getWindowInsets() {
        return this._windowInsetsCompat;
    }
    
    @Override
    public int hashCode() {
        return this._bounds.hashCode() * 31 + this._windowInsetsCompat.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WindowMetrics( bounds=");
        sb.append(this._bounds);
        sb.append(", windowInsetsCompat=");
        sb.append(this._windowInsetsCompat);
        sb.append(')');
        return sb.toString();
    }
}
