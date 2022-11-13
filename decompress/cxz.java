// 
// Decompiled by Procyon v0.6.0
// 

public enum cxz
{
    a("JSON", 0, ".json"), 
    b("ZIP", 1, ".zip");
    
    private static final cxz[] d;
    public final String c;
    
    private cxz(final String s, final int n, final String c) {
        this.c = c;
    }
    
    @Override
    public final String toString() {
        return this.c;
    }
}
