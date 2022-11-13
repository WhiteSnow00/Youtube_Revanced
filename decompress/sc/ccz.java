import android.view.Display;
import android.media.MediaRouter$RouteInfo;
import android.media.MediaRouter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ccz extends ccw
{
    public ccz(final cdr cdr) {
        super((ccv)cdr);
    }
    
    public final void onRoutePresentationDisplayChanged(final MediaRouter mediaRouter, final MediaRouter$RouteInfo mediaRouter$RouteInfo) {
        final cdr cdr = (cdr)this.a;
        final int n = ((cdq)cdr).n(mediaRouter$RouteInfo);
        if (n >= 0) {
            final cdo cdo = cdr.p.get(n);
            final Display b = cdk.b((Object)mediaRouter$RouteInfo);
            int displayId;
            if (b != null) {
                displayId = b.getDisplayId();
            }
            else {
                displayId = -1;
            }
            if (displayId != ((ccc)cdo.c).e()) {
                final ccb ccb = new ccb((ccc)cdo.c);
                ccb.j(displayId);
                cdo.c = ccb.a();
                ((cdq)cdr).w();
            }
        }
    }
}
