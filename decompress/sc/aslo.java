import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslo extends AtomicReference implements ashd
{
    private static final long serialVersionUID = -5454794857847146511L;
    final aslp a;
    
    public aslo(final aslp a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.g(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.h((AtomicReference)this, asir);
    }
    
    @Override
    public final void tx() {
        final aslp a = this.a;
        a.k = false;
        a.d();
    }
}
