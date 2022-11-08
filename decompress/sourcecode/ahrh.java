// 
// Decompiled by Procyon v0.6.0
// 

public enum ahrh implements agzm
{
    a("ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN", 0, 0), 
    b("ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_CLIENT_URL_PLAY_STORE", 1, 1), 
    c("ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_FINSKY", 2, 2), 
    d("ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_ALLEY_OOP", 3, 3);
    
    public final int e;
    
    private ahrh(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return ahng.t;
    }
    
    public static ahrh b(final int n) {
        if (n == 0) {
            return ahrh.a;
        }
        if (n == 1) {
            return ahrh.b;
        }
        if (n == 2) {
            return ahrh.c;
        }
        if (n != 3) {
            return null;
        }
        return ahrh.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
