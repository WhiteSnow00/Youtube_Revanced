import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asyv extends asht
{
    final Callable a;
    
    public asyv(final Callable a) {
        this.a = a;
    }
    
    public final void f(final ashy ashy) {
        try {
            final ashw ashw = this.a.call();
            askk.b((Object)ashw, "null ObservableSource supplied");
            ashw.aP(ashy);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            asjw.g(t, ashy);
        }
    }
}
