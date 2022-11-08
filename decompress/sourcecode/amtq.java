// 
// Decompiled by Procyon v0.6.0
// 

public enum amtq implements agzm
{
    a("ACTION_UNKNOWN", 0, 0), 
    b("ACTION_ADD", 1, 1), 
    c("ACTION_REMOVE", 2, 2), 
    d("ACTION_REMOVE_WITH_PROMPT", 3, 9), 
    e("ACTION_PAUSE", 4, 3), 
    f("ACTION_RETRY", 5, 4), 
    g("ACTION_RESUME", 6, 5), 
    @Deprecated
    h("ACTION_DOWNLOAD_IMMEDIATELY", 7, 6), 
    i("ACTION_REDOWNLOAD", 8, 7), 
    j("ACTION_RENEW", 9, 8), 
    k("ACTION_RENEW_WITH_PROMPT", 10, 10), 
    l("ACTION_INFER_AUTOMATICALLY", 11, 11);
    
    public final int m;
    
    private amtq(final String s, final int n, final int m) {
        this.m = m;
    }
    
    public static agzo a() {
        return amtt.b;
    }
    
    public static amtq b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return amtq.l;
            }
            case 10: {
                return amtq.k;
            }
            case 9: {
                return amtq.d;
            }
            case 8: {
                return amtq.j;
            }
            case 7: {
                return amtq.i;
            }
            case 6: {
                return amtq.h;
            }
            case 5: {
                return amtq.g;
            }
            case 4: {
                return amtq.f;
            }
            case 3: {
                return amtq.e;
            }
            case 2: {
                return amtq.c;
            }
            case 1: {
                return amtq.b;
            }
            case 0: {
                return amtq.a;
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
