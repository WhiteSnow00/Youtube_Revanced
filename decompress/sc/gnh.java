import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class gnh implements zmr
{
    final List a;
    final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint b;
    final aezp c;
    final gni d;
    
    public gnh(final gni d, final List a, final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint b, final aezp c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
    }
    
    public final void b() {
        this.d.b(this.a, this.b, this.c);
    }
    
    public final void c(final Exception ex) {
        this.d.a.e((Throwable)ex);
    }
}
