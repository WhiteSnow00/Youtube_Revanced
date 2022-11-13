// 
// Decompiled by Procyon v0.6.0
// 

public enum akby implements ahbl
{
    a("HOME_SIGNAL_UNKNOWN", 0, 0), 
    b("HOME_SIGNAL_FIRST_INLINE_PLAYBACK_STARTED", 1, 1);
    
    private static final akby[] c;
    private final int d;
    
    private akby(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
