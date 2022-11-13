import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class jdy extends GestureDetector$SimpleOnGestureListener
{
    final jdz a;
    
    public jdy(final jdz a) {
        this.a = a;
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        return true;
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        final jdz a = this.a;
        int n3 = 0;
        final boolean b = false;
        final int n4 = 0;
        boolean b2 = b;
        if (motionEvent != null) {
            b2 = b;
            if (motionEvent.getPointerCount() == 1) {
                b2 = b;
                if (motionEvent2 != null) {
                    b2 = b;
                    if (motionEvent2.getPointerCount() == 1) {
                        b2 = b;
                        if (a.a.a == 5) {
                            if (!a.c) {
                                int n5 = n4;
                                while (true) {
                                    final abj b3 = a.b;
                                    if (n5 >= b3.b) {
                                        break;
                                    }
                                    ((jdx)b3.b(n5)).k();
                                    ++n5;
                                }
                                a.c = true;
                            }
                            else {
                                while (true) {
                                    final abj b4 = a.b;
                                    if (n3 >= b4.b) {
                                        break;
                                    }
                                    ((jdx)b4.b(n3)).p(n, n2);
                                    ++n3;
                                }
                            }
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
}
