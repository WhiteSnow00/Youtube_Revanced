// 
// Decompiled by Procyon v0.6.0
// 

final class atds implements ashy
{
    private final atdr a;
    
    public atds(final atdr a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final atdr a = this.a;
        asjv.b(a.c);
        a.a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this.a.d, asir);
    }
    
    @Override
    public final void tu(final Object o) {
        this.a.lazySet(o);
    }
    
    @Override
    public final void tx() {
    }
}
