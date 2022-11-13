// 
// Decompiled by Procyon v0.6.0
// 

public enum admt implements ahbl
{
    a("UNKNOWN_UPLOAD", 0, 0), 
    b("NORMAL_UPLOAD", 1, 1), 
    c("FEEDBACK_ONLY_UPLOAD", 2, 3), 
    d("REELS_UPLOAD", 3, 4), 
    e("LIVE_HIGHLIGHT_UPLOAD", 4, 6), 
    f("SHORTS_UPLOAD", 5, 7), 
    g("POSTS_UPLOAD", 6, 8);
    
    private static final admt[] i;
    public final int h;
    
    private admt(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static admt a(final int n) {
        if (n == 0) {
            return admt.a;
        }
        if (n == 1) {
            return admt.b;
        }
        if (n == 3) {
            return admt.c;
        }
        if (n == 4) {
            return admt.d;
        }
        if (n == 6) {
            return admt.e;
        }
        if (n == 7) {
            return admt.f;
        }
        if (n != 8) {
            return null;
        }
        return admt.g;
    }
    
    public static ahbn b() {
        return pff.q;
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
