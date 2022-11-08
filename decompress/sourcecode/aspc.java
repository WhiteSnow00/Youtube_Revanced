import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspc extends AtomicReference implements ashq, asic
{
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ aspd a;
    
    public aspc(final aspd a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        final aspd a = this.a;
        a.d.d((asic)this);
        if (athp.e(a.f, t)) {
            a.i.tq();
            a.d.dispose();
            a.e.decrementAndGet();
            a.h();
            return;
        }
        aulo.r(t);
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void tp(final Object o) {
        final aspd a = this.a;
        a.d.d((asic)this);
        Label_0219: {
            if (a.get() == 0 && a.compareAndSet(0, 1)) {
                final int decrementAndGet = a.e.decrementAndGet();
                Label_0168: {
                    if (a.c.get() != 0L) {
                        a.a.tr(o);
                        final atfp atfp = a.h.get();
                        if (decrementAndGet == 0 && (atfp == null || atfp.i())) {
                            final Throwable d = athp.d(a.f);
                            if (d != null) {
                                a.a.b(d);
                                return;
                            }
                            a.a.tu();
                            return;
                        }
                        else {
                            atnp.m(a.c, 1L);
                            if (a.b != Integer.MAX_VALUE) {
                                a.i.e(1L);
                                break Label_0168;
                            }
                            break Label_0168;
                        }
                    }
                    final atfp atfp2 = a.d();
                    synchronized (atfp2) {
                        atfp2.j(o);
                        monitorexit(atfp2);
                        if (a.decrementAndGet() == 0) {
                            return;
                        }
                        break Label_0219;
                    }
                }
            }
            final atfp atfp2 = a.d();
            synchronized (atfp2) {
                atfp2.j(o);
                monitorexit(atfp2);
                a.e.decrementAndGet();
                if (a.getAndIncrement() != 0) {
                    return;
                }
                a.i();
            }
        }
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
