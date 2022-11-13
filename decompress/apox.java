// 
// Decompiled by Procyon v0.6.0
// 

public enum apox implements ahbl
{
    a("TRIM_EVENT_UNKNOWN", 0, 0), 
    b("TRIM_EVENT_ENTER", 1, 1), 
    c("TRIM_EVENT_EDIT_SUCCESS", 2, 2), 
    d("TRIM_EVENT_EDIT_ERROR", 3, 3), 
    e("TRIM_EVENT_CANCEL", 4, 4), 
    f("TRIM_EVENT_CANCEL_TRANSCODE", 5, 5);
    
    private static final ahbm g;
    private static final apox[] h;
    private final int i;
    
    static {
        h = c();
        g = (ahbm)new afqn(7);
    }
    
    private apox(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static ahbn a() {
        return apow.f;
    }
    
    public static apox b(final int n) {
        if (n == 0) {
            return apox.a;
        }
        if (n == 1) {
            return apox.b;
        }
        if (n == 2) {
            return apox.c;
        }
        if (n == 3) {
            return apox.d;
        }
        if (n == 4) {
            return apox.e;
        }
        if (n != 5) {
            return null;
        }
        return apox.f;
    }
    
    private static apox[] c() {
        return new apox[] { apox.a, apox.b, apox.c, apox.d, apox.e, apox.f };
    }
    
    public final int getNumber() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
