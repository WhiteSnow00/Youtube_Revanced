import android.media.MediaRouter2$RoutingController;
import android.media.MediaRouter2$ControllerCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbw extends MediaRouter2$ControllerCallback
{
    final ccd a;
    
    public cbw(final ccd a) {
        this.a = a;
    }
    
    public final void onControllerUpdated(final MediaRouter2$RoutingController mediaRouter2$RoutingController) {
        this.a.f(mediaRouter2$RoutingController);
    }
}
