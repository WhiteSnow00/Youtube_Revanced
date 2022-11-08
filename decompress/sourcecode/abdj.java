import java.util.List;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModelImpl;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abdj implements abdg
{
    final /* synthetic */ abdq a;
    
    public abdj(final abdq a, final byte[] array) {
        this.a = a;
    }
    
    public final void b(PlayerResponseModel playerResponseModel) {
        if (!((abdl)this.a.a).b) {
            final tdg tdg = (tdg)((aexw)((abdl)this.a.a).j).a;
            final ahiv s = playerResponseModel.s();
            final PlayerResponseModel playerResponseModel2 = null;
            byte[] i = null;
            Label_0123: {
                if (s != null) {
                    final Iterator<Object> iterator = ((List<Object>)s.d).iterator();
                    while (iterator.hasNext()) {
                        apie apie;
                        if ((apie = iterator.next().c) == null) {
                            apie = apie.a;
                        }
                        if ((apie.b & 0x1) != 0x0) {
                            i = apie.e.I();
                            break Label_0123;
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
                final akve akve = (akve)((vjl)tdg.b).a(i, (MessageLite)akve.a);
                if (akve == null) {
                    o = playerResponseModel2;
                }
                else {
                    final int b = akve.b;
                    o = playerResponseModel2;
                    if ((b & 0x10) != 0x0) {
                        o = playerResponseModel2;
                        if ((b & 0x8) != 0x0) {
                            o = new PlayerResponseModelImpl(akve, 0L, (vhm)tdg.a);
                        }
                    }
                }
            }
            if (o != null) {
                playerResponseModel = (PlayerResponseModel)o;
            }
            final abdb m = ((abdl)this.a.a).m;
            final auip auip = (auip)m.b.a();
            if (auip == null) {
                zjp.b(zjo.b, zjn.j, "MediaCacheDownloadManagerProvider misconfigured");
                return;
            }
            final long a = playerResponseModel.m().A();
            final long n = m.a.b;
            final aexq d = m.d;
            if (d.h()) {
                final zbq zbq = (zbq)d.c();
            }
            m.e = auip.aB(playerResponseModel, a, n, (ydu)m);
        }
    }
    
    public final void c(int n) {
        if (--n != 2 && n != 3 && n != 4) {
            return;
        }
        ((abdl)this.a.a).n = true;
    }
}
