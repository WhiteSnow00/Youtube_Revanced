import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcu extends AtomicReference implements askk, asln
{
    private static final long serialVersionUID = -502562646270949838L;
    final atcv a;
    
    public atcu(final atcv a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final atcv a = this.a;
        a.b.d(this);
        if (atle.e(a.d, t)) {
            a.g.dispose();
            a.b.dispose();
            a.c.decrementAndGet();
            a.g();
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
        final atcv a = this.a;
        a.b.d(this);
        Label_0219: {
            atje atje2 = null;
            if (a.get() == 0 && a.compareAndSet(0, 1)) {
                a.a.tt(o);
                final int decrementAndGet = a.c.decrementAndGet();
                final atje atje = a.f.get();
                if (decrementAndGet == 0 && (atje == null || atje.i())) {
                    final Throwable d = atle.d(a.d);
                    if (d != null) {
                        a.a.b(d);
                        return;
                    }
                    a.a.tw();
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
                while ((atje2 = a.f.get()) == null) {
                    atje2 = new atje(aske.a);
                    final AtomicReference f = a.f;
                    while (!f.compareAndSet(null, atje2)) {
                        if (f.get() != null) {
                            continue Label_0128;
                        }
                    }
                    break;
                }
            }
            monitorenter(atje2);
            try {
                atje2.j(o);
                monitorexit(atje2);
                a.c.decrementAndGet();
                if (a.getAndIncrement() != 0) {
                    return;
                }
                a.h();
            }
            finally {
                monitorexit(atje2);
                while (true) {}
            }
        }
    }
    
    @Override
    public final void tw() {
        final atcv a = this.a;
        a.b.d(this);
        if (a.get() != 0 || !a.compareAndSet(0, 1)) {
            a.c.decrementAndGet();
            a.g();
            return;
        }
        final int decrementAndGet = a.c.decrementAndGet();
        final atje atje = a.f.get();
        if (decrementAndGet == 0 && (atje == null || atje.i())) {
            final Throwable d = atle.d(a.d);
            if (d != null) {
                a.a.b(d);
                return;
            }
            a.a.tw();
        }
        else {
            if (a.decrementAndGet() == 0) {
                return;
            }
            a.h();
        }
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
