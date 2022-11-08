import android.view.Display;
import android.media.MediaRouter$RouteInfo;
import android.media.MediaRouter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ccy extends ccv
{
    public ccy(final cdq cdq) {
        super((ccu)cdq);
    }
    
    public final void onRoutePresentationDisplayChanged(final MediaRouter mediaRouter, final MediaRouter$RouteInfo mediaRouter$RouteInfo) {
        final cdq cdq = (cdq)this.a;
        final int n = ((cdp)cdq).n((Object)mediaRouter$RouteInfo);
        if (n >= 0) {
            final cdn cdn = cdq.p.get(n);
            final Display b = cdj.b(mediaRouter$RouteInfo);
            int displayId;
            if (b != null) {
                displayId = b.getDisplayId();
            }
            else {
                displayId = -1;
            }
            if (displayId != ((ccb)cdn.c).e()) {
                final cca cca = new cca((ccb)cdn.c);
                cca.j(displayId);
                cdn.c = cca.a();
                ((cdp)cdq).w();
            }
        }
    }
}
