// 
// Decompiled by Procyon v0.6.0
// 

public enum aqwc implements agzm
{
    a("FONT_FAMILY_UNSPECIFIED", 0, 0), 
    b("CLASSIC", 1, 1), 
    c("LIGHT", 2, 2), 
    d("HEAVY", 3, 3), 
    e("MARKER", 4, 4), 
    f("BRUSH", 5, 5), 
    g("TYPEWRITER", 6, 6);
    
    public final int h;
    
    private aqwc(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agzo a() {
        return aqtg.k;
    }
    
    public static aqwc b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return aqwc.g;
            }
            case 5: {
                return aqwc.f;
            }
            case 4: {
                return aqwc.e;
            }
            case 3: {
                return aqwc.d;
            }
            case 2: {
                return aqwc.c;
            }
            case 1: {
                return aqwc.b;
            }
            case 0: {
                return aqwc.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
