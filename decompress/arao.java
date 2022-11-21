// 
// Decompiled by Procyon v0.6.0
// 

public enum arao implements ahdd
{
    a("ALIGN_HORIZONTAL_UNSPECIFIED", 0, 0), 
    b("ALIGN_LEFT", 1, 1), 
    c("ALIGN_CENTER", 2, 2), 
    d("ALIGN_RIGHT", 3, 3);
    
    private static final arao[] f;
    public final int e;
    
    private arao(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return aqym.g;
    }
    
    public static arao b(final int n) {
        if (n == 0) {
            return arao.a;
        }
        if (n == 1) {
            return arao.b;
        }
        if (n == 2) {
            return arao.c;
        }
        if (n != 3) {
            return null;
        }
        return arao.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
