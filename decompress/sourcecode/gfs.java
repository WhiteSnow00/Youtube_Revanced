import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfs implements ggr
{
    private final atie a;
    private final uyf b;
    
    public gfs(final uyf b) {
        this.a = ((atie)atig.aD()).aK();
        this.b = b;
    }
    
    public final ashe a() {
        return ((asgt)this.a).ai();
    }
    
    public final void f(final ardu ardu) {
        apgi apgi;
        if ((apgi = this.b.b().q) == null) {
            apgi = apgi.a;
        }
        if (apgi.e) {
            final Object b = ardu.b;
            if (b != null) {
                final PaneDescriptor paneDescriptor = (PaneDescriptor)b;
                if (paneDescriptor.f() != null && ((agzd)paneDescriptor.f()).rs((agyr)BrowseEndpointOuterClass.browseEndpoint)) {
                    this.a.tr((Object)((aial)((agzd)paneDescriptor.f()).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).c);
                }
            }
        }
    }
}
