// 
// Decompiled by Procyon v0.6.0
// 

public enum apri implements ahdd
{
    a("FONT_FAMILY_UNSPECIFIED", 0, 0), 
    b("FONT_FAMILY_CLASSIC", 1, 1), 
    c("FONT_FAMILY_LIGHT", 2, 2), 
    d("FONT_FAMILY_HEAVY", 3, 3), 
    e("FONT_FAMILY_MARKER", 4, 4), 
    f("FONT_FAMILY_BRUSH", 5, 5), 
    g("FONT_FAMILY_TYPEWRITER", 6, 6);
    
    private static final apri[] i;
    public final int h;
    
    private apri(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahdf a() {
        return aprh.a;
    }
    
    public static apri b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return apri.g;
            }
            case 5: {
                return apri.f;
            }
            case 4: {
                return apri.e;
            }
            case 3: {
                return apri.d;
            }
            case 2: {
                return apri.c;
            }
            case 1: {
                return apri.b;
            }
            case 0: {
                return apri.a;
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
