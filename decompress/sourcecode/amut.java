// 
// Decompiled by Procyon v0.6.0
// 

public enum amut implements agzm
{
    a("ADD_TO_OFFLINE_BUTTON_STATE_UNKNOWN", 0, 0), 
    b("ADD_TO_OFFLINE_BUTTON_STATE_DISABLED", 1, 1), 
    c("ADD_TO_OFFLINE_BUTTON_STATE_ENABLED", 2, 2);
    
    private final int e;
    
    private amut(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return amtt.d;
    }
    
    public static amut b(final int n) {
        if (n == 0) {
            return amut.a;
        }
        if (n == 1) {
            return amut.b;
        }
        if (n != 2) {
            return null;
        }
        return amut.c;
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
