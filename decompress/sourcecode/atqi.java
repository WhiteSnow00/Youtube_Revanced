// 
// Decompiled by Procyon v0.6.0
// 

public final class atqi extends atvh
{
    public final atos b;
    
    public atqi(final atli atli, final atld atld) {
        atli.getClass();
        super(atli, atld);
        this.b = auet.i();
    }
    
    @Override
    protected final void d(final Object o) {
        final atos b = this.b;
        do {
            final int a = b.a;
            if (a != 0) {
                if (a == 1) {
                    atuq.a(atza.e(this.e), aulo.k(o, this.e));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!this.b.a(0, 2));
    }
    
    @Override
    protected final void tL(final Object o) {
        this.d(o);
    }
}
