// 
// Decompiled by Procyon v0.6.0
// 

public enum aglf implements agif
{
    a("UNKNOWN", 0, 0), 
    b("DATA_MESSAGE", 1, 1), 
    c("TOPIC", 2, 2), 
    d("DISPLAY_NOTIFICATION", 3, 3);
    
    private final int f;
    
    private aglf(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public final int a() {
        return this.f;
    }
}
