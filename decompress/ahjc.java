// 
// Decompiled by Procyon v0.6.0
// 

public enum ahjc implements ahdd
{
    a("UNKNOWN_COMPONENT_STYLE", 0, 0), 
    b("LEGACY_COMPONENT_STYLE", 1, 1), 
    c("GLIF_COMPONENT_STYLE", 2, 2), 
    d("GM_COMPONENT_STYLE", 3, 3);
    
    private static final ahjc[] f;
    public final int e;
    
    private ahjc(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return ahhs.f;
    }
    
    public static ahjc b(final int n) {
        if (n == 0) {
            return ahjc.a;
        }
        if (n == 1) {
            return ahjc.b;
        }
        if (n == 2) {
            return ahjc.c;
        }
        if (n != 3) {
            return null;
        }
        return ahjc.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
