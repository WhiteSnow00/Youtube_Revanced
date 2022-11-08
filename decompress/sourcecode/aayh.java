import android.os.Looper;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aayh implements aayr
{
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public aayh(final aayi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aayh(final foz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void c(final TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, final abcg abcg, final int n) {
        if (this.b == 0) {
            final aayi aayi = (aayi)this.a;
            Label_0116: {
                if (aayi.e && aayi.f) {
                    if (abcg == abcg.g) {
                        break Label_0116;
                    }
                }
                else if (abcg == abcg.f) {
                    break Label_0116;
                }
                return;
            }
            final aayi aayi2 = (aayi)this.a;
            aayi2.b = aayi2.a.d();
            final aayi aayi3 = (aayi)this.a;
            aayi3.d = aayi3.c;
            aayi3.c = timelineMarker2;
            return;
        }
        if (abcg != abcg.f) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ((foz)this.a).z(timelineMarker2);
        }
        else {
            ((foz)this.a).post((Runnable)new fsa(this, timelineMarker2, 1, null));
        }
        ((foz)this.a).r = timelineMarker2;
    }
    
    public final void d(final abcg abcg) {
        final int b = this.b;
        boolean e = false;
        if (b != 0) {
            ((foz)this.a).invalidate();
            if (abcg == abcg.g) {
                ((foz)this.a).s = false;
            }
            return;
        }
        final Object a = this.a;
        if (abcg == abcg.g) {
            e = true;
        }
        ((aayi)a).e = e;
    }
    
    public final void oR(final abcg abcg, final boolean b) {
        if (this.b != 0) {
            if (abcg == abcg.f) {
                ((foz)this.a).invalidate();
                return;
            }
            if (abcg != abcg.g) {
                return;
            }
            final foz foz = (foz)this.a;
            if (foz.s != b && (foz.s = b)) {
                foz.m.cancel();
                ((foz)this.a).m.start();
            }
            ((foz)this.a).invalidate();
        }
        else {
            if (abcg != abcg.g) {
                return;
            }
            ((aayi)this.a).f = b;
        }
    }
}
