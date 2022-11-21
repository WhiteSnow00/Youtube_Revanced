// 
// Decompiled by Procyon v0.6.0
// 

public enum ahjv implements ahdd
{
    a("ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED", 0, 0), 
    b("CLOSE", 1, 1), 
    @Deprecated
    c("SKIP_AD", 2, 2), 
    d("SKIP_AD_ON_CLOSE", 3, 3);
    
    private static final ahjv[] f;
    public final int e;
    
    private ahjv(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return ahhs.m;
    }
    
    public static ahjv b(final int n) {
        if (n == 0) {
            return ahjv.a;
        }
        if (n == 1) {
            return ahjv.b;
        }
        if (n == 2) {
            return ahjv.c;
        }
        if (n != 3) {
            return null;
        }
        return ahjv.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
