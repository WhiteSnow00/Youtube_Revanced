// 
// Decompiled by Procyon v0.6.0
// 

public enum glx
{
    a("PUBLIC", 0, 2132020141), 
    b("UNLISTED", 1, 2132020143), 
    c("PRIVATE", 2, 2132020139);
    
    private static final glx[] e;
    public final int d;
    
    private glx(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static glx a(final String s) {
        return Enum.valueOf(glx.class, s);
    }
}
