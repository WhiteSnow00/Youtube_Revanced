// 
// Decompiled by Procyon v0.6.0
// 

public enum aluf implements ahbl
{
    a("LIVE_ONLY_PEG_STRATEGY_UNKNOWN", 0, 0), 
    b("LIVE_ONLY_PEG_STRATEGY_DO_NOT_PEG", 1, 1), 
    c("LIVE_ONLY_PEG_STRATEGY_SEEK_ON_RESUME", 2, 3), 
    d("LIVE_ONLY_PEG_STRATEGY_SEEK_ON_REBUFFER_ESTIMATE_DURATION", 3, 6);
    
    private static final aluf[] e;
    private final int f;
    
    private aluf(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return alua.c;
    }
    
    public static aluf b(final int n) {
        if (n == 0) {
            return aluf.a;
        }
        if (n == 1) {
            return aluf.b;
        }
        if (n == 3) {
            return aluf.c;
        }
        if (n != 6) {
            return null;
        }
        return aluf.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
