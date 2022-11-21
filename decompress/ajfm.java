// 
// Decompiled by Procyon v0.6.0
// 

public enum ajfm implements ahdd
{
    a("UNKNOWN_TYPE", 0, 0), 
    b("INTERACTION_LOGGING", 1, 1), 
    c("GENERIC_EVENT_LOGGING", 2, 2), 
    d("GENERIC_EVENT_LOGGING_RETRY", 3, 3), 
    e("KIDS_VIDEO_REPORTING", 4, 4), 
    f("NOTIFICATION_REGISTRATION", 5, 5), 
    g("ATTESTATION", 6, 6);
    
    private static final ajfm[] i;
    public final int h;
    
    private ajfm(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahdf a() {
        return aitw.s;
    }
    
    public static ajfm b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return ajfm.g;
            }
            case 5: {
                return ajfm.f;
            }
            case 4: {
                return ajfm.e;
            }
            case 3: {
                return ajfm.d;
            }
            case 2: {
                return ajfm.c;
            }
            case 1: {
                return ajfm.b;
            }
            case 0: {
                return ajfm.a;
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
