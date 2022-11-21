// 
// Decompiled by Procyon v0.6.0
// 

public enum ahqs implements ahdd
{
    a("CONTROL_FLOW_MANAGER_LAYER_UNSPECIFIED", 0, 0), 
    b("CONTROL_FLOW_MANAGER_LAYER_CORE", 1, 1), 
    c("CONTROL_FLOW_MANAGER_LAYER_ADAPTER", 2, 2), 
    d("CONTROL_FLOW_MANAGER_LAYER_SURFACE", 3, 3), 
    e("CONTROL_FLOW_MANAGER_LAYER_EXTERNAL", 4, 4);
    
    private static final ahqs[] g;
    public final int f;
    
    private ahqs(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return ahld.t;
    }
    
    public static ahqs b(final int n) {
        if (n == 0) {
            return ahqs.a;
        }
        if (n == 1) {
            return ahqs.b;
        }
        if (n == 2) {
            return ahqs.c;
        }
        if (n == 3) {
            return ahqs.d;
        }
        if (n != 4) {
            return null;
        }
        return ahqs.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
