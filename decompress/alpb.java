// 
// Decompiled by Procyon v0.6.0
// 

public enum alpb implements ahbl
{
    a("STARTUP_SIGNAL_ERROR_UNKNOWN", 0, 0), 
    b("STARTUP_SIGNAL_ERROR_FIRST_THUMBNAIL_TIMEOUT", 1, 1), 
    c("STARTUP_SIGNAL_ERROR_BROWSE_FEED_TIMEOUT", 2, 2), 
    d("STARTUP_SIGNAL_ERROR_AFTER_ONRESUME_TIMEOUT", 3, 3);
    
    private static final alpb[] f;
    public final int e;
    
    private alpb(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return alnf.f;
    }
    
    public static alpb b(final int n) {
        if (n == 0) {
            return alpb.a;
        }
        if (n == 1) {
            return alpb.b;
        }
        if (n == 2) {
            return alpb.c;
        }
        if (n != 3) {
            return null;
        }
        return alpb.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
