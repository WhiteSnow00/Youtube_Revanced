// 
// Decompiled by Procyon v0.6.0
// 

public enum aqvf implements agzm
{
    a("ALIGN_HORIZONTAL_UNSPECIFIED", 0, 0), 
    b("ALIGN_LEFT", 1, 1), 
    c("ALIGN_CENTER", 2, 2), 
    d("ALIGN_RIGHT", 3, 3);
    
    public final int e;
    
    private aqvf(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return aqtg.e;
    }
    
    public static aqvf b(final int n) {
        if (n == 0) {
            return aqvf.a;
        }
        if (n == 1) {
            return aqvf.b;
        }
        if (n == 2) {
            return aqvf.c;
        }
        if (n != 3) {
            return null;
        }
        return aqvf.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
