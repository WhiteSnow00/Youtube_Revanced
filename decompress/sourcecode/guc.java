import java.util.Map;
import java.util.HashMap;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class guc
{
    public static aorm a(final aioe aioe, final aceo aceo) {
        final aorm aorm = null;
        final aorm aorm2 = null;
        aorm aorm3 = aorm;
        if (aioe != null) {
            aorm3 = aorm;
            if (((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                aorm aorm4;
                if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x80) != 0x0) {
                    if ((aorm4 = reelWatchEndpointOuterClass$ReelWatchEndpoint.i) == null) {
                        aorm4 = aorm.a;
                    }
                }
                else {
                    aorm4 = null;
                }
                if (aorm4 == null) {
                    aorm4 = aorm2;
                    if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x80) != 0x0) {
                        if ((aorm4 = reelWatchEndpointOuterClass$ReelWatchEndpoint.i) == null) {
                            aorm4 = aorm.a;
                        }
                    }
                }
                if ((aorm3 = aorm4) != null) {
                    final int size = aorm4.c.size();
                    int d = 1;
                    int e;
                    if (size > 0) {
                        e = aorm4.c.get(0).e;
                    }
                    else {
                        e = 1;
                    }
                    if (aorm4.c.size() > 0) {
                        d = aorm4.c.get(0).d;
                    }
                    aceo.m(aorm4, d, e);
                    aorm3 = aorm4;
                }
            }
        }
        return aorm3;
    }
    
    public static boolean b(final dua dua) {
        final Object a = dua.a;
        if (a != null) {
            final Object b = dua.b;
            if (b != null && a.equals(b)) {
                return true;
            }
        }
        return false;
    }
    
    public static int c(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int d(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static String e(final PlayerResponseModel playerResponseModel) {
        String j;
        if ((j = playerResponseModel.J()) == null) {
            j = "";
        }
        return j;
    }
    
    public static String f(final PlayerResponseModel playerResponseModel) {
        final String k = playerResponseModel.K();
        if (k != null && !k.isEmpty()) {
            return tmy.cF(k).toString();
        }
        return "https://www.youtube.com";
    }
    
    public static vax h(final vax vax) {
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.apps.youtube.app.endpoint.flags", 2);
        return (vax)new hjx(vax, (Map)hashMap, 1);
    }
    
    public static acik i() {
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.apps.youtube.app.endpoint.flags", 2);
        return (acik)new fas((Map)hashMap, 2);
    }
}
