// 
// Decompiled by Procyon v0.6.0
// 

public enum admu implements ahbl
{
    a("UNKNOWN", 0, 0), 
    b("NOT_CREATED", 1, 1), 
    c("SUCCESS", 2, 2), 
    d("FAILED", 3, 3), 
    e("REJECTED", 4, 4), 
    f("DELETED", 5, 5);
    
    private static final admu[] h;
    public final int g;
    
    private admu(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static admu a(final int n) {
        if (n == 0) {
            return admu.a;
        }
        if (n == 1) {
            return admu.b;
        }
        if (n == 2) {
            return admu.c;
        }
        if (n == 3) {
            return admu.d;
        }
        if (n == 4) {
            return admu.e;
        }
        if (n != 5) {
            return null;
        }
        return admu.f;
    }
    
    public static ahbn b() {
        return pff.r;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
