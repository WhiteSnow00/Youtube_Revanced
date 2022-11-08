// 
// Decompiled by Procyon v0.6.0
// 

final class afcn extends afif
{
    private final afcr a;
    
    public afcn(final afcr a, final int n) {
        super(a.size(), n);
        this.a = a;
    }
    
    protected final Object a(final int n) {
        return this.a.get(n);
    }
}
