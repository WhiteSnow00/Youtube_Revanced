// 
// Decompiled by Procyon v0.6.0
// 

public enum ankw implements agzm
{
    a("PRESENTATION_STYLE_UNKNOWN", 0, 0), 
    b("PRESENTATION_STYLE_PUSH", 1, 1), 
    c("PRESENTATION_STYLE_MODAL", 2, 2), 
    d("PRESENTATION_STYLE_PANEL", 3, 3);
    
    private final int f;
    
    private ankw(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return angs.j;
    }
    
    public static ankw b(final int n) {
        if (n == 0) {
            return ankw.a;
        }
        if (n == 1) {
            return ankw.b;
        }
        if (n == 2) {
            return ankw.c;
        }
        if (n != 3) {
            return null;
        }
        return ankw.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
