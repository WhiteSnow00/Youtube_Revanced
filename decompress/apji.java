// 
// Decompiled by Procyon v0.6.0
// 

public enum apji implements ahdd
{
    a("UPLOAD_CLIENT_SIDE_RENDERING_STATE_UNSPECIFIED", 0, 0), 
    b("UPLOAD_CLIENT_SIDE_RENDERING_STATE_FAILED", 1, 1), 
    c("UPLOAD_CLIENT_SIDE_RENDERING_STATE_PROCESSING", 2, 2), 
    d("UPLOAD_CLIENT_SIDE_RENDERING_STATE_CANCELLED", 3, 3), 
    e("UPLOAD_CLIENT_SIDE_RENDERING_STATE_COMPLETED", 4, 4);
    
    private static final apji[] g;
    public final int f;
    
    private apji(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return aoxk.o;
    }
    
    public static apji b(final int n) {
        if (n == 0) {
            return apji.a;
        }
        if (n == 1) {
            return apji.b;
        }
        if (n == 2) {
            return apji.c;
        }
        if (n == 3) {
            return apji.d;
        }
        if (n != 4) {
            return null;
        }
        return apji.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
