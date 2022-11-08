// 
// Decompiled by Procyon v0.6.0
// 

public enum ampx implements agzm
{
    a("NOTIFICATION_OS_SETTING_STATE_UNKNOWN", 0, 0), 
    b("NOTIFICATION_OS_SETTING_STATE_ENABLED", 1, 1), 
    c("NOTIFICATION_OS_SETTING_STATE_DISABLED", 2, 2), 
    d("NOTIFICATION_OS_SETTING_STATE_ONLY_CHANNEL_DISABLED", 3, 3);
    
    public final int e;
    
    private ampx(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return amom.p;
    }
    
    public static ampx b(final int n) {
        if (n == 0) {
            return ampx.a;
        }
        if (n == 1) {
            return ampx.b;
        }
        if (n == 2) {
            return ampx.c;
        }
        if (n != 3) {
            return null;
        }
        return ampx.d;
    }
    
    @Override
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
