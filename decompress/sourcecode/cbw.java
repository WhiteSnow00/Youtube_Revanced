import java.util.List;
import android.media.MediaRouter2$RouteCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbw extends MediaRouter2$RouteCallback
{
    final /* synthetic */ cbz a;
    
    public cbw(final cbz a) {
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
