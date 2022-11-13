import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ateq extends asie
{
    final Callable a;
    
    public ateq(final Callable a) {
        this.a = a;
    }
    
    protected final void af(final asif asif) {
        try {
            final asih asih = this.a.call();
            askk.b((Object)asih, "The singleSupplier returned a null SingleSource");
            asih.ae(asif);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            asjw.h(t, asif);
        }
    }
}
