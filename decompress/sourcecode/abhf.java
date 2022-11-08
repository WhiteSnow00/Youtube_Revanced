import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abhf
{
    public final abji a;
    public final Executor b;
    public final arhr c;
    public final AtomicReference d;
    public String e;
    public abxj f;
    public final abmu g;
    public final abpj h;
    private final aboq i;
    private final Executor j;
    private final avt k;
    
    public abhf(final avt k, final aboq i, final asgt asgt, final asgt asgt2, final abji a, final abmu g, final arhr c, final Executor j, final Executor b, final abpj h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.k = k;
        this.i = i;
        this.a = a;
        this.g = g;
        this.c = c;
        this.j = j;
        this.b = b;
        this.h = h;
        this.d = new AtomicReference(null);
        this.e = null;
        asgt.al((asix)new abgn(this, 8));
        asgt2.al((asix)new abgn(this, 9));
    }
    
    public final void a(final abjc abjc, final abig abig, final PlaybackStartDescriptor playbackStartDescriptor, final abib abib, final abdg abdg) {
        final abxj f = this.f;
        final long a = abig.a;
        final boolean b = a > 0L;
        ListenableFuture e;
        if (a > 0L) {
            e = abjc.e(playbackStartDescriptor, abig, abib.b);
        }
        else {
            e = null;
        }
        ListenableFuture f2;
        if (!b || (f2 = e) == null) {
            f2 = abjc.f(playbackStartDescriptor, abig.b.b(), abib.b);
        }
        this.d.set(f2);
        tcp.l(f2, this.j, (tcn)zqg.n, (tco)new fiy(this, f, abdg, playbackStartDescriptor, abib, 3), (Runnable)thr.h);
    }
    
    public final boolean c(final PlaybackStartDescriptor playbackStartDescriptor, final abib abib, final PlayerResponseModel playerResponseModel) {
        final String b = playbackStartDescriptor.B(this.k);
        final aboq i = this.i;
        playerResponseModel.getClass();
        playbackStartDescriptor.getClass();
        synchronized (i.h) {
            final Object a = i.h.a;
            boolean b2 = false;
            if (a == null) {
                monitorexit(i.h);
            }
            else if (!aaja.o(playerResponseModel.y())) {
                monitorexit(i.h);
            }
            else if (((uyi)i.f.i).f(45377345L) && ((abta)a).ac()) {
                monitorexit(i.h);
            }
            else {
                ((abta)a).H(playerResponseModel, playbackStartDescriptor, abib);
                monitorexit(i.h);
                b2 = true;
            }
            if (b2) {
                this.e = b;
            }
            return b2;
        }
    }
}
