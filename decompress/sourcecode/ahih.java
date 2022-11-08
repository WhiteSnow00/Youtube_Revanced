// 
// Decompiled by Procyon v0.6.0
// 

public enum ahih implements agzm
{
    a("REGISTERED_GAIA_SERVICES_UNSPECIFIED", 0, 0), 
    b("REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT", 1, 1), 
    c("REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU", 2, 2), 
    d("REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA", 3, 3), 
    e("REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT", 4, 4), 
    f("REGISTERED_GAIA_SERVICES_IS_YOUTUBE_CHANNEL_ACCOUNT", 5, 5), 
    g("REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY", 6, 6), 
    h("UNRECOGNIZED", 7, -1);
    
    private final int j;
    
    private ahih(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static agzo a() {
        return ahho.d;
    }
    
    public static ahih b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return ahih.g;
            }
            case 5: {
                return ahih.f;
            }
            case 4: {
                return ahih.e;
            }
            case 3: {
                return ahih.d;
            }
            case 2: {
                return ahih.c;
            }
            case 1: {
                return ahih.b;
            }
            case 0: {
                return ahih.a;
            }
        }
    }
    
    public final int getNumber() {
        if (this != ahih.h) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
