// 
// Decompiled by Procyon v0.6.0
// 

public enum ahuy implements ahdd
{
    a("ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN", 0, 0), 
    b("ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_CLIENT_URL_PLAY_STORE", 1, 1), 
    c("ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_FINSKY", 2, 2), 
    d("ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_ALLEY_OOP", 3, 3);
    
    private static final ahuy[] f;
    public final int e;
    
    private ahuy(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return ahqv.t;
    }
    
    public static ahuy b(final int n) {
        if (n == 0) {
            return ahuy.a;
        }
        if (n == 1) {
            return ahuy.b;
        }
        if (n == 2) {
            return ahuy.c;
        }
        if (n != 3) {
            return null;
        }
        return ahuy.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
