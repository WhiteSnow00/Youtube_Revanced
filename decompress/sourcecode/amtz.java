// 
// Decompiled by Procyon v0.6.0
// 

public enum amtz implements agzm
{
    a("OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN", 0, 0), 
    b("OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE", 1, 1), 
    c("OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_IN_ORDER_DEDUPE", 2, 2), 
    d("OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE", 3, 3);
    
    public final int e;
    
    private amtz(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static amtz a(final int n) {
        if (n == 0) {
            return amtz.a;
        }
        if (n == 1) {
            return amtz.b;
        }
        if (n == 2) {
            return amtz.c;
        }
        if (n != 3) {
            return null;
        }
        return amtz.d;
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
