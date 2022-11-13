import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxm implements ashy, asir
{
    static final asxl a;
    final ashd b;
    final asjr c;
    final atid d;
    final AtomicReference e;
    volatile boolean f;
    asir g;
    
    static {
        a = new asxl((asxm)null);
    }
    
    public asxm(final ashd b, final asjr c) {
        this.b = b;
        this.c = c;
        this.d = new atid();
        this.e = new AtomicReference();
    }
    
    @Override
    public final void b(Throwable d) {
        if (atih.e((AtomicReference)this.d, d)) {
            this.f();
            d = atih.d((AtomicReference)this.d);
            if (d != atih.a) {
                this.b.b(d);
            }
            return;
        }
        atqx.j(d);
    }
    
    @Override
    public final void d(final asir g) {
        if (asjv.g(this.g, g)) {
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
        final asxl a = asxm.a;
        final asxl asxl = e.getAndSet(a);
        if (asxl != null && asxl != a) {
            asjv.b((AtomicReference)asxl);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.e.get() == asxm.a;
    }
    
    @Override
    public final void tu(final Object o) {
        try {
            final Object a = this.c.a(o);
            final asxl asxl = new asxl(this);
            asxl asxl2;
            do {
                asxl2 = this.e.get();
                if (asxl2 == asxm.a) {
                    return;
                }
            } while (!arbu.G(this.e, (Object)asxl2, (Object)asxl));
            if (asxl2 != null) {
                asjv.b((AtomicReference)asxl2);
            }
            ((ashf)a).Y(asxl);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.g.dispose();
            this.b(t);
        }
    }
    
    @Override
    public final void tx() {
        this.f = true;
        if (this.e.get() == null) {
            final Throwable d = atih.d((AtomicReference)this.d);
            if (d == null) {
                this.b.tx();
                return;
            }
            this.b.b(d);
        }
    }
}
