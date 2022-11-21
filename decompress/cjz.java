import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class cjz implements Drawable$Callback
{
    final cke a;
    
    public cjz(final cke a) {
        this.a = a;
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.a.invalidateSelf();
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.a.scheduleSelf(runnable, n);
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}
