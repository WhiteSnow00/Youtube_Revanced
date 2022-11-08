// 
// Decompiled by Procyon v0.6.0
// 

public enum aheb implements agzm
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
    
    private final int r;
    
    private aheb(final String s, final int n, final int r) {
        this.r = r;
    }
    
    public static agzo a() {
        return agvo.u;
    }
    
    public static aheb b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 14: {
                return aheb.o;
            }
            case 13: {
                return aheb.n;
            }
            case 12: {
                return aheb.m;
            }
            case 11: {
                return aheb.l;
            }
            case 10: {
                return aheb.k;
            }
            case 9: {
                return aheb.j;
            }
            case 8: {
                return aheb.i;
            }
            case 7: {
                return aheb.h;
            }
            case 6: {
                return aheb.g;
            }
            case 5: {
                return aheb.f;
            }
            case 4: {
                return aheb.e;
            }
            case 3: {
                return aheb.d;
            }
            case 2: {
                return aheb.c;
            }
            case 1: {
                return aheb.b;
            }
            case 0: {
                return aheb.a;
            }
        }
    }
    
    public final int getNumber() {
        if (this != aheb.p) {
            return this.r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
