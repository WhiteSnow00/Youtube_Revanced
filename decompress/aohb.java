// 
// Decompiled by Procyon v0.6.0
// 

public enum aohb implements ahdd
{
    a("SHORTS_CREATION_SURFACE_UNKNOWN", 0, 0), 
    b("SHORTS_CREATION_SURFACE_VOD_WATCH_PAGE", 1, 1), 
    c("SHORTS_CREATION_SURFACE_PIVOT", 2, 2), 
    @Deprecated
    d("SHORTS_CREATION_SURFACE_GLOBAL", 3, 3), 
    e("SHORTS_CREATION_SURFACE_SHORTS_PLAYER", 4, 4), 
    f("SHORTS_CREATION_SURFACE_SHORTS_SHELF", 5, 5), 
    g("SHORTS_CREATION_SURFACE_ZERO_STATE_UPLOADS", 6, 6), 
    h("SHORTS_CREATION_SURFACE_BOTTOM_SHEET_CAMERA", 7, 7), 
    i("SHORTS_CREATION_SURFACE_BOTTOM_SHEET_UPLOAD", 8, 8), 
    j("SHORTS_CREATION_SURFACE_DEEP_LINKS", 9, 9), 
    k("SHORTS_CREATION_SURFACE_PROMO", 10, 10), 
    l("SHORTS_CREATION_SURFACE_HASHTAG_PIVOT", 11, 11), 
    @Deprecated
    m("SHORTS_CREATION_SURFACE_MULTIMIX_SOUND", 12, 12), 
    @Deprecated
    n("SHORTS_CREATION_SURFACE_MULTIMIX_COLLAB", 13, 13), 
    @Deprecated
    o("SHORTS_CREATION_SURFACE_MULTIMIX_GREEN_SCREEN", 14, 14), 
    @Deprecated
    p("SHORTS_CREATION_SURFACE_MULTIMIX_SPLICE", 15, 15), 
    @Deprecated
    q("SHORTS_CREATION_SURFACE_MULTIMIX_VOD_IMPORT", 16, 19), 
    r("SHORTS_CREATION_SURFACE_CLIP_IMPORT", 17, 16), 
    s("SHORTS_CREATION_SURFACE_SEARCH_RESULT_3_DOT_MENU", 18, 17), 
    t("SHORTS_CREATION_SURFACE_SAVED_SOUNDS_PLAYLIST", 19, 18), 
    u("SHORTS_CREATION_SURFACE_COMMENT", 20, 20), 
    v("SHORTS_CREATION_SURFACE_HOME_3_DOT_MENU", 21, 21);
    
    private static final aohb[] x;
    public final int w;
    
    private aohb(final String s, final int n, final int w) {
        this.w = w;
    }
    
    public static ahdf a() {
        return aoha.c;
    }
    
    public static aohb b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 21: {
                return aohb.v;
            }
            case 20: {
                return aohb.u;
            }
            case 19: {
                return aohb.q;
            }
            case 18: {
                return aohb.t;
            }
            case 17: {
                return aohb.s;
            }
            case 16: {
                return aohb.r;
            }
            case 15: {
                return aohb.p;
            }
            case 14: {
                return aohb.o;
            }
            case 13: {
                return aohb.n;
            }
            case 12: {
                return aohb.m;
            }
            case 11: {
                return aohb.l;
            }
            case 10: {
                return aohb.k;
            }
            case 9: {
                return aohb.j;
            }
            case 8: {
                return aohb.i;
            }
            case 7: {
                return aohb.h;
            }
            case 6: {
                return aohb.g;
            }
            case 5: {
                return aohb.f;
            }
            case 4: {
                return aohb.e;
            }
            case 3: {
                return aohb.d;
            }
            case 2: {
                return aohb.c;
            }
            case 1: {
                return aohb.b;
            }
            case 0: {
                return aohb.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.w;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.w);
    }
}
