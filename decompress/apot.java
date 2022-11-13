// 
// Decompiled by Procyon v0.6.0
// 

public enum apot implements ahbl
{
    a("ALIGN_HORIZONTAL_UNSPECIFIED", 0, 0), 
    b("ALIGN_HORIZONTAL_ALIGN_LEFT", 1, 1), 
    c("ALIGN_HORIZONTAL_ALIGN_CENTER", 2, 2), 
    d("ALIGN_HORIZONTAL_ALIGN_RIGHT", 3, 3);
    
    private static final apot[] f;
    public final int e;
    
    private apot(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return aplg.q;
    }
    
    public static apot b(final int n) {
        if (n == 0) {
            return apot.a;
        }
        if (n == 1) {
            return apot.b;
        }
        if (n == 2) {
            return apot.c;
        }
        if (n != 3) {
            return null;
        }
        return apot.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
