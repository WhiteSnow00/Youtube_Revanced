// 
// Decompiled by Procyon v0.6.0
// 

public enum anpg implements ahbl
{
    a("PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN", 0, 0), 
    b("PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_NOOP", 1, 1), 
    c("PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE", 2, 2), 
    d("PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_OPEN_APP_INSTALL", 3, 3), 
    e("PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_OPEN_CHANNEL", 4, 4);
    
    private static final anpg[] f;
    private final int g;
    
    private anpg(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahbn a() {
        return anic.u;
    }
    
    public static anpg b(final int n) {
        if (n == 0) {
            return anpg.a;
        }
        if (n == 1) {
            return anpg.b;
        }
        if (n == 2) {
            return anpg.c;
        }
        if (n == 3) {
            return anpg.d;
        }
        if (n != 4) {
            return null;
        }
        return anpg.e;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
