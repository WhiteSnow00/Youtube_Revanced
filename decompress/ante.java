// 
// Decompiled by Procyon v0.6.0
// 

public enum ante implements ahdd
{
    a("QOE_HOT_CONFIG_FEATURES_UNSPECIFIED", 0, 0), 
    b("QOE_HOT_CONFIG_FEATURES_USE_STRING_FORMAT_FOR_ELAPSED_TIME", 1, 1), 
    c("QOE_HOT_CONFIG_FEATURES_DISABLE_ECATCHER_PINGS", 2, 2), 
    d("QOE_HOT_CONFIG_FEATURES_REMOVE_EXPIDS_AFTER_FIRST_PING", 3, 4), 
    e("QOE_HOT_CONFIG_FEATURES_PUSH_DROPPED_FRAMES", 4, 5), 
    f("QOE_HOT_CONFIG_FEATURES_PUSH_BUFFER_HEALTH", 5, 6), 
    g("QOE_HOT_CONFIG_FEATURES_DO_NOT_CHANGE_FATAL_ERROR_CODE", 6, 8), 
    h("UNRECOGNIZED", 7, -1);
    
    private static final ante[] i;
    private final int j;
    
    private ante(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static ahdf a() {
        return ansp.g;
    }
    
    public static ante b(final int n) {
        if (n == 0) {
            return ante.a;
        }
        if (n == 1) {
            return ante.b;
        }
        if (n == 2) {
            return ante.c;
        }
        if (n == 4) {
            return ante.d;
        }
        if (n == 5) {
            return ante.e;
        }
        if (n == 6) {
            return ante.f;
        }
        if (n != 8) {
            return null;
        }
        return ante.g;
    }
    
    public final int getNumber() {
        if (this != ante.h) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
