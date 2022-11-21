// 
// Decompiled by Procyon v0.6.0
// 

public enum ahtl implements ahdd
{
    a("ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_UNKNOWN", 0, 0), 
    b("ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_ADS_DEBOUNCE", 1, 4), 
    c("ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL", 2, 1), 
    d("ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL", 3, 2), 
    e("ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_DEEP_LINK", 4, 3);
    
    private static final ahtl[] g;
    public final int f;
    
    private ahtl(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return ahqv.i;
    }
    
    public static ahtl b(final int n) {
        if (n == 0) {
            return ahtl.a;
        }
        if (n == 1) {
            return ahtl.c;
        }
        if (n == 2) {
            return ahtl.d;
        }
        if (n == 3) {
            return ahtl.e;
        }
        if (n != 4) {
            return null;
        }
        return ahtl.b;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
