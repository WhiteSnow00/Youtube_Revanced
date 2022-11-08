import android.view.MotionEvent;
import android.graphics.Point;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fok implements tpy, tpu
{
    private final View a;
    private Point b;
    private Object c;
    
    public fok(final View a) {
        this.a = a;
    }
    
    private final View d(final MotionEvent motionEvent) {
        if (this.b == null) {
            this.b = new Point();
        }
        this.b.set((int)motionEvent.getRawX(), (int)motionEvent.getRawY());
        gow.h(this.b, this.a);
        View view;
        if ((view = gow.d(this.a, this.b, (aext)bbt.p)) == null) {
            if (this.b == null) {
                this.b = new Point();
            }
            this.b.set((int)motionEvent.getX(), (int)motionEvent.getY());
            view = gow.d(this.a, this.b, (aext)bbt.q);
        }
        return view;
    }
    
    public final void b(final MotionEvent motionEvent) {
        final View d = this.d(motionEvent);
        if (d == null) {
            return;
        }
        if (this.c == null) {
            this.c = d.getTag(2131430457);
        }
        final Object c = this.c;
        if (c != null) {
            ((tpy)c).b(motionEvent);
            return;
        }
        if (d.isClickable()) {
            d.performClick();
        }
    }
    
    public final boolean c(final MotionEvent motionEvent, final boolean b) {
        final View d = this.d(motionEvent);
        if (d == null) {
            return false;
        }
        if (this.c == null) {
            this.c = d.getTag(2131430457);
        }
        final Object c = this.c;
        return c != null && ((tpu)c).c(motionEvent, b);
    }
    
    public final void pe(final MotionEvent motionEvent, final boolean b) {
        final View d = this.d(motionEvent);
        if (d == null) {
            return;
        }
        if (this.c == null) {
            this.c = d.getTag(2131430457);
        }
        final Object c = this.c;
        if (c != null) {
            ((tpu)c).pe(motionEvent, b);
        }
    }
}
