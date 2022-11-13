// 
// Decompiled by Procyon v0.6.0
// 

public enum anea implements ahbl
{
    a("UNKNOWN", 0, 0), 
    b("OFF", 1, 1), 
    c("ON", 2, 2), 
    d("FORCED_ON", 3, 3), 
    e("ON_WEAK", 4, 4), 
    f("OFF_WEAK", 5, 5);
    
    private static final anea[] g;
    private final int h;
    
    private anea(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahbn a() {
        return anci.k;
    }
    
    public static anea b(final int n) {
        if (n == 0) {
            return anea.a;
        }
        if (n == 1) {
            return anea.b;
        }
        if (n == 2) {
            return anea.c;
        }
        if (n == 3) {
            return anea.d;
        }
        if (n == 4) {
            return anea.e;
        }
        if (n != 5) {
            return null;
        }
        return anea.f;
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
