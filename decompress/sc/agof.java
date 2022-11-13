import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agof extends aruu
{
    private final AtomicReference a;
    
    public agof(final arua arua) {
        super(arua);
        this.a = new AtomicReference((V)argj.b(1));
    }
    
    public final void b(final String s, final Throwable t) {
        Status status2;
        final Status status = status2 = Status.b;
        if (s != null) {
            status2 = status.withDescription(s);
        }
        Status c = status2;
        if (t != null) {
            c = status2.c(t);
        }
        argj argj;
        argj argj2;
        do {
            argj = this.a.get();
            final int a = argj.a;
            if (a == 4) {
                argj2 = argj;
            }
            else if (a == 1) {
                argj2 = argj.a(4, c);
            }
            else {
                argj2 = argj.a(5, c);
            }
        } while (!agpc.c(this.a, argj, argj2));
        super.b.b(s, t);
    }
    
    public final void c() {
        argj argj;
        do {
            argj = this.a.get();
            if (argj.a == 2) {
                continue;
            }
            throw new IllegalStateException("Call was either not started or already half-closed.");
        } while (!agpc.c(this.a, argj, argj.b(3)));
        super.b.c();
    }
    
    public final void f(final int n) {
        final int a = this.a.get().a;
        if (a != 1 && a != 4) {
            adkp.I(true, (Object)"Number requested must be non-negative");
            super.b.f(n);
            return;
        }
        throw new IllegalStateException("Not started");
    }
    
    public final void g(final Object o) {
        o.getClass();
        final int a = this.a.get().a;
        if (a == 2) {
            super.b.g(o);
            return;
        }
        if (a == 5) {
            return;
        }
        throw new IllegalStateException("Call was either not started or already half-closed.");
    }
    
    public final void l(final arbu arbu, final arwk arwk) {
        argj argj;
        argj b;
        do {
            argj = this.a.get();
            if (argj.a == 1) {
                b = argj.b(2);
            }
            else {
                b = argj;
            }
        } while (!agpc.c(this.a, argj, b));
        final int a = argj.a;
        if (a == 1) {
            super.b.l(arbu, arwk);
            return;
        }
        if (a == 4) {
            arbu.a((Status)argj.b, new arwk());
            return;
        }
        final IllegalStateException ex = new IllegalStateException("Already started");
        super.b.b("start() called more than once", (Throwable)ex);
        throw ex;
    }
}
