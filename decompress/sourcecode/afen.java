// 
// Decompiled by Procyon v0.6.0
// 

final class afen extends afif
{
    static final afif a;
    private final Object[] b;
    
    static {
        a = new afen(new Object[0]);
    }
    
    public afen(final Object[] b) {
        super(0, 0);
        this.b = b;
    }
    
    protected final Object a(final int n) {
        return this.b[n];
    }
}
