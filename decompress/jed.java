import android.view.MotionEvent;
import android.view.View;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.content.Context;
import android.view.ScaleGestureDetector$OnScaleGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jed extends try implements ScaleGestureDetector$OnScaleGestureListener
{
    public final Context a;
    public ScaleGestureDetector b;
    public GestureDetector c;
    public boolean d;
    public boolean e;
    private final abj g;
    private final jej h;
    
    public jed(final Context a, final jej h) {
        this.a = a;
        this.h = h;
        this.g = new abj();
        this.d = false;
    }
    
    public final void b(final jec jec) {
        this.g.add((Object)jec);
    }
    
    public final void c() {
        this.d = false;
    }
    
    public final boolean d(final View view, final MotionEvent motionEvent) {
        final GestureDetector c = this.c;
        if (c != null) {
            c.onTouchEvent(motionEvent);
        }
        final ScaleGestureDetector b = this.b;
        if (b != null) {
            b.onTouchEvent(motionEvent);
        }
        final int pointerCount = motionEvent.getPointerCount();
        boolean b2 = true;
        boolean b3 = false;
        final boolean b4 = pointerCount == 1 && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3);
        if (motionEvent.getPointerCount() != 1 || !this.h.c()) {
            b2 = false;
        }
        final boolean d = this.d;
        if (d && (b4 || b2)) {
            int n = 0;
            while (true) {
                final abj g = this.g;
                if (n >= g.b) {
                    break;
                }
                ((jec)g.b(n)).pk(this.e);
                ++n;
            }
            this.d = false;
            this.e = false;
        }
        else {
            b3 = d;
        }
        return b3;
    }
    
    public final boolean onScale(final ScaleGestureDetector scaleGestureDetector) {
        int n = 0;
        while (true) {
            final abj g = this.g;
            if (n >= g.b) {
                break;
            }
            ((jec)g.b(n)).z(scaleGestureDetector);
            ++n;
        }
        return true;
    }
    
    public final boolean onScaleBegin(final ScaleGestureDetector scaleGestureDetector) {
        this.d = true;
        int n = 0;
        while (true) {
            final abj g = this.g;
            if (n >= g.b) {
                break;
            }
            ((jec)g.b(n)).pj(scaleGestureDetector);
            ++n;
        }
        return true;
    }
    
    public final void onScaleEnd(final ScaleGestureDetector scaleGestureDetector) {
    }
}
