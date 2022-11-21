// 
// Decompiled by Procyon v0.6.0
// 

public enum aiml implements ahdd
{
    a("STYLE_UNKNOWN", 0, 0), 
    b("STYLE_DEFAULT", 1, 1), 
    c("STYLE_PRIMARY", 2, 2), 
    d("STYLE_SECONDARY", 3, 3), 
    e("STYLE_LARGE_SECONDARY", 4, 16), 
    f("STYLE_LARGE_TRANSLUCENT_AND_SELECTED_WHITE", 5, 10), 
    g("STYLE_RELATED", 6, 4), 
    h("STYLE_INLINE_SURVEY_CHECKBOX", 7, 5), 
    i("STYLE_HOME_FILTER", 8, 6), 
    j("STYLE_HOME_FILTER_ATTRIBUTE", 9, 7), 
    k("STYLE_PREMIUM_CHIP", 10, 8), 
    l("STYLE_SEARCH_FILTER_CHIP", 11, 9), 
    m("STYLE_SHORTS_CHIP", 12, 11), 
    n("STYLE_EXPLORE_LAUNCHER_CHIP", 13, 12), 
    o("STYLE_REFRESH_TO_NOVEL_CHIP", 14, 13), 
    p("STYLE_TRANSPARENT", 15, 14), 
    q("STYLE_LARGE_BLACK_AND_SELECTED_WHITE", 16, 15), 
    r("STYLE_PLAYER_PAGE_MDX_CHIP", 17, 17);
    
    private static final aiml[] t;
    public final int s;
    
    private aiml(final String s, final int n, final int s2) {
        this.s = s2;
    }
    
    public static ahdf a() {
        return aiga.r;
    }
    
    public static aiml b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 17: {
                return aiml.r;
            }
            case 16: {
                return aiml.e;
            }
            case 15: {
                return aiml.q;
            }
            case 14: {
                return aiml.p;
            }
            case 13: {
                return aiml.o;
            }
            case 12: {
                return aiml.n;
            }
            case 11: {
                return aiml.m;
            }
            case 10: {
                return aiml.f;
            }
            case 9: {
                return aiml.l;
            }
            case 8: {
                return aiml.k;
            }
            case 7: {
                return aiml.j;
            }
            case 6: {
                return aiml.i;
            }
            case 5: {
                return aiml.h;
            }
            case 4: {
                return aiml.g;
            }
            case 3: {
                return aiml.d;
            }
            case 2: {
                return aiml.c;
            }
            case 1: {
                return aiml.b;
            }
            case 0: {
                return aiml.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.s;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.s);
    }
}
