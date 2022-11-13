// 
// Decompiled by Procyon v0.6.0
// 

public enum aral implements ahbl
{
    a("TOUCH_STATE_UNSPECIFIED", 0, 0), 
    b("START", 1, 1), 
    c("MOVE", 2, 2), 
    d("END", 3, 3), 
    e("CANCEL", 4, 4);
    
    private static final aral[] g;
    public final int f;
    
    private aral(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return aqvs.r;
    }
    
    public static aral b(final int n) {
        if (n == 0) {
            return aral.a;
        }
        if (n == 1) {
            return aral.b;
        }
        if (n == 2) {
            return aral.c;
        }
        if (n == 3) {
            return aral.d;
        }
        if (n != 4) {
            return null;
        }
        return aral.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
