// 
// Decompiled by Procyon v0.6.0
// 

public enum arhd implements ahdd
{
    a("UNKNOWN", 0, 0), 
    b("VP8", 1, 1), 
    c("VP9", 2, 2), 
    d("H264", 3, 3), 
    e("H265X", 4, 4), 
    f("AV1X", 5, 5);
    
    private static final arhd[] h;
    public final int g;
    
    private arhd(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahdf a() {
        return areg.d;
    }
    
    public static arhd b(final int n) {
        if (n == 0) {
            return arhd.a;
        }
        if (n == 1) {
            return arhd.b;
        }
        if (n == 2) {
            return arhd.c;
        }
        if (n == 3) {
            return arhd.d;
        }
        if (n == 4) {
            return arhd.e;
        }
        if (n != 5) {
            return null;
        }
        return arhd.f;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
