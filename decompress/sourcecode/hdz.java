import android.support.v7.widget.RecyclerView;
import java.util.Map;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import android.support.v7.widget.LinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class hdz implements rbq
{
    final /* synthetic */ hea a;
    
    public hdz(final hea a) {
        this.a = a;
    }
    
    public final void nv(final long n) {
        final ShortsVideoTrimView2 ai = this.a.ai;
        if (ai != null) {
            ai.H(n);
        }
        final het as = this.a.as;
        szc.f();
        if (as.c == null) {
            zjp.b(zjo.b, zjn.x, "[ShortsCreation][Android][ClipEdit]Adapter is not initialized when trying to update active video segment");
            return;
        }
        final Map.Entry<Long, Object> floorEntry = as.f.floorEntry(n);
        if (floorEntry == null) {
            final zjo b = zjo.b;
            final zjn x = zjn.x;
            final StringBuilder sb = new StringBuilder("[ShortsCreation][Android][ClipEdit]Segment duration map does not contain entry for video playback position ");
            sb.append(n);
            zjp.b(b, x, sb.toString());
            return;
        }
        final int intValue = floorEntry.getValue();
        final int h = as.h;
        if (h != intValue) {
            as.g = h;
            as.h = intValue;
            final hes c = as.c;
            if (c != null) {
                c.f = intValue;
                c.tc(h);
                c.tc(intValue);
            }
            final RecyclerView d = as.d;
            if (d == null) {
                zjp.b(zjo.b, zjn.x, "[ShortsCreation][Android][ClipEdit]Thumbnail list is null when updating active video segment");
                return;
            }
            final int e = as.e;
            if (e == 0) {
                zjp.b(zjo.b, zjn.x, "[ShortsCreation][Android][ClipEdit]Horizontal center of screen has not been computed when updating active segment");
                return;
            }
            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)d.n;
            if (linearLayoutManager != null) {
                linearLayoutManager.ab(as.h, e);
            }
        }
    }
}
