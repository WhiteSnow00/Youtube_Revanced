// 
// Decompiled by Procyon v0.6.0
// 

final class afem extends afkf
{
    private final afeq a;
    
    public afem(final afeq a, final int n) {
        super(a.size(), n);
        this.a = a;
    }
    
    protected final Object a(final int n) {
        return this.a.get(n);
    }
}
