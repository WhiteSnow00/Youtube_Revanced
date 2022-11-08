import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aszp extends ashe implements Callable
{
    final Callable a;
    
    public aszp(final Callable a) {
        this.a = a;
    }
    
    public final Object call() {
        final Object call = this.a.call();
        asjv.b(call, "The callable returned a null value");
        return call;
    }
    
    public final void f(final ashj ashj) {
        final askm askm = new askm(ashj);
        ashj.d((asic)askm);
        if (askm.tx()) {
            return;
        }
        try {
            final Object call = this.a.call();
            asjv.b(call, "Callable returned null");
            askm.f(call);
        }
        finally {
            final Throwable t;
            asey.d(t);
            if (!askm.tx()) {
                ashj.b(t);
                return;
            }
            aulo.r(t);
        }
    }
}
