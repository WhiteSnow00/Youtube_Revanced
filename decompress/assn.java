import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class assn extends AtomicReference implements aslb, asln
{
    private static final long serialVersionUID = -502562646270949838L;
    final asso a;
    
    public assn(final asso a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asso a = this.a;
        a.d.d(this);
        if (atle.e(a.f, t)) {
            a.i.ts();
            a.d.dispose();
            a.e.decrementAndGet();
            a.h();
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void tr(final Object o) {
        final asso a = this.a;
        a.d.d(this);
        Label_0219: {
            if (a.get() == 0 && a.compareAndSet(0, 1)) {
                final int decrementAndGet = a.e.decrementAndGet();
                Label_0168: {
                    if (a.c.get() != 0L) {
                        a.a.tt(o);
                        final atje atje = a.h.get();
                        if (decrementAndGet == 0 && (atje == null || atje.i())) {
                            final Throwable d = atle.d(a.f);
                            if (d != null) {
                                a.a.b(d);
                                return;
                            }
                            a.a.tw();
                            return;
                        }
                        else {
                            auop.E(a.c, 1L);
                            if (a.b != Integer.MAX_VALUE) {
                                a.i.e(1L);
                                break Label_0168;
                            }
                            break Label_0168;
                        }
                    }
                    final atje atje2 = a.d();
                    synchronized (atje2) {
                        atje2.j(o);
                        monitorexit(atje2);
                        if (a.decrementAndGet() == 0) {
                            return;
                        }
                        break Label_0219;
                    }
                }
            }
            final atje atje2 = a.d();
            synchronized (atje2) {
                atje2.j(o);
                monitorexit(atje2);
                a.e.decrementAndGet();
                if (a.getAndIncrement() != 0) {
                    return;
                }
                a.i();
            }
        }
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
