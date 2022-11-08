import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fda implements vau, fbz
{
    private final ggi a;
    private final tdz b;
    private final hyr c;
    private final aja d;
    
    public fda(final ggi a, final tdz b, final aja d, final hyr c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final String c = ((amrs)((agzd)aioe).rr((agyr)OfflineEndpointOuterClass.offlineEndpoint)).c;
        boolean b2;
        final boolean b = b2 = false;
        if (map != null) {
            b2 = b;
            if (map.containsKey("com.google.android.libraries.youtube.rendering.presenter.PresentContext")) {
                b2 = b;
                if (map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext").j("nested_fragment_key", false)) {
                    b2 = true;
                }
            }
        }
        final String s = (String)tmy.O(map, (Object)"offline_playlist_top_level_tab_id", (Class)String.class);
        PaneDescriptor paneDescriptor;
        if (!"PPSV".equals(c) && !aexs.f(c)) {
            paneDescriptor = this.c.F(c, b2, s);
        }
        else {
            paneDescriptor = this.d.r(aioe);
        }
        this.b.d((Object)new fhr());
        this.a.d(paneDescriptor);
    }
}
