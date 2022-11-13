import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flh
{
    public static final aiqj a;
    
    static {
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb.e((ahaq)DownloadsPageEndpointOuterClass.downloadsPageEndpoint, (Object)ajhq.a);
        a = (aiqj)((ahaz)ahbb).build();
    }
    
    public static aiqj a(final String d, final String e, final amvv amvv) {
        tvb.n(d);
        final ahaz builder = OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a.createBuilder();
        builder.copyOnWrite();
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)builder.instance;
        d.getClass();
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c = 1;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d = d;
        if (!aezr.f(e)) {
            builder.copyOnWrite();
            final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)builder.instance;
            e.getClass();
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.b |= 0x4;
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.e = e;
        }
        builder.copyOnWrite();
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint3 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)builder.instance;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.f = amvv.m;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.b |= 0x8;
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb.e((ahaq)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, (Object)builder.build());
        return (aiqj)((ahaz)ahbb).build();
    }
    
    public static aiqj b(final String c) {
        tvb.n(c);
        final ahaz builder = ((ahbh)amtw.a).createBuilder();
        builder.copyOnWrite();
        final amtw amtw = (amtw)builder.instance;
        c.getClass();
        amtw.b |= 0x2;
        amtw.c = c;
        final amtw amtw2 = (amtw)builder.build();
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb.e((ahaq)OfflineEndpointOuterClass.offlineEndpoint, (Object)amtw2);
        return (aiqj)((ahaz)ahbb).build();
    }
    
    public static boolean c(final aiqj aiqj) {
        return ((ahbc)aiqj).ry((ahaq)DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
    }
    
    public static boolean d(final aiqj aiqj, final atke atke) {
        return ((ahbc)aiqj).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint) && fwc.l(((aicj)((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c) && ((fmr)atke.a()).j(fwc.k(((aicj)((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c));
    }
    
    public static aiqj e(final String c) {
        tvb.n(c);
        final ahaz builder = OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a.createBuilder();
        builder.copyOnWrite();
        final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint)builder.instance;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b |= 0x1;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c = c;
        builder.copyOnWrite();
        final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2 = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint)builder.instance;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2.d = 0;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2.b |= 0x2;
        final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint3 = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint)builder.build();
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb.e((ahaq)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint, (Object)offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint3);
        return (aiqj)((ahaz)ahbb).build();
    }
}
