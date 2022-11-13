// 
// Decompiled by Procyon v0.6.0
// 

public enum agur implements ahbl
{
    a("FEATURE_UNSPECIFIED", 0, 0), 
    b("USER_FEEDBACK_IHNR", 1, 1), 
    c("IN_APP_PROMPTS", 2, 2), 
    d("NO_TRAY_NOTIFICATIONS", 3, 3), 
    e("USER_FEEDBACK_IHNR_ACTION_BUTTONS", 4, 5);
    
    private static final agur[] g;
    public final int f;
    
    private agur(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
