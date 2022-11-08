// 
// Decompiled by Procyon v0.6.0
// 

public enum agsq implements agzm
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
    
    public final int s;
    
    private agsq(final String s, final int n, final int s2) {
        this.s = s2;
    }
    
    public static agsq a(final int n) {
        if (n == 20) {
            return agsq.r;
        }
        switch (n) {
            default: {
                return null;
            }
            case 16: {
                return agsq.i;
            }
            case 15: {
                return agsq.q;
            }
            case 14: {
                return agsq.p;
            }
            case 13: {
                return agsq.o;
            }
            case 12: {
                return agsq.n;
            }
            case 11: {
                return agsq.m;
            }
            case 10: {
                return agsq.l;
            }
            case 9: {
                return agsq.k;
            }
            case 8: {
                return agsq.j;
            }
            case 7: {
                return agsq.h;
            }
            case 6: {
                return agsq.g;
            }
            case 5: {
                return agsq.f;
            }
            case 4: {
                return agsq.e;
            }
            case 3: {
                return agsq.d;
            }
            case 2: {
                return agsq.c;
            }
            case 1: {
                return agsq.b;
            }
            case 0: {
                return agsq.a;
            }
        }
    }
    
    public static agzo b() {
        return afon.m;
    }
    
    public final int getNumber() {
        return this.s;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.s);
    }
}
