// 
// Decompiled by Procyon v0.6.0
// 

public enum anpf implements ahbl
{
    a("PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN", 0, 0), 
    b("PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_NOOP", 1, 1), 
    c("PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE", 2, 2), 
    d("PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_OPEN_ACTION_WEBSITE_URL", 3, 3), 
    e("PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_OPEN_CHANNEL", 4, 4);
    
    private static final anpf[] f;
    private final int g;
    
    private anpf(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahbn a() {
        return anic.t;
    }
    
    public static anpf b(final int n) {
        if (n == 0) {
            return anpf.a;
        }
        if (n == 1) {
            return anpf.b;
        }
        if (n == 2) {
            return anpf.c;
        }
        if (n == 3) {
            return anpf.d;
        }
        if (n != 4) {
            return null;
        }
        return anpf.e;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
