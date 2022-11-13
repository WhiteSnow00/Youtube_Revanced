// 
// Decompiled by Procyon v0.6.0
// 

public enum agng implements agkg
{
    a("UNKNOWN", 0, 0), 
    b("DATA_MESSAGE", 1, 1), 
    c("TOPIC", 2, 2), 
    d("DISPLAY_NOTIFICATION", 3, 3);
    
    private static final agng[] e;
    private final int f;
    
    private agng(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public final int a() {
        return this.f;
    }
}
