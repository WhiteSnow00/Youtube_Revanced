// 
// Decompiled by Procyon v0.6.0
// 

public enum amse implements agzm
{
    a("OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN", 0, 0), 
    b("OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NONE", 1, 1), 
    c("OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK", 2, 2), 
    d("OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI", 3, 3), 
    e("OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI_OR_UNMETERED", 4, 4);
    
    public final int f;
    
    private amse(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return amsc.f;
    }
    
    public static amse b(final int n) {
        if (n == 0) {
            return amse.a;
        }
        if (n == 1) {
            return amse.b;
        }
        if (n == 2) {
            return amse.c;
        }
        if (n == 3) {
            return amse.d;
        }
        if (n != 4) {
            return null;
        }
        return amse.e;
    }
    
    @Override
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
