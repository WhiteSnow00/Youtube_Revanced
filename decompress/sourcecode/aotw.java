// 
// Decompiled by Procyon v0.6.0
// 

public enum aotw implements agzm
{
    a("TRANSCRIPT_AUTO_SCROLL_TRIGGER_VALUE_UNKNOWN", 0, 0), 
    b("TRANSCRIPT_AUTO_SCROLL_TRIGGER_VALUE_START", 1, 1), 
    c("TRANSCRIPT_AUTO_SCROLL_TRIGGER_VALUE_RESTART", 2, 2), 
    d("TRANSCRIPT_AUTO_SCROLL_TRIGGER_VALUE_STOP", 3, 3);
    
    private final int f;
    
    private aotw(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return aotc.f;
    }
    
    public static aotw b(final int n) {
        if (n == 0) {
            return aotw.a;
        }
        if (n == 1) {
            return aotw.b;
        }
        if (n == 2) {
            return aotw.c;
        }
        if (n != 3) {
            return null;
        }
        return aotw.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
