import java.util.List;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModelImpl;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawl implements abhk
{
    public final Executor a;
    public final aboh b;
    private final vhm c;
    private final vjl d;
    private final avt e;
    
    public aawl(final avt e, final vhm c, final Executor a, final vjl d, final aboh b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public static boolean b(final algz algz) {
        if (algz != null && (algz.b & 0x1) != 0x0) {
            alha alha;
            if ((alha = algz.c) == null) {
                alha = alha.a;
            }
            final int b = alhb.b(alha.b);
            if (b != 0) {
                if (b == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void a() {
    }
    
    public final abxp[] c(final abxq abxq, final algz algz, final long n) {
        final ArrayList list = new ArrayList();
        final boolean b = b(algz);
        final Iterator<Object> iterator = ((List<Object>)algz.d).iterator();
        while (iterator.hasNext()) {
            final akve akve = (akve)this.d.a(iterator.next().c.I(), (MessageLite)akve.a);
            if (akve != null) {
                final PlayerResponseModelImpl playerResponseModelImpl = new PlayerResponseModelImpl(akve, n, this.c);
                if (playerResponseModelImpl.d == null) {
                    continue;
                }
                playerResponseModelImpl.i.a("PLAYER_IS_CONTENT_INTERSTITIAL_KEY", true);
                playerResponseModelImpl.i.a("PLAYER_CONTENT_INTERSTITIAL_IS_PREROLL_KEY", b);
                list.add(abxq.m((PlayerResponseModel)playerResponseModelImpl, this.e.Z(), 2));
            }
        }
        return list.toArray(new abxp[list.size()]);
    }
}
