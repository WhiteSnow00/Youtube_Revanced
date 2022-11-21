import android.os.Build$VERSION;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.graphics.Rect;
import android.app.Dialog;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwa implements View$OnTouchListener
{
    private final Dialog a;
    private final int b;
    private final int c;
    private final int d;
    
    public adwa(final Dialog a, final Rect rect) {
        this.a = a;
        this.b = rect.left;
        this.c = rect.top;
        this.d = ViewConfiguration.get(a.getContext()).getScaledWindowTouchSlop();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final View viewById = view.findViewById(16908290);
        final int n = this.b + viewById.getLeft();
        final int width = viewById.getWidth();
        final int n2 = this.c + viewById.getTop();
        if (new RectF((float)n, (float)n2, (float)(width + n), (float)(viewById.getHeight() + n2)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build$VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            final float n3 = (float)(-this.d - 1);
            obtain.setLocation(n3, n3);
        }
        view.performClick();
        return this.a.onTouchEvent(obtain);
    }
}
