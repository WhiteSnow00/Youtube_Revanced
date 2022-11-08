// 
// Decompiled by Procyon v0.6.0
// 

public enum aomi implements agzm
{
    a("ASPECT_RATIO_UNSPECIFIED", 0, 0), 
    b("ASPECT_RATIO_16_BY_9", 1, 1), 
    c("ASPECT_RATIO_1_BY_1", 2, 2), 
    d("ASPECT_RATIO_2_BY_3", 3, 3);
    
    private final int f;
    
    private aomi(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return aoiz.m;
    }
    
    public static aomi b(final int n) {
        if (n == 0) {
            return aomi.a;
        }
        if (n == 1) {
            return aomi.b;
        }
        if (n == 2) {
            return aomi.c;
        }
        if (n != 3) {
            return null;
        }
        return aomi.d;
    }
    
    @Override
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
