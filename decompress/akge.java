// 
// Decompiled by Procyon v0.6.0
// 

public enum akge implements ahbl
{
    a("INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN", 0, 0), 
    b("INLINE_PLAYBACK_TRIGGER_STYLE_USER", 1, 1);
    
    private static final akge[] c;
    private final int d;
    
    private akge(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return akeh.k;
    }
    
    public static akge b(final int n) {
        if (n == 0) {
            return akge.a;
        }
        if (n != 1) {
            return null;
        }
        return akge.b;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
