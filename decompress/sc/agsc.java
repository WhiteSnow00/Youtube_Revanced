// 
// Decompiled by Procyon v0.6.0
// 

public final class agsc implements agsb
{
    public static final agsc a;
    
    static {
        a = new agsc();
    }
    
    private agsc() {
    }
    
    @Override
    public final void a(final String s) {
        System.loadLibrary(s);
    }
}
