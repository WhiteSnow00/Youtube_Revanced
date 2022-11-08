import android.view.MotionEvent;
import android.view.View;
import android.graphics.Rect;
import android.view.TouchDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kat extends TouchDelegate
{
    public kat(final Rect rect, final View view) {
        super(rect, view);
    }
    
    public final boolean onTouchEvent(MotionEvent obtain) {
        final boolean onTouchEvent = super.onTouchEvent(obtain);
        if (onTouchEvent && obtain.getAction() == 1) {
            obtain = MotionEvent.obtain(obtain);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            return true;
        }
        return onTouchEvent;
    }
}
