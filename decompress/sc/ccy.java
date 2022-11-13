import android.media.MediaRouter$RouteInfo;
import android.media.MediaRouter$VolumeCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ccy extends MediaRouter$VolumeCallback
{
    protected final ccx a;
    
    public ccy(final ccx a) {
        this.a = a;
    }
    
    public final void onVolumeSetRequest(final MediaRouter$RouteInfo mediaRouter$RouteInfo, final int n) {
        this.a.k(mediaRouter$RouteInfo, n);
    }
    
    public final void onVolumeUpdateRequest(final MediaRouter$RouteInfo mediaRouter$RouteInfo, final int n) {
        this.a.l(mediaRouter$RouteInfo, n);
    }
}
