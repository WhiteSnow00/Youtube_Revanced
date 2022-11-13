// 
// Decompiled by Procyon v0.6.0
// 

public enum ajhp implements ahbl
{
    a("FILTER_TYPE_UNSPECIFIED", 0, 0), 
    b("FILTER_TYPE_NONE", 1, 1), 
    c("FILTER_TYPE_PLAYLISTS_ONLY", 2, 2), 
    d("FILTER_TYPE_VIDEOS_ONLY", 3, 3);
    
    private static final ajhp[] f;
    public final int e;
    
    private ajhp(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return ajek.o;
    }
    
    public static ajhp b(final int n) {
        if (n == 0) {
            return ajhp.a;
        }
        if (n == 1) {
            return ajhp.b;
        }
        if (n == 2) {
            return ajhp.c;
        }
        if (n != 3) {
            return null;
        }
        return ajhp.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
