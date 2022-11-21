// 
// Decompiled by Procyon v0.6.0
// 

public enum aufv
{
    a("DISABLED", 0, 0, false), 
    b("DISK", 1, 1, true), 
    c("DISK_NO_HTTP", 2, 1, false), 
    d("MEMORY", 3, 2, true);
    
    private static final aufv[] g;
    public final int e;
    public final boolean f;
    
    private aufv(final String s, final int n, final int e, final boolean f) {
        this.f = f;
        this.e = e;
    }
    
    static aufv a(final int n) {
        if (n == 0) {
            return aufv.a;
        }
        if (n == 1) {
            return aufv.d;
        }
        if (n == 2) {
            return aufv.c;
        }
        if (n == 3) {
            return aufv.b;
        }
        throw new IllegalArgumentException("Unknown public builder cache mode");
    }
}
