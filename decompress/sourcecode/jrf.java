import android.util.Log;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrf implements vau
{
    private static final String b = "jrf";
    private final vax c;
    private final fzo d;
    
    public jrf(final fzo d, final vax c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.c = c;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint = (ShareEndpointOuterClass$ShareEntityEndpoint)((agzd)aioe).rr((agyr)ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
        int bx;
        if ((bx = aqql.bx(shareEndpointOuterClass$ShareEntityEndpoint.e)) == 0) {
            bx = 2;
        }
        if (--bx == 0) {
            throw new AssertionError((Object)"Unspecified share panel type");
        }
        if (bx == 1) {
            this.d.z((fci)gno.a).mE(aioe, map);
            return;
        }
        if (bx == 3) {
            throw new AssertionError((Object)"Web player share panel type not supported");
        }
        if ((shareEndpointOuterClass$ShareEntityEndpoint.b & 0x10) != 0x0) {
            Map map2;
            if ((map2 = map) != null) {
                map2 = map;
                if (map.containsKey("anchor_view")) {
                    map2 = new HashMap(map);
                    map2.put("com.google.android.libraries.youtube.rendering.elements.sender_view", map.get("anchor_view"));
                }
            }
            final vax c = this.c;
            aioe aioe2;
            if ((aioe2 = shareEndpointOuterClass$ShareEntityEndpoint.f) == null) {
                aioe2 = aioe.a;
            }
            c.c(aioe2, map2);
            return;
        }
        Log.e(jrf.b, "Command not in share entity endpoint proto.");
    }
}
