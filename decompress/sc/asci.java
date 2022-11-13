import java.util.Map;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class asci implements asdp
{
    final asan a;
    boolean b;
    final asck c;
    
    public asci(final asck c, final asan a) {
        this.c = c;
        this.b = false;
        this.a = a;
    }
    
    @Override
    public final void a(final boolean b) {
        this.c.f(this.a, b);
    }
    
    @Override
    public final void b() {
        this.c.c.a(2, "READY");
        this.c.d.execute((Runnable)new asba(this, 8));
    }
    
    @Override
    public final void c(final Status status) {
        this.c.c.b(2, "{0} SHUTDOWN with {1}", new Object[] { this.a.c(), asck.k(status) });
        this.b = true;
        this.c.d.execute((Runnable)new asat(this, status, 15));
    }
    
    @Override
    public final void d() {
        adkp.R(this.b, (Object)"transportShutdown() must be called before transportTerminated().");
        this.c.c.b(2, "{0} Terminated", new Object[] { this.a.c() });
        arvc.b((Map)this.c.b.d, (arve)this.a);
        this.c.f(this.a, false);
        this.c.d.execute((Runnable)new asba(this, 9));
    }
}
