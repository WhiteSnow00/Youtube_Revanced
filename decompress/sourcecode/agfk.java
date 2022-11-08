// 
// Decompiled by Procyon v0.6.0
// 

public enum agfk implements agzm
{
    a("LEFT_BY_UNKNOWN", 0, 0), 
    b("DISMISS_BUTTON", 1, 1), 
    c("BACK", 2, 2), 
    d("SHOP_BUTTON", 3, 3), 
    e("CLIENT_APP_SENT_DISMISS", 4, 4), 
    f("APP_TERMINATED", 5, 5);
    
    public final int g;
    
    private agfk(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static agfk a(final int n) {
        if (n == 0) {
            return agfk.a;
        }
        if (n == 1) {
            return agfk.b;
        }
        if (n == 2) {
            return agfk.c;
        }
        if (n == 3) {
            return agfk.d;
        }
        if (n == 4) {
            return agfk.e;
        }
        if (n != 5) {
            return null;
        }
        return agfk.f;
    }
    
    public static agzo b() {
        return afon.c;
    }
    
    @Override
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
