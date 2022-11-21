// 
// Decompiled by Procyon v0.6.0
// 

public enum areh implements ahdd
{
    a("VISUAL_SOURCE_TYPE_UNKNOWN", 0, 0), 
    b("VISUAL_SOURCE_TYPE_SPLICE", 1, 1), 
    c("VISUAL_SOURCE_TYPE_GREEN_SCREEN", 2, 2), 
    d("VISUAL_SOURCE_TYPE_COLLAB", 3, 3), 
    e("VISUAL_SOURCE_TYPE_IMPORT", 4, 4), 
    f("VISUAL_SOURCE_TYPE_RECOMPOSITION", 5, 5);
    
    private static final areh[] h;
    public final int g;
    
    private areh(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahdf a() {
        return areg.a;
    }
    
    public static areh b(final int n) {
        if (n == 0) {
            return areh.a;
        }
        if (n == 1) {
            return areh.b;
        }
        if (n == 2) {
            return areh.c;
        }
        if (n == 3) {
            return areh.d;
        }
        if (n == 4) {
            return areh.e;
        }
        if (n != 5) {
            return null;
        }
        return areh.f;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
