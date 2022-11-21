import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.offline.player.OfflinePlaybackTrackingPlaybackListener$State;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaez extends acat
{
    private String a;
    private long b;
    private final vbo c;
    private final aapu d;
    private aapu e;
    private acjq f;
    private final abwe g;
    
    public aaez(final aapu d, final abwe g, final vbo c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.g = g;
        this.c = c;
    }
    
    public final Parcelable N() {
        return (Parcelable)new OfflinePlaybackTrackingPlaybackListener$State(this.a);
    }
    
    public final void O(final aapp aapp) {
        final abll c = aapp.c();
        if (c == abll.h || c == abll.i) {
            final PlayerResponseModel b = aapp.b();
            if (b == null) {
                return;
            }
            final String k = b.K();
            final String a = this.a;
            if (a == null || !a.equals(k)) {
                this.a = k;
                final aapu d = this.d;
                final Object c2 = d.c;
                final oco oco = (oco)((atnb)d.b).a();
                oco.getClass();
                final abwe abwe = (abwe)((atnb)d.a).a();
                abwe.getClass();
                k.getClass();
                this.f = new acjq((atnb)c2, oco, abwe, k, null, null);
                final abwe g = this.g;
                final String a2 = this.a;
                final Object a3 = g.a;
                final Object b2 = g.b;
                a2.getClass();
                this.e = new aapu((atnb)a3, (atnb)b2, a2);
            }
        }
    }
    
    public final void b() {
        if (aaks.v(this.c)) {
            final aapu e = this.e;
            if (e != null) {
                if (this.b >= 0L) {
                    final long seconds = TimeUnit.MILLISECONDS.toSeconds(this.b);
                    if (!TextUtils.isEmpty((CharSequence)e.b)) {
                        final aadl aadl = (aadl)((atnb)e.a).a();
                        if (aadl.h()) {
                            final aage a = aadl.a();
                            if (!((aafz)((atnb)e.c).a()).M(aadl.d())) {
                                final aadc e2 = a.l().e((String)e.b);
                                if (e2 != null && !e2.q()) {
                                    a.l().z((String)e.b, seconds);
                                }
                            }
                        }
                    }
                }
                this.b = -1L;
            }
        }
    }
    
    public final void e(final aapq aapq) {
        final acjq f = this.f;
        if (f != null && aapq.j()) {
            if (!TextUtils.isEmpty((CharSequence)f.b)) {
                if (((abwe)f.a).i()) {
                    final aadl aadl = (aadl)((atnb)f.c).a();
                    if (aadl.h()) {
                        final aage a = aadl.a();
                        if (a.l().e((String)f.b) != null) {
                            a.l().A((String)f.b, ((oco)f.d).c());
                        }
                    }
                }
            }
            this.f = null;
        }
        if (aaks.v(this.c) && aapq.j()) {
            this.b = aapq.e();
        }
    }
    
    public final void f(final Parcelable parcelable, final agjn agjn) {
        adme.K(parcelable instanceof OfflinePlaybackTrackingPlaybackListener$State);
        if (!agjn.a) {
            this.a = ((OfflinePlaybackTrackingPlaybackListener$State)parcelable).a;
        }
    }
}
