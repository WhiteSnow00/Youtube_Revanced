// 
// Decompiled by Procyon v0.6.0
// 

public enum apyh implements agzm
{
    a("ACTION_TYPE_UNKNOWN", 0, 0), 
    b("ACTION_TYPE_RETRY", 1, 1), 
    c("ACTION_TYPE_GIVE_UP", 2, 2), 
    d("ACTION_TYPE_PASS_THROUGH_ERROR", 3, 3);
    
    public final int e;
    
    private apyh(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return apsc.s;
    }
    
    public static apyh b(final int n) {
        if (n == 0) {
            return apyh.a;
        }
        if (n == 1) {
            return apyh.b;
        }
        if (n == 2) {
            return apyh.c;
        }
        if (n != 3) {
            return null;
        }
        return apyh.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
