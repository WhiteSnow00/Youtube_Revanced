// 
// Decompiled by Procyon v0.6.0
// 

public enum oya
{
    a("FULL", 0, 1.0), 
    b("THREE_QUARTER", 1, 0.75), 
    c("HALF", 2, 0.5), 
    d("QUARTER", 3, 0.25), 
    e("NONE", 4, 0.0);
    
    public final double f;
    
    private oya(final String s, final int n, final double f) {
        this.f = f;
    }
}
