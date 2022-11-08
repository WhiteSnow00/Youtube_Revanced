// 
// Decompiled by Procyon v0.6.0
// 

public enum agwe implements agzm
{
    a("FETCH_REASON_UNSPECIFIED", 0, 0), 
    b("FULL_SYNC_INSTRUCTION", 1, 1), 
    c("SYNC_INSTRUCTION", 2, 2), 
    d("COLLABORATOR_API_CALL", 3, 3), 
    e("GUNS_MIGRATION", 4, 4), 
    f("INBOX", 5, 5), 
    g("DELAYED_IMPRESSION", 6, 6), 
    h("REMOTE_DELETED_MESSAGES", 7, 7), 
    i("LOCALE_CHANGED", 8, 8), 
    j("GROWTHKIT_PERIODIC_FETCH", 9, 9);
    
    public final int k;
    
    private agwe(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static agwe a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 9: {
                return agwe.j;
            }
            case 8: {
                return agwe.i;
            }
            case 7: {
                return agwe.h;
            }
            case 6: {
                return agwe.g;
            }
            case 5: {
                return agwe.f;
            }
            case 4: {
                return agwe.e;
            }
            case 3: {
                return agwe.d;
            }
            case 2: {
                return agwe.c;
            }
            case 1: {
                return agwe.b;
            }
            case 0: {
                return agwe.a;
            }
        }
    }
    
    public static agzo b() {
        return agvo.i;
    }
    
    public final int getNumber() {
        return this.k;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}
