// 
// Decompiled by Procyon v0.6.0
// 

public enum apjg implements agzm
{
    a("TEXT_STICKER_FONT_NAME_UNKNOWN", 0, 0), 
    b("TEXT_STICKER_FONT_NAME_CLASSIC", 1, 1), 
    c("TEXT_STICKER_FONT_NAME_LIGHT", 2, 2), 
    d("TEXT_STICKER_FONT_NAME_HEAVY", 3, 3), 
    e("TEXT_STICKER_FONT_NAME_MARKER", 4, 4), 
    f("TEXT_STICKER_FONT_NAME_BRUSH", 5, 5), 
    g("TEXT_STICKER_FONT_NAME_TYPEWRITER", 6, 6);
    
    public final int h;
    
    private apjg(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agzo a() {
        return apjd.h;
    }
    
    public static apjg b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return apjg.g;
            }
            case 5: {
                return apjg.f;
            }
            case 4: {
                return apjg.e;
            }
            case 3: {
                return apjg.d;
            }
            case 2: {
                return apjg.c;
            }
            case 1: {
                return apjg.b;
            }
            case 0: {
                return apjg.a;
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
