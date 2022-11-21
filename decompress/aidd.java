// 
// Decompiled by Procyon v0.6.0
// 

public enum aidd implements ahdd
{
    a("BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_UNKNOWN", 0, 0), 
    b("BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL", 1, 1), 
    c("BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_DIALOG", 2, 2);
    
    private static final aidd[] e;
    public final int d;
    
    private aidd(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return aidb.c;
    }
    
    public static aidd b(final int n) {
        if (n == 0) {
            return aidd.a;
        }
        if (n == 1) {
            return aidd.b;
        }
        if (n != 2) {
            return null;
        }
        return aidd.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
