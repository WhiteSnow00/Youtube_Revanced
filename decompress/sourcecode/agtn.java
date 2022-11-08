// 
// Decompiled by Procyon v0.6.0
// 

public enum agtn implements agzm
{
    a("REMOVE_REASON_UNKNOWN", 0, 0), 
    b("CLICKED_IN_SYSTEM_TRAY", 1, 1), 
    c("ACTION_CLICK_IN_SYSTEM_TRAY", 2, 2), 
    d("DISMISSED_IN_SYSTEM_TRAY", 3, 3), 
    e("CLICKED_IN_INBOX", 4, 4), 
    f("ACTION_CLICK_IN_INBOX", 5, 5), 
    g("DISMISSED_IN_INBOX", 6, 6), 
    h("DISMISSED_REMOTE", 7, 7), 
    i("DISMISSED_BY_API", 8, 8), 
    j("EXPIRED", 9, 9), 
    k("ACCOUNT_DATA_CLEANED", 10, 10);
    
    public final int l;
    
    private agtn(final String s, final int n, final int l) {
        this.l = l;
    }
    
    public static agtn a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 10: {
                return agtn.k;
            }
            case 9: {
                return agtn.j;
            }
            case 8: {
                return agtn.i;
            }
            case 7: {
                return agtn.h;
            }
            case 6: {
                return agtn.g;
            }
            case 5: {
                return agtn.f;
            }
            case 4: {
                return agtn.e;
            }
            case 3: {
                return agtn.d;
            }
            case 2: {
                return agtn.c;
            }
            case 1: {
                return agtn.b;
            }
            case 0: {
                return agtn.a;
            }
        }
    }
    
    public static agzo b() {
        return agte.f;
    }
    
    public final int getNumber() {
        return this.l;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}
