// 
// Decompiled by Procyon v0.6.0
// 

public enum agup implements ahbl
{
    a("OK", 0, 0), 
    b("CANCELLED", 1, 1), 
    c("UNKNOWN", 2, 2), 
    d("INVALID_ARGUMENT", 3, 3), 
    e("DEADLINE_EXCEEDED", 4, 4), 
    f("NOT_FOUND", 5, 5), 
    g("ALREADY_EXISTS", 6, 6), 
    h("PERMISSION_DENIED", 7, 7), 
    i("UNAUTHENTICATED", 8, 16), 
    j("RESOURCE_EXHAUSTED", 9, 8), 
    k("FAILED_PRECONDITION", 10, 9), 
    l("ABORTED", 11, 10), 
    m("OUT_OF_RANGE", 12, 11), 
    n("UNIMPLEMENTED", 13, 12), 
    o("INTERNAL", 14, 13), 
    p("UNAVAILABLE", 15, 14), 
    q("DATA_LOSS", 16, 15), 
    r("DO_NOT_USE_RESERVED_FOR_FUTURE_EXPANSION_USE_DEFAULT_IN_SWITCH_INSTEAD_", 17, 20);
    
    private static final agup[] t;
    public final int s;
    
    private agup(final String s, final int n, final int s2) {
        this.s = s2;
    }
    
    public static agup a(final int n) {
        if (n == 20) {
            return agup.r;
        }
        switch (n) {
            default: {
                return null;
            }
            case 16: {
                return agup.i;
            }
            case 15: {
                return agup.q;
            }
            case 14: {
                return agup.p;
            }
            case 13: {
                return agup.o;
            }
            case 12: {
                return agup.n;
            }
            case 11: {
                return agup.m;
            }
            case 10: {
                return agup.l;
            }
            case 9: {
                return agup.k;
            }
            case 8: {
                return agup.j;
            }
            case 7: {
                return agup.h;
            }
            case 6: {
                return agup.g;
            }
            case 5: {
                return agup.f;
            }
            case 4: {
                return agup.e;
            }
            case 3: {
                return agup.d;
            }
            case 2: {
                return agup.c;
            }
            case 1: {
                return agup.b;
            }
            case 0: {
                return agup.a;
            }
        }
    }
    
    public static ahbn b() {
        return afqo.m;
    }
    
    public final int getNumber() {
        return this.s;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.s);
    }
}
