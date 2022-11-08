import java.util.Map;
import java.util.List;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdj implements vau
{
    public final atjj a;
    public final tny b;
    public final imn c;
    private final Activity d;
    private final zki e;
    private final zkw f;
    private final abfa g;
    private final aaca h;
    
    public fdj(final aaca h, final atjj a, final tny b, final Activity d, final zki e, final zkw f, final imn c, final abfa g, final byte[] array, final byte[] array2, final byte[] array3) {
        h.getClass();
        this.h = h;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        this.c = c;
        this.g = g;
    }
    
    public final void b(final aioe aioe, final Object o) {
        final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint)((agzd)aioe).rr((agyr)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        final String c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.c;
        final agzy d = playlistEditEndpointOuterClass$PlaylistEditEndpoint.d;
        Optional optional;
        if ((playlistEditEndpointOuterClass$PlaylistEditEndpoint.b & 0x2) != 0x0) {
            aioe aioe2;
            if ((aioe2 = playlistEditEndpointOuterClass$PlaylistEditEndpoint.f) == null) {
                aioe2 = aioe.a;
            }
            optional = Optional.of((Object)aioe2);
        }
        else {
            optional = Optional.empty();
        }
        final fdi fdi = new fdi(this, c, (List)d, optional, o);
        final abfa g = this.g;
        if (g == null || !g.d(aioe, (znj)fdi)) {
            final vse k = this.h.k();
            ((vii)k).j(aioe.c);
            k.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.c;
            k.w((List)playlistEditEndpointOuterClass$PlaylistEditEndpoint.d);
            k.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.g;
            this.h.l((vjn)k, (znj)fdi);
        }
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint.e.size() != 0) {
            ((vax)this.a.a()).e((List)playlistEditEndpointOuterClass$PlaylistEditEndpoint.e, o);
        }
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final Object m = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
        final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint)((agzd)aioe).rr((agyr)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        if (this.d != null && this.f != null) {
            final zki e = this.e;
            if (e != null && !e.t()) {
                if (!playlistEditEndpointOuterClass$PlaylistEditEndpoint.h) {
                    this.f.b(this.d, (byte[])null, (zku)new fdh(this, aioe, m, 0));
                    return;
                }
            }
        }
        this.b(aioe, m);
    }
}
