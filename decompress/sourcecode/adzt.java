import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzt
{
    public static final Map a;
    public static final Map b;
    
    static {
        final Map map = a = new HashMap();
        final Map map2 = b = new HashMap();
        final Integer value = -2;
        map.put(value, "An unknown error occurred.");
        final Integer value2 = -3;
        map.put(value2, "The API is not available on this device.");
        final Integer value3 = -4;
        map.put(value3, "The request that was sent by the app is malformed.");
        final Integer value4 = -5;
        map.put(value4, "The install is unavailable to this user or device.");
        final Integer value5 = -6;
        map.put(value5, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        final Integer value6 = -7;
        map.put(value6, "The install/update has not been (fully) downloaded yet.");
        final Integer value7 = -8;
        map.put(value7, "The install is already in progress and there is no UI flow to resume.");
        final Integer value8 = -9;
        map.put(value8, "The Play Store app is either not installed or not the official version.");
        final Integer value9 = -10;
        map.put(value9, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        final Integer value10 = -100;
        map.put(value10, "An internal error happened in the Play Store.");
        map2.put(value, "ERROR_UNKNOWN");
        map2.put(value2, "ERROR_API_NOT_AVAILABLE");
        map2.put(value3, "ERROR_INVALID_REQUEST");
        map2.put(value4, "ERROR_INSTALL_UNAVAILABLE");
        map2.put(value5, "ERROR_INSTALL_NOT_ALLOWED");
        map2.put(value6, "ERROR_DOWNLOAD_NOT_PRESENT");
        map2.put(value7, "ERROR_INSTALL_IN_PROGRESS");
        map2.put(value10, "ERROR_INTERNAL_ERROR");
        map2.put(value8, "ERROR_PLAY_STORE_NOT_FOUND");
        map2.put(value9, "ERROR_APP_NOT_OWNED");
        map2.put(value10, "ERROR_INTERNAL_ERROR");
    }
}
