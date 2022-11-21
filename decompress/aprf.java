// 
// Decompiled by Procyon v0.6.0
// 

public enum aprf implements ahdd
{
    a("ALIGN_HORIZONTAL_UNSPECIFIED", 0, 0), 
    b("ALIGN_HORIZONTAL_ALIGN_LEFT", 1, 1), 
    c("ALIGN_HORIZONTAL_ALIGN_CENTER", 2, 2), 
    d("ALIGN_HORIZONTAL_ALIGN_RIGHT", 3, 3);
    
    private static final aprf[] f;
    public final int e;
    
    private aprf(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return apnc.r;
    }
    
    public static aprf b(final int n) {
        if (n == 0) {
            return aprf.a;
        }
        if (n == 1) {
            return aprf.b;
        }
        if (n == 2) {
            return aprf.c;
        }
        if (n != 3) {
            return null;
        }
        return aprf.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
