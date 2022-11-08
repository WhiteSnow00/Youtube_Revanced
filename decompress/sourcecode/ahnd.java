// 
// Decompiled by Procyon v0.6.0
// 

public enum ahnd implements agzm
{
    a("CONTROL_FLOW_MANAGER_LAYER_UNSPECIFIED", 0, 0), 
    b("CONTROL_FLOW_MANAGER_LAYER_CORE", 1, 1), 
    c("CONTROL_FLOW_MANAGER_LAYER_ADAPTER", 2, 2), 
    d("CONTROL_FLOW_MANAGER_LAYER_SURFACE", 3, 3), 
    e("CONTROL_FLOW_MANAGER_LAYER_EXTERNAL", 4, 4);
    
    public final int f;
    
    private ahnd(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return ahho.t;
    }
    
    public static ahnd b(final int n) {
        if (n == 0) {
            return ahnd.a;
        }
        if (n == 1) {
            return ahnd.b;
        }
        if (n == 2) {
            return ahnd.c;
        }
        if (n == 3) {
            return ahnd.d;
        }
        if (n != 4) {
            return null;
        }
        return ahnd.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
