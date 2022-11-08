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

final class cby extends MediaRouter2$TransferCallback
{
    final /* synthetic */ cbz a;
    
    public cby(final cbz a) {
        this.a = a;
    }
    
    public final void onStop(final MediaRouter2$RoutingController mediaRouter2$RoutingController) {
        final ccg ccg = this.a.b.remove(mediaRouter2$RoutingController);
        if (ccg != null) {
            final qpt d = this.a.d;
            if (ccg == ((cco)d.a).q) {
                d.V(2);
            }
            return;
        }
        new StringBuilder("onStop: No matching routeController found. routingController=").append(mediaRouter2$RoutingController);
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=".concat(String.valueOf(mediaRouter2$RoutingController)));
    }
    
    public final void onTransfer(final MediaRouter2$RoutingController mediaRouter2$RoutingController, final MediaRouter2$RoutingController mediaRouter2$RoutingController2) {
        this.a.b.remove(mediaRouter2$RoutingController);
        if (mediaRouter2$RoutingController2 == this.a.a.getSystemController()) {
            this.a.d.V(3);
            return;
        }
        final List selectedRoutes = mediaRouter2$RoutingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        final String id = selectedRoutes.get(0).getId();
        this.a.b.put(mediaRouter2$RoutingController2, new cbu(mediaRouter2$RoutingController2, id));
        final qpt d = this.a.d;
        while (true) {
            for (final ccs ccs : ((cco)d.a).g) {
                if (ccs.c() == ((cco)d.a).e && TextUtils.equals((CharSequence)id, (CharSequence)ccs.b)) {
                    if (ccs == null) {
                        Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=".concat(String.valueOf(id)));
                    }
                    else {
                        ((cco)d.a).l(ccs, 3);
                    }
                    this.a.f(mediaRouter2$RoutingController2);
                    return;
                }
            }
            ccs ccs = null;
            continue;
        }
    }
    
    public final void onTransferFailure(final MediaRoute2Info mediaRoute2Info) {
        new StringBuilder("Transfer failed. requestedRoute=").append(mediaRoute2Info);
        Log.w("MR2Provider", "Transfer failed. requestedRoute=".concat(String.valueOf(mediaRoute2Info)));
    }
}
