// 
// Decompiled by Procyon v0.6.0
// 

public enum aims implements ahdd
{
    a("CINEMATIC_CONTAINER_PRESENTATION_STYLE_UNKNOWN", 0, 0), 
    b("CINEMATIC_CONTAINER_PRESENTATION_STYLE_NONE", 1, 1), 
    c("CINEMATIC_CONTAINER_PRESENTATION_STYLE_STATIC_SINGLE_COLOR", 2, 2), 
    d("CINEMATIC_CONTAINER_PRESENTATION_STYLE_STATIC_BLURRED", 3, 3), 
    e("CINEMATIC_CONTAINER_PRESENTATION_STYLE_DYNAMIC_SINGLE_COLOR", 4, 4), 
    f("CINEMATIC_CONTAINER_PRESENTATION_STYLE_DYNAMIC_BLURRED", 5, 5);
    
    private static final aims[] h;
    public final int g;
    
    private aims(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahdf a() {
        return aiga.s;
    }
    
    public static aims b(final int n) {
        if (n == 0) {
            return aims.a;
        }
        if (n == 1) {
            return aims.b;
        }
        if (n == 2) {
            return aims.c;
        }
        if (n == 3) {
            return aims.d;
        }
        if (n == 4) {
            return aims.e;
        }
        if (n != 5) {
            return null;
        }
        return aims.f;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
