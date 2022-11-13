import java.util.List;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgt implements abgu
{
    private final aadx a;
    
    public abgt(final aadx a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public final void a(final String s, final String s2, final String s3, final zpf zpf) {
        this.b(s, s2, s3, null, zpf);
    }
    
    public final void b(final String a, final String s, final String s2, final String c, final zpf zpf) {
        final vuh k = this.a.k();
        k.a = a;
        k.x(s, s2);
        k.c = c;
        ((vkk)k).i();
        this.a.l((vls)k, zpf);
    }
    
    public final void c(final String s) {
    }
    
    public final boolean d(final aiqj aiqj, final zpf zpf) {
        final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint)((ahbc)aiqj).rx((ahaq)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        final vuh k = this.a.k();
        k.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.c;
        k.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.g;
        if ((aiqj.b & 0x1) != 0x0) {
            ((vkk)k).j(aiqj.c);
        }
        else {
            ((vkk)k).i();
        }
        k.w((List)playlistEditEndpointOuterClass$PlaylistEditEndpoint.d);
        this.a.l((vls)k, zpf);
        return true;
    }
}
