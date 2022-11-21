// 
// Decompiled by Procyon v0.6.0
// 

public enum ahii implements ahdd
{
    a("UNKNOWN", 0, 0), 
    b("WIDGET_TAPPED", 1, 1), 
    c("WIDGET_ADDED", 2, 2), 
    d("WIDGET_REMOVED", 3, 3), 
    e("WIDGET_UPDATED", 4, 4), 
    f("WIDGET_RESIZED", 5, 5);
    
    private static final ahii[] h;
    public final int g;
    
    private ahii(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahdf a() {
        return ahhs.c;
    }
    
    public static ahii b(final int n) {
        if (n == 0) {
            return ahii.a;
        }
        if (n == 1) {
            return ahii.b;
        }
        if (n == 2) {
            return ahii.c;
        }
        if (n == 3) {
            return ahii.d;
        }
        if (n == 4) {
            return ahii.e;
        }
        if (n != 5) {
            return null;
        }
        return ahii.f;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
