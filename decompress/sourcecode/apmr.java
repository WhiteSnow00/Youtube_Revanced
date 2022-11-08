// 
// Decompiled by Procyon v0.6.0
// 

public enum apmr implements agzm
{
    a("FONT_FAMILY_UNSPECIFIED", 0, 0), 
    b("FONT_FAMILY_CLASSIC", 1, 1), 
    c("FONT_FAMILY_LIGHT", 2, 2), 
    d("FONT_FAMILY_HEAVY", 3, 3), 
    e("FONT_FAMILY_MARKER", 4, 4), 
    f("FONT_FAMILY_BRUSH", 5, 5), 
    g("FONT_FAMILY_TYPEWRITER", 6, 6);
    
    public final int h;
    
    private apmr(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agzo a() {
        return apjd.u;
    }
    
    public static apmr b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return apmr.g;
            }
            case 5: {
                return apmr.f;
            }
            case 4: {
                return apmr.e;
            }
            case 3: {
                return apmr.d;
            }
            case 2: {
                return apmr.c;
            }
            case 1: {
                return apmr.b;
            }
            case 0: {
                return apmr.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
