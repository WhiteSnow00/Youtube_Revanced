// 
// Decompiled by Procyon v0.6.0
// 

public enum ahfv implements agzm
{
    a("ONESIE_REQUEST_TARGET_UNKNOWN", 0, 0), 
    b("ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE", 1, 1), 
    c("ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE_DEPRECATED", 2, 2), 
    d("ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE", 3, 3);
    
    public final int e;
    
    private ahfv(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return ahec.l;
    }
    
    public static ahfv b(final int n) {
        if (n == 0) {
            return ahfv.a;
        }
        if (n == 1) {
            return ahfv.b;
        }
        if (n == 2) {
            return ahfv.c;
        }
        if (n != 3) {
            return null;
        }
        return ahfv.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
