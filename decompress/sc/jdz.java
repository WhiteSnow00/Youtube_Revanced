import android.view.MotionEvent;
import android.view.View;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.view.GestureDetector;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdz extends try
{
    public final jej a;
    public final abj b;
    public boolean c;
    public boolean d;
    private final GestureDetector e;
    
    public jdz(final Context context, final jej a, final iuv iuv, final jki jki, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = new abj();
        (this.e = new GestureDetector(context, (GestureDetector$OnGestureListener)new jdy(this))).setIsLongpressEnabled(false);
        if (jki.n()) {
            iuv.a((iuu)new jdw(this, 0));
        }
    }
    
    public final void c() {
        this.c = false;
    }
    
    public final boolean d(final View view, final MotionEvent motionEvent) {
        final GestureDetector e = this.e;
        if (e != null) {
            e.onTouchEvent(motionEvent);
        }
        final int pointerCount = motionEvent.getPointerCount();
        final boolean b = false;
        final boolean b2 = pointerCount == 1 && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3);
        final int pointerCount2 = motionEvent.getPointerCount();
        final int a = this.a.a;
        boolean c = this.c;
        if (c && (b2 || pointerCount2 > 1 || a != 5)) {
            int n = 0;
            while (true) {
                final abj b3 = this.b;
                if (n >= b3.b) {
                    break;
                }
                ((jdx)b3.b(n)).m();
                ++n;
            }
            this.c = false;
            c = b;
        }
        return c;
    }
    
    public final boolean h() {
        return !this.d && super.f;
    }
}
