// 
// Decompiled by Procyon v0.6.0
// 

public enum ampo implements agzm
{
    a("SHORTS_LAYOUT_TYPE_UNKNOWN", 0, 0), 
    b("SHORTS_LAYOUT_TYPE_THUMBNAIL_END", 1, 1), 
    c("SHORTS_LAYOUT_TYPE_THUMBNAIL_END_NO_HEADER", 2, 2);
    
    private final int e;
    
    private ampo(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return amom.m;
    }
    
    public static ampo b(final int n) {
        if (n == 0) {
            return ampo.a;
        }
        if (n == 1) {
            return ampo.b;
        }
        if (n != 2) {
            return null;
        }
        return ampo.c;
    }
    
    @Override
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
