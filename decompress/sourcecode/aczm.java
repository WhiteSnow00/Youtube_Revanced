import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczm implements vau
{
    public final tny a;
    private final vmt b;
    private final vax c;
    private final wwu d;
    
    public aczm(final vmt b, final tny a, final vax c, final wwu d) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    public final void b(final Map map, final akhg akhg) {
        if (akhg.e.size() != 0) {
            this.c.e((List)akhg.e, (Object)null);
        }
        if ((akhg.b & 0x2) != 0x0) {
            final alff alff = (alff)tmy.O(map, (Object)"client_data_override", (Class)alff.class);
            final HashMap hashMap = new HashMap();
            hashMap.put(www.c, alff);
            vax c = this.c;
            final vax vax = (vax)tmy.O(map, (Object)"endpoint_resolver_override", (Class)vax.class);
            if (vax != null) {
                c = vax;
            }
            aioe aioe;
            if ((aioe = akhg.d) == null) {
                aioe = aioe.a;
            }
            c.c(aioe, (Map)hashMap);
        }
        final aczl aczl = (aczl)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)aczl.class);
        if (aczl != null) {
            aczl.j();
        }
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = (SendShareEndpoint$SendShareExternallyEndpoint)((agzd)aioe).rr((agyr)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint);
        akhh akhh;
        if ((akhh = sendShareEndpoint$SendShareExternallyEndpoint.d) == null) {
            akhh = akhh.a;
        }
        akhg akhg2 = null;
        Label_0095: {
            if (!akhh.d) {
                akhg akhg;
                if ((akhg = sendShareEndpoint$SendShareExternallyEndpoint.e) == null) {
                    akhg = akhg.a;
                }
                if ((akhg.b & 0x2) != 0x0) {
                    if ((akhg2 = sendShareEndpoint$SendShareExternallyEndpoint.e) == null) {
                        akhg2 = akhg.a;
                    }
                    break Label_0095;
                }
            }
            akhg2 = null;
        }
        final wwu d = this.d;
        wwv n = (wwv)tmy.O(map, (Object)"interaction_logger_override", (Class)wwv.class);
        if (n == null) {
            n = d.n();
        }
        if (akhg2 == null) {
            final byte[] array = (byte[])tmy.O(map, (Object)"click_tracking_params", (Class)byte[].class);
            if (array != null) {
                n.J(3, (wxz)new wws(array), (alff)null);
            }
            final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint2 = (SendShareEndpoint$SendShareExternallyEndpoint)((agzd)aioe).rr((agyr)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint);
            final vmt b = this.b;
            akhj a;
            if ((a = sendShareEndpoint$SendShareExternallyEndpoint2.c) == null) {
                a = akhj.a;
            }
            akhh b2;
            if ((b2 = sendShareEndpoint$SendShareExternallyEndpoint2.d) == null) {
                b2 = akhh.a;
            }
            final gmt gmt = new gmt(this, map, 10);
            final vna vna = new vna(b.c, b.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            vna.a = a;
            vna.b = b2;
            ((vkm)b).c((MessageLite)akhg.a, b.f, (tad)vmq.c, (tac)vlh.n).e((vjn)vna, (znj)gmt);
            return;
        }
        this.b(map, akhg2);
    }
}
