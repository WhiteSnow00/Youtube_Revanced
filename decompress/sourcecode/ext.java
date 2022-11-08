// 
// Decompiled by Procyon v0.6.0
// 

public enum ext
{
    a("UNKNOWN", 0, false), 
    b("NOT_SUPPORTED", 1, false), 
    c("IN_BEDTIME", 2, true), 
    d("NOT_IN_BEDTIME", 3, true), 
    e("NO_ACCESS", 4, false);
    
    public final boolean f;
    
    private ext(final String s, final int n, final boolean f) {
        this.f = f;
    }
}
