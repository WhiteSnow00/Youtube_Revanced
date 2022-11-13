import java.util.List;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModelImpl;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abfe implements abfb
{
    final abei a;
    
    public abfe(final abei a, final byte[] array) {
        this.a = a;
    }
    
    public final void a(final Throwable t) {
    }
    
    public final void b(PlayerResponseModel playerResponseModel) {
        if (!((abfg)this.a.a).b) {
            final sqq sqq = (sqq)((aezv)((abfg)this.a.a).j).a;
            final ahkt s = playerResponseModel.s();
            final PlayerResponseModel playerResponseModel2 = null;
            byte[] i = null;
            Label_0133: {
                if (s != null) {
                    final Iterator<Object> iterator = ((List<Object>)s.d).iterator();
                    while (iterator.hasNext()) {
                        apki apki;
                        if ((apki = iterator.next().c) == null) {
                            apki = apki.a;
                        }
                        if ((apki.b & 0x1) != 0x0) {
                            i = apki.e.I();
                            break Label_0133;
                        }
                    }
                }
                i = null;
            }
            Object o;
            if (i == null) {
                o = playerResponseModel2;
            }
            else {
                final akxi akxi = (akxi)((vlq)sqq.b).a(i, (MessageLite)akxi.a);
                if (akxi == null) {
                    o = playerResponseModel2;
                }
                else {
                    final int b = akxi.b;
                    o = playerResponseModel2;
                    if ((b & 0x10) != 0x0) {
                        o = playerResponseModel2;
                        if ((b & 0x8) != 0x0) {
                            o = new PlayerResponseModelImpl(akxi, 0L, (vjm)sqq.a);
                        }
                    }
                }
            }
            if (o != null) {
                playerResponseModel = (PlayerResponseModel)o;
            }
            final abex m = ((abfg)this.a.a).m;
            final aujg aujg = (aujg)m.b.a();
            if (aujg == null) {
                zlm.b(zll.b, zlk.j, "MediaCacheDownloadManagerProvider misconfigured");
                return;
            }
            final long a = playerResponseModel.m().A();
            final long n = m.a.b;
            final aezp d = m.d;
            if (d.h()) {
                final zdj zdj = (zdj)d.c();
            }
            m.e = aujg.aA(playerResponseModel, a, n, (yfq)m);
        }
    }
    
    public final void c(int n) {
        if (--n != 2 && n != 3 && n != 4) {
            return;
        }
        ((abfg)this.a.a).n = true;
    }
}
