// 
// Decompiled by Procyon v0.6.0
// 

public enum ajde implements ahbl
{
    a("PLAYBACK_CONTEXT_TYPE_UNKNOWN", 0, 0), 
    b("PLAYBACK_CONTEXT_TYPE_WATCH", 1, 1), 
    c("PLAYBACK_CONTEXT_TYPE_INLINE", 2, 2);
    
    private static final ajde[] d;
    private final int e;
    
    private ajde(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return airy.r;
    }
    
    public static ajde b(final int n) {
        if (n == 0) {
            return ajde.a;
        }
        if (n == 1) {
            return ajde.b;
        }
        if (n != 2) {
            return null;
        }
        return ajde.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
