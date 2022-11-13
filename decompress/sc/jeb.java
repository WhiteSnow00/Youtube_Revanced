import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jeb extends GestureDetector$SimpleOnGestureListener
{
    final jed a;
    
    public jeb(final jed a) {
        this.a = a;
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        final double n3 = n;
        final double n4 = n2;
        final jed a = this.a;
        final double hypot = Math.hypot(n3, n4);
        final boolean d = a.d;
        boolean e = false;
        if (d) {
            e = e;
            if (hypot >= 1500.0) {
                e = true;
            }
        }
        a.e = e;
        return true;
    }
}
