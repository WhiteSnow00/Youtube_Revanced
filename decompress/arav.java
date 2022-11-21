// 
// Decompiled by Procyon v0.6.0
// 

public enum arav implements ahdd
{
    a("CHANNEL_MENTION_STYLE_UNSPECIFIED", 0, 0), 
    b("CHANNEL_MENTION_NORMAL", 1, 1), 
    c("CHANNEL_MENTION_LIGHT", 2, 2);
    
    private static final arav[] e;
    public final int d;
    
    private arav(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return aqym.h;
    }
    
    public static arav b(final int n) {
        if (n == 0) {
            return arav.a;
        }
        if (n == 1) {
            return arav.b;
        }
        if (n != 2) {
            return null;
        }
        return arav.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
