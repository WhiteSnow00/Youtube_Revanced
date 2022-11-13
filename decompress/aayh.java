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

public final class aayh implements abjd
{
    public final Executor a;
    public final abqg b;
    private final vjm c;
    private final vlq d;
    private final msr e;
    
    public aayh(final msr e, final vjm c, final Executor a, final vlq d, final abqg b, final byte[] array, final byte[] array2) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public static boolean b(final aljd aljd) {
        if (aljd != null && (aljd.b & 0x1) != 0x0) {
            alje alje;
            if ((alje = aljd.c) == null) {
                alje = alje.a;
            }
            final int av = adyf.aV(alje.b);
            if (av != 0) {
                if (av == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void a() {
    }
    
    public final abzs[] c(final abzt abzt, final aljd aljd, final long n) {
        final ArrayList list = new ArrayList();
        final boolean b = b(aljd);
        final Iterator<Object> iterator = ((List<Object>)aljd.d).iterator();
        while (iterator.hasNext()) {
            final akxi akxi = (akxi)this.d.a(iterator.next().c.I(), (MessageLite)akxi.a);
            if (akxi != null) {
                final PlayerResponseModelImpl playerResponseModelImpl = new PlayerResponseModelImpl(akxi, n, this.c);
                if (playerResponseModelImpl.d == null) {
                    continue;
                }
                playerResponseModelImpl.i.a("PLAYER_IS_CONTENT_INTERSTITIAL_KEY", true);
                playerResponseModelImpl.i.a("PLAYER_CONTENT_INTERSTITIAL_IS_PREROLL_KEY", b);
                list.add(abzt.m((PlayerResponseModel)playerResponseModelImpl, this.e.A(), 2));
            }
        }
        return list.toArray(new abzs[list.size()]);
    }
}
