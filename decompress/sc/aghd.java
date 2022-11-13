// 
// Decompiled by Procyon v0.6.0
// 

public enum aghd implements ahbl
{
    a("NOT_ASKED", 0, 0), 
    b("PREVIOUSLY_DENIED", 1, 1), 
    c("PREVIOUSLY_GRANTED", 2, 2), 
    d("GRANTED", 3, 3), 
    e("DENIED", 4, 4);
    
    private static final aghd[] g;
    public final int f;
    
    private aghd(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static aghd a(final int n) {
        if (n == 0) {
            return aghd.a;
        }
        if (n == 1) {
            return aghd.b;
        }
        if (n == 2) {
            return aghd.c;
        }
        if (n == 3) {
            return aghd.d;
        }
        if (n != 4) {
            return null;
        }
        return aghd.e;
    }
    
    public static ahbn b() {
        return afqo.b;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
