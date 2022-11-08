import j$.util.Optional;
import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hmp extends GestureDetector$SimpleOnGestureListener
{
    final /* synthetic */ hqd a;
    final /* synthetic */ hpd b;
    final /* synthetic */ hmq c;
    
    public hmp(final hmq c, final hqd a, final hpd b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onLongPress(final MotionEvent motionEvent) {
        final hqk am = this.a.aM();
        if (am == null) {
            return;
        }
        this.c.d = true;
        final hoa hoa = (hoa)am.k;
        final Optional au = hoa.aU();
        if (au.isPresent() && (((anrb)au.get()).c & 0x800) != 0x0) {
            final vax ay = hoa.ay;
            aioe aioe;
            if ((aioe = ((anrb)au.get()).R) == null) {
                aioe = aioe.a;
            }
            ay.a(aioe);
        }
        else {
            hoa.bg();
        }
        am.performHapticFeedback(0);
        final hpd b = this.b;
        if (b.e && b.g) {
            if (b.h) {
                b.d();
                b.h(3, 134942);
            }
        }
    }
}
