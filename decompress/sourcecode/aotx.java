// 
// Decompiled by Procyon v0.6.0
// 

public enum aotx implements agzm
{
    a("TRANSCRIPT_SEARCH_STATE_VALUE_UNKNOWN", 0, 0), 
    b("TRANSCRIPT_SEARCH_STATE_VALUE_NOT_SEARCHING", 1, 1), 
    c("TRANSCRIPT_SEARCH_STATE_VALUE_SEARCHING", 2, 2), 
    d("TRANSCRIPT_SEARCH_STATE_VALUE_COMPLETE", 3, 3), 
    e("TRANSCRIPT_SEARCH_STATE_VALUE_FAILED", 4, 4);
    
    public final int f;
    
    private aotx(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return aotc.g;
    }
    
    public static aotx b(final int n) {
        if (n == 0) {
            return aotx.a;
        }
        if (n == 1) {
            return aotx.b;
        }
        if (n == 2) {
            return aotx.c;
        }
        if (n == 3) {
            return aotx.d;
        }
        if (n != 4) {
            return null;
        }
        return aotx.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
