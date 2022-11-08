import android.media.MediaRouter$Callback;
import android.media.MediaRouter;
import android.media.MediaRouter$RouteInfo;
import android.media.MediaRouter$UserRouteInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

class cdr extends cdq
{
    public cdr(final Context context, final cds cds) {
        super(context, cds);
    }
    
    protected void A(final cdo cdo) {
        super.A(cdo);
        ((MediaRouter$UserRouteInfo)cdo.b).setDescription((CharSequence)cdo.a.e);
    }
    
    protected boolean C(final cdn cdn) {
        return ((MediaRouter$RouteInfo)cdn.a).isConnecting();
    }
    
    protected void m(final cdn cdn, final cca cca) {
        super.m(cdn, cca);
        final CharSequence description = ((MediaRouter$RouteInfo)cdn.a).getDescription();
        if (description != null) {
            cca.e(description.toString());
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
            blx.g(this.a, this.b);
        }
        this.o = true;
        ((MediaRouter)this.a).addCallback(this.m, (MediaRouter$Callback)this.b, (this.n ? 1 : 0) | 0x2);
    }
}
