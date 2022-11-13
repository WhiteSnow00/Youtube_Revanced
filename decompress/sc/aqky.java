// 
// Decompiled by Procyon v0.6.0
// 

public enum aqky implements ahbl
{
    a("HAPTIC_TYPE_UNKNOWN", 0, 0), 
    b("HAPTIC_TYPE_LIGHT_IMPACT", 1, 1), 
    c("HAPTIC_TYPE_MEDIUM_IMPACT", 2, 2), 
    d("HAPTIC_TYPE_HEAVY_IMPACT", 3, 3), 
    e("HAPTIC_TYPE_SELECTION_CLICK", 4, 4), 
    f("HAPTIC_TYPE_SUCCESS", 5, 5);
    
    private static final aqky[] g;
    private final int h;
    
    private aqky(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahbn a() {
        return aqls.b;
    }
    
    public static aqky b(final int n) {
        if (n == 0) {
            return aqky.a;
        }
        if (n == 1) {
            return aqky.b;
        }
        if (n == 2) {
            return aqky.c;
        }
        if (n == 3) {
            return aqky.d;
        }
        if (n == 4) {
            return aqky.e;
        }
        if (n != 5) {
            return null;
        }
        return aqky.f;
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
