// 
// Decompiled by Procyon v0.6.0
// 

public enum akfu implements ahbl
{
    a("INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN", 0, 0), 
    b("INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_DEFAULT", 1, 1), 
    c("INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_MAXIMIZED_WATCH_ON_EXIT", 2, 2);
    
    private static final akfu[] d;
    private final int e;
    
    private akfu(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return akeh.h;
    }
    
    public static akfu b(final int n) {
        if (n == 0) {
            return akfu.a;
        }
        if (n == 1) {
            return akfu.b;
        }
        if (n != 2) {
            return null;
        }
        return akfu.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
