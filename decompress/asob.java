import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asob extends AtomicReference implements asku, asln
{
    private static final long serialVersionUID = -5417183359794346637L;
    final asoc a;
    final int b;
    public asnp c;
    public volatile boolean d;
    int e;
    
    public asob(final asoc a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        final atbj atbj = (atbj)this.a;
        if (atle.e(atbj.e, t)) {
            if (atbj.n == 1) {
                atbj.h.dispose();
            }
            this.f();
            atbj.f();
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        if (asmr.f(this, asln)) {
            if (asln instanceof asnk) {
                final asnk asnk = (asnk)asln;
                final int tu = asnk.tu(3);
                if (tu == 1) {
                    this.e = 1;
                    this.c = (asnp)asnk;
                    this.d = true;
                    this.a.g(this);
                    return;
                }
                if (tu == 2) {
                    this.e = 2;
                    this.c = (asnp)asnk;
                    return;
                }
            }
            final int n = -this.b;
            Object c;
            if (n < 0) {
                c = new atje(-n);
            }
            else {
                c = new atjd(n);
            }
            this.c = (asnp)c;
        }
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    public final void f() {
        this.d = true;
    }
    
    @Override
    public final void tt(final Object o) {
        if (this.e == 0) {
            final asoc a = this.a;
            this.c.j(o);
            ((atbj)a).f();
            return;
        }
        this.a.f();
    }
    
    @Override
    public final void tw() {
        this.a.g(this);
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
