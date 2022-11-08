// 
// Decompiled by Procyon v0.6.0
// 

public enum aorw implements agzm
{
    a("TIME_SENSITIVITY_UNKNOWN", 0, 0), 
    b("TIME_SENSITIVITY_LATENCY_CRITICAL", 1, 1), 
    c("TIME_SENSITIVITY_FINISH_SOON", 2, 2), 
    d("TIME_SENSITIVITY_BACKGROUND", 3, 3);
    
    private final int f;
    
    private aorw(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return aonj.s;
    }
    
    public static aorw b(final int n) {
        if (n == 0) {
            return aorw.a;
        }
        if (n == 1) {
            return aorw.b;
        }
        if (n == 2) {
            return aorw.c;
        }
        if (n != 3) {
            return null;
        }
        return aorw.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
