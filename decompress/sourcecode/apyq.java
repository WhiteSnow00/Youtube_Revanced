// 
// Decompiled by Procyon v0.6.0
// 

public enum apyq implements agzm
{
    a("CUE_RANGE_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("CUE_RANGE_EVENT_TYPE_ENTER", 1, 1), 
    c("CUE_RANGE_EVENT_TYPE_EXIT", 2, 2);
    
    public final int d;
    
    private apyq(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return apsc.t;
    }
    
    public static apyq b(final int n) {
        if (n == 0) {
            return apyq.a;
        }
        if (n == 1) {
            return apyq.b;
        }
        if (n != 2) {
            return null;
        }
        return apyq.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
