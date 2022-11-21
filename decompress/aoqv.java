// 
// Decompiled by Procyon v0.6.0
// 

public enum aoqv implements ahdd
{
    a("ASPECT_RATIO_UNSPECIFIED", 0, 0), 
    b("ASPECT_RATIO_16_BY_9", 1, 1), 
    c("ASPECT_RATIO_1_BY_1", 2, 2), 
    d("ASPECT_RATIO_2_BY_3", 3, 3);
    
    private static final aoqv[] e;
    private final int f;
    
    private aoqv(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return aonf.o;
    }
    
    public static aoqv b(final int n) {
        if (n == 0) {
            return aoqv.a;
        }
        if (n == 1) {
            return aoqv.b;
        }
        if (n == 2) {
            return aoqv.c;
        }
        if (n != 3) {
            return null;
        }
        return aoqv.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
