// 
// Decompiled by Procyon v0.6.0
// 

public enum akan implements ahbl
{
    a("HANDOFF_FEATURE_TYPE_UNKNOWN", 0, 0), 
    b("HANDOFF_FEATURE_TYPE_YTV_LR_PURCHASE", 1, 1), 
    c("HANDOFF_FEATURE_TYPE_YTC_LR_PURCHASE", 2, 2), 
    @Deprecated
    d("HANDOFF_FEATURE_TYPE_ALC_TWO_FACTOR_LOCATION", 3, 3), 
    e("HANDOFF_FEATURE_TYPE_OTT_TWOFACTOR_LOCATION", 4, 6), 
    f("HANDOFF_FEATURE_TYPE_CALL_TO_ACTION", 5, 4), 
    g("HANDOFF_FEATURE_TYPE_LR_AUTOCONNECT", 6, 5), 
    h("HANDOFF_FEATURE_TYPE_YTV_LR_FAMILY_SHARING", 7, 7), 
    i("HANDOFF_FEATURE_TYPE_YTV_LR_REFER_FRIENDS", 8, 8), 
    j("HANDOFF_FEATURE_TYPE_LR_COMMENTS", 9, 9), 
    k("HANDOFF_FEATURE_TYPE_LR_ALWAYS_AUTOCONNECT", 10, 10);
    
    private static final akan[] m;
    public final int l;
    
    private akan(final String s, final int n, final int l) {
        this.l = l;
    }
    
    public static ahbn a() {
        return ajym.f;
    }
    
    public static akan b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 10: {
                return akan.k;
            }
            case 9: {
                return akan.j;
            }
            case 8: {
                return akan.i;
            }
            case 7: {
                return akan.h;
            }
            case 6: {
                return akan.e;
            }
            case 5: {
                return akan.g;
            }
            case 4: {
                return akan.f;
            }
            case 3: {
                return akan.d;
            }
            case 2: {
                return akan.c;
            }
            case 1: {
                return akan.b;
            }
            case 0: {
                return akan.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.l;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}
