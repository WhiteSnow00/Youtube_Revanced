import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fla
{
    public static final aioe a;
    
    static {
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        agzc.e((agyr)DownloadsPageEndpointOuterClass.downloadsPageEndpoint, ajfm.a);
        a = (aioe)agzc.build();
    }
    
    public static aioe a(final String d, final String e, final amtq amtq) {
        tsx.n(d);
        final agza builder = OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a.createBuilder();
        builder.copyOnWrite();
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)builder.instance;
        d.getClass();
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c = 1;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d = d;
        if (!aexs.f(e)) {
            builder.copyOnWrite();
            final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)builder.instance;
            e.getClass();
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.b |= 0x4;
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.e = e;
        }
        builder.copyOnWrite();
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint3 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)builder.instance;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.f = amtq.m;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.b |= 0x8;
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        agzc.e((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, builder.build());
        return (aioe)agzc.build();
    }
    
    public static aioe b(final String c) {
        tsx.n(c);
        final agza builder = ((agzi)amrs.a).createBuilder();
        builder.copyOnWrite();
        final amrs amrs = (amrs)builder.instance;
        c.getClass();
        amrs.b |= 0x2;
        amrs.c = c;
        final amrs amrs2 = (amrs)builder.build();
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        agzc.e((agyr)OfflineEndpointOuterClass.offlineEndpoint, amrs2);
        return (aioe)agzc.build();
    }
    
    public static boolean c(final aioe aioe) {
        return ((agzd)aioe).rs((agyr)DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
    }
    
    public static boolean d(final aioe aioe, final atjj atjj) {
        return ((agzd)aioe).rs((agyr)BrowseEndpointOuterClass.browseEndpoint) && fvu.l(((aial)((agzd)aioe).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).c) && ((fml)atjj.a()).j(fvu.k(((aial)((agzd)aioe).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).c));
    }
    
    public static aioe e(final String c) {
        tsx.n(c);
        final agza builder = OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a.createBuilder();
        builder.copyOnWrite();
        final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint)builder.instance;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b |= 0x1;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c = c;
        builder.copyOnWrite();
        final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2 = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint)builder.instance;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2.d = 0;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2.b |= 0x2;
        final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint3 = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint)builder.build();
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        agzc.e((agyr)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint3);
        return (aioe)agzc.build();
    }
}
