import java.util.List;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aber implements abfa
{
    private final Map a;
    private final aaca b;
    
    public aber(final aaca b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new HashMap();
        this.b = b;
    }
    
    private final abey e(final String s) {
        if (!this.a.containsKey(s)) {
            this.a.put(s, new abey(this.b, s, (byte[])null, (byte[])null, (byte[])null));
        }
        return this.a.get(s);
    }
    
    public final void a(final String s, final String s2, final String s3, final znj znj) {
        this.b(s, s2, s3, null, znj);
    }
    
    public final void b(final String s, final String s2, final String s3, final String s4, final znj znj) {
        final abey e = this.e(s);
        e.a((abev)new abet(e, s2, s3, s4, znj));
    }
    
    public final void c(final String s) {
        this.e(s).d();
    }
    
    public final boolean d(final aioe aioe, final znj znj) {
        final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint)((agzd)aioe).rr((agyr)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint.d.size() != 0) {
            final int cb = aqql.cB(((anfw)playlistEditEndpointOuterClass$PlaylistEditEndpoint.d.get(0)).c);
            Label_0099: {
                if (cb != 0) {
                    if (cb == 3) {
                        break Label_0099;
                    }
                }
                final int cb2 = aqql.cB(((anfw)playlistEditEndpointOuterClass$PlaylistEditEndpoint.d.get(0)).c);
                if (cb2 != 0) {
                    if (cb2 == 11) {
                        break Label_0099;
                    }
                }
                return false;
            }
            final abey e = this.e(playlistEditEndpointOuterClass$PlaylistEditEndpoint.c);
            final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint2 = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint)((agzd)aioe).rr((agyr)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
            Object o = null;
            Label_0222: {
                if (playlistEditEndpointOuterClass$PlaylistEditEndpoint2.d.size() == 1) {
                    final int cb3 = aqql.cB(((anfw)playlistEditEndpointOuterClass$PlaylistEditEndpoint2.d.get(0)).c);
                    if (cb3 != 0) {
                        if (cb3 == 11) {
                            o = new abex(e, (List)playlistEditEndpointOuterClass$PlaylistEditEndpoint2.d, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.g, aioe.c, znj);
                            break Label_0222;
                        }
                    }
                }
                o = new abes(e, (List)playlistEditEndpointOuterClass$PlaylistEditEndpoint2.d, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.g, aioe.c, znj);
            }
            e.a((abev)o);
            return true;
        }
        return false;
    }
}
