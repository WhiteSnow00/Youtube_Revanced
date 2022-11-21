// 
// Decompiled by Procyon v0.6.0
// 

public enum aopf implements ahdd
{
    a("SUBSCRIPTION_NOTIFICATION_SETTING_STATE_UNKNOWN", 0, 0), 
    b("SUBSCRIPTION_NOTIFICATION_SETTING_STATE_ENABLED", 1, 1), 
    c("SUBSCRIPTION_NOTIFICATION_SETTING_STATE_DISABLED", 2, 2);
    
    private static final aopf[] d;
    private final int e;
    
    private aopf(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return aonf.k;
    }
    
    public static aopf b(final int n) {
        if (n == 0) {
            return aopf.a;
        }
        if (n == 1) {
            return aopf.b;
        }
        if (n != 2) {
            return null;
        }
        return aopf.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
