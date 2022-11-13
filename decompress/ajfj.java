// 
// Decompiled by Procyon v0.6.0
// 

public enum ajfj implements ahbl
{
    a("SPAN_ID_UNKNOWN", 0, 0), 
    b("SPAN_ID_ANDROID_MAIN_COLD_HOME_START", 1, 1), 
    c("SPAN_ID_ANDROID_MAIN_HOME_PAGE_SCROLL", 2, 2);
    
    private static final ajfj[] e;
    public final int d;
    
    private ajfj(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return ajek.e;
    }
    
    public static ajfj b(final int n) {
        if (n == 0) {
            return ajfj.a;
        }
        if (n == 1) {
            return ajfj.b;
        }
        if (n != 2) {
            return null;
        }
        return ajfj.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
