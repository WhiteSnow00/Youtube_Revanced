// 
// Decompiled by Procyon v0.6.0
// 

public enum ahnh implements agzm
{
    a("SLOT_TYPE_UNSPECIFIED", 0, 0), 
    b("SLOT_TYPE_PLAYER_BYTES", 1, 1), 
    c("SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM", 2, 14), 
    d("SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER", 3, 15), 
    e("SLOT_TYPE_BELOW_PLAYER", 4, 2), 
    f("SLOT_TYPE_IN_PLAYER", 5, 3), 
    g("SLOT_TYPE_FORECASTING", 6, 4), 
    h("SLOT_TYPE_FULLSCREEN_ENGAGEMENT", 7, 5), 
    i("SLOT_TYPE_ABOVE_FEED", 8, 6), 
    j("SLOT_TYPE_LOCKSCREEN", 9, 7), 
    k("SLOT_TYPE_FIXED_FOOTER", 10, 8), 
    l("SLOT_TYPE_BELOW_PLAYER_IMMERSIVE", 11, 9), 
    m("SLOT_TYPE_AD_BREAK_REQUEST", 12, 10), 
    n("SLOT_TYPE_PLAYBACK_TRACKING", 13, 11), 
    o("SLOT_TYPE_IN_FEED", 14, 12), 
    p("SLOT_TYPE_PAGE_TOP", 15, 13), 
    q("SLOT_TYPE_ADS_WATCH_NEXT_REQUEST", 16, 16), 
    r("SLOT_TYPE_PLAYER_UNDERLAY", 17, 17), 
    s("SLOT_TYPE_EXTERNAL_YT_APP_OVERLAY", 18, 18);
    
    public final int t;
    
    private ahnh(final String s, final int n, final int t) {
        this.t = t;
    }
    
    public static agzo a() {
        return ahng.c;
    }
    
    public static ahnh b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 18: {
                return ahnh.s;
            }
            case 17: {
                return ahnh.r;
            }
            case 16: {
                return ahnh.q;
            }
            case 15: {
                return ahnh.d;
            }
            case 14: {
                return ahnh.c;
            }
            case 13: {
                return ahnh.p;
            }
            case 12: {
                return ahnh.o;
            }
            case 11: {
                return ahnh.n;
            }
            case 10: {
                return ahnh.m;
            }
            case 9: {
                return ahnh.l;
            }
            case 8: {
                return ahnh.k;
            }
            case 7: {
                return ahnh.j;
            }
            case 6: {
                return ahnh.i;
            }
            case 5: {
                return ahnh.h;
            }
            case 4: {
                return ahnh.g;
            }
            case 3: {
                return ahnh.f;
            }
            case 2: {
                return ahnh.e;
            }
            case 1: {
                return ahnh.b;
            }
            case 0: {
                return ahnh.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.t;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.t);
    }
}
