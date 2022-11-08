// 
// Decompiled by Procyon v0.6.0
// 

public enum agwm implements agzm
{
    a("REGISTRATION_REASON_UNSPECIFIED", 0, 0), 
    b("DEVICE_START", 1, 1), 
    c("APP_UPDATED", 2, 2), 
    d("ACCOUNT_CHANGED", 3, 3), 
    e("SERVER_SYNC_INSTRUCTION", 4, 4), 
    f("LOCALE_CHANGED", 5, 5), 
    g("TIMEZONE_CHANGED", 6, 6), 
    h("COLLABORATOR_API_CALL", 7, 7), 
    i("GUNS_MIGRATION", 8, 8), 
    j("REGISTRATION_ID_CHANGED", 9, 9), 
    k("CHANNEL_BLOCK_STATE_CHANGED", 10, 10), 
    l("GROWTHKIT_PERIODIC_REGISTRATION", 11, 11);
    
    public final int m;
    
    private agwm(final String s, final int n, final int m) {
        this.m = m;
    }
    
    public static agwm a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return agwm.l;
            }
            case 10: {
                return agwm.k;
            }
            case 9: {
                return agwm.j;
            }
            case 8: {
                return agwm.i;
            }
            case 7: {
                return agwm.h;
            }
            case 6: {
                return agwm.g;
            }
            case 5: {
                return agwm.f;
            }
            case 4: {
                return agwm.e;
            }
            case 3: {
                return agwm.d;
            }
            case 2: {
                return agwm.c;
            }
            case 1: {
                return agwm.b;
            }
            case 0: {
                return agwm.a;
            }
        }
    }
    
    public static agzo b() {
        return agvo.k;
    }
    
    public final int getNumber() {
        return this.m;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}
