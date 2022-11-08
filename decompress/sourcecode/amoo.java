// 
// Decompiled by Procyon v0.6.0
// 

public enum amoo implements agzm
{
    a("EFFECTIVE_CONNECTION_TYPE_UNKNOWN", 0, 0), 
    b("EFFECTIVE_CONNECTION_TYPE_OFFLINE", 1, 1), 
    c("EFFECTIVE_CONNECTION_TYPE_SLOW_2G", 2, 2), 
    d("EFFECTIVE_CONNECTION_TYPE_2G", 3, 3), 
    e("EFFECTIVE_CONNECTION_TYPE_3G", 4, 4), 
    f("EFFECTIVE_CONNECTION_TYPE_4G", 5, 5);
    
    public final int g;
    
    private amoo(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static agzo a() {
        return amom.c;
    }
    
    public static amoo b(final int n) {
        if (n == 0) {
            return amoo.a;
        }
        if (n == 1) {
            return amoo.b;
        }
        if (n == 2) {
            return amoo.c;
        }
        if (n == 3) {
            return amoo.d;
        }
        if (n == 4) {
            return amoo.e;
        }
        if (n != 5) {
            return null;
        }
        return amoo.f;
    }
    
    @Override
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
