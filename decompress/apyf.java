// 
// Decompiled by Procyon v0.6.0
// 

public enum apyf implements ahdd
{
    a("YOU_THERE_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("YOU_THERE_EVENT_TYPE_BELOW_LACT_THRESHOLD", 1, 1), 
    c("YOU_THERE_EVENT_TYPE_PROMPT_SHOWN", 2, 2), 
    d("YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN", 3, 22), 
    e("YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN_IN_DIALOG", 4, 23), 
    f("YOU_THERE_EVENT_TYPE_PLAYBACK_PAUSED", 5, 3), 
    g("YOU_THERE_EVENT_TYPE_USER_RESPONDED", 6, 4), 
    h("YOU_THERE_EVENT_TYPE_LACT_RESET", 7, 8), 
    i("YOU_THERE_EVENT_TYPE_RATE_LIMITED", 8, 14), 
    j("YOU_THERE_EVENT_TYPE_NAVIGATED_OUT", 9, 17), 
    k("YOU_THERE_EVENT_TYPE_AUTOPLAY_PAUSED", 10, 5), 
    l("YOU_THERE_EVENT_TYPE_AUTOPLAY_RESUMED", 11, 6), 
    m("YOU_THERE_EVENT_TYPE_AUTOPLAY_APP_EXIT", 12, 7), 
    n("YOU_THERE_EVENT_TYPE_AUTOPLAY_RATE_LIMITED", 13, 15), 
    o("YOU_THERE_EVENT_TYPE_AUTOPLAY_NAVIGATED_OUT", 14, 18), 
    p("YOU_THERE_EVENT_TYPE_F_AUTONAV_BELOW_LACT_THRESHOLD", 15, 9), 
    q("YOU_THERE_EVENT_TYPE_F_AUTONAV_PAUSE_ENABLED", 16, 10), 
    r("YOU_THERE_EVENT_TYPE_F_AUTONAV_PAUSE_DISABLED_BY_LACT_RESET", 17, 11), 
    s("YOU_THERE_EVENT_TYPE_F_AUTONAV_PAUSED", 18, 12), 
    t("YOU_THERE_EVENT_TYPE_F_AUTONAV_INVALID_LACT_THRESHOLD", 19, 13), 
    u("YOU_THERE_EVENT_TYPE_F_AUTONAV_RATE_LIMITED", 20, 16), 
    v("YOU_THERE_EVENT_TYPE_F_AUTONAV_NAVIGATED_OUT", 21, 19), 
    w("YOU_THERE_EVENT_TYPE_ABR_TRIGGERED", 22, 20), 
    x("YOU_THERE_EVENT_TYPE_ABR_LACT_RESET", 23, 21);
    
    private static final apyf[] z;
    public final int y;
    
    private apyf(final String s, final int n, final int y) {
        this.y = y;
    }
    
    public static ahdf a() {
        return apvm.h;
    }
    
    public static apyf b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 23: {
                return apyf.e;
            }
            case 22: {
                return apyf.d;
            }
            case 21: {
                return apyf.x;
            }
            case 20: {
                return apyf.w;
            }
            case 19: {
                return apyf.v;
            }
            case 18: {
                return apyf.o;
            }
            case 17: {
                return apyf.j;
            }
            case 16: {
                return apyf.u;
            }
            case 15: {
                return apyf.n;
            }
            case 14: {
                return apyf.i;
            }
            case 13: {
                return apyf.t;
            }
            case 12: {
                return apyf.s;
            }
            case 11: {
                return apyf.r;
            }
            case 10: {
                return apyf.q;
            }
            case 9: {
                return apyf.p;
            }
            case 8: {
                return apyf.h;
            }
            case 7: {
                return apyf.m;
            }
            case 6: {
                return apyf.l;
            }
            case 5: {
                return apyf.k;
            }
            case 4: {
                return apyf.g;
            }
            case 3: {
                return apyf.f;
            }
            case 2: {
                return apyf.c;
            }
            case 1: {
                return apyf.b;
            }
            case 0: {
                return apyf.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.y;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.y);
    }
}
