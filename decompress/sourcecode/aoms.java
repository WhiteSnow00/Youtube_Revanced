// 
// Decompiled by Procyon v0.6.0
// 

public enum aoms implements agzm
{
    a("SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED", 0, 0), 
    b("SURVEY_DISPLAY_TRIGGER_UI_EVENT_APP_FOREGROUNDED", 1, 1);
    
    private static final agzn c;
    private final int e;
    
    static {
        c = (agzn)new afom(6);
    }
    
    private aoms(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return aoiz.s;
    }
    
    public static aoms b(final int n) {
        if (n == 0) {
            return aoms.a;
        }
        if (n != 1) {
            return null;
        }
        return aoms.b;
    }
    
    @Override
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
