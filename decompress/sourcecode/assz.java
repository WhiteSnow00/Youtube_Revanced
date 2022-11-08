import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class assz extends AtomicInteger implements asgw, aujq
{
    private static final long serialVersionUID = -4945480365982832967L;
    final aujp a;
    final AtomicLong b;
    final AtomicReference c;
    final athl d;
    final assy e;
    
    public assz(final aujp a) {
        this.a = a;
        this.b = new AtomicLong();
        this.c = new AtomicReference();
        this.e = new assy(this);
        this.d = new athl();
    }
    
    public final void b(final Throwable t) {
        athh.f(this.e);
        aubt.x(this.a, t, this, this.d);
    }
    
    public final void e(final long n) {
        athh.a(this.c, this.b, n);
    }
    
    public final void f(final aujq aujq) {
        athh.j(this.c, this.b, aujq);
    }
    
    public final void tq() {
        athh.f(this.c);
        athh.f(this.e);
    }
    
    public final void tr(final Object o) {
        aubt.y(this.a, o, this, this.d);
    }
    
    public final void tu() {
        athh.f(this.e);
        aubt.v(this.a, this, this.d);
    }
}
