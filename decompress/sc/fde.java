import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fde implements vcv, fcd
{
    private final ggr a;
    private final tgd b;
    private final ajb c;
    private final hzn d;
    
    public fde(final ggr a, final tgd b, final ajb c, final hzn d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final String c = ((amtw)((ahbc)aiqj).rx((ahaq)OfflineEndpointOuterClass.offlineEndpoint)).c;
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
        final String s = (String)tpe.O(map, (Object)"offline_playlist_top_level_tab_id", (Class)String.class);
        PaneDescriptor paneDescriptor;
        if (!"PPSV".equals(c) && !aezr.f(c)) {
            paneDescriptor = this.d.G(c, b2, s);
        }
        else {
            paneDescriptor = this.c.r(aiqj);
        }
        this.b.d((Object)new fhx());
        this.a.d(paneDescriptor);
    }
}
