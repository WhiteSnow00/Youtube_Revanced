import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atah extends asht implements Callable
{
    final Callable a;
    
    public atah(final Callable a) {
        this.a = a;
    }
    
    public final Object call() {
        final Object call = this.a.call();
        askk.b(call, "The callable returned a null value");
        return call;
    }
    
    public final void f(final ashy ashy) {
        final aslb aslb = new aslb(ashy);
        ashy.d((asir)aslb);
        if (aslb.tA()) {
            return;
        }
        try {
            final Object call = this.a.call();
            askk.b(call, "Callable returned null");
            aslb.f(call);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            if (!aslb.tA()) {
                ashy.b(t);
                return;
            }
            atqx.j(t);
        }
    }
}
