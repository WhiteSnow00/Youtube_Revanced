// 
// Decompiled by Procyon v0.6.0
// 

public enum ajdo implements ahbl
{
    a("UNKNOWN_TYPE", 0, 0), 
    b("INTERACTION_LOGGING", 1, 1), 
    c("GENERIC_EVENT_LOGGING", 2, 2), 
    d("GENERIC_EVENT_LOGGING_RETRY", 3, 3), 
    e("KIDS_VIDEO_REPORTING", 4, 4), 
    f("NOTIFICATION_REGISTRATION", 5, 5), 
    g("ATTESTATION", 6, 6);
    
    private static final ajdo[] i;
    public final int h;
    
    private ajdo(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahbn a() {
        return airy.s;
    }
    
    public static ajdo b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return ajdo.g;
            }
            case 5: {
                return ajdo.f;
            }
            case 4: {
                return ajdo.e;
            }
            case 3: {
                return ajdo.d;
            }
            case 2: {
                return ajdo.c;
            }
            case 1: {
                return ajdo.b;
            }
            case 0: {
                return ajdo.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
