import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpy extends arxo
{
    private final AtomicReference a;
    
    public agpy(final arwu arwu) {
        super(arwu);
        this.a = new AtomicReference((V)arjd.b(1));
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
        arjd arjd;
        arjd arjd2;
        do {
            arjd = this.a.get();
            final int a = arjd.a;
            if (a == 4) {
                arjd2 = arjd;
            }
            else if (a == 1) {
                arjd2 = arjd.a(4, c);
            }
            else {
                arjd2 = arjd.a(5, c);
            }
        } while (!agpx.a(this.a, arjd, arjd2));
        super.b.b(s, t);
    }
    
    public final void c() {
        arjd arjd;
        do {
            arjd = this.a.get();
            if (arjd.a == 2) {
                continue;
            }
            throw new IllegalStateException("Call was either not started or already half-closed.");
        } while (!agpx.a(this.a, arjd, arjd.b(3)));
        super.b.c();
    }
    
    public final void f(final int n) {
        final int a = this.a.get().a;
        if (a != 1 && a != 4) {
            adme.L(true, "Number requested must be non-negative");
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
    
    public final void l(final arxu arxu, final arze arze) {
        arjd arjd;
        arjd b;
        do {
            arjd = this.a.get();
            if (arjd.a == 1) {
                b = arjd.b(2);
            }
            else {
                b = arjd;
            }
        } while (!agpx.a(this.a, arjd, b));
        final int a = arjd.a;
        if (a == 1) {
            super.b.l(arxu, arze);
            return;
        }
        if (a == 4) {
            arxu.a((Status)arjd.b, new arze());
            return;
        }
        final IllegalStateException ex = new IllegalStateException("Already started");
        super.b.b("start() called more than once", ex);
        throw ex;
    }
}
