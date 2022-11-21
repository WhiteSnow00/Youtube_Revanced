// 
// Decompiled by Procyon v0.6.0
// 

public enum ahjk implements ahdd
{
    a("ONESIE_REQUEST_TARGET_UNKNOWN", 0, 0), 
    b("ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE", 1, 1), 
    c("ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE_DEPRECATED", 2, 2), 
    d("ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE", 3, 3);
    
    private static final ahjk[] f;
    public final int e;
    
    private ahjk(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return ahhs.l;
    }
    
    public static ahjk b(final int n) {
        if (n == 0) {
            return ahjk.a;
        }
        if (n == 1) {
            return ahjk.b;
        }
        if (n == 2) {
            return ahjk.c;
        }
        if (n != 3) {
            return null;
        }
        return ahjk.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
