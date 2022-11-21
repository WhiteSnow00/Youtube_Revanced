// 
// Decompiled by Procyon v0.6.0
// 

public enum aohq implements ahdd
{
    a("SHORTS_FIRST_BOUNCE_COUNT_RESET_REASON_UNKNOWN", 0, 0), 
    b("SHORTS_FIRST_BOUNCE_COUNT_RESET_REASON_SWIPED_NEXT", 1, 1), 
    c("SHORTS_FIRST_BOUNCE_COUNT_RESET_REASON_PIVOT", 2, 2), 
    d("SHORTS_FIRST_BOUNCE_COUNT_RESET_REASON_SHORTS_TAB_TIME", 3, 3);
    
    private static final aohq[] f;
    public final int e;
    
    private aohq(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return aoha.i;
    }
    
    public static aohq b(final int n) {
        if (n == 0) {
            return aohq.a;
        }
        if (n == 1) {
            return aohq.b;
        }
        if (n == 2) {
            return aohq.c;
        }
        if (n != 3) {
            return null;
        }
        return aohq.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
