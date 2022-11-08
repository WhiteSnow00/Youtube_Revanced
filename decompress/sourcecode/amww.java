// 
// Decompiled by Procyon v0.6.0
// 

public enum amww implements agzm
{
    a("PARTICIPANT_JOIN_STATE_UNKNOWN", 0, 0), 
    b("PARTICIPANT_JOIN_STATE_PREJOIN", 1, 1), 
    c("PARTICIPANT_JOIN_STATE_WAITING", 2, 2), 
    d("PARTICIPANT_JOIN_STATE_REFUSED", 3, 3), 
    e("PARTICIPANT_JOIN_STATE_APPROVED", 4, 4), 
    f("PARTICIPANT_JOIN_STATE_PRE_CHANNEL_CREATION", 5, 5), 
    g("PARTICIPANT_JOIN_STATE_SIGNED_OUT", 6, 6), 
    h("PARTICIPANT_JOIN_STATE_WAITING_STATE_TIMEOUT", 7, 7), 
    i("PARTICIPANT_JOIN_STATE_JOIN_STARTING_STATE_TIMEOUT", 8, 8), 
    j("PARTICIPANT_JOIN_STATE_FULL_CONFERENCE", 9, 9), 
    k("PARTICIPANT_JOIN_STATE_CONFERENCE_ENDED", 10, 10), 
    l("PARTICIPANT_JOIN_STATE_ERROR", 11, 11);
    
    public final int m;
    
    private amww(final String s, final int n, final int m) {
        this.m = m;
    }
    
    public static agzo a() {
        return amtt.h;
    }
    
    public static amww b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return amww.l;
            }
            case 10: {
                return amww.k;
            }
            case 9: {
                return amww.j;
            }
            case 8: {
                return amww.i;
            }
            case 7: {
                return amww.h;
            }
            case 6: {
                return amww.g;
            }
            case 5: {
                return amww.f;
            }
            case 4: {
                return amww.e;
            }
            case 3: {
                return amww.d;
            }
            case 2: {
                return amww.c;
            }
            case 1: {
                return amww.b;
            }
            case 0: {
                return amww.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.m;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}
