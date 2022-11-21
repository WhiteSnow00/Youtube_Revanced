import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcl extends AtomicReference implements asku
{
    private static final long serialVersionUID = -4606175640614850599L;
    final long a;
    final atcm b;
    volatile boolean c;
    volatile asnp d;
    int e;
    
    public atcl(final atcm b, final long a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (atle.e(this.b.j, t)) {
            final atcm b = this.b;
            if (!b.e) {
                b.k();
            }
            this.c = true;
            this.b.f();
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        if (asmr.f(this, asln) && asln instanceof asnk) {
            final asnk asnk = (asnk)asln;
            final int tu = asnk.tu(7);
            if (tu == 1) {
                this.e = 1;
                this.d = (asnp)asnk;
                this.c = true;
                this.b.f();
                return;
            }
            if (tu == 2) {
                this.e = 2;
                this.d = (asnp)asnk;
            }
        }
    }
    
    @Override
    public final void tt(final Object o) {
        if (this.e == 0) {
            final atcm b = this.b;
            Label_0099: {
                if (b.get() == 0 && b.compareAndSet(0, 1)) {
                    b.c.tt(o);
                    if (b.decrementAndGet() != 0) {
                        break Label_0099;
                    }
                }
                else {
                    Object d;
                    if ((d = this.d) == null) {
                        d = new atje(b.g);
                        this.d = (asnp)d;
                    }
                    ((asnp)d).j(o);
                    if (b.getAndIncrement() == 0) {
                        break Label_0099;
                    }
                }
                return;
            }
            b.g();
            return;
        }
        this.b.f();
    }
    
    @Override
    public final void tw() {
        this.c = true;
        this.b.f();
    }
}
