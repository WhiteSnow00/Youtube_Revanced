// 
// Decompiled by Procyon v0.6.0
// 

public enum apes implements agzm
{
    a("UPLOAD_CLIENT_SIDE_RENDERING_STATE_UNSPECIFIED", 0, 0), 
    b("UPLOAD_CLIENT_SIDE_RENDERING_STATE_FAILED", 1, 1), 
    c("UPLOAD_CLIENT_SIDE_RENDERING_STATE_PROCESSING", 2, 2), 
    d("UPLOAD_CLIENT_SIDE_RENDERING_STATE_CANCELLED", 3, 3), 
    e("UPLOAD_CLIENT_SIDE_RENDERING_STATE_COMPLETED", 4, 4);
    
    public final int f;
    
    private apes(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return aotc.m;
    }
    
    public static apes b(final int n) {
        if (n == 0) {
            return apes.a;
        }
        if (n == 1) {
            return apes.b;
        }
        if (n == 2) {
            return apes.c;
        }
        if (n == 3) {
            return apes.d;
        }
        if (n != 4) {
            return null;
        }
        return apes.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
