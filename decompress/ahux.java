// 
// Decompiled by Procyon v0.6.0
// 

public enum ahux implements ahdd
{
    a("ANDROID_ONESIE_HOT_CONFIG_FEATURES_UNKNOWN", 0, 0), 
    b("ANDROID_ONESIE_HOT_CONFIG_FEATURES_USE_VIDEO_ID_IN_DATA_SOURCE", 1, 2), 
    c("ANDROID_ONESIE_HOT_CONFIG_FEATURES_HANDLE_RESPONSE_STALENESS", 2, 3), 
    d("ANDROID_ONESIE_HOT_CONFIG_FEATURES_PREWARM_FROM_PLAYERLIB", 3, 4), 
    e("ANDROID_ONESIE_HOT_CONFIG_FEATURES_DISABLE_CANCEL_FROM_MEDIAPLAYER", 4, 5), 
    f("ANDROID_ONESIE_HOT_CONFIG_FEATURES_ENCRYPT_FROM_PREPARER", 5, 6), 
    g("UNRECOGNIZED", 6, -1);
    
    private static final ahux[] h;
    private final int i;
    
    private ahux(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static ahdf a() {
        return ahqv.r;
    }
    
    public static ahux b(final int n) {
        if (n == 0) {
            return ahux.a;
        }
        if (n == 2) {
            return ahux.b;
        }
        if (n == 3) {
            return ahux.c;
        }
        if (n == 4) {
            return ahux.d;
        }
        if (n == 5) {
            return ahux.e;
        }
        if (n != 6) {
            return null;
        }
        return ahux.f;
    }
    
    public final int getNumber() {
        if (this != ahux.g) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
