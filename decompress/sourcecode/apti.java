// 
// Decompiled by Procyon v0.6.0
// 

public enum apti implements agzm
{
    a("YOU_THERE_TRIGGER_REASON_UNKNOWN", 0, 0), 
    b("YOU_THERE_TRIGGER_REASON_1", 1, 1), 
    c("YOU_THERE_TRIGGER_REASON_2", 2, 2), 
    d("YOU_THERE_TRIGGER_REASON_3", 3, 3), 
    e("YOU_THERE_TRIGGER_REASON_4", 4, 4);
    
    public final int f;
    
    private apti(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return apsc.g;
    }
    
    public static apti b(final int n) {
        if (n == 0) {
            return apti.a;
        }
        if (n == 1) {
            return apti.b;
        }
        if (n == 2) {
            return apti.c;
        }
        if (n == 3) {
            return apti.d;
        }
        if (n != 4) {
            return null;
        }
        return apti.e;
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
