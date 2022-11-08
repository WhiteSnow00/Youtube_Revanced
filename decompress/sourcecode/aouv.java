// 
// Decompiled by Procyon v0.6.0
// 

public enum aouv implements agzm
{
    a("TRANSFER_STATE_UNKNOWN", 0, 0), 
    b("TRANSFER_STATE_TRANSFER_IN_QUEUE", 1, 1), 
    @Deprecated
    c("TRANSFER_STATE_PRE_TRANSFER", 2, 2), 
    d("TRANSFER_STATE_TRANSFERRING", 3, 3), 
    e("TRANSFER_STATE_PAUSED_BY_USER", 4, 4), 
    f("TRANSFER_STATE_FAILED", 5, 5), 
    g("TRANSFER_STATE_COMPLETE", 6, 6), 
    h("TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH", 7, 7);
    
    public final int i;
    
    private aouv(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static agzo a() {
        return aotc.h;
    }
    
    public static aouv b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return aouv.h;
            }
            case 6: {
                return aouv.g;
            }
            case 5: {
                return aouv.f;
            }
            case 4: {
                return aouv.e;
            }
            case 3: {
                return aouv.d;
            }
            case 2: {
                return aouv.c;
            }
            case 1: {
                return aouv.b;
            }
            case 0: {
                return aouv.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}
