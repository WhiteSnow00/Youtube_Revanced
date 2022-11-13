import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxe extends ukv
{
    private final gxd c;
    
    public gxe(final gxf gxf, final gxd c) {
        super((ukw)gxf, (ukt)c);
        this.c = c;
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        if (motionEvent != null && motionEvent.getPointerCount() == 1 && motionEvent2 != null && motionEvent2.getPointerCount() == 1) {
            this.c.g(n, n2);
            return true;
        }
        return super.onScroll(motionEvent, motionEvent2, n, n2);
    }
}
