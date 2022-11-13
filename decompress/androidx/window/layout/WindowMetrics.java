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
    private final aob _windowInsetsCompat;
    
    public WindowMetrics(final Rect rect, final aob aob) {
        rect.getClass();
        aob.getClass();
        this(new Bounds(rect), aob);
    }
    
    public WindowMetrics(final Rect rect, aob a, final int n, final atny atny) {
        if ((n & 0x2) != 0x0) {
            Object o;
            if (Build$VERSION.SDK_INT >= 30) {
                o = new ans();
            }
            else if (Build$VERSION.SDK_INT >= 29) {
                o = new anr();
            }
            else {
                o = new anq();
            }
            a = ((ant)o).a();
            a.getClass();
        }
        this(rect, a);
    }
    
    public WindowMetrics(final Bounds bounds, final aob windowInsetsCompat) {
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
        if (!atoc.c((Object)class1, (Object)class2)) {
            return false;
        }
        o.getClass();
        final WindowMetrics windowMetrics = (WindowMetrics)o;
        return atoc.c((Object)this._bounds, (Object)windowMetrics._bounds) && atoc.c((Object)this._windowInsetsCompat, (Object)windowMetrics._windowInsetsCompat);
    }
    
    public final Rect getBounds() {
        return this._bounds.toRect();
    }
    
    public final aob getWindowInsets() {
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
