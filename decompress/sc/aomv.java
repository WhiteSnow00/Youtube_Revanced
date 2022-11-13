// 
// Decompiled by Procyon v0.6.0
// 

public enum aomv implements ahbl
{
    a("SUBSCRIPTION_NOTIFICATION_SETTING_STATE_UNKNOWN", 0, 0), 
    b("SUBSCRIPTION_NOTIFICATION_SETTING_STATE_ENABLED", 1, 1), 
    c("SUBSCRIPTION_NOTIFICATION_SETTING_STATE_DISABLED", 2, 2);
    
    private static final aomv[] d;
    private final int e;
    
    private aomv(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return aola.j;
    }
    
    public static aomv b(final int n) {
        if (n == 0) {
            return aomv.a;
        }
        if (n == 1) {
            return aomv.b;
        }
        if (n != 2) {
            return null;
        }
        return aomv.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
