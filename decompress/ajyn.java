// 
// Decompiled by Procyon v0.6.0
// 

public enum ajyn implements ahbl
{
    a("GMS_DEVICE_CHECK_TYPE_UNKNOWN", 0, 0), 
    b("GMS_DEVICE_CHECK_TYPE_SUCCESS", 1, 1), 
    c("GMS_DEVICE_CHECK_TYPE_CONTINUE", 2, 2), 
    d("GMS_DEVICE_CHECK_TYPE_FAILED", 3, 3), 
    e("GMS_DEVICE_CHECK_TYPE_SUCCESS_NO_BROWSER", 4, 4);
    
    private static final ajyn[] g;
    public final int f;
    
    private ajyn(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return ajym.a;
    }
    
    public static ajyn b(final int n) {
        if (n == 0) {
            return ajyn.a;
        }
        if (n == 1) {
            return ajyn.b;
        }
        if (n == 2) {
            return ajyn.c;
        }
        if (n == 3) {
            return ajyn.d;
        }
        if (n != 4) {
            return null;
        }
        return ajyn.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
