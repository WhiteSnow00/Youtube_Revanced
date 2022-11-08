// 
// Decompiled by Procyon v0.6.0
// 

public enum ahfn implements agzm
{
    a("UNKNOWN_COMPONENT_STYLE", 0, 0), 
    b("LEGACY_COMPONENT_STYLE", 1, 1), 
    c("GLIF_COMPONENT_STYLE", 2, 2), 
    d("GM_COMPONENT_STYLE", 3, 3);
    
    public final int e;
    
    private ahfn(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return ahec.f;
    }
    
    public static ahfn b(final int n) {
        if (n == 0) {
            return ahfn.a;
        }
        if (n == 1) {
            return ahfn.b;
        }
        if (n == 2) {
            return ahfn.c;
        }
        if (n != 3) {
            return null;
        }
        return ahfn.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
