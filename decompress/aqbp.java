// 
// Decompiled by Procyon v0.6.0
// 

public enum aqbp implements ahdd
{
    a("PLAYLIST_VISIBILITY_UNKNOWN", 0, 0), 
    b("PLAYLIST_VISIBILITY_PUBLIC", 1, 1), 
    c("PLAYLIST_VISIBILITY_PRIVATE", 2, 2), 
    d("PLAYLIST_VISIBILITY_UNLISTED", 3, 3);
    
    private static final aqbp[] e;
    private final int f;
    
    private aqbp(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return apvm.q;
    }
    
    public static aqbp b(final int n) {
        if (n == 0) {
            return aqbp.a;
        }
        if (n == 1) {
            return aqbp.b;
        }
        if (n == 2) {
            return aqbp.c;
        }
        if (n != 3) {
            return null;
        }
        return aqbp.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
