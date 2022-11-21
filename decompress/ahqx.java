// 
// Decompiled by Procyon v0.6.0
// 

public enum ahqx implements ahdd
{
    a("TRIGGER_CATEGORY_UNSPECIFIED", 0, 0), 
    b("TRIGGER_CATEGORY_SLOT_ENTRY", 1, 1), 
    c("TRIGGER_CATEGORY_SLOT_FULFILLMENT", 2, 2), 
    d("TRIGGER_CATEGORY_SLOT_EXPIRATION", 3, 3), 
    e("TRIGGER_CATEGORY_LAYOUT_EXIT_NORMAL", 4, 4), 
    f("TRIGGER_CATEGORY_LAYOUT_EXIT_USER_SKIPPED", 5, 5), 
    g("TRIGGER_CATEGORY_LAYOUT_EXIT_USER_MUTED", 6, 6), 
    h("TRIGGER_CATEGORY_LAYOUT_EXIT_USER_INPUT_SUBMITTED", 7, 8), 
    i("TRIGGER_CATEGORY_LAYOUT_EXIT_USER_CANCELLED", 8, 9), 
    j("TRIGGER_CATEGORY_PING_DISPATCH", 9, 7);
    
    private static final ahqx[] l;
    public final int k;
    
    private ahqx(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static ahdf a() {
        return ahqv.d;
    }
    
    public static ahqx b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 9: {
                return ahqx.i;
            }
            case 8: {
                return ahqx.h;
            }
            case 7: {
                return ahqx.j;
            }
            case 6: {
                return ahqx.g;
            }
            case 5: {
                return ahqx.f;
            }
            case 4: {
                return ahqx.e;
            }
            case 3: {
                return ahqx.d;
            }
            case 2: {
                return ahqx.c;
            }
            case 1: {
                return ahqx.b;
            }
            case 0: {
                return ahqx.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.k;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}
