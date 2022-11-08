import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class gnb implements zku
{
    final /* synthetic */ List a;
    final /* synthetic */ CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint b;
    final /* synthetic */ aexq c;
    final /* synthetic */ gnc d;
    
    public gnb(final gnc d, final List a, final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint b, final aexq c) {
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
