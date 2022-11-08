import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsp implements veo
{
    public final Context a;
    public final flg b;
    public final jvy c;
    public final eg d;
    private final Executor e;
    
    public jsp(final Executor e, final Context a, final flg b, final jvy c, final eg d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final ListenableFuture a(final amel amel, final Object o) {
        amel.getClass();
        final aioe c = vwh.c(amel);
        if (c == null || !((agzd)c).rs((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
            return afva.m(afcr.q());
        }
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)((agzd)c).rr((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
        String s;
        if (offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1) {
            s = (String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
        }
        else {
            s = "";
        }
        if (s.isEmpty()) {
            return afva.m(afcr.q());
        }
        return afva.r(aesm.c((afrx)new jkv(this, amel, offlineVideoEndpointOuterClass$OfflineVideoEndpoint, 2)), this.e);
    }
    
    public final amel b(final amel amel, final Object o) {
        return this.c.b(amel, o);
    }
    
    public final afcr c(amel amel) {
        amel.getClass();
        final aioe c = vwh.c(amel);
        if (c == null || !((agzd)c).rs((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
            return afcr.q();
        }
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)((agzd)c).rr((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
        String s;
        if (offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1) {
            s = (String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
        }
        else {
            s = "";
        }
        if (s.isEmpty()) {
            return afcr.q();
        }
        final agza builder = ((agzi)amel).toBuilder();
        ameq ameq;
        if ((ameq = amel.d) == null) {
            ameq = ameq.a;
        }
        final agza builder2 = ((agzi)ameq).toBuilder();
        builder2.copyOnWrite();
        final ameq ameq2 = (ameq)builder2.instance;
        ameq2.b |= 0x1000;
        ameq2.i = true;
        final ajsq g = abyh.g(new String[] { this.a.getString(2132018657) });
        builder2.copyOnWrite();
        final ameq ameq3 = (ameq)builder2.instance;
        g.getClass();
        ameq3.c = g;
        ameq3.b |= 0x1;
        final ameq d = (ameq)builder2.build();
        builder.copyOnWrite();
        amel = (amel)builder.instance;
        d.getClass();
        amel.d = d;
        amel.b |= 0x2;
        return afcr.r((Object)builder.build());
    }
}
