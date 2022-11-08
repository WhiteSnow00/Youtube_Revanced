// 
// Decompiled by Procyon v0.6.0
// 

public enum ahdz implements agzm
{
    a("ENVIRONMENT_UNKNOWN", 0, 0), 
    b("ENVIRONMENT_PROD", 1, 1), 
    c("ENVIRONMENT_STAGING", 2, 2), 
    d("ENVIRONMENT_TEST_STAGING", 3, 3), 
    e("ENVIRONMENT_AUTOPUSH", 4, 4), 
    f("ENVIRONMENT_TEST_AUTOPUSH", 5, 5), 
    g("ENVIRONMENT_TEST", 6, 6), 
    h("UNRECOGNIZED", 7, -1);
    
    private final int j;
    
    private ahdz(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static agzo a() {
        return agvo.t;
    }
    
    public static ahdz b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return ahdz.g;
            }
            case 5: {
                return ahdz.f;
            }
            case 4: {
                return ahdz.e;
            }
            case 3: {
                return ahdz.d;
            }
            case 2: {
                return ahdz.c;
            }
            case 1: {
                return ahdz.b;
            }
            case 0: {
                return ahdz.a;
            }
        }
    }
    
    public final int getNumber() {
        if (this != ahdz.h) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
