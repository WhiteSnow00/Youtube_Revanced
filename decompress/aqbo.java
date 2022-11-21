// 
// Decompiled by Procyon v0.6.0
// 

public enum aqbo implements ahdd
{
    a("PLAYLIST_THUMBNAIL_STYLE_UNKNOWN", 0, 0), 
    b("PLAYLIST_THUMBNAIL_STYLE_FIRST_VIDEO", 1, 1), 
    c("PLAYLIST_THUMBNAIL_STYLE_TWO_BY_TWO", 2, 2), 
    d("PLAYLIST_THUMBNAIL_STYLE_ONE_AND_TWO_AVATAR", 3, 3), 
    e("PLAYLIST_THUMBNAIL_STYLE_ONE_AND_TWO", 4, 4);
    
    private static final aqbo[] g;
    public final int f;
    
    private aqbo(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return apvm.p;
    }
    
    public static aqbo b(final int n) {
        if (n == 0) {
            return aqbo.a;
        }
        if (n == 1) {
            return aqbo.b;
        }
        if (n == 2) {
            return aqbo.c;
        }
        if (n == 3) {
            return aqbo.d;
        }
        if (n != 4) {
            return null;
        }
        return aqbo.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
