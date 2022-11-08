// 
// Decompiled by Procyon v0.6.0
// 

public enum agfc implements agzm
{
    a("NOT_ASKED", 0, 0), 
    b("PREVIOUSLY_DENIED", 1, 1), 
    c("PREVIOUSLY_GRANTED", 2, 2), 
    d("GRANTED", 3, 3), 
    e("DENIED", 4, 4);
    
    public final int f;
    
    private agfc(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agfc a(final int n) {
        if (n == 0) {
            return agfc.a;
        }
        if (n == 1) {
            return agfc.b;
        }
        if (n == 2) {
            return agfc.c;
        }
        if (n == 3) {
            return agfc.d;
        }
        if (n != 4) {
            return null;
        }
        return agfc.e;
    }
    
    public static agzo b() {
        return afon.b;
    }
    
    @Override
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
