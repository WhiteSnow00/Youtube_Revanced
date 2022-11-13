// 
// Decompiled by Procyon v0.6.0
// 

public enum arbl implements ahbl
{
    a("VISUAL_SOURCE_TYPE_UNKNOWN", 0, 0), 
    b("VISUAL_SOURCE_TYPE_SPLICE", 1, 1), 
    c("VISUAL_SOURCE_TYPE_GREEN_SCREEN", 2, 2), 
    d("VISUAL_SOURCE_TYPE_COLLAB", 3, 3), 
    e("VISUAL_SOURCE_TYPE_IMPORT", 4, 4);
    
    private static final arbl[] g;
    public final int f;
    
    private arbl(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return areg.b;
    }
    
    public static arbl b(final int n) {
        if (n == 0) {
            return arbl.a;
        }
        if (n == 1) {
            return arbl.b;
        }
        if (n == 2) {
            return arbl.c;
        }
        if (n == 3) {
            return arbl.d;
        }
        if (n != 4) {
            return null;
        }
        return arbl.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
