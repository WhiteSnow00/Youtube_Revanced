// 
// Decompiled by Procyon v0.6.0
// 

public enum anpe implements ahbl
{
    a("PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN", 0, 0), 
    b("PROMOTED_SPARKLES_CLICK_LOCATION_TITLE", 1, 1), 
    c("PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE", 2, 2), 
    d("PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL", 3, 3), 
    e("PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION", 4, 4), 
    f("PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL", 5, 5), 
    g("PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND", 6, 6), 
    h("PROMOTED_SPARKLES_CLICK_LOCATION_BORDER", 7, 7), 
    i("PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND", 8, 14), 
    j("PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE", 9, 8), 
    k("PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING", 10, 9), 
    l("PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE", 11, 10), 
    m("PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_APP_STORE", 12, 11), 
    n("PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_ADVERTISER", 13, 12), 
    o("PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_PRICE", 14, 13), 
    p("PROMOTED_SPARKLES_CLICK_LOCATION_CUSTOM_BADGE", 15, 15), 
    q("PROMOTED_SPARKLES_CLICK_LOCATION_CAROUSEL_CARD_TITLE", 16, 16), 
    r("PROMOTED_SPARKLES_CLICK_LOCATION_CAROUSEL_CARD_THUMBNAIL", 17, 17), 
    s("PROMOTED_SPARKLES_CLICK_LOCATION_CAROUSEL_CARD_ACTION_LABEL", 18, 18), 
    t("PROMOTED_SPARKLES_CLICK_LOCATION_CAROUSEL_CARD_BACKGROUND", 19, 19), 
    u("PROMOTED_SPARKLES_CLICK_LOCATION_ADVERTISER_AD_ICON", 20, 20), 
    v("PROMOTED_SPARKLES_CLICK_LOCATION_TALKBACK_ACTIVATED", 21, 21), 
    w("PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL_TALKBACK_ACTIVATED", 22, 22), 
    x("PROMOTED_SPARKLES_CLICK_LOCATION_SITELINK", 23, 23), 
    y("PROMOTED_SPARKLES_CLICK_LOCATION_STAR_RATING", 24, 24);
    
    private static final anpe[] z;
    private final int A;
    
    private anpe(final String s, final int n, final int a) {
        this.A = a;
    }
    
    public static ahbn a() {
        return anic.s;
    }
    
    public static anpe b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 24: {
                return anpe.y;
            }
            case 23: {
                return anpe.x;
            }
            case 22: {
                return anpe.w;
            }
            case 21: {
                return anpe.v;
            }
            case 20: {
                return anpe.u;
            }
            case 19: {
                return anpe.t;
            }
            case 18: {
                return anpe.s;
            }
            case 17: {
                return anpe.r;
            }
            case 16: {
                return anpe.q;
            }
            case 15: {
                return anpe.p;
            }
            case 14: {
                return anpe.i;
            }
            case 13: {
                return anpe.o;
            }
            case 12: {
                return anpe.n;
            }
            case 11: {
                return anpe.m;
            }
            case 10: {
                return anpe.l;
            }
            case 9: {
                return anpe.k;
            }
            case 8: {
                return anpe.j;
            }
            case 7: {
                return anpe.h;
            }
            case 6: {
                return anpe.g;
            }
            case 5: {
                return anpe.f;
            }
            case 4: {
                return anpe.e;
            }
            case 3: {
                return anpe.d;
            }
            case 2: {
                return anpe.c;
            }
            case 1: {
                return anpe.b;
            }
            case 0: {
                return anpe.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.A;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.A);
    }
}
