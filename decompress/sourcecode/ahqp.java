// 
// Decompiled by Procyon v0.6.0
// 

public enum ahqp implements agzm
{
    a("ANDROID_MEDIA_CACHE_WIPEOUT_REASON_UNKNOWN", 0, 0), 
    b("ANDROID_MEDIA_CACHE_WIPEOUT_REASON_ON_ACCOUNT_REMOVED", 1, 1);
    
    public final int c;
    
    private ahqp(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public static agzo a() {
        return ahng.m;
    }
    
    public static ahqp b(final int n) {
        if (n == 0) {
            return ahqp.a;
        }
        if (n != 1) {
            return null;
        }
        return ahqp.b;
    }
    
    public final int getNumber() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}
