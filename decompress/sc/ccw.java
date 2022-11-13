import android.media.MediaRouter$RouteGroup;
import android.media.MediaRouter$RouteInfo;
import android.media.MediaRouter;
import android.media.MediaRouter$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

class ccw extends MediaRouter$Callback
{
    protected final ccv a;
    
    public ccw(final ccv a) {
        this.a = a;
    }
    
    public final void onRouteAdded(final MediaRouter mediaRouter, final MediaRouter$RouteInfo mediaRouter$RouteInfo) {
        this.a.a(mediaRouter$RouteInfo);
    }
    
    public final void onRouteChanged(final MediaRouter mediaRouter, final MediaRouter$RouteInfo mediaRouter$RouteInfo) {
        this.a.c(mediaRouter$RouteInfo);
    }
    
    public final void onRouteGrouped(final MediaRouter mediaRouter, final MediaRouter$RouteInfo mediaRouter$RouteInfo, final MediaRouter$RouteGroup mediaRouter$RouteGroup, final int n) {
        this.a.g();
    }
    
    public final void onRouteRemoved(final MediaRouter mediaRouter, final MediaRouter$RouteInfo mediaRouter$RouteInfo) {
        this.a.e(mediaRouter$RouteInfo);
    }
    
    public final void onRouteSelected(final MediaRouter mediaRouter, final int n, final MediaRouter$RouteInfo mediaRouter$RouteInfo) {
        this.a.h(mediaRouter$RouteInfo);
    }
    
    public final void onRouteUngrouped(final MediaRouter mediaRouter, final MediaRouter$RouteInfo mediaRouter$RouteInfo, final MediaRouter$RouteGroup mediaRouter$RouteGroup) {
        this.a.i();
    }
    
    public final void onRouteUnselected(final MediaRouter mediaRouter, final int n, final MediaRouter$RouteInfo mediaRouter$RouteInfo) {
        this.a.j();
    }
    
    public final void onRouteVolumeChanged(final MediaRouter mediaRouter, final MediaRouter$RouteInfo mediaRouter$RouteInfo) {
        this.a.f(mediaRouter$RouteInfo);
    }
}
