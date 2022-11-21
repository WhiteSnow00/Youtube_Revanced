import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atai implements asku, asln
{
    static final atah a;
    final asjz b;
    final asmn c;
    final atla d;
    final AtomicReference e;
    volatile boolean f;
    asln g;
    
    static {
        a = new atah((atai)null);
    }
    
    public atai(final asjz b, final asmn c) {
        this.b = b;
        this.c = c;
        this.d = new atla();
        this.e = new AtomicReference();
    }
    
    @Override
    public final void b(Throwable d) {
        if (atle.e(this.d, d)) {
            this.f();
            d = atle.d(this.d);
            if (d != atle.a) {
                this.b.b(d);
            }
            return;
        }
        aqvq.w(d);
    }
    
    @Override
    public final void d(final asln g) {
        if (asmr.g(this.g, g)) {
            this.g = g;
            this.b.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.g.dispose();
        this.f();
    }
    
    final void f() {
        final AtomicReference e = this.e;
        final atah a = atai.a;
        final atah atah = e.getAndSet(a);
        if (atah != null && atah != a) {
            asmr.b(atah);
        }
    }
    
    @Override
    public final void tt(final Object o) {
        try {
            final Object a = this.c.a(o);
            final atah atah = new atah(this);
            atah atah2;
            do {
                atah2 = this.e.get();
                if (atah2 == atai.a) {
                    return;
                }
            } while (!arxu.t(this.e, atah2, atah));
            if (atah2 != null) {
                asmr.b(atah2);
            }
            ((askb)a).Y(atah);
        }
        finally {
            final Throwable t;
            asjv.a(t);
            this.g.dispose();
            this.b(t);
        }
    }
    
    @Override
    public final void tw() {
        this.f = true;
        if (this.e.get() == null) {
            final Throwable d = atle.d(this.d);
            if (d == null) {
                this.b.tw();
                return;
            }
            this.b.b(d);
        }
    }
    
    @Override
    public final boolean tz() {
        return this.e.get() == atai.a;
    }
}
