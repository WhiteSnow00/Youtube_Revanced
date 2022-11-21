import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkf
{
    public final abmo a;
    public final Executor b;
    public final arna c;
    public final AtomicReference d;
    public String e;
    public acav f;
    public final abqc g;
    public final absv h;
    private final abry i;
    private final Executor j;
    private final aefs k;
    
    public abkf(final aefs k, final abry i, final aske aske, final aske aske2, final abmo a, final abqc g, final arna c, final Executor j, final Executor b, final absv h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
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
        aske.am(new abje(this, 18));
        aske2.am(new abje(this, 19));
    }
    
    public static void b(final Throwable t) {
        tut.d("Prefetch was unsuccessful", t);
    }
    
    public final void a(final abmd abmd, final ablf ablf, final PlaybackStartDescriptor playbackStartDescriptor, final abla abla, final abgg abgg) {
        final acav f = this.f;
        final long a = ablf.a;
        final boolean b = a > 0L;
        ListenableFuture e;
        if (a > 0L) {
            e = abmd.e(playbackStartDescriptor, ablf, abla.b);
        }
        else {
            e = null;
        }
        ListenableFuture f2;
        if (!b || (f2 = e) == null) {
            f2 = abmd.f(playbackStartDescriptor, ablf.b.b(), abla.b);
        }
        this.d.set(f2);
        tfx.l(f2, this.j, (tfv)zvv.l, (tfw)new fjh(this, f, abgg, playbackStartDescriptor, abla, 3), (Runnable)tkz.h);
    }
    
    public final boolean c(final PlaybackStartDescriptor playbackStartDescriptor, final abla abla, final PlayerResponseModel playerResponseModel) {
        final String b = playbackStartDescriptor.B(this.k);
        final abry i = this.i;
        playerResponseModel.getClass();
        playbackStartDescriptor.getClass();
        synchronized (i.h) {
            final Object a = i.h.a;
            boolean b2 = false;
            if (a == null) {
                monitorexit(i.h);
            }
            else if (!aamr.o(playerResponseModel.y())) {
                monitorexit(i.h);
            }
            else if (((vbs)i.f.c).f(45377345L) && ((abwn)a).ac()) {
                monitorexit(i.h);
            }
            else {
                ((abwn)a).H(playerResponseModel, playbackStartDescriptor, abla);
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
