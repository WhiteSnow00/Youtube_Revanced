// 
// Decompiled by Procyon v0.6.0
// 

public enum ajfc implements ahdd
{
    a("PLAYBACK_CONTEXT_TYPE_UNKNOWN", 0, 0), 
    b("PLAYBACK_CONTEXT_TYPE_WATCH", 1, 1), 
    c("PLAYBACK_CONTEXT_TYPE_INLINE", 2, 2);
    
    private static final ajfc[] d;
    private final int e;
    
    private ajfc(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return aitw.r;
    }
    
    public static ajfc b(final int n) {
        if (n == 0) {
            return ajfc.a;
        }
        if (n == 1) {
            return ajfc.b;
        }
        if (n != 2) {
            return null;
        }
        return ajfc.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
