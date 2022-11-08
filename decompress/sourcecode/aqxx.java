// 
// Decompiled by Procyon v0.6.0
// 

public enum aqxx implements agzm
{
    a("TOUCH_STATE_UNSPECIFIED", 0, 0), 
    b("START", 1, 1), 
    c("MOVE", 2, 2), 
    d("END", 3, 3), 
    e("CANCEL", 4, 4);
    
    public final int f;
    
    private aqxx(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return aqtg.q;
    }
    
    public static aqxx b(final int n) {
        if (n == 0) {
            return aqxx.a;
        }
        if (n == 1) {
            return aqxx.b;
        }
        if (n == 2) {
            return aqxx.c;
        }
        if (n == 3) {
            return aqxx.d;
        }
        if (n != 4) {
            return null;
        }
        return aqxx.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
