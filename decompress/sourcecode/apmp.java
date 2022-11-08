// 
// Decompiled by Procyon v0.6.0
// 

public enum apmp implements agzm
{
    a("ALIGN_HORIZONTAL_UNSPECIFIED", 0, 0), 
    b("ALIGN_HORIZONTAL_ALIGN_LEFT", 1, 1), 
    c("ALIGN_HORIZONTAL_ALIGN_CENTER", 2, 2), 
    d("ALIGN_HORIZONTAL_ALIGN_RIGHT", 3, 3);
    
    public final int e;
    
    private apmp(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return apjd.p;
    }
    
    public static apmp b(final int n) {
        if (n == 0) {
            return apmp.a;
        }
        if (n == 1) {
            return apmp.b;
        }
        if (n == 2) {
            return apmp.c;
        }
        if (n != 3) {
            return null;
        }
        return apmp.d;
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
