// 
// Decompiled by Procyon v0.6.0
// 

public final class dht implements dij
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public dht(final int a, final byte[] array) {
        this.a = a;
        this.b = new ckx();
    }
    
    public dht(final dhv b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final dii b(final din din) {
        if (this.a != 0) {
            return (dii)new dim(1);
        }
        return (dii)new dhx((dhv)this.b, 0);
    }
    
    public final void c() {
    }
}
