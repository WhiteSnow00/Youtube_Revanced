// 
// Decompiled by Procyon v0.6.0
// 

public enum aqzv implements ahbl
{
    a("PREVIEW_MODE_UNSPECIFIED", 0, 0), 
    b("PREVIEW_MODE_REGULAR", 1, 1), 
    c("PREVIEW_MODE_MINI", 2, 2), 
    d("PREVIEW_MODE_REGULAR_SCROLL", 3, 3);
    
    private static final aqzv[] f;
    public final int e;
    
    private aqzv(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return aqvs.p;
    }
    
    public static aqzv b(final int n) {
        if (n == 0) {
            return aqzv.a;
        }
        if (n == 1) {
            return aqzv.b;
        }
        if (n == 2) {
            return aqzv.c;
        }
        if (n != 3) {
            return null;
        }
        return aqzv.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
