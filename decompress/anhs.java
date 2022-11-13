// 
// Decompiled by Procyon v0.6.0
// 

public enum anhs implements ahbl
{
    a("UNKNOWN", 0, 0), 
    b("STANDARD", 1, 1), 
    c("FULLSCREEN", 2, 2), 
    d("MINI", 3, 3), 
    e("BACKGROUND", 4, 4);
    
    private static final anhs[] f;
    private final int g;
    
    private anhs(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahbn a() {
        return anci.r;
    }
    
    public static anhs b(final int n) {
        if (n == 0) {
            return anhs.a;
        }
        if (n == 1) {
            return anhs.b;
        }
        if (n == 2) {
            return anhs.c;
        }
        if (n == 3) {
            return anhs.d;
        }
        if (n != 4) {
            return null;
        }
        return anhs.e;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
