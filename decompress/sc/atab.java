import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atab extends AtomicReference implements asif, asir
{
    private static final long serialVersionUID = -502562646270949838L;
    final atac a;
    
    public atab(final atac a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final atac a = this.a;
        a.b.d(this);
        if (atih.e((AtomicReference)a.d, t)) {
            a.g.dispose();
            a.b.dispose();
            a.c.decrementAndGet();
            a.g();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b(this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.get());
    }
    
    @Override
    public final void ts(final Object o) {
        final atac a = this.a;
        a.b.d(this);
        Label_0219: {
            atgh atgh2 = null;
            if (a.get() == 0 && a.compareAndSet(0, 1)) {
                a.a.tu(o);
                final int decrementAndGet = a.c.decrementAndGet();
                final atgh atgh = a.f.get();
                if (decrementAndGet == 0 && (atgh == null || atgh.i())) {
                    final Throwable d = atih.d((AtomicReference)a.d);
                    if (d != null) {
                        a.a.b(d);
                        return;
                    }
                    a.a.tx();
                    return;
                }
                else {
                    if (a.decrementAndGet() == 0) {
                        return;
                    }
                    break Label_0219;
                }
            }
            else {
            Label_0128:
                while ((atgh2 = a.f.get()) == null) {
                    atgh2 = new atgh(ashi.a);
                    final AtomicReference f = a.f;
                    while (!f.compareAndSet(null, atgh2)) {
                        if (f.get() != null) {
                            continue Label_0128;
                        }
                    }
                    break;
                }
            }
            monitorenter(atgh2);
            try {
                atgh2.j(o);
                monitorexit(atgh2);
                a.c.decrementAndGet();
                if (a.getAndIncrement() != 0) {
                    return;
                }
                a.h();
            }
            finally {
                monitorexit(atgh2);
                while (true) {}
            }
        }
    }
}
