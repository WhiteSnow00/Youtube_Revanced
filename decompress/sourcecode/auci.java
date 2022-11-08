// 
// Decompiled by Procyon v0.6.0
// 

public enum auci
{
    a("DISABLED", 0, 0, false), 
    b("DISK", 1, 1, true), 
    c("DISK_NO_HTTP", 2, 1, false), 
    d("MEMORY", 3, 2, true);
    
    public final int e;
    public final boolean f;
    
    private auci(final String s, final int n, final int e, final boolean f) {
        this.f = f;
        this.e = e;
    }
    
    static auci a(final int n) {
        if (n == 0) {
            return auci.a;
        }
        if (n == 1) {
            return auci.d;
        }
        if (n == 2) {
            return auci.c;
        }
        if (n == 3) {
            return auci.b;
        }
        throw new IllegalArgumentException("Unknown public builder cache mode");
    }
}
