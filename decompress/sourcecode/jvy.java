import java.util.Collection;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvy implements veo
{
    private final Context a;
    private final atjj b;
    private final fml c;
    private final flo d;
    
    public jvy(final Context a, final atjj b, final fml c, final flo d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private final amel d(amel amel, final int n, int b, final akbe akbe) {
        final agza builder = ((agzi)amel).toBuilder();
        fms.d(this.a, builder, b);
        final agzc agzc = (agzc)((agzi)akbf.a).createBuilder();
        ((agza)agzc).copyOnWrite();
        final akbf akbf = (akbf)agzc.instance;
        akbf.c = akbe.sv;
        akbf.b |= 0x1;
        final akbf d = (akbf)((agza)agzc).build();
        amel = (amel)builder.instance;
        b = amel.b;
        if ((b & 0x1) != 0x0) {
            amem amem;
            if ((amem = amel.c) == null) {
                amem = amem.a;
            }
            final agza builder2 = ((agzi)amem).toBuilder();
            builder2.copyOnWrite();
            final amem amem2 = (amem)builder2.instance;
            d.getClass();
            amem2.d = d;
            amem2.b |= 0x2;
            builder.copyOnWrite();
            final amel amel2 = (amel)builder.instance;
            final amem c = (amem)builder2.build();
            c.getClass();
            amel2.c = c;
            amel2.b |= 0x1;
        }
        else if ((b & 0x2) != 0x0) {
            ameq ameq;
            if ((ameq = amel.d) == null) {
                ameq = ameq.a;
            }
            final agza builder3 = ((agzi)ameq).toBuilder();
            builder3.copyOnWrite();
            final ameq ameq2 = (ameq)builder3.instance;
            d.getClass();
            ameq2.d = d;
            ameq2.b |= 0x8;
            builder.copyOnWrite();
            final amel amel3 = (amel)builder.instance;
            final ameq d2 = (ameq)builder3.build();
            d2.getClass();
            amel3.d = d2;
            amel3.b |= 0x2;
        }
        else if ((b & 0x10) != 0x0) {
            ameh ameh;
            if ((ameh = amel.g) == null) {
                ameh = ameh.a;
            }
            final agza builder4 = ((agzi)ameh).toBuilder();
            builder4.copyOnWrite();
            final ameh ameh2 = (ameh)builder4.instance;
            d.getClass();
            ameh2.d = d;
            ameh2.b |= 0x2;
            builder.copyOnWrite();
            final amel amel4 = (amel)builder.instance;
            final ameh g = (ameh)builder4.build();
            g.getClass();
            amel4.g = g;
            amel4.b |= 0x10;
        }
        else if ((b & 0x20) != 0x0) {
            amei amei;
            if ((amei = amel.h) == null) {
                amei = amei.a;
            }
            final agza builder5 = ((agzi)amei).toBuilder();
            builder5.copyOnWrite();
            final amei amei2 = (amei)builder5.instance;
            d.getClass();
            amei2.d = d;
            amei2.b |= 0x2;
            builder.copyOnWrite();
            final amel amel5 = (amel)builder.instance;
            final amei h = (amei)builder5.build();
            h.getClass();
            amel5.h = h;
            amel5.b |= 0x20;
        }
        else if ((b & 0x8) != 0x0) {
            amew amew;
            if ((amew = amel.f) == null) {
                amew = amew.a;
            }
            final agza builder6 = ((agzi)amew).toBuilder();
            if (((amew)builder6.instance).i) {
                builder6.copyOnWrite();
                final amew amew2 = (amew)builder6.instance;
                d.getClass();
                amew2.g = d;
                amew2.b |= 0x40;
            }
            else {
                builder6.copyOnWrite();
                final amew amew3 = (amew)builder6.instance;
                d.getClass();
                amew3.d = d;
                amew3.b |= 0x4;
            }
            builder.copyOnWrite();
            final amel amel6 = (amel)builder.instance;
            final amew f = (amew)builder6.build();
            f.getClass();
            amel6.f = f;
            amel6.b |= 0x8;
        }
        else if ((b & 0x400) != 0x0) {
            apbk apbk;
            if ((apbk = amel.m) == null) {
                apbk = apbk.a;
            }
            final agza builder7 = apbk.toBuilder();
            builder7.copyOnWrite();
            final apbk apbk2 = (apbk)builder7.instance;
            d.getClass();
            apbk2.d = d;
            apbk2.c = 2;
            builder.copyOnWrite();
            final amel amel7 = (amel)builder.instance;
            final apbk m = (apbk)builder7.build();
            m.getClass();
            amel7.m = m;
            amel7.b |= 0x400;
        }
        final aioe c2 = vwh.c((amel)builder.build());
        if (c2 != null && ((agzd)c2).rs((agyr)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)) {
            final agza builder8 = ((agzi)((agzd)c2).rr((agyr)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)).toBuilder();
            builder8.copyOnWrite();
            final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint)builder8.instance;
            offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.d = n - 1;
            offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b |= 0x2;
            final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2 = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint)builder8.build();
            final agzc agzc2 = (agzc)((agzi)c2).toBuilder();
            agzc2.e((agyr)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint, (Object)offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2);
            vwh.i(builder, (aioe)((agza)agzc2).build());
        }
        return (amel)builder.build();
    }
    
    public final amel b(final amel amel, final Object o) {
        amel.getClass();
        final aioe c = vwh.c(amel);
        zyy d = null;
        if (c == null || !((agzd)c).rs((agyr)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)) {
            return null;
        }
        final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint)((agzd)c).rr((agyr)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
        if (offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c.isEmpty()) {
            return null;
        }
        if (this.c.j(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c)) {
            d = ((zzu)this.b.a()).a().i().d(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c);
        }
        if (d == null) {
            return this.d(amel, 2, 2132017457, akbe.l);
        }
        return this.d(amel, 3, 2132019494, akbe.t);
    }
    
    public final afcr c(final amel amel) {
        amel.getClass();
        final aioe c = vwh.c(amel);
        if (c == null || !((agzd)c).rs((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
            return afcr.q();
        }
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)((agzd)c).rr((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
        final int c2 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
        final String s = "";
        String s2;
        if (c2 == 1) {
            s2 = (String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
        }
        else {
            s2 = "";
        }
        if (s2.isEmpty()) {
            return afcr.q();
        }
        zzl e;
        if (this.c.i()) {
            final aacp l = ((zzu)this.b.a()).a().l();
            String s3 = s;
            if (offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1) {
                s3 = (String)offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
            }
            e = l.e(s3);
        }
        else {
            e = null;
        }
        afcr afcr;
        if (this.d.d().J((asjc)new jax(e, 16)).ab()) {
            afcr = afcr.q();
        }
        else {
            final String e2 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.e;
            final ArrayList list = new ArrayList();
            if (e != null && !e.q()) {
                final zzh i = e.i();
                final zzh a = zzh.a;
                switch (i.ordinal()) {
                    case 21: {
                        list.add(fms.b(this.a, amel, amtq.i, 2132019522, aexq.k((Object)akbe.u)));
                        break;
                    }
                    case 17: {
                        list.add(fms.b(this.a, amel, amtq.j, 2132019501, aexq.k((Object)akbe.u)));
                        break;
                    }
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 19:
                    case 20:
                    case 22: {
                        list.add(fms.b(this.a, amel, amtq.f, 2132018891, aexq.k((Object)akbe.u)));
                        break;
                    }
                    case 10: {
                        list.add(fms.b(this.a, amel, amtq.g, 2132019518, aexq.k((Object)akbe.u)));
                        break;
                    }
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 11: {
                        list.add(fms.b(this.a, amel, amtq.e, 2132019095, aexq.k((Object)akbe.v)));
                        break;
                    }
                }
                list.add(fms.b(this.a, amel, amtq.c, 2132019494, aexq.k((Object)akbe.t)));
            }
            else if (!aexs.f(e2) && this.c.j(e2)) {
                list.add(fms.b(this.a, amel, amtq.i, 2132019317, aexq.k((Object)akbe.u)));
            }
            else {
                list.add(fms.b(this.a, amel, amtq.b, 2132017465, aexq.k((Object)akbe.u)));
            }
            afcr = afcr.o((Collection)list);
        }
        return afcr;
    }
}
