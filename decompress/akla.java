// 
// Decompiled by Procyon v0.6.0
// 

public enum akla implements ahbl
{
    a("CAMERA_UNKNOWN", 0, 0), 
    b("CAMERA_NONE", 1, 1), 
    c("CAMERA_BACK", 2, 2), 
    d("CAMERA_FRONT", 3, 3), 
    e("CAMERA_FRONT_AND_BACK", 4, 4);
    
    private static final akla[] g;
    public final int f;
    
    private akla(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return akjo.f;
    }
    
    public static akla b(final int n) {
        if (n == 0) {
            return akla.a;
        }
        if (n == 1) {
            return akla.b;
        }
        if (n == 2) {
            return akla.c;
        }
        if (n == 3) {
            return akla.d;
        }
        if (n != 4) {
            return null;
        }
        return akla.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
