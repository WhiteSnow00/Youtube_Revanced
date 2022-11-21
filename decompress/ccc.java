import java.util.Iterator;
import java.util.List;
import android.text.TextUtils;
import android.media.MediaRoute2Info;
import android.util.Log;
import android.media.MediaRouter2$RoutingController;
import android.media.MediaRouter2$TransferCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ccc extends MediaRouter2$TransferCallback
{
    final ccd a;
    
    public ccc(final ccd a) {
        this.a = a;
    }
    
    public final void onStop(final MediaRouter2$RoutingController mediaRouter2$RoutingController) {
        final cck cck = this.a.b.remove(mediaRouter2$RoutingController);
        if (cck != null) {
            final oqz d = this.a.d;
            if (cck == ((ccs)d.a).q) {
                d.U(2);
            }
            return;
        }
        new StringBuilder("onStop: No matching routeController found. routingController=").append(mediaRouter2$RoutingController);
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=".concat(String.valueOf(mediaRouter2$RoutingController)));
    }
    
    public final void onTransfer(final MediaRouter2$RoutingController mediaRouter2$RoutingController, final MediaRouter2$RoutingController mediaRouter2$RoutingController2) {
        this.a.b.remove(mediaRouter2$RoutingController);
        if (mediaRouter2$RoutingController2 == this.a.a.getSystemController()) {
            this.a.d.U(3);
            return;
        }
        final List selectedRoutes = mediaRouter2$RoutingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        final String id = selectedRoutes.get(0).getId();
        this.a.b.put(mediaRouter2$RoutingController2, new cby(mediaRouter2$RoutingController2, id));
        final oqz d = this.a.d;
        while (true) {
            for (final ccw ccw : ((ccs)d.a).g) {
                if (ccw.c() == ((ccs)d.a).e && TextUtils.equals((CharSequence)id, (CharSequence)ccw.b)) {
                    if (ccw == null) {
                        Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=".concat(String.valueOf(id)));
                    }
                    else {
                        ((ccs)d.a).l(ccw, 3);
                    }
                    this.a.f(mediaRouter2$RoutingController2);
                    return;
                }
            }
            ccw ccw = null;
            continue;
        }
    }
    
    public final void onTransferFailure(final MediaRoute2Info mediaRoute2Info) {
        new StringBuilder("Transfer failed. requestedRoute=").append(mediaRoute2Info);
        Log.w("MR2Provider", "Transfer failed. requestedRoute=".concat(String.valueOf(mediaRoute2Info)));
    }
}
