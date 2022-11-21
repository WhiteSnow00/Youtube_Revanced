// 
// Decompiled by Procyon v0.6.0
// 

public enum ahja implements ahdd
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
    
    private static final ahja[] o;
    public final int n;
    
    private ahja(final String s, final int n, final int n2) {
        this.n = n2;
    }
    
    public static ahdf a() {
        return ahhs.d;
    }
    
    public static ahja b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                return ahja.m;
            }
            case 11: {
                return ahja.l;
            }
            case 10: {
                return ahja.k;
            }
            case 9: {
                return ahja.j;
            }
            case 8: {
                return ahja.i;
            }
            case 7: {
                return ahja.h;
            }
            case 6: {
                return ahja.g;
            }
            case 5: {
                return ahja.f;
            }
            case 4: {
                return ahja.e;
            }
            case 3: {
                return ahja.d;
            }
            case 2: {
                return ahja.c;
            }
            case 1: {
                return ahja.b;
            }
            case 0: {
                return ahja.a;
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
