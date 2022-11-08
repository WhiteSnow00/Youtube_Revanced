// 
// Decompiled by Procyon v0.6.0
// 

public final class dim implements dii
{
    public static final dim a;
    private final /* synthetic */ int b;
    
    static {
        a = new dim(2, null);
    }
    
    public dim(final int b) {
        this.b = b;
    }
    
    @Deprecated
    public dim(final int b, final byte[] array) {
        this.b = b;
    }
    
    public final boolean a(final Object o) {
        final int b = this.b;
        return b != 0 && (b != 1 || o.toString().startsWith("data:image"));
    }
    
    public final alm b(final Object o, int b, final int n, final ddo ddo) {
        b = this.b;
        if (b == 0) {
            return null;
        }
        if (b != 1) {
            return new alm((ddj)new dor(o), (ddx)new dir(o, 0));
        }
        return new alm((ddj)new dor(o), (ddx)new dhs(o.toString()));
    }
}
