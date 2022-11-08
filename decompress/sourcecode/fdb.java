import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdb implements vau
{
    private final aago a;
    
    public fdb(final aago a) {
        a.getClass();
        this.a = a;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint)((agzd)aioe).rr((agyr)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
        final int d = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.d;
        final int cq = aqql.cQ(d);
        final int n = 1;
        int n2 = cq;
        if (cq == 0) {
            n2 = 1;
        }
        if (--n2 != 1) {
            if (n2 == 2) {
                this.a.c(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c, aagg.a(false));
                return;
            }
            if (n2 != 8) {
                int cq2 = aqql.cQ(d);
                if (cq2 == 0) {
                    cq2 = n;
                }
                final StringBuilder sb = new StringBuilder("Unsupported Offline Video Action: ");
                sb.append(cq2 - 1);
                trn.l(sb.toString());
                return;
            }
            this.a.c(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c, aagg.a(true));
        }
        else {
            final Object m = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
            final boolean b = m instanceof aitp;
            final amqx amqx = null;
            amva amva = null;
            Label_0421: {
                if (b) {
                    final aitp aitp = (aitp)m;
                    aito aito;
                    if ((aito = aitp.o) == null) {
                        aito = aito.a;
                    }
                    if ((0x1 & aito.b) != 0x0) {
                        aito aito2;
                        if ((aito2 = aitp.o) == null) {
                            aito2 = aito.a;
                        }
                        if ((amva = aito2.c) == null) {
                            amva = amva.a;
                        }
                        break Label_0421;
                    }
                }
                else if (m instanceof angx) {
                    final angx angx = (angx)m;
                    angv angv;
                    if ((angv = angx.w) == null) {
                        angv = angv.a;
                    }
                    if (angv.b == 60572968) {
                        angv angv2;
                        if ((angv2 = angx.w) == null) {
                            angv2 = angv.a;
                        }
                        if (angv2.b == 60572968) {
                            amva = (amva)angv2.c;
                            break Label_0421;
                        }
                        amva = amva.a;
                        break Label_0421;
                    }
                }
                else if (m instanceof angj) {
                    final angj angj = (angj)m;
                    angi angi;
                    if ((angi = angj.F) == null) {
                        angi = angi.a;
                    }
                    if (angi.b == 60572968) {
                        angi angi2;
                        if ((angi2 = angj.F) == null) {
                            angi2 = angi.a;
                        }
                        if (angi2.b == 60572968) {
                            amva = (amva)angi2.c;
                            break Label_0421;
                        }
                        amva = amva.a;
                        break Label_0421;
                    }
                }
                amva = null;
            }
            amva amva2;
            if ((amva2 = amva) == null) {
                if ((offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b & 0x8) != 0x0) {
                    anss anss;
                    if ((anss = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.e) == null) {
                        anss = anss.a;
                    }
                    amva2 = (amva)((agzd)anss).rr((agyr)OfflineabilityRendererOuterClass.offlineabilityRenderer);
                }
                else {
                    amva2 = null;
                }
            }
            if (amva2 == null) {
                trn.b("Object is not an offlineable playlist: ".concat(String.valueOf(String.valueOf(m))));
                return;
            }
            final wwv wwv = (wwv)tmy.O(map, (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wwv.class);
            final aago a = this.a;
            final String c = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c;
            amqx amqx2 = amqx;
            if ((offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b & 0x10) != 0x0 && (amqx2 = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.f) == null) {
                amqx2 = amqx.a;
            }
            a.k(c, amva2, wwv, amqx2);
        }
    }
}
