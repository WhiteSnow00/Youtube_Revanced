// 
// Decompiled by Procyon v0.6.0
// 

public enum aqxh implements agzm
{
    a("PREVIEW_MODE_UNSPECIFIED", 0, 0), 
    b("PREVIEW_MODE_REGULAR", 1, 1), 
    c("PREVIEW_MODE_MINI", 2, 2), 
    d("PREVIEW_MODE_REGULAR_SCROLL", 3, 3);
    
    public final int e;
    
    private aqxh(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return aqtg.o;
    }
    
    public static aqxh b(final int n) {
        if (n == 0) {
            return aqxh.a;
        }
        if (n == 1) {
            return aqxh.b;
        }
        if (n == 2) {
            return aqxh.c;
        }
        if (n != 3) {
            return null;
        }
        return aqxh.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
