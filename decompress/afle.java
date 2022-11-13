// 
// Decompiled by Procyon v0.6.0
// 

public enum afle
{
    a("SMALL", 0, 10), 
    b("MEDIUM", 1, 20), 
    c("LARGE", 2, 50), 
    d("FULL", 3, -1), 
    e("NONE", 4, 0);
    
    private static final afle[] g;
    public final int f;
    
    private afle(final String s, final int n, final int f) {
        this.f = f;
    }
}
