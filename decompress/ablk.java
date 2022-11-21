// 
// Decompiled by Procyon v0.6.0
// 

public enum ablk
{
    a("DEFAULT_VALUE", 0, 0), 
    b("IS_UAO", 1, 1);
    
    private static final ablk[] d;
    public final int c;
    
    private ablk(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public final String a() {
        return String.valueOf(this.c);
    }
}
