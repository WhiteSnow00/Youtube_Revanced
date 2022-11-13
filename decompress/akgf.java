// 
// Decompiled by Procyon v0.6.0
// 

public enum akgf implements ahbl
{
    a("INLINE_SCRUBBING_UI_STYLE_UNKNOWN", 0, 0), 
    b("INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER", 1, 1), 
    c("INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD", 2, 2), 
    d("INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD_PEEK_ONLY", 3, 3), 
    e("INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_ENHANCED_STORYBOARDCARD_PEEK_ONLY", 4, 4), 
    f("INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_FULLSIZE_STORYBOARDCARD", 5, 5), 
    g("INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD_LIFTED", 6, 6), 
    h("INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD_FULL_LOCKUP", 7, 7);
    
    private static final akgf[] i;
    private final int j;
    
    private akgf(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static ahbn a() {
        return akeh.l;
    }
    
    public static akgf b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return akgf.h;
            }
            case 6: {
                return akgf.g;
            }
            case 5: {
                return akgf.f;
            }
            case 4: {
                return akgf.e;
            }
            case 3: {
                return akgf.d;
            }
            case 2: {
                return akgf.c;
            }
            case 1: {
                return akgf.b;
            }
            case 0: {
                return akgf.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.j;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}
