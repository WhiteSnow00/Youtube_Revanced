// 
// Decompiled by Procyon v0.6.0
// 

public enum aegc implements agzm
{
    a("OWNER_USER_TYPE_UNKNOWN", 0, 0), 
    b("GOOGLE_USER", 1, 1), 
    c("GPLUS_USER", 2, 2), 
    d("GPLUS_DISABLED_BY_ADMIN", 3, 3), 
    e("GOOGLE_APPS_USER", 4, 4), 
    f("GOOGLE_APPS_SELF_MANAGED_USER", 5, 5), 
    g("GOOGLE_FAMILY_USER", 6, 6), 
    h("GOOGLE_FAMILY_CHILD_USER", 7, 7), 
    i("GOOGLE_APPS_ADMIN_DISABLED", 8, 9), 
    j("GOOGLE_ONE_USER", 9, 10), 
    k("GOOGLE_FAMILY_CONVERTED_CHILD_USER", 10, 11);
    
    private final int m;
    
    private aegc(final String s, final int n, final int m) {
        this.m = m;
    }
    
    public static aegc a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return aegc.k;
            }
            case 10: {
                return aegc.j;
            }
            case 9: {
                return aegc.i;
            }
            case 7: {
                return aegc.h;
            }
            case 6: {
                return aegc.g;
            }
            case 5: {
                return aegc.f;
            }
            case 4: {
                return aegc.e;
            }
            case 3: {
                return aegc.d;
            }
            case 2: {
                return aegc.c;
            }
            case 1: {
                return aegc.b;
            }
            case 0: {
                return aegc.a;
            }
        }
    }
    
    public static agzo b() {
        return pdu.u;
    }
    
    @Override
    public final int getNumber() {
        return this.m;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}
