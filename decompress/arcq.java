// 
// Decompiled by Procyon v0.6.0
// 

public enum arcq implements ahdd
{
    a("PREVIEW_MODE_UNSPECIFIED", 0, 0), 
    b("PREVIEW_MODE_REGULAR", 1, 1), 
    c("PREVIEW_MODE_MINI", 2, 2), 
    d("PREVIEW_MODE_REGULAR_SCROLL", 3, 3);
    
    private static final arcq[] f;
    public final int e;
    
    private arcq(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return aqym.q;
    }
    
    public static arcq b(final int n) {
        if (n == 0) {
            return arcq.a;
        }
        if (n == 1) {
            return arcq.b;
        }
        if (n == 2) {
            return arcq.c;
        }
        if (n != 3) {
            return null;
        }
        return arcq.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
