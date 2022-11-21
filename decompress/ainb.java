// 
// Decompiled by Procyon v0.6.0
// 

public enum ainb implements ahdd
{
    a("TERMINATION_EVENT_TYPE_UNSPECIFIED", 0, 0), 
    b("TERMINATION_EVENT_TYPE_RETURNED_TO_APP", 1, 1), 
    c("TERMINATION_EVENT_TYPE_OVERLAY_CLOSED", 2, 2), 
    d("TERMINATION_EVENT_TYPE_DISCOVERY_VIDEO_PLAYBACK_COMPLETED", 3, 3);
    
    private static final ainb[] f;
    public final int e;
    
    private ainb(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return aiga.u;
    }
    
    public static ainb b(final int n) {
        if (n == 0) {
            return ainb.a;
        }
        if (n == 1) {
            return ainb.b;
        }
        if (n == 2) {
            return ainb.c;
        }
        if (n != 3) {
            return null;
        }
        return ainb.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
