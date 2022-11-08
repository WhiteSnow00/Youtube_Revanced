// 
// Decompiled by Procyon v0.6.0
// 

public enum apmt implements agzm
{
    a("TRIM_EVENT_UNKNOWN", 0, 0), 
    b("TRIM_EVENT_ENTER", 1, 1), 
    c("TRIM_EVENT_EDIT_SUCCESS", 2, 2), 
    d("TRIM_EVENT_EDIT_ERROR", 3, 3), 
    e("TRIM_EVENT_CANCEL", 4, 4), 
    f("TRIM_EVENT_CANCEL_TRANSCODE", 5, 5);
    
    private static final agzn g;
    private final int i;
    
    static {
        g = (agzn)new afom(7);
    }
    
    private apmt(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static agzo a() {
        return apms.e;
    }
    
    public static apmt b(final int n) {
        if (n == 0) {
            return apmt.a;
        }
        if (n == 1) {
            return apmt.b;
        }
        if (n == 2) {
            return apmt.c;
        }
        if (n == 3) {
            return apmt.d;
        }
        if (n == 4) {
            return apmt.e;
        }
        if (n != 5) {
            return null;
        }
        return apmt.f;
    }
    
    @Override
    public final int getNumber() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
