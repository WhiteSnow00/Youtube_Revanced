import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefu
{
    public static final Map a;
    public static final Map b;
    private static final Map c;
    
    static {
        final Map map = a = new HashMap();
        final Map map2 = b = new HashMap();
        final Integer value = -1;
        map.put(value, "Too many sessions are running for current app, existing sessions must be resolved first.");
        final Integer value2 = -2;
        map.put(value2, "A requested module is not available (to this user/device, for the installed apk).");
        final Integer value3 = -3;
        map.put(value3, "Request is otherwise invalid.");
        final Integer value4 = -4;
        map.put(value4, "Requested session is not found.");
        final Integer value5 = -5;
        map.put(value5, "Split Install API is not available.");
        final Integer value6 = -6;
        map.put(value6, "Network error: unable to obtain split details.");
        final Integer value7 = -7;
        map.put(value7, "Download not permitted under current device circumstances (e.g. in background).");
        final Integer value8 = -8;
        map.put(value8, "Requested session contains modules from an existing active session and also new modules.");
        final Integer value9 = -9;
        map.put(value9, "Service handling split install has died.");
        final Integer value10 = -10;
        map.put(value10, "Install failed due to insufficient storage.");
        final Integer value11 = -11;
        map.put(value11, "Signature verification error when invoking SplitCompat.");
        final Integer value12 = -12;
        map.put(value12, "Error in SplitCompat emulation.");
        final Integer value13 = -13;
        map.put(value13, "Error in copying files for SplitCompat.");
        final Integer value14 = -14;
        map.put(value14, "The Play Store app is either not installed or not the official version.");
        final Integer value15 = -15;
        map.put(value15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        final Integer value16 = -100;
        map.put(value16, "Unknown error processing split install.");
        map2.put(value, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        map2.put(value2, "MODULE_UNAVAILABLE");
        map2.put(value3, "INVALID_REQUEST");
        map2.put(value4, "DOWNLOAD_NOT_FOUND");
        map2.put(value5, "API_NOT_AVAILABLE");
        map2.put(value6, "NETWORK_ERROR");
        map2.put(value7, "ACCESS_DENIED");
        map2.put(value8, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        map2.put(value9, "SERVICE_DIED");
        map2.put(value10, "INSUFFICIENT_STORAGE");
        map2.put(value11, "SPLITCOMPAT_VERIFICATION_ERROR");
        map2.put(value12, "SPLITCOMPAT_EMULATION_ERROR");
        map2.put(value13, "SPLITCOMPAT_COPY_ERROR");
        map2.put(value14, "PLAY_STORE_NOT_FOUND");
        map2.put(value15, "APP_NOT_OWNED");
        map2.put(value16, "INTERNAL_ERROR");
        c = new HashMap();
        for (final Map.Entry<K, String> entry : map2.entrySet()) {
            aefu.c.put(entry.getValue(), entry.getKey());
        }
    }
    
    public static int a(final String s) {
        final Integer n = aefu.c.get(s);
        if (n != null) {
            return n;
        }
        throw new IllegalArgumentException(String.valueOf(s).concat(" is unknown error."));
    }
}
