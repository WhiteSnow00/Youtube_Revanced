// 
// Decompiled by Procyon v0.6.0
// 

public enum apyg implements ahdd
{
    a("YOU_THERE_TRIGGER_REASON_UNKNOWN", 0, 0), 
    b("YOU_THERE_TRIGGER_REASON_1", 1, 1), 
    c("YOU_THERE_TRIGGER_REASON_2", 2, 2), 
    d("YOU_THERE_TRIGGER_REASON_3", 3, 3), 
    e("YOU_THERE_TRIGGER_REASON_4", 4, 4);
    
    private static final apyg[] g;
    public final int f;
    
    private apyg(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return apvm.i;
    }
    
    public static apyg b(final int n) {
        if (n == 0) {
            return apyg.a;
        }
        if (n == 1) {
            return apyg.b;
        }
        if (n == 2) {
            return apyg.c;
        }
        if (n == 3) {
            return apyg.d;
        }
        if (n != 4) {
            return null;
        }
        return apyg.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
