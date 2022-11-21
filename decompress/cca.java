import java.util.List;
import android.media.MediaRouter2$RouteCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class cca extends MediaRouter2$RouteCallback
{
    final ccd a;
    
    public cca(final ccd a) {
        this.a = a;
    }
    
    public final void onRoutesAdded(final List list) {
        this.a.e();
    }
    
    public final void onRoutesChanged(final List list) {
        this.a.e();
    }
    
    public final void onRoutesRemoved(final List list) {
        this.a.e();
    }
}
