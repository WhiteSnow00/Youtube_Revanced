// 
// Decompiled by Procyon v0.6.0
// 

public enum ajnn implements ahbl
{
    a("EMBEDS_AD_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("EMBEDS_AD_EVENT_TYPE_AD_STARTED", 1, 1), 
    c("EMBEDS_AD_EVENT_TYPE_AD_COMPLETED", 2, 2), 
    d("EMBEDS_AD_EVENT_TYPE_AD_SKIPPED", 3, 3), 
    e("EMBEDS_AD_EVENT_TYPE_AD_CLICKED", 4, 4), 
    f("EMBEDS_AD_EVENT_TYPE_AD_PAUSED", 5, 5), 
    g("EMBEDS_AD_EVENT_TYPE_AD_RESUMED", 6, 6), 
    h("EMBEDS_AD_EVENT_TYPE_AD_SUSPENDED", 7, 7), 
    i("EMBEDS_AD_EVENT_TYPE_AD_REQUESTED", 8, 8), 
    j("EMBEDS_AD_EVENT_TYPE_AD_LOADED", 9, 9), 
    k("EMBEDS_AD_EVENT_TYPE_AD_ERROR", 10, 10);
    
    private static final ajnn[] m;
    public final int l;
    
    private ajnn(final String s, final int n, final int l) {
        this.l = l;
    }
    
    public static ahbn a() {
        return ajmw.e;
    }
    
    public static ajnn b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 10: {
                return ajnn.k;
            }
            case 9: {
                return ajnn.j;
            }
            case 8: {
                return ajnn.i;
            }
            case 7: {
                return ajnn.h;
            }
            case 6: {
                return ajnn.g;
            }
            case 5: {
                return ajnn.f;
            }
            case 4: {
                return ajnn.e;
            }
            case 3: {
                return ajnn.d;
            }
            case 2: {
                return ajnn.c;
            }
            case 1: {
                return ajnn.b;
            }
            case 0: {
                return ajnn.a;
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
