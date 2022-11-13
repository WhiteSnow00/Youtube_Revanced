import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfz implements gha
{
    private final atiw a;
    private final vaf b;
    
    public gfz(final vaf b) {
        this.a = ((atiw)atiy.aE()).aL();
        this.b = b;
    }
    
    public final asht a() {
        return ((ashi)this.a).ai();
    }
    
    @Override
    public final void f(final argj argj) {
        apim apim;
        if ((apim = this.b.b().q) == null) {
            apim = apim.a;
        }
        if (apim.e) {
            final Object b = argj.b;
            if (b != null) {
                final PaneDescriptor paneDescriptor = (PaneDescriptor)b;
                if (paneDescriptor.f() != null && ((ahbc)paneDescriptor.f()).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint)) {
                    this.a.tu((Object)((aicj)((ahbc)paneDescriptor.f()).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c);
                }
            }
        }
    }
}
