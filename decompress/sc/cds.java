import android.media.MediaRouter$Callback;
import android.media.MediaRouter;
import android.media.MediaRouter$RouteInfo;
import android.media.MediaRouter$UserRouteInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

class cds extends cdr
{
    public cds(final Context context, final cdt cdt) {
        super(context, cdt);
    }
    
    protected void A(final cdp cdp) {
        super.A(cdp);
        ((MediaRouter$UserRouteInfo)cdp.b).setDescription((CharSequence)cdp.a.e);
    }
    
    protected boolean C(final cdo cdo) {
        return ((MediaRouter$RouteInfo)cdo.a).isConnecting();
    }
    
    protected void m(final cdo cdo, final ccb ccb) {
        super.m(cdo, ccb);
        final CharSequence description = ((MediaRouter$RouteInfo)cdo.a).getDescription();
        if (description != null) {
            ccb.e(description.toString());
        }
    }
    
    protected Object r() {
        return ((MediaRouter)this.a).getDefaultRoute();
    }
    
    protected void x(final Object o) {
        ((MediaRouter)this.a).selectRoute(8388611, (MediaRouter$RouteInfo)o);
    }
    
    protected void y() {
        if (this.o) {
            bly.g(this.a, this.b);
        }
        this.o = true;
        ((MediaRouter)this.a).addCallback(this.m, (MediaRouter$Callback)this.b, (this.n ? 1 : 0) | 0x2);
    }
}
