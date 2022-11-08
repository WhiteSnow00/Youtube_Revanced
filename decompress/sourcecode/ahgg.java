// 
// Decompiled by Procyon v0.6.0
// 

public enum ahgg implements agzm
{
    a("ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED", 0, 0), 
    b("CLOSE", 1, 1), 
    @Deprecated
    c("SKIP_AD", 2, 2), 
    d("SKIP_AD_ON_CLOSE", 3, 3);
    
    public final int e;
    
    private ahgg(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return ahec.m;
    }
    
    public static ahgg b(final int n) {
        if (n == 0) {
            return ahgg.a;
        }
        if (n == 1) {
            return ahgg.b;
        }
        if (n == 2) {
            return ahgg.c;
        }
        if (n != 3) {
            return null;
        }
        return ahgg.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
