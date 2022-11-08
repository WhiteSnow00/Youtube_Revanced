import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atdy extends ashp
{
    final Callable a;
    
    public atdy(final Callable a) {
        this.a = a;
    }
    
    protected final void ae(final ashq ashq) {
        try {
            final ashs ashs = this.a.call();
            asjv.b((Object)ashs, "The singleSupplier returned a null SingleSource");
            ashs.ad(ashq);
        }
        finally {
            final Throwable t;
            asey.d(t);
            asjh.h(t, ashq);
        }
    }
}
