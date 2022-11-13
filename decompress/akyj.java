// 
// Decompiled by Procyon v0.6.0
// 

public enum akyj implements ahbl
{
    a("CODE_DELIVERY_METHOD_UNKNOWN", 0, 0), 
    b("CODE_DELIVERY_METHOD_TEXT", 1, 1), 
    c("CODE_DELIVERY_METHOD_CALL", 2, 2);
    
    private static final akyj[] e;
    public final int d;
    
    private akyj(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return akwi.c;
    }
    
    public static akyj b(final int n) {
        if (n == 0) {
            return akyj.a;
        }
        if (n == 1) {
            return akyj.b;
        }
        if (n != 2) {
            return null;
        }
        return akyj.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
