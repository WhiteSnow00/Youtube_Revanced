import android.view.Display;
import android.media.MediaRouter$RouteInfo;
import android.media.MediaRouter;

// 
// Decompiled by Procyon v0.6.0
// 

final class cdc extends ccz
{
    public cdc(final cdu cdu) {
        super((ccy)cdu);
    }
    
    public final void onRoutePresentationDisplayChanged(final MediaRouter mediaRouter, final MediaRouter$RouteInfo mediaRouter$RouteInfo) {
        final cdu cdu = (cdu)this.a;
        final int n = ((cdt)cdu).n((Object)mediaRouter$RouteInfo);
        if (n >= 0) {
            final cdr cdr = cdu.p.get(n);
            final Display g = bmd.g(mediaRouter$RouteInfo);
            int displayId;
            if (g != null) {
                displayId = g.getDisplayId();
            }
            else {
                displayId = -1;
            }
            if (displayId != ((ccf)cdr.c).e()) {
                final cce cce = new cce((ccf)cdr.c);
                cce.j(displayId);
                cdr.c = cce.a();
                ((cdt)cdu).w();
            }
        }
    }
}
