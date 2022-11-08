// 
// Decompiled by Procyon v0.6.0
// 

public enum cxy
{
    a("JSON", 0, ".json"), 
    b("ZIP", 1, ".zip");
    
    public final String c;
    
    private cxy(final String s, final int n, final String c) {
        this.c = c;
    }
    
    @Override
    public final String toString() {
        return this.c;
    }
}
