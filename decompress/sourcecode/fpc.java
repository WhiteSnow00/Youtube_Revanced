import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpc implements aayr
{
    public final aays a;
    public final ArrayList b;
    public final ArrayList c;
    public long d;
    private boolean e;
    
    public fpc(final aays a) {
        a.getClass();
        this.a = a;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }
    
    final aexq a(final abcb abcb) {
        final TimelineMarker[] n = this.a.n(abcg.g);
        if (this.e && n != null && n.length > 0 && abcb.t()) {
            return aexq.k(n);
        }
        return (aexq)aewp.a;
    }
    
    final void b() {
        this.b.clear();
    }
    
    public final void c(final TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, final abcg abcg, final int n) {
        final ArrayList c = this.c;
        for (int size = c.size(), i = 0; i < size; ++i) {
            ((aayr)c.get(i)).c(timelineMarker, timelineMarker2, abcg, n);
        }
    }
    
    public final void d(final abcg abcg) {
        if (abcg != abcg.f && abcg != abcg.g) {
            return;
        }
        if (abcg == abcg.g) {
            this.b();
        }
        final ArrayList c = this.c;
        for (int size = c.size(), i = 0; i < size; ++i) {
            ((aayr)c.get(i)).d(abcg);
        }
    }
    
    public final void oR(final abcg abcg, final boolean e) {
        if (abcg != abcg.f && abcg != abcg.g) {
            return;
        }
        if (abcg == abcg.g) {
            this.e = e;
            this.b();
        }
        final ArrayList c = this.c;
        for (int size = c.size(), i = 0; i < size; ++i) {
            ((aayr)c.get(i)).oR(abcg, e);
        }
    }
}
