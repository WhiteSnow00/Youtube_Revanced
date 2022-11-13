// 
// Decompiled by Procyon v0.6.0
// 

public enum aowy implements ahbl
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
    
    private static final aowy[] j;
    public final int i;
    
    private aowy(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static ahbn a() {
        return aove.i;
    }
    
    public static aowy b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return aowy.h;
            }
            case 6: {
                return aowy.g;
            }
            case 5: {
                return aowy.f;
            }
            case 4: {
                return aowy.e;
            }
            case 3: {
                return aowy.d;
            }
            case 2: {
                return aowy.c;
            }
            case 1: {
                return aowy.b;
            }
            case 0: {
                return aowy.a;
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
