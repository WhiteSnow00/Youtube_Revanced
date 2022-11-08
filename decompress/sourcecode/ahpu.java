// 
// Decompiled by Procyon v0.6.0
// 

public enum ahpu implements agzm
{
    a("ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_UNKNOWN", 0, 0), 
    b("ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_ADS_DEBOUNCE", 1, 4), 
    c("ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL", 2, 1), 
    d("ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL", 3, 2), 
    e("ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_DEEP_LINK", 4, 3);
    
    public final int f;
    
    private ahpu(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return ahng.i;
    }
    
    public static ahpu b(final int n) {
        if (n == 0) {
            return ahpu.a;
        }
        if (n == 1) {
            return ahpu.c;
        }
        if (n == 2) {
            return ahpu.d;
        }
        if (n == 3) {
            return ahpu.e;
        }
        if (n != 4) {
            return null;
        }
        return ahpu.b;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
