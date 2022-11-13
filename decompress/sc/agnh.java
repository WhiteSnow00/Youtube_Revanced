// 
// Decompiled by Procyon v0.6.0
// 

public enum agnh implements agkg
{
    a("UNKNOWN_OS", 0, 0), 
    b("ANDROID", 1, 1), 
    c("IOS", 2, 2), 
    d("WEB", 3, 3);
    
    private static final agnh[] e;
    private final int f;
    
    private agnh(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public final int a() {
        return this.f;
    }
}
