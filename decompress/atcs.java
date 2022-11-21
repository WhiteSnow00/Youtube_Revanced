import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcs extends AtomicInteger implements asln, asku
{
    private static final long serialVersionUID = 8443155186132538303L;
    final asjz a;
    final atla b;
    final asmn c;
    final aslm d;
    asln e;
    volatile boolean f;
    
    public atcs(final asjz a, final asmn c) {
        this.a = a;
        this.c = c;
        this.b = new atla();
        this.d = new aslm();
        this.lazySet(1);
    }
    
    @Override
    public final void b(Throwable d) {
        if (atle.e(this.b, d)) {
            this.dispose();
            if (this.getAndSet(0) > 0) {
                d = atle.d(this.b);
                this.a.b(d);
            }
            return;
        }
        aqvq.w(d);
    }
    
    @Override
    public final void d(final asln e) {
        if (asmr.g(this.e, e)) {
            this.e = e;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.f = true;
        this.e.dispose();
        this.d.dispose();
    }
    
    @Override
    public final void tt(final Object o) {
        try {
            final askb askb = (askb)this.c.a(o);
            asng.b(askb, "The mapper returned a null CompletableSource");
            this.getAndIncrement();
            final atcr atcr = new atcr(this);
            if (!this.f && this.d.c(atcr)) {
                askb.Y(atcr);
            }
        }
        finally {
            final Throwable t;
            asjv.a(t);
            this.e.dispose();
            this.b(t);
        }
    }
    
    @Override
    public final void tw() {
        if (this.decrementAndGet() == 0) {
            final Throwable d = atle.d(this.b);
            if (d != null) {
                this.a.b(d);
                return;
            }
            this.a.tw();
        }
    }
    
    @Override
    public final boolean tz() {
        return this.e.tz();
    }
}
