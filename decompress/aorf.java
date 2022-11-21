// 
// Decompiled by Procyon v0.6.0
// 

public enum aorf implements ahdd
{
    a("SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED", 0, 0), 
    b("SURVEY_DISPLAY_TRIGGER_UI_EVENT_APP_FOREGROUNDED", 1, 1);
    
    private static final ahde c;
    private static final aorf[] d;
    private final int e;
    
    static {
        d = c();
        c = (ahde)new afsc(6);
    }
    
    private aorf(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return aonf.u;
    }
    
    public static aorf b(final int n) {
        if (n == 0) {
            return aorf.a;
        }
        if (n != 1) {
            return null;
        }
        return aorf.b;
    }
    
    private static aorf[] c() {
        return new aorf[] { aorf.a, aorf.b };
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
