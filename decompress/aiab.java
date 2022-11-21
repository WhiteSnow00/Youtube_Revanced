// 
// Decompiled by Procyon v0.6.0
// 

public enum aiab implements ahdd
{
    a("BACKGROUND_PROMO_STYLE_TYPE_UNKNOWN", 0, 0), 
    b("BACKGROUND_PROMO_STYLE_TYPE_FULL_HEIGHT", 1, 1), 
    c("BACKGROUND_PROMO_STYLE_TYPE_CONTENT_HEIGHT", 2, 2), 
    d("BACKGROUND_PROMO_STYLE_TYPE_ADAPTIVE_FULL_HEIGHT", 3, 3), 
    e("BACKGROUND_PROMO_STYLE_TYPE_EMPTY_STATE", 4, 4), 
    f("BACKGROUND_PROMO_STYLE_TYPE_EMBEDDED_CONTAINER", 5, 5), 
    g("BACKGROUND_PROMO_STYLE_TYPE_FULL_HEIGHT_SMALL_THUMBNAIL", 6, 6);
    
    private static final aiab[] i;
    public final int h;
    
    private aiab(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahdf a() {
        return ahvv.p;
    }
    
    public static aiab b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return aiab.g;
            }
            case 5: {
                return aiab.f;
            }
            case 4: {
                return aiab.e;
            }
            case 3: {
                return aiab.d;
            }
            case 2: {
                return aiab.c;
            }
            case 1: {
                return aiab.b;
            }
            case 0: {
                return aiab.a;
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
