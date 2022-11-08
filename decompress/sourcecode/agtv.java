// 
// Decompiled by Procyon v0.6.0
// 

public enum agtv implements agzm
{
    a("SYSTEM_EVENT_UNSPECIFIED", 0, 0), 
    b("LOGIN_ACCOUNTS_CHANGED", 1, 1), 
    c("TIMEZONE_CHANGED", 2, 2), 
    d("LOCALE_CHANGED", 3, 3), 
    e("PHENOTYPE_CHANGED", 4, 4), 
    f("BOOT_COMPLETED", 5, 5), 
    g("APP_UPDATED", 6, 6), 
    h("SCHEDULED_JOB", 7, 7);
    
    public final int i;
    
    private agtv(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static agtv a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return agtv.h;
            }
            case 6: {
                return agtv.g;
            }
            case 5: {
                return agtv.f;
            }
            case 4: {
                return agtv.e;
            }
            case 3: {
                return agtv.d;
            }
            case 2: {
                return agtv.c;
            }
            case 1: {
                return agtv.b;
            }
            case 0: {
                return agtv.a;
            }
        }
    }
    
    public static agzo b() {
        return agte.k;
    }
    
    public final int getNumber() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}
