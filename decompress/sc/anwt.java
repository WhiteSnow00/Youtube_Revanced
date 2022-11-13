// 
// Decompiled by Procyon v0.6.0
// 

public enum anwt implements ahbl
{
    a("SCROLL_ORIENTATION_UNKNOWN", 0, 0), 
    b("SCROLL_ORIENTATION_HORIZONTAL", 1, 1), 
    c("SCROLL_ORIENTATION_VERTICAL", 2, 2);
    
    private static final anwt[] e;
    public final int d;
    
    private anwt(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return anxd.b;
    }
    
    public static anwt b(final int n) {
        if (n == 0) {
            return anwt.a;
        }
        if (n == 1) {
            return anwt.b;
        }
        if (n != 2) {
            return null;
        }
        return anwt.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
