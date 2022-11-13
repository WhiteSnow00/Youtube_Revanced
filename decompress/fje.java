import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.AutoconnectEndpointOuterClass$AutoconnectEndpoint;
import j$.util.Optional;
import java.util.Map;
import android.net.Uri;
import android.content.Intent;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fje implements tet
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;
    
    public fje(final abiy c, final abzl e, final abfb b, final PlaybackStartDescriptor a, final abjt d, final int f) {
        this.f = f;
        this.c = c;
        this.e = e;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public fje(final fjg a, final Intent b, final Uri c, final aiqj d, final Map e, final int f) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public fje(final xfn b, final Optional e, final AutoconnectEndpointOuterClass$AutoconnectEndpoint a, final xfq c, final alhj d, final int f) {
        this.f = f;
        this.b = b;
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final Object o) {
        final int f = this.f;
        if (f == 0) {
            ((fjg)this.a).b((Intent)this.b, (Uri)this.c, (aiqj)this.d, (Map)this.e, (boolean)o);
            return;
        }
        if (f == 1) {
            ((fjg)this.a).c((Intent)this.b, (Uri)this.c, (aiqj)this.d, (Map)this.e, (boolean)o);
            return;
        }
        if (f != 2) {
            final Object c = this.c;
            final Object e = this.e;
            final Object b = this.b;
            final Object a = this.a;
            final Object d = this.d;
            final PlayerResponseModel playerResponseModel = (PlayerResponseModel)o;
            final abiy abiy = (abiy)c;
            if (adkp.ae(e, abiy.f)) {
                if (b != null) {
                    ((abfb)b).b(playerResponseModel);
                }
                abiy.c((PlaybackStartDescriptor)a, (abjt)d, playerResponseModel);
            }
            return;
        }
        final Object b2 = this.b;
        final Object e2 = this.e;
        final Object a2 = this.a;
        final Object c2 = this.c;
        final Object d2 = this.d;
        final Void void1 = (Void)o;
        ((xfn)b2).a.d((Optional)e2, (AutoconnectEndpointOuterClass$AutoconnectEndpoint)a2, (xfq)c2, (alhj)d2);
    }
}
