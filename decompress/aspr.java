import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspr extends AtomicReference implements asif, asir
{
    private static final long serialVersionUID = -502562646270949838L;
    final asps a;
    
    public aspr(final asps a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asps a = this.a;
        a.d.d((asir)this);
        if (atih.e((AtomicReference)a.f, t)) {
            a.i.tt();
            a.d.dispose();
            a.e.decrementAndGet();
            a.h();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void ts(final Object o) {
        final asps a = this.a;
        a.d.d((asir)this);
        Label_0219: {
            if (a.get() == 0 && a.compareAndSet(0, 1)) {
                final int decrementAndGet = a.e.decrementAndGet();
                Label_0168: {
                    if (a.c.get() != 0L) {
                        a.a.tu(o);
                        final atgh atgh = a.h.get();
                        if (decrementAndGet == 0 && (atgh == null || atgh.i())) {
                            final Throwable d = atih.d((AtomicReference)a.f);
                            if (d != null) {
                                a.a.b(d);
                                return;
                            }
                            a.a.tx();
                            return;
                        }
                        else {
                            asfn.A(a.c, 1L);
                            if (a.b != Integer.MAX_VALUE) {
                                a.i.e(1L);
                                break Label_0168;
                            }
                            break Label_0168;
                        }
                    }
                    final atgh atgh2 = a.d();
                    synchronized (atgh2) {
                        atgh2.j(o);
                        monitorexit(atgh2);
                        if (a.decrementAndGet() == 0) {
                            return;
                        }
                        break Label_0219;
                    }
                }
            }
            final atgh atgh2 = a.d();
            synchronized (atgh2) {
                atgh2.j(o);
                monitorexit(atgh2);
                a.e.decrementAndGet();
                if (a.getAndIncrement() != 0) {
                    return;
                }
                a.i();
            }
        }
    }
}
