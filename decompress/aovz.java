// 
// Decompiled by Procyon v0.6.0
// 

public enum aovz implements ahbl
{
    a("TRANSCRIPT_AUTO_SCROLL_TRIGGER_VALUE_UNKNOWN", 0, 0), 
    b("TRANSCRIPT_AUTO_SCROLL_TRIGGER_VALUE_START", 1, 1), 
    c("TRANSCRIPT_AUTO_SCROLL_TRIGGER_VALUE_RESTART", 2, 2), 
    d("TRANSCRIPT_AUTO_SCROLL_TRIGGER_VALUE_STOP", 3, 3);
    
    private static final aovz[] e;
    private final int f;
    
    private aovz(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return aove.g;
    }
    
    public static aovz b(final int n) {
        if (n == 0) {
            return aovz.a;
        }
        if (n == 1) {
            return aovz.b;
        }
        if (n == 2) {
            return aovz.c;
        }
        if (n != 3) {
            return null;
        }
        return aovz.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
