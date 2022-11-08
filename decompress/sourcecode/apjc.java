// 
// Decompiled by Procyon v0.6.0
// 

public enum apjc implements agzm
{
    a("COMMENT_STICKER_SOURCE_UNKNOWN", 0, 0), 
    b("COMMENT_STICKER_SOURCE_STORY_COMMENTS", 1, 1), 
    c("COMMENT_STICKER_SOURCE_VOD_COMMENTS", 2, 2), 
    d("COMMENT_STICKER_SOURCE_STORY_CAMERA", 3, 3), 
    e("COMMENT_STICKER_SOURCE_SHORT_COMMENTS", 4, 4);
    
    public final int f;
    
    private apjc(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return apjd.b;
    }
    
    public static apjc b(final int n) {
        if (n == 0) {
            return apjc.a;
        }
        if (n == 1) {
            return apjc.b;
        }
        if (n == 2) {
            return apjc.c;
        }
        if (n == 3) {
            return apjc.d;
        }
        if (n != 4) {
            return null;
        }
        return apjc.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
