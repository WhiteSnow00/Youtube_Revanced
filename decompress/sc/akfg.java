// 
// Decompiled by Procyon v0.6.0
// 

public enum akfg implements ahbl
{
    a("INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN", 0, 0), 
    b("INLINE_AUDIO_CONTROL_UI_STYLE_PER_PLAYER", 1, 1), 
    c("INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED", 2, 2), 
    d("INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_WITH_CAPTION_CONTROL", 3, 3), 
    e("INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_PAUSE_AFTER_DURATION", 4, 4), 
    f("INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_REDIRECT_AFTER_DURATION", 5, 5);
    
    private static final akfg[] g;
    private final int h;
    
    private akfg(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahbn a() {
        return akeh.c;
    }
    
    public static akfg b(final int n) {
        if (n == 0) {
            return akfg.a;
        }
        if (n == 1) {
            return akfg.b;
        }
        if (n == 2) {
            return akfg.c;
        }
        if (n == 3) {
            return akfg.d;
        }
        if (n == 4) {
            return akfg.e;
        }
        if (n != 5) {
            return null;
        }
        return akfg.f;
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
