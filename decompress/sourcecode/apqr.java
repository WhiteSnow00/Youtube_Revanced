// 
// Decompiled by Procyon v0.6.0
// 

public enum apqr implements agzm
{
    a("PLAYER_PLAYBACK_STATE_UNKNOWN", 0, 0), 
    b("PLAYER_PLAYBACK_STATE_PLAYING", 1, 1), 
    c("PLAYER_PLAYBACK_STATE_PAUSED", 2, 2), 
    d("PLAYER_PLAYBACK_STATE_BUFFERING", 3, 3), 
    e("PLAYER_PLAYBACK_STATE_PAUSED_BUFFERING", 4, 4), 
    f("PLAYER_PLAYBACK_STATE_SEEKING", 5, 5), 
    g("PLAYER_PLAYBACK_STATE_ENDED", 6, 6), 
    h("PLAYER_PLAYBACK_STATE_ERROR", 7, 7), 
    i("PLAYER_PLAYBACK_STATE_SUSPENDED", 8, 8), 
    j("PLAYER_PLAYBACK_STATE_UNSTARTED", 9, 9);
    
    public final int k;
    
    private apqr(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static agzo a() {
        return apms.u;
    }
    
    public static apqr b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 9: {
                return apqr.j;
            }
            case 8: {
                return apqr.i;
            }
            case 7: {
                return apqr.h;
            }
            case 6: {
                return apqr.g;
            }
            case 5: {
                return apqr.f;
            }
            case 4: {
                return apqr.e;
            }
            case 3: {
                return apqr.d;
            }
            case 2: {
                return apqr.c;
            }
            case 1: {
                return apqr.b;
            }
            case 0: {
                return apqr.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.k;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}
