// 
// Decompiled by Procyon v0.6.0
// 

public enum ahhr implements ahdd
{
    a("STATE_UNKNOWN", 0, 0), 
    b("STATE_START", 1, 1), 
    c("STATE_ACCOUNT_SELECTION", 2, 2), 
    d("STATE_PROVIDER_CONSENT", 3, 3), 
    e("STATE_ACCOUNT_CREATION", 4, 4), 
    f("STATE_APP_AUTH", 5, 5), 
    g("STATE_ADD_PHONE", 6, 6), 
    h("STATE_VERIFY_PHONE", 7, 7), 
    i("STATE_VERIFY_PHONE_FAIL", 8, 8), 
    j("STATE_COMPLETE", 9, 9), 
    k("STATE_ERROR", 10, 10), 
    l("STATE_INFO_DIALOG", 11, 11), 
    m("STATE_APP_FLIP", 12, 12), 
    n("STATE_LINKING_INFO", 13, 13), 
    o("STATE_USAGE_NOTICE", 14, 14), 
    p("UNRECOGNIZED", 15, -1);
    
    private static final ahhr[] q;
    private final int r;
    
    private ahhr(final String s, final int n, final int r) {
        this.r = r;
    }
    
    public static ahdf a() {
        return agzf.u;
    }
    
    public static ahhr b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 14: {
                return ahhr.o;
            }
            case 13: {
                return ahhr.n;
            }
            case 12: {
                return ahhr.m;
            }
            case 11: {
                return ahhr.l;
            }
            case 10: {
                return ahhr.k;
            }
            case 9: {
                return ahhr.j;
            }
            case 8: {
                return ahhr.i;
            }
            case 7: {
                return ahhr.h;
            }
            case 6: {
                return ahhr.g;
            }
            case 5: {
                return ahhr.f;
            }
            case 4: {
                return ahhr.e;
            }
            case 3: {
                return ahhr.d;
            }
            case 2: {
                return ahhr.c;
            }
            case 1: {
                return ahhr.b;
            }
            case 0: {
                return ahhr.a;
            }
        }
    }
    
    public final int getNumber() {
        if (this != ahhr.p) {
            return this.r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
