// 
// Decompiled by Procyon v0.6.0
// 

public enum aidc implements ahdd
{
    a("BEDTIME_REMINDER_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("BEDTIME_REMINDER_EVENT_TYPE_IMPRESSION", 1, 1), 
    c("BEDTIME_REMINDER_EVENT_TYPE_DISMISS", 2, 2), 
    d("BEDTIME_REMINDER_EVENT_TYPE_SNOOZE", 3, 3);
    
    private static final aidc[] f;
    public final int e;
    
    private aidc(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return aidb.a;
    }
    
    public static aidc b(final int n) {
        if (n == 0) {
            return aidc.a;
        }
        if (n == 1) {
            return aidc.b;
        }
        if (n == 2) {
            return aidc.c;
        }
        if (n != 3) {
            return null;
        }
        return aidc.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
