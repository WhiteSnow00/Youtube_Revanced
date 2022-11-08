// 
// Decompiled by Procyon v0.6.0
// 

public enum glp
{
    a("PUBLIC", 0, 2132020140), 
    b("UNLISTED", 1, 2132020142), 
    c("PRIVATE", 2, 2132020138);
    
    public final int d;
    
    private glp(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static glp a(final String s) {
        return Enum.valueOf(glp.class, s);
    }
}
