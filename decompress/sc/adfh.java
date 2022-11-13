import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

final class adfh extends ntc
{
    final adfj a;
    private final oyu b;
    
    public adfh(final adfj a) {
        this.a = a;
        this.b = new oyu((byte[])null);
    }
    
    private final Double X(final nrt nrt, final MotionEvent motionEvent) {
        oap.w(nrt, Math.min(Math.max((int)motionEvent.getX(), this.a.getPaddingLeft()), this.a.getWidth() - this.a.getPaddingRight() - 1), Math.min(Math.max((int)motionEvent.getY(), this.a.getPaddingTop()), this.a.getHeight() - this.a.getPaddingBottom() - 1), true, this.b);
        if (this.b.a) {
            final nvs a = this.a.a();
            if (a != null) {
                return (Double)a.a;
            }
        }
        return null;
    }
    
    public final boolean h(final nrt nrt, final MotionEvent motionEvent) {
        this.a.k = false;
        nrt.getParent().requestDisallowInterceptTouchEvent(false);
        final Double x = this.X(nrt, motionEvent);
        if (x != null) {
            this.a.i = x;
            this.a.f();
            this.a.e(x);
            return true;
        }
        return false;
    }
    
    public final void i() {
        this.a.k = false;
    }
    
    public final boolean j(final nrt nrt, final MotionEvent motionEvent) {
        this.a.k = true;
        nrt.getParent().requestDisallowInterceptTouchEvent(true);
        final Double x = this.X(nrt, motionEvent);
        if (x != null) {
            this.a.i = x;
            this.a.f();
            return true;
        }
        return false;
    }
}
