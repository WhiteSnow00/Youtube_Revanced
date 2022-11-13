import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aszm extends asht
{
    final Callable a;
    
    public aszm(final Callable a) {
        this.a = a;
    }
    
    public final void f(final ashy ashy) {
        final Throwable t;
        try {
            askk.b((Object)this.a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        finally {
            asgz.c(t);
        }
        asjw.g(t, ashy);
    }
}
