// 
// Decompiled by Procyon v0.6.0
// 

public enum amsx implements agzm
{
    a("OFFLINE_REFRESH_ACTION_UNKNOWN", 0, 0), 
    b("OFFLINE_REFRESH_ACTION_REFRESH_PLAYER_RESPONSE", 1, 1), 
    c("OFFLINE_REFRESH_ACTION_REFRESH_ADS", 2, 2), 
    d("OFFLINE_REFRESH_ACTION_DELETE_ADS", 3, 3), 
    e("OFFLINE_REFRESH_ACTION_REFRESH_STREAMS", 4, 4), 
    f("OFFLINE_REFRESH_ACTION_REFRESH_METADATA", 5, 5), 
    g("OFFLINE_REFRESH_ACTION_REFRESH_STORYBOARDS", 6, 6);
    
    public final int h;
    
    private amsx(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agzo a() {
        return amsc.n;
    }
    
    public static amsx b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return amsx.g;
            }
            case 5: {
                return amsx.f;
            }
            case 4: {
                return amsx.e;
            }
            case 3: {
                return amsx.d;
            }
            case 2: {
                return amsx.c;
            }
            case 1: {
                return amsx.b;
            }
            case 0: {
                return amsx.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
