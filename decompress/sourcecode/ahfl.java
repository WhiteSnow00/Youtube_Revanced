// 
// Decompiled by Procyon v0.6.0
// 

public enum ahfl implements agzm
{
    a("UNKNOWN_COMPONENT_APPEARANCE", 0, 0), 
    b("FULLSCREEN_COMPONENT_APPEARANCE", 1, 1), 
    c("BOTTOM_SHEET_COMPONENT_APPEARANCE", 2, 2), 
    @Deprecated
    d("BOTTOM_NAV_DRAWER_COMPONENT_APPEARANCE", 3, 3), 
    e("SIDE_DRAWER_ABOVE_COMPONENT_APPEARANCE", 4, 4), 
    f("SIDE_DRAWER_SIDE_BY_SIDE_COMPONENT_APPEARANCE", 5, 5), 
    g("SIDE_DRAWER_SIDE_BY_SIDE_MINIMIZED_COMPONENT_APPEARANCE", 6, 6), 
    h("BOTTOM_DRAWER_COMPONENT_APPEARANCE", 7, 7), 
    i("POPOVER_COMPONENT_APPEARANCE", 8, 8), 
    @Deprecated
    j("POPUP_COMPONENT_APPEARANCE", 9, 9), 
    k("APP_SPECIFIC_COMPONENT_APPEARANCE", 10, 10), 
    l("CLICKABLE_SNACKBAR_COMPONENT_APPEARANCE", 11, 11), 
    m("NON_CLICKABLE_SNACKBAR_COMPONENT_APPEARANCE", 12, 12);
    
    public final int n;
    
    private ahfl(final String s, final int n, final int n2) {
        this.n = n2;
    }
    
    public static agzo a() {
        return ahec.d;
    }
    
    public static ahfl b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                return ahfl.m;
            }
            case 11: {
                return ahfl.l;
            }
            case 10: {
                return ahfl.k;
            }
            case 9: {
                return ahfl.j;
            }
            case 8: {
                return ahfl.i;
            }
            case 7: {
                return ahfl.h;
            }
            case 6: {
                return ahfl.g;
            }
            case 5: {
                return ahfl.f;
            }
            case 4: {
                return ahfl.e;
            }
            case 3: {
                return ahfl.d;
            }
            case 2: {
                return ahfl.c;
            }
            case 1: {
                return ahfl.b;
            }
            case 0: {
                return ahfl.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.n;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}
