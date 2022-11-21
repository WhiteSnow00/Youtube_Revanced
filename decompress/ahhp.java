// 
// Decompiled by Procyon v0.6.0
// 

public enum ahhp implements ahdd
{
    a("ENVIRONMENT_UNKNOWN", 0, 0), 
    b("ENVIRONMENT_PROD", 1, 1), 
    c("ENVIRONMENT_STAGING", 2, 2), 
    d("ENVIRONMENT_TEST_STAGING", 3, 3), 
    e("ENVIRONMENT_AUTOPUSH", 4, 4), 
    f("ENVIRONMENT_TEST_AUTOPUSH", 5, 5), 
    g("ENVIRONMENT_TEST", 6, 6), 
    h("UNRECOGNIZED", 7, -1);
    
    private static final ahhp[] i;
    private final int j;
    
    private ahhp(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static ahdf a() {
        return agzf.t;
    }
    
    public static ahhp b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return ahhp.g;
            }
            case 5: {
                return ahhp.f;
            }
            case 4: {
                return ahhp.e;
            }
            case 3: {
                return ahhp.d;
            }
            case 2: {
                return ahhp.c;
            }
            case 1: {
                return ahhp.b;
            }
            case 0: {
                return ahhp.a;
            }
        }
    }
    
    public final int getNumber() {
        if (this != ahhp.h) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
