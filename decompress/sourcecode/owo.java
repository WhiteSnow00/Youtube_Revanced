// 
// Decompiled by Procyon v0.6.0
// 

public final class owo extends dss
{
    @dyh(a = 13)
    @dyi(a = dyj.a)
    qpt a;
    
    public owo() {
        super("ElementDeferredLayout");
    }
    
    private final own b() {
        return (own)super.s;
    }
    
    protected final void T(final dsw dsw) {
        final elw elw = new elw();
        final qpt a = this.a;
        try {
            final orz a2 = orz.a().a();
            final Object a3 = a.a;
            final olq a4 = ((owp)a3).a;
            final dzt d = ((owp)a3).d;
            final ory h = a2.h();
            h.i(((owp)a3).c);
            h.h(((owp)a3).i);
            elw.a = a4.b((dsw)d, h.a(), ((owp)a3).j, ((owp)a3).b, ((owp)a3).e);
            this.b().a = (dss)elw.a;
        }
        catch (final Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    protected final void ad(final dwq dwq, final dwq dwq2) {
        ((own)dwq2).a = ((own)dwq).a;
    }
    
    protected final boolean ai() {
        return true;
    }
    
    protected final dss c(final dsw dsw) {
        final dss a = this.b().a;
        if (a != null) {
            return a.j();
        }
        return null;
    }
}
