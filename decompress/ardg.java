// 
// Decompiled by Procyon v0.6.0
// 

public enum ardg implements ahdd
{
    a("TOUCH_STATE_UNSPECIFIED", 0, 0), 
    b("START", 1, 1), 
    c("MOVE", 2, 2), 
    d("END", 3, 3), 
    e("CANCEL", 4, 4);
    
    private static final ardg[] g;
    public final int f;
    
    private ardg(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return aqym.s;
    }
    
    public static ardg b(final int n) {
        if (n == 0) {
            return ardg.a;
        }
        if (n == 1) {
            return ardg.b;
        }
        if (n == 2) {
            return ardg.c;
        }
        if (n == 3) {
            return ardg.d;
        }
        if (n != 4) {
            return null;
        }
        return ardg.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
