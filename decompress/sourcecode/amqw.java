// 
// Decompiled by Procyon v0.6.0
// 

public enum amqw implements agzm
{
    a("DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN", 0, 0), 
    b("DOWNLOAD_QUALITY_SETTINGS_ACTION_SAVE", 1, 1), 
    c("DOWNLOAD_QUALITY_SETTINGS_ACTION_EXPIRING_SAVE", 2, 2), 
    d("DOWNLOAD_QUALITY_SETTINGS_ACTION_DONT_SAVE", 3, 3), 
    e("DOWNLOAD_QUALITY_SETTINGS_ACTION_ALREADY_SAVED", 4, 4);
    
    public final int f;
    
    private amqw(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return amom.q;
    }
    
    public static amqw b(final int n) {
        if (n == 0) {
            return amqw.a;
        }
        if (n == 1) {
            return amqw.b;
        }
        if (n == 2) {
            return amqw.c;
        }
        if (n == 3) {
            return amqw.d;
        }
        if (n != 4) {
            return null;
        }
        return amqw.e;
    }
    
    @Override
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
