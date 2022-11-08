import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.offline.player.OfflinePlaybackTrackingPlaybackListener$State;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabg extends abxh
{
    private String a;
    private long b;
    private final uyf c;
    private final aamd d;
    private acga e;
    private final auip f;
    private auip g;
    
    public aabg(final auip f, final aamd d, final uyf c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = f;
        this.d = d;
        this.c = c;
    }
    
    public final Parcelable N() {
        return (Parcelable)new OfflinePlaybackTrackingPlaybackListener$State(this.a);
    }
    
    public final void O(final aaly aaly) {
        final abim c = aaly.c();
        if (c == abim.h || c == abim.i) {
            final PlayerResponseModel b = aaly.b();
            if (b == null) {
                return;
            }
            final String k = b.K();
            final String a = this.a;
            if (a == null || !a.equals(k)) {
                this.a = k;
                final auip f = this.f;
                final Object b2 = f.b;
                final oas oas = (oas)((atjj)f.c).a();
                oas.getClass();
                final aamd aamd = (aamd)((atjj)f.a).a();
                aamd.getClass();
                k.getClass();
                this.e = new acga((atjj)b2, oas, aamd, k, null);
                final aamd d = this.d;
                final String a2 = this.a;
                final Object a3 = d.a;
                final Object b3 = d.b;
                a2.getClass();
                this.g = new auip((atjj)a3, (atjj)b3, a2);
            }
        }
    }
    
    public final void b() {
        if (aaha.v(this.c)) {
            final auip g = this.g;
            if (g != null) {
                if (this.b >= 0L) {
                    final long seconds = TimeUnit.MILLISECONDS.toSeconds(this.b);
                    if (!TextUtils.isEmpty((CharSequence)g.a)) {
                        final zzu zzu = (zzu)((atjj)g.b).a();
                        if (zzu.h()) {
                            final aack a = zzu.a();
                            if (!((aacf)((atjj)g.c).a()).M(zzu.d())) {
                                final zzl e = a.l().e((String)g.a);
                                if (e != null && !e.q()) {
                                    a.l().z((String)g.a, seconds);
                                }
                            }
                        }
                    }
                }
                this.b = -1L;
            }
        }
    }
    
    public final void e(final aalz aalz) {
        final acga e = this.e;
        if (e != null && aalz.j()) {
            if (!TextUtils.isEmpty((CharSequence)e.c)) {
                if (((aamd)e.d).c()) {
                    final zzu zzu = (zzu)((atjj)e.a).a();
                    if (zzu.h()) {
                        final aack a = zzu.a();
                        if (a.l().e((String)e.c) != null) {
                            a.l().A((String)e.c, ((oas)e.b).c());
                        }
                    }
                }
            }
            this.e = null;
        }
        if (aaha.v(this.c) && aalz.j()) {
            this.b = aalz.e();
        }
    }
    
    public final void f(final Parcelable parcelable, final agfu agfu) {
        agot.u(parcelable instanceof OfflinePlaybackTrackingPlaybackListener$State);
        if (!agfu.a) {
            this.a = ((OfflinePlaybackTrackingPlaybackListener$State)parcelable).a;
        }
    }
}
