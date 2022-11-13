// 
// Decompiled by Procyon v0.6.0
// 

public enum aowa implements ahbl
{
    a("TRANSCRIPT_SEARCH_STATE_VALUE_UNKNOWN", 0, 0), 
    b("TRANSCRIPT_SEARCH_STATE_VALUE_NOT_SEARCHING", 1, 1), 
    c("TRANSCRIPT_SEARCH_STATE_VALUE_SEARCHING", 2, 2), 
    d("TRANSCRIPT_SEARCH_STATE_VALUE_COMPLETE", 3, 3), 
    e("TRANSCRIPT_SEARCH_STATE_VALUE_FAILED", 4, 4);
    
    private static final aowa[] g;
    public final int f;
    
    private aowa(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return aove.h;
    }
    
    public static aowa b(final int n) {
        if (n == 0) {
            return aowa.a;
        }
        if (n == 1) {
            return aowa.b;
        }
        if (n == 2) {
            return aowa.c;
        }
        if (n == 3) {
            return aowa.d;
        }
        if (n != 4) {
            return null;
        }
        return aowa.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
