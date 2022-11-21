// 
// Decompiled by Procyon v0.6.0
// 

public enum ahlw implements ahdd
{
    a("REGISTERED_GAIA_SERVICES_UNSPECIFIED", 0, 0), 
    b("REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT", 1, 1), 
    c("REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU", 2, 2), 
    d("REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA", 3, 3), 
    e("REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT", 4, 4), 
    f("REGISTERED_GAIA_SERVICES_IS_YOUTUBE_CHANNEL_ACCOUNT", 5, 5), 
    g("REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY", 6, 6), 
    h("UNRECOGNIZED", 7, -1);
    
    private static final ahlw[] i;
    private final int j;
    
    private ahlw(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static ahdf a() {
        return ahld.d;
    }
    
    public static ahlw b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return ahlw.g;
            }
            case 5: {
                return ahlw.f;
            }
            case 4: {
                return ahlw.e;
            }
            case 3: {
                return ahlw.d;
            }
            case 2: {
                return ahlw.c;
            }
            case 1: {
                return ahlw.b;
            }
            case 0: {
                return ahlw.a;
            }
        }
    }
    
    public final int getNumber() {
        if (this != ahlw.h) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
