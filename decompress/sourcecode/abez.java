import java.util.List;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abez implements abfa
{
    private final aaca a;
    
    public abez(final aaca a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public final void a(final String s, final String s2, final String s3, final znj znj) {
        this.b(s, s2, s3, null, znj);
    }
    
    public final void b(final String a, final String s, final String s2, final String c, final znj znj) {
        final vse k = this.a.k();
        k.a = a;
        k.x(s, s2);
        k.c = c;
        ((vii)k).i();
        this.a.l((vjn)k, znj);
    }
    
    public final void c(final String s) {
    }
    
    public final boolean d(final aioe aioe, final znj znj) {
        final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint)((agzd)aioe).rr((agyr)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        final vse k = this.a.k();
        k.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.c;
        k.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.g;
        if ((aioe.b & 0x1) != 0x0) {
            ((vii)k).j(aioe.c);
        }
        else {
            ((vii)k).i();
        }
        k.w((List)playlistEditEndpointOuterClass$PlaylistEditEndpoint.d);
        this.a.l((vjn)k, znj);
        return true;
    }
}
