import java.util.List;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgl implements abgu
{
    private final Map a;
    private final aadx b;
    
    public abgl(final aadx b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new HashMap();
        this.b = b;
    }
    
    private final abgs e(final String s) {
        if (!this.a.containsKey(s)) {
            this.a.put(s, new abgs(this.b, s, (byte[])null, (byte[])null, (byte[])null));
        }
        return this.a.get(s);
    }
    
    public final void a(final String s, final String s2, final String s3, final zpf zpf) {
        this.b(s, s2, s3, null, zpf);
    }
    
    public final void b(final String s, final String s2, final String s3, final String s4, final zpf zpf) {
        final abgs e = this.e(s);
        e.a((abgp)new abgn(e, s2, s3, s4, zpf));
    }
    
    public final void c(final String s) {
        this.e(s).d();
    }
    
    public final boolean d(final aiqj aiqj, final zpf zpf) {
        final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint)((ahbc)aiqj).rx((ahaq)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint.d.size() != 0) {
            final int cc = aqsx.cC(((ania)playlistEditEndpointOuterClass$PlaylistEditEndpoint.d.get(0)).c);
            Label_0097: {
                if (cc != 0) {
                    if (cc == 3) {
                        break Label_0097;
                    }
                }
                final int cc2 = aqsx.cC(((ania)playlistEditEndpointOuterClass$PlaylistEditEndpoint.d.get(0)).c);
                if (cc2 != 0) {
                    if (cc2 == 11) {
                        break Label_0097;
                    }
                }
                return false;
            }
            final abgs e = this.e(playlistEditEndpointOuterClass$PlaylistEditEndpoint.c);
            final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint2 = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint)((ahbc)aiqj).rx((ahaq)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
            abgm abgm = null;
            Label_0221: {
                if (playlistEditEndpointOuterClass$PlaylistEditEndpoint2.d.size() == 1) {
                    final int cc3 = aqsx.cC(((ania)playlistEditEndpointOuterClass$PlaylistEditEndpoint2.d.get(0)).c);
                    if (cc3 != 0) {
                        if (cc3 == 11) {
                            abgm = new abgr(e, (List)playlistEditEndpointOuterClass$PlaylistEditEndpoint2.d, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.g, aiqj.c, zpf);
                            break Label_0221;
                        }
                    }
                }
                abgm = new abgm(e, (List)playlistEditEndpointOuterClass$PlaylistEditEndpoint2.d, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.g, aiqj.c, zpf);
            }
            e.a((abgp)abgm);
            return true;
        }
        return false;
    }
}
