// 
// Decompiled by Procyon v0.6.0
// 

public enum aklb implements ahbl
{
    a("UNKNOWN_FORM_FACTOR", 0, 0), 
    b("SMALL_FORM_FACTOR", 1, 1), 
    c("LARGE_FORM_FACTOR", 2, 2), 
    d("AUTOMOTIVE_FORM_FACTOR", 3, 3), 
    e("WEARABLE_FORM_FACTOR", 4, 4);
    
    private static final aklb[] g;
    public final int f;
    
    private aklb(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return akjo.g;
    }
    
    public static aklb b(final int n) {
        if (n == 0) {
            return aklb.a;
        }
        if (n == 1) {
            return aklb.b;
        }
        if (n == 2) {
            return aklb.c;
        }
        if (n == 3) {
            return aklb.d;
        }
        if (n != 4) {
            return null;
        }
        return aklb.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
