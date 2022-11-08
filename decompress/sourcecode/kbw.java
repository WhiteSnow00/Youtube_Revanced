import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import android.view.GestureDetector$OnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbw implements GestureDetector$OnGestureListener
{
    final /* synthetic */ PivotBar a;
    private boolean b;
    private View c;
    
    public kbw(final PivotBar a) {
        this.a = a;
        this.b = false;
        this.c = null;
    }
    
    private final void a() {
        final View c = this.c;
        if (c != null) {
            c.setPressed(false);
            this.c = null;
        }
    }
    
    private final boolean b(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
        return Math.abs(motionEvent.getY() - motionEvent2.getY()) > this.a.d;
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        this.a();
        this.b = false;
        return true;
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        this.a();
        if (!this.b(motionEvent, motionEvent2) && !this.b) {
            return true;
        }
        if (!this.b) {
            this.a.f(motionEvent);
            this.b = true;
        }
        this.a.f(motionEvent2);
        return true;
    }
    
    public final void onLongPress(final MotionEvent motionEvent) {
        throw new UnsupportedOperationException("Long presses not supported");
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        this.a();
        if (!this.b(motionEvent, motionEvent2) && !this.b) {
            return true;
        }
        if (!this.b) {
            this.a.f(motionEvent);
            this.b = true;
        }
        this.a.f(motionEvent2);
        return true;
    }
    
    public final void onShowPress(final MotionEvent motionEvent) {
        final Point point = new Point((int)motionEvent.getRawX(), (int)motionEvent.getRawY());
        gow.h(point, (View)this.a);
        final View d = gow.d((View)this.a, point, (aext)ihq.r);
        this.a();
        if (d != null) {
            d.setPressed(true);
            this.c = d;
        }
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        if (this.b) {
            this.a.f(motionEvent);
        }
        else {
            this.a();
            final PivotBar a = this.a;
            final Point point = new Point();
            point.set((int)motionEvent.getRawX(), (int)motionEvent.getRawY());
            gow.h(point, (View)a);
            final View d = gow.d((View)a, point, (aext)ihq.q);
            if (d != null) {
                d.performClick();
            }
        }
        return true;
    }
}
