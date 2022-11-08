import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

final class addf extends nrw
{
    final /* synthetic */ addh a;
    private final oxl b;
    
    public addf(final addh a) {
        this.a = a;
        this.b = new oxl(null);
    }
    
    private final Double ae(final nqn nqn, final MotionEvent motionEvent) {
        nrw.o(nqn, Math.min(Math.max((int)motionEvent.getX(), this.a.getPaddingLeft()), this.a.getWidth() - this.a.getPaddingRight() - 1), Math.min(Math.max((int)motionEvent.getY(), this.a.getPaddingTop()), this.a.getHeight() - this.a.getPaddingBottom() - 1), true, this.b);
        if (this.b.a) {
            final num a = this.a.a();
            if (a != null) {
                return (Double)a.a;
            }
        }
        return null;
    }
    
    public final boolean h(final nqn nqn, final MotionEvent motionEvent) {
        this.a.k = false;
        nqn.getParent().requestDisallowInterceptTouchEvent(false);
        final Double ae = this.ae(nqn, motionEvent);
        if (ae != null) {
            this.a.i = ae;
            this.a.f();
            this.a.e(ae);
            return true;
        }
        return false;
    }
    
    public final void i() {
        this.a.k = false;
    }
    
    public final boolean j(final nqn nqn, final MotionEvent motionEvent) {
        this.a.k = true;
        nqn.getParent().requestDisallowInterceptTouchEvent(true);
        final Double ae = this.ae(nqn, motionEvent);
        if (ae != null) {
            this.a.i = ae;
            this.a.f();
            return true;
        }
        return false;
    }
}
