// 
// Decompiled by Procyon v0.6.0
// 

public enum aghl implements ahbl
{
    a("LEFT_BY_UNKNOWN", 0, 0), 
    b("DISMISS_BUTTON", 1, 1), 
    c("BACK", 2, 2), 
    d("SHOP_BUTTON", 3, 3), 
    e("CLIENT_APP_SENT_DISMISS", 4, 4), 
    f("APP_TERMINATED", 5, 5);
    
    private static final aghl[] h;
    public final int g;
    
    private aghl(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static aghl a(final int n) {
        if (n == 0) {
            return aghl.a;
        }
        if (n == 1) {
            return aghl.b;
        }
        if (n == 2) {
            return aghl.c;
        }
        if (n == 3) {
            return aghl.d;
        }
        if (n == 4) {
            return aghl.e;
        }
        if (n != 5) {
            return null;
        }
        return aghl.f;
    }
    
    public static ahbn b() {
        return afqo.c;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
