import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.GoogleMapsNavigationEndpointOuterClass;
import java.util.Map;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gov implements vau, szw
{
    private final Context a;
    private final vax b;
    private final tdg c;
    
    public gov(final tdg c, final vax b, final Context a, final byte[] array) {
        this.c = c;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public final void b(final int n, final int n2, final Intent intent) {
    }
    
    public final void mE(aioe aioe, final Map map) {
        if (!((agzd)aioe).rs((agyr)GoogleMapsNavigationEndpointOuterClass.googleMapsNavigationEndpoint)) {
            return;
        }
        final ajwo ajwo = (ajwo)((agzd)aioe).rr((agyr)GoogleMapsNavigationEndpointOuterClass.googleMapsNavigationEndpoint);
        Uri parse;
        if ((ajwo.b & 0x1) != 0x0) {
            parse = Uri.parse(ajwo.c);
        }
        else {
            parse = null;
        }
        final Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.setPackage("com.google.android.apps.maps");
        final PackageManager packageManager = this.a.getPackageManager();
        if (parse != null && packageManager.resolveActivity(intent, 65536) != null) {
            this.c.c(intent, 2100, (szw)this);
            return;
        }
        if ((ajwo.b & 0x2) != 0x0) {
            final vax b = this.b;
            if ((aioe = ajwo.d) == null) {
                aioe = aioe.a;
            }
            b.c(aioe, map);
        }
    }
}
