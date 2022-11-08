import java.util.List;
import com.google.protos.youtube.api.innertube.PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
import java.util.Collection;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczk implements vau
{
    private final Context a;
    private final vmt b;
    private final uyf c;
    
    public aczk(final Context a, final vmt b, final uyf c) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final aczj aczj = (aczj)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)aczj.class);
        final List ak = tmy.ak(this.a.getPackageManager());
        amga amga;
        if ((amga = this.c.b().i) == null) {
            amga = amga.a;
        }
        ahsb ahsb;
        if ((ahsb = amga.m) == null) {
            ahsb = ahsb.a;
        }
        final List e = adbp.e(ak, ahsb);
        this.b.d(((PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint)((agzd)aioe).rr((agyr)PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint)).b, e, (znj)new aczg(aczj, aioe, e, 2), true);
    }
}
