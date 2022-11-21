// 
// Decompiled by Procyon v0.6.0
// 

public enum ahug implements ahdd
{
    a("ANDROID_MEDIA_CACHE_WIPEOUT_REASON_UNKNOWN", 0, 0), 
    b("ANDROID_MEDIA_CACHE_WIPEOUT_REASON_ON_ACCOUNT_REMOVED", 1, 1);
    
    private static final ahug[] d;
    public final int c;
    
    private ahug(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public static ahdf a() {
        return ahqv.m;
    }
    
    public static ahug b(final int n) {
        if (n == 0) {
            return ahug.a;
        }
        if (n != 1) {
            return null;
        }
        return ahug.b;
    }
    
    public final int getNumber() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}
