// 
// Decompiled by Procyon v0.6.0
// 

public enum aonu implements agzm
{
    a("SURVEY_STATE_TYPE_UNKNOWN", 0, 0), 
    b("SURVEY_STATE_TYPE_SELECTED", 1, 1), 
    c("SURVEY_STATE_TYPE_DISMISSED", 2, 2), 
    d("SURVEY_STATE_TYPE_SUBMITTED", 3, 3);
    
    private final int f;
    
    private aonu(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return aonj.c;
    }
    
    public static aonu b(final int n) {
        if (n == 0) {
            return aonu.a;
        }
        if (n == 1) {
            return aonu.b;
        }
        if (n == 2) {
            return aonu.c;
        }
        if (n != 3) {
            return null;
        }
        return aonu.d;
    }
    
    @Override
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
