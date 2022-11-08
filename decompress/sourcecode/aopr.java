// 
// Decompiled by Procyon v0.6.0
// 

public enum aopr implements agzm
{
    a("SCREEN_UNKNOWN", 0, 0), 
    b("SCREEN_HOME_FEED", 1, 1), 
    c("SCREEN_WATCH_PAGE", 2, 2), 
    d("SCREEN_SEARCH_PAGE", 3, 3), 
    e("SCREEN_SUBSCRIPTIONS_PAGE", 4, 4), 
    f("SCREEN_HISTORY_PAGE", 5, 5);
    
    public final int g;
    
    private aopr(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static agzo a() {
        return aonj.k;
    }
    
    public static aopr b(final int n) {
        if (n == 0) {
            return aopr.a;
        }
        if (n == 1) {
            return aopr.b;
        }
        if (n == 2) {
            return aopr.c;
        }
        if (n == 3) {
            return aopr.d;
        }
        if (n == 4) {
            return aopr.e;
        }
        if (n != 5) {
            return null;
        }
        return aopr.f;
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
