// 
// Decompiled by Procyon v0.6.0
// 

public enum apjh implements agzm
{
    a("TEXT_STICKER_FONT_STYLE_UNKNOWN", 0, 0), 
    b("TEXT_STICKER_FONT_STYLE_ROBOTO", 1, 1), 
    c("TEXT_STICKER_FONT_STYLE_QUICK_SAND_REGULAR", 2, 2), 
    d("TEXT_STICKER_FONT_STYLE_OSWALD_BOLD", 3, 3), 
    e("TEXT_STICKER_FONT_STYLE_PERMANENT_MARKER", 4, 4), 
    f("TEXT_STICKER_FONT_STYLE_TEXT_PACIFICO", 5, 5), 
    g("TEXT_STICKER_FONT_STYLE_TEXT_CUTIVE", 6, 6);
    
    public final int h;
    
    private apjh(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agzo a() {
        return apjd.i;
    }
    
    public static apjh b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return apjh.g;
            }
            case 5: {
                return apjh.f;
            }
            case 4: {
                return apjh.e;
            }
            case 3: {
                return apjh.d;
            }
            case 2: {
                return apjh.c;
            }
            case 1: {
                return apjh.b;
            }
            case 0: {
                return apjh.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
