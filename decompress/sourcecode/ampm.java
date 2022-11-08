// 
// Decompiled by Procyon v0.6.0
// 

public enum ampm implements agzm
{
    a("NOTIFICATION_SURVEY_LAYOUT_TYPE_UNKNOWN", 0, 0), 
    b("NOTIFICATION_SURVEY_LAYOUT_TYPE_FIVE_SCALE", 1, 1), 
    c("NOTIFICATION_SURVEY_LAYOUT_TYPE_FIVE_SCALE_12_PLUS", 2, 2);
    
    private final int e;
    
    private ampm(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return amom.i;
    }
    
    public static ampm b(final int n) {
        if (n == 0) {
            return ampm.a;
        }
        if (n == 1) {
            return ampm.b;
        }
        if (n != 2) {
            return null;
        }
        return ampm.c;
    }
    
    @Override
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
