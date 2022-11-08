// 
// Decompiled by Procyon v0.6.0
// 

public enum aocs implements agzm
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
    
    public final int w;
    
    private aocs(final String s, final int n, final int w) {
        this.w = w;
    }
    
    public static agzo a() {
        return aocr.a;
    }
    
    public static aocs b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 21: {
                return aocs.v;
            }
            case 20: {
                return aocs.u;
            }
            case 19: {
                return aocs.q;
            }
            case 18: {
                return aocs.t;
            }
            case 17: {
                return aocs.s;
            }
            case 16: {
                return aocs.r;
            }
            case 15: {
                return aocs.p;
            }
            case 14: {
                return aocs.o;
            }
            case 13: {
                return aocs.n;
            }
            case 12: {
                return aocs.m;
            }
            case 11: {
                return aocs.l;
            }
            case 10: {
                return aocs.k;
            }
            case 9: {
                return aocs.j;
            }
            case 8: {
                return aocs.i;
            }
            case 7: {
                return aocs.h;
            }
            case 6: {
                return aocs.g;
            }
            case 5: {
                return aocs.f;
            }
            case 4: {
                return aocs.e;
            }
            case 3: {
                return aocs.d;
            }
            case 2: {
                return aocs.c;
            }
            case 1: {
                return aocs.b;
            }
            case 0: {
                return aocs.a;
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
