import java.util.List;
import android.media.MediaRouter2$RouteCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbx extends MediaRouter2$RouteCallback
{
    final /* synthetic */ cbz a;
    
    public cbx(final cbz a) {
        this.a = a;
    }
    
    public final void onRoutesUpdated(final List list) {
        this.a.e();
    }
}
