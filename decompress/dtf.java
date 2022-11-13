import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class dtf implements View$OnTouchListener
{
    public dun a;
    public dun b;
    
    public dtf() {
    }
    
    public final boolean onTouch(final View a, final MotionEvent b) {
        final dun b2 = this.b;
        if (b2 != null) {
            bku.s(b2, a, b);
        }
        final dun a2 = this.a;
        if (a2 != null) {
            bkw.e();
            if (bku.f == null) {
                bku.f = new dwx();
            }
            final dwx f = bku.f;
            f.a = a;
            f.b = b;
            final Object p2 = a2.b.l().P(a2, bku.f);
            final dwx f2 = bku.f;
            f2.a = null;
            f2.b = null;
            if (p2 != null && (boolean)p2) {
                return true;
            }
        }
        return false;
    }
}
