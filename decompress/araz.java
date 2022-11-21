// 
// Decompiled by Procyon v0.6.0
// 

public enum araz implements ahdd
{
    a("COMMENT_STICKER_SOURCE_UNKNOWN", 0, 0), 
    b("COMMENT_STICKER_SOURCE_STORY_COMMENTS", 1, 1), 
    c("COMMENT_STICKER_SOURCE_VOD_COMMENTS", 2, 2), 
    d("COMMENT_STICKER_SOURCE_STORY_CAMERA", 3, 3), 
    e("COMMENT_STICKER_SOURCE_SHORT_COMMENTS", 4, 4);
    
    private static final araz[] g;
    public final int f;
    
    private araz(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return aqym.i;
    }
    
    public static araz b(final int n) {
        if (n == 0) {
            return araz.a;
        }
        if (n == 1) {
            return araz.b;
        }
        if (n == 2) {
            return araz.c;
        }
        if (n == 3) {
            return araz.d;
        }
        if (n != 4) {
            return null;
        }
        return araz.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
