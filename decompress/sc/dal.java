// 
// Decompiled by Procyon v0.6.0
// 

enum dal
{
    a("RESPONSE_CODE_UNSPECIFIED", 0, -999), 
    b("SERVICE_TIMEOUT", 1, -3), 
    c("FEATURE_NOT_SUPPORTED", 2, -2), 
    d("SERVICE_DISCONNECTED", 3, -1), 
    e("OK", 4, 0), 
    f("USER_CANCELED", 5, 1), 
    g("SERVICE_UNAVAILABLE", 6, 2), 
    h("BILLING_UNAVAILABLE", 7, 3), 
    i("ITEM_UNAVAILABLE", 8, 4), 
    j("DEVELOPER_ERROR", 9, 5), 
    k("ERROR", 10, 6), 
    l("ITEM_ALREADY_OWNED", 11, 7), 
    m("ITEM_NOT_OWNED", 12, 8), 
    n("EXPIRED_OFFER_TOKEN", 13, 11);
    
    public static final afev o;
    private static final dal[] p;
    private final int q;
    
    static {
        final afes h2 = afev.h();
        for (final dal dal : values()) {
            h2.g(dal.q, dal);
        }
        o = h2.c();
    }
    
    private dal(final String s, final int n, final int q) {
        this.q = q;
    }
}
