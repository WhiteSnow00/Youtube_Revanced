// 
// Decompiled by Procyon v0.6.0
// 

public enum arbl implements ahdd
{
    a("FONT_FAMILY_UNSPECIFIED", 0, 0), 
    b("CLASSIC", 1, 1), 
    c("LIGHT", 2, 2), 
    d("HEAVY", 3, 3), 
    e("MARKER", 4, 4), 
    f("BRUSH", 5, 5), 
    g("TYPEWRITER", 6, 6);
    
    private static final arbl[] i;
    public final int h;
    
    private arbl(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahdf a() {
        return aqym.m;
    }
    
    public static arbl b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return arbl.g;
            }
            case 5: {
                return arbl.f;
            }
            case 4: {
                return arbl.e;
            }
            case 3: {
                return arbl.d;
            }
            case 2: {
                return arbl.c;
            }
            case 1: {
                return arbl.b;
            }
            case 0: {
                return arbl.a;
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
