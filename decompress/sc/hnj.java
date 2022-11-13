import j$.util.Optional;
import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hnj extends GestureDetector$SimpleOnGestureListener
{
    final hqy a;
    final hpy b;
    final hnk c;
    
    public hnj(final hnk c, final hqy a, final hpy b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onLongPress(final MotionEvent motionEvent) {
        final hrf am = this.a.aM();
        if (am == null) {
            return;
        }
        this.c.d = true;
        final how how = (how)am.k;
        final Optional au = how.aU();
        if (au.isPresent() && (((ante)au.get()).c & 0x800) != 0x0) {
            final vcy aw = how.aw;
            aiqj aiqj;
            if ((aiqj = ((ante)au.get()).R) == null) {
                aiqj = aiqj.a;
            }
            aw.a(aiqj);
        }
        else {
            how.bg();
        }
        am.performHapticFeedback(0);
        final hpy b = this.b;
        if (b.e && b.g) {
            if (b.h) {
                b.d();
                b.h(3, 134942);
            }
        }
    }
}
