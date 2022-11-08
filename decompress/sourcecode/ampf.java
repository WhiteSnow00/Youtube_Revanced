// 
// Decompiled by Procyon v0.6.0
// 

public enum ampf implements agzm
{
    a("NOTAIRE_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("NOTAIRE_EVENT_TYPE_BITMAP_FETCH_STARTED", 1, 1), 
    c("NOTAIRE_EVENT_TYPE_BITMAP_FETCH_FINISHED", 2, 2), 
    d("NOTAIRE_EVENT_TYPE_COMMANDS_EXECUTED", 3, 3), 
    e("NOTAIRE_EVENT_TYPE_ERROR_RAISED", 4, 4), 
    f("NOTAIRE_EVENT_TYPE_IDENTITY_DID_NOT_MATCH", 5, 5), 
    g("NOTAIRE_EVENT_TYPE_IDENTITY_MISSING", 6, 6), 
    h("NOTAIRE_EVENT_TYPE_NOTIFICATION_BUILDING_STARTED", 7, 7), 
    i("NOTAIRE_EVENT_TYPE_NOTIFICATION_DID_NOT_BUILD", 8, 8), 
    j("NOTAIRE_EVENT_TYPE_NOTIFICATION_POSTED", 9, 9), 
    k("NOTAIRE_EVENT_TYPE_NOTIFICATION_OS_SETTINGS_DISABLED", 10, 16), 
    l("NOTAIRE_EVENT_TYPE_NOTIFICATION_SETTINGS_DISABLED", 11, 10), 
    m("NOTAIRE_EVENT_TYPE_PAYLOAD_NOT_VALID_1", 12, 11), 
    n("NOTAIRE_EVENT_TYPE_PAYLOAD_NOT_VALID_2", 13, 12), 
    o("NOTAIRE_EVENT_TYPE_PAYLOAD_PROCESSING_STARTED", 14, 13), 
    p("NOTAIRE_EVENT_TYPE_PAYLOAD_RECEIVED", 15, 14), 
    q("NOTAIRE_EVENT_TYPE_USER_SIGNED_OUT", 16, 15);
    
    public final int r;
    
    private ampf(final String s, final int n, final int r) {
        this.r = r;
    }
    
    public static agzo a() {
        return amom.e;
    }
    
    public static ampf b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 16: {
                return ampf.k;
            }
            case 15: {
                return ampf.q;
            }
            case 14: {
                return ampf.p;
            }
            case 13: {
                return ampf.o;
            }
            case 12: {
                return ampf.n;
            }
            case 11: {
                return ampf.m;
            }
            case 10: {
                return ampf.l;
            }
            case 9: {
                return ampf.j;
            }
            case 8: {
                return ampf.i;
            }
            case 7: {
                return ampf.h;
            }
            case 6: {
                return ampf.g;
            }
            case 5: {
                return ampf.f;
            }
            case 4: {
                return ampf.e;
            }
            case 3: {
                return ampf.d;
            }
            case 2: {
                return ampf.c;
            }
            case 1: {
                return ampf.b;
            }
            case 0: {
                return ampf.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.r;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.r);
    }
}
