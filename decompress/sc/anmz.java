// 
// Decompiled by Procyon v0.6.0
// 

public enum anmz implements ahbl
{
    a("PRESENTATION_STYLE_UNKNOWN", 0, 0), 
    b("PRESENTATION_STYLE_PUSH", 1, 1), 
    c("PRESENTATION_STYLE_MODAL", 2, 2), 
    d("PRESENTATION_STYLE_PANEL", 3, 3);
    
    private static final anmz[] e;
    private final int f;
    
    private anmz(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return anic.k;
    }
    
    public static anmz b(final int n) {
        if (n == 0) {
            return anmz.a;
        }
        if (n == 1) {
            return anmz.b;
        }
        if (n == 2) {
            return anmz.c;
        }
        if (n != 3) {
            return null;
        }
        return anmz.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
