// 
// Decompiled by Procyon v0.6.0
// 

public enum ahet implements agzm
{
    a("UNKNOWN", 0, 0), 
    b("WIDGET_TAPPED", 1, 1), 
    c("WIDGET_ADDED", 2, 2), 
    d("WIDGET_REMOVED", 3, 3), 
    e("WIDGET_UPDATED", 4, 4), 
    f("WIDGET_RESIZED", 5, 5);
    
    public final int g;
    
    private ahet(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static agzo a() {
        return ahec.c;
    }
    
    public static ahet b(final int n) {
        if (n == 0) {
            return ahet.a;
        }
        if (n == 1) {
            return ahet.b;
        }
        if (n == 2) {
            return ahet.c;
        }
        if (n == 3) {
            return ahet.d;
        }
        if (n == 4) {
            return ahet.e;
        }
        if (n != 5) {
            return null;
        }
        return ahet.f;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
