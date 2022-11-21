// 
// Decompiled by Procyon v0.6.0
// 

public enum aprj implements ahdd
{
    a("TRIM_EVENT_UNKNOWN", 0, 0), 
    b("TRIM_EVENT_ENTER", 1, 1), 
    c("TRIM_EVENT_EDIT_SUCCESS", 2, 2), 
    d("TRIM_EVENT_EDIT_ERROR", 3, 3), 
    e("TRIM_EVENT_CANCEL", 4, 4), 
    f("TRIM_EVENT_CANCEL_TRANSCODE", 5, 5);
    
    private static final ahde g;
    private static final aprj[] h;
    private final int i;
    
    static {
        h = c();
        g = (ahde)new afsc(7);
    }
    
    private aprj(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static ahdf a() {
        return aprh.g;
    }
    
    public static aprj b(final int n) {
        if (n == 0) {
            return aprj.a;
        }
        if (n == 1) {
            return aprj.b;
        }
        if (n == 2) {
            return aprj.c;
        }
        if (n == 3) {
            return aprj.d;
        }
        if (n == 4) {
            return aprj.e;
        }
        if (n != 5) {
            return null;
        }
        return aprj.f;
    }
    
    private static aprj[] c() {
        return new aprj[] { aprj.a, aprj.b, aprj.c, aprj.d, aprj.e, aprj.f };
    }
    
    public final int getNumber() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
