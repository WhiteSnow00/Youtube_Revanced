// 
// Decompiled by Procyon v0.6.0
// 

enum agyw
{
    a("SCALAR", 0, false), 
    b("VECTOR", 1, true), 
    c("PACKED_VECTOR", 2, true), 
    d("MAP", 3, false);
    
    public final boolean e;
    
    private agyw(final String s, final int n, final boolean e) {
        this.e = e;
    }
}
