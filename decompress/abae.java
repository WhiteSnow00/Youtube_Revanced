import android.os.Looper;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abae implements abao
{
    public final Object a;
    private final int b;
    
    public abae(final abaf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abae(final fpe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void c(final TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, final abea abea, final int n) {
        if (this.b == 0) {
            final abaf abaf = (abaf)this.a;
            Label_0116: {
                if (abaf.e && abaf.f) {
                    if (abea == abea.g) {
                        break Label_0116;
                    }
                }
                else if (abea == abea.f) {
                    break Label_0116;
                }
                return;
            }
            final abaf abaf2 = (abaf)this.a;
            abaf2.b = abaf2.a.d();
            final abaf abaf3 = (abaf)this.a;
            abaf3.d = abaf3.c;
            abaf3.c = timelineMarker2;
            return;
        }
        if (abea != abea.f) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ((fpe)this.a).z(timelineMarker2);
        }
        else {
            ((fpe)this.a).post((Runnable)new fsi(this, timelineMarker2, 1, null));
        }
        ((fpe)this.a).r = timelineMarker2;
    }
    
    public final void d(final abea abea) {
        final int b = this.b;
        boolean e = false;
        if (b != 0) {
            ((fpe)this.a).invalidate();
            if (abea == abea.g) {
                ((fpe)this.a).s = false;
            }
            return;
        }
        final Object a = this.a;
        if (abea == abea.g) {
            e = true;
        }
        ((abaf)a).e = e;
    }
    
    public final void oR(final abea abea, final boolean b) {
        if (this.b != 0) {
            if (abea == abea.f) {
                ((fpe)this.a).invalidate();
                return;
            }
            if (abea != abea.g) {
                return;
            }
            final fpe fpe = (fpe)this.a;
            if (fpe.s != b && (fpe.s = b)) {
                fpe.m.cancel();
                ((fpe)this.a).m.start();
            }
            ((fpe)this.a).invalidate();
        }
        else {
            if (abea != abea.g) {
                return;
            }
            ((abaf)this.a).f = b;
        }
    }
}
