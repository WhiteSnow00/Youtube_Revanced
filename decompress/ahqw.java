// 
// Decompiled by Procyon v0.6.0
// 

public enum ahqw implements ahdd
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
    
    private static final ahqw[] u;
    public final int t;
    
    private ahqw(final String s, final int n, final int t) {
        this.t = t;
    }
    
    public static ahdf a() {
        return ahqv.c;
    }
    
    public static ahqw b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 18: {
                return ahqw.s;
            }
            case 17: {
                return ahqw.r;
            }
            case 16: {
                return ahqw.q;
            }
            case 15: {
                return ahqw.d;
            }
            case 14: {
                return ahqw.c;
            }
            case 13: {
                return ahqw.p;
            }
            case 12: {
                return ahqw.o;
            }
            case 11: {
                return ahqw.n;
            }
            case 10: {
                return ahqw.m;
            }
            case 9: {
                return ahqw.l;
            }
            case 8: {
                return ahqw.k;
            }
            case 7: {
                return ahqw.j;
            }
            case 6: {
                return ahqw.i;
            }
            case 5: {
                return ahqw.h;
            }
            case 4: {
                return ahqw.g;
            }
            case 3: {
                return ahqw.f;
            }
            case 2: {
                return ahqw.e;
            }
            case 1: {
                return ahqw.b;
            }
            case 0: {
                return ahqw.a;
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
