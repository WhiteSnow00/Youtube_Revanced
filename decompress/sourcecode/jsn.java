import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.os.Handler;
import android.view.View;
import android.graphics.PointF;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsn implements View$OnTouchListener
{
    public final PointF a;
    public final PointF b;
    public final jsg c;
    public final acil d;
    private final View e;
    private final int f;
    private final Handler g;
    private final int h;
    private final Runnable i;
    
    public jsn(final View e, final jsg c, final acil d, final Handler g, int scaledTouchSlop) {
        this.a = new PointF();
        this.b = new PointF();
        this.i = new jnu(this, 4);
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.g = g;
        this.h = scaledTouchSlop;
        scaledTouchSlop = ViewConfiguration.get(e.getContext()).getScaledTouchSlop();
        this.f = scaledTouchSlop * scaledTouchSlop;
    }
    
    public final boolean a(final PointF pointF, final PointF pointF2) {
        final float n = pointF.x - pointF2.x;
        final float n2 = pointF.y - pointF2.y;
        return n * n + n2 * n2 <= this.f;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.b.set(motionEvent.getX(), motionEvent.getY());
                    if (!this.a(this.b, this.a)) {
                        this.g.removeCallbacks(this.i);
                    }
                    return true;
                }
                if (action != 3) {
                    return this.e.onTouchEvent(motionEvent);
                }
            }
            this.g.removeCallbacks(this.i);
        }
        else {
            this.a.set(motionEvent.getX(), motionEvent.getY());
            this.b.set(motionEvent.getX(), motionEvent.getY());
            this.g.removeCallbacks(this.i);
            this.g.postDelayed(this.i, (long)this.h);
        }
        return this.e.onTouchEvent(motionEvent);
    }
}
