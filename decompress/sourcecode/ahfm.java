// 
// Decompiled by Procyon v0.6.0
// 

public enum ahfm implements agzm
{
    a("UNKNOWN_COMPONENT", 0, 0), 
    b("ACCOUNT_MENU_COMPONENT", 1, 1), 
    @Deprecated
    c("SIDE_NAV_COMPONENT", 2, 2), 
    d("SETTINGS_MENU_COMPONENT", 3, 3), 
    e("ACCOUNT_MANAGEMENT_MENU_COMPONENT", 4, 4), 
    f("STANDALONE_ACCOUNT_MENU_COMPONENT", 5, 5), 
    g("NAV_WITH_ACCOUNT_MENU_COMPONENT", 6, 6), 
    h("NAV_WITHOUT_ACCOUNT_MENU_COMPONENT", 7, 7), 
    i("ACCOUNT_PARTICLE_DISC_COMPONENT", 8, 8), 
    j("EXPRESS_SIGN_IN_COMPONENT", 9, 9), 
    k("ACCOUNT_PARTICLE_COMPONENT", 10, 10), 
    l("DEFAULT_ACCOUNT_SELECTION_COMPONENT", 11, 11), 
    m("ACCOUNT_SNACKBAR_COMPONENT", 12, 12), 
    n("COLLAPSED_EMBEDDED_ACCOUNT_MENU_HEADER", 13, 13), 
    o("COLLAPSIBLE_ACCOUNT_MENU_MESPACE", 14, 14), 
    p("OBAKE_ENTRY_POINT_COMPONENT", 15, 15), 
    q("ADD_OR_REMOVE_ACCOUNTS_MENU_COMPONENT", 16, 16), 
    r("OBAKE_EDUCATION_COMPONENT", 17, 17), 
    s("INCOGNITO_LONG_PRESS_EDUCATION_COMPONENT", 18, 18), 
    t("APD_EDUCATION_COMPONENT", 19, 19);
    
    public final int u;
    
    private ahfm(final String s, final int n, final int u) {
        this.u = u;
    }
    
    public static agzo a() {
        return ahec.e;
    }
    
    public static ahfm b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 19: {
                return ahfm.t;
            }
            case 18: {
                return ahfm.s;
            }
            case 17: {
                return ahfm.r;
            }
            case 16: {
                return ahfm.q;
            }
            case 15: {
                return ahfm.p;
            }
            case 14: {
                return ahfm.o;
            }
            case 13: {
                return ahfm.n;
            }
            case 12: {
                return ahfm.m;
            }
            case 11: {
                return ahfm.l;
            }
            case 10: {
                return ahfm.k;
            }
            case 9: {
                return ahfm.j;
            }
            case 8: {
                return ahfm.i;
            }
            case 7: {
                return ahfm.h;
            }
            case 6: {
                return ahfm.g;
            }
            case 5: {
                return ahfm.f;
            }
            case 4: {
                return ahfm.e;
            }
            case 3: {
                return ahfm.d;
            }
            case 2: {
                return ahfm.c;
            }
            case 1: {
                return ahfm.b;
            }
            case 0: {
                return ahfm.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.u;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.u);
    }
}
