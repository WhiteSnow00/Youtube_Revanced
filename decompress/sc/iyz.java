import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyz implements fpm
{
    public final Object a;
    private final int b;
    
    public iyz(final iyh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iyz(final izd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final MotionEvent motionEvent) {
        if (this.b != 0) {
            final iyh iyh = (iyh)this.a;
            if (iyh.k || !iyh.l) {
                final int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        iyh.a();
                    }
                }
                else if (!iyh.i && !iyh.h) {
                    iyh.a.postDelayed(iyh.c, 200L);
                }
            }
            return;
        }
        final izd izd = (izd)this.a;
        if (!izd.d.isEmpty()) {
            izd.d.iterator().next().a(motionEvent);
        }
    }
}
