import java.util.List;
import android.media.MediaRouter2$RouteCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ccb extends MediaRouter2$RouteCallback
{
    final ccd a;
    
    public ccb(final ccd a) {
        this.a = a;
    }
    
    public final void onRoutesUpdated(final List list) {
        this.a.e();
    }
}
