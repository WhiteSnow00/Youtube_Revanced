// 
// Decompiled by Procyon v0.6.0
// 

public enum ajnm implements ahbl
{
    a("EMBEDS_AD_BREAK_TYPE_UNKNOWN", 0, 0), 
    b("EMBEDS_AD_BREAK_TYPE_PRE_ROLL", 1, 1), 
    c("EMBEDS_AD_BREAK_TYPE_MID_ROLL", 2, 2), 
    d("EMBEDS_AD_BREAK_TYPE_POST_ROLL", 3, 3);
    
    private static final ajnm[] f;
    public final int e;
    
    private ajnm(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return ajmw.d;
    }
    
    public static ajnm b(final int n) {
        if (n == 0) {
            return ajnm.a;
        }
        if (n == 1) {
            return ajnm.b;
        }
        if (n == 2) {
            return ajnm.c;
        }
        if (n != 3) {
            return null;
        }
        return ajnm.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
