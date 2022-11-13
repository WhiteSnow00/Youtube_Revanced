// 
// Decompiled by Procyon v0.6.0
// 

public enum apov implements ahbl
{
    a("FONT_FAMILY_UNSPECIFIED", 0, 0), 
    b("FONT_FAMILY_CLASSIC", 1, 1), 
    c("FONT_FAMILY_LIGHT", 2, 2), 
    d("FONT_FAMILY_HEAVY", 3, 3), 
    e("FONT_FAMILY_MARKER", 4, 4), 
    f("FONT_FAMILY_BRUSH", 5, 5), 
    g("FONT_FAMILY_TYPEWRITER", 6, 6);
    
    private static final apov[] i;
    public final int h;
    
    private apov(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahbn a() {
        return apow.b;
    }
    
    public static apov b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return apov.g;
            }
            case 5: {
                return apov.f;
            }
            case 4: {
                return apov.e;
            }
            case 3: {
                return apov.d;
            }
            case 2: {
                return apov.c;
            }
            case 1: {
                return apov.b;
            }
            case 0: {
                return apov.a;
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
