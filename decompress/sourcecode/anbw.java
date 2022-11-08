// 
// Decompiled by Procyon v0.6.0
// 

public enum anbw implements agzm
{
    a("UNKNOWN", 0, 0), 
    b("OFF", 1, 1), 
    c("ON", 2, 2), 
    d("FORCED_ON", 3, 3), 
    e("ON_WEAK", 4, 4), 
    f("OFF_WEAK", 5, 5);
    
    private final int h;
    
    private anbw(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agzo a() {
        return anaf.j;
    }
    
    public static anbw b(final int n) {
        if (n == 0) {
            return anbw.a;
        }
        if (n == 1) {
            return anbw.b;
        }
        if (n == 2) {
            return anbw.c;
        }
        if (n == 3) {
            return anbw.d;
        }
        if (n == 4) {
            return anbw.e;
        }
        if (n != 5) {
            return null;
        }
        return anbw.f;
    }
    
    @Override
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
