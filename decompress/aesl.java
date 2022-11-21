// 
// Decompiled by Procyon v0.6.0
// 

public enum aesl
{
    a("ON_CHARGER", 0, 1), 
    b("ON_NETWORK_UNMETERED", 1, 2), 
    c("ON_NETWORK_CONNECTED", 2, 4);
    
    private static final aesl[] e;
    public final int d;
    
    private aesl(final String s, final int n, final int d) {
        this.d = d;
    }
}
