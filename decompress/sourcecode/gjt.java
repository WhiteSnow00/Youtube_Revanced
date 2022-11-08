import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.View;
import android.graphics.Rect;
import android.view.TouchDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjt extends TouchDelegate
{
    private final Rect a;
    private final View b;
    private final int c;
    
    public gjt(final Rect rect, final View b) {
        super(rect, b);
        this.a = new Rect(rect);
        this.b = b;
        this.c = ViewConfiguration.get(b.getContext()).getScaledEdgeSlop();
    }
    
    public final boolean onTouchEvent(MotionEvent obtain) {
        if (!this.a.contains((int)obtain.getX(), (int)obtain.getY())) {
            return false;
        }
        final int action = obtain.getAction();
        if (action != 0 && action != 1 && action != 2) {
            return false;
        }
        obtain = MotionEvent.obtain(obtain.getDownTime(), obtain.getEventTime(), action, obtain.getX(), (float)(this.b.getHeight() - this.c), obtain.getMetaState());
        return this.b.dispatchTouchEvent(obtain);
    }
}
