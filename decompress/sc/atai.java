import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atai extends asht
{
    final Future a;
    
    public atai(final Future a) {
        this.a = a;
    }
    
    public final void f(final ashy ashy) {
        final aslb aslb = new aslb(ashy);
        ashy.d((asir)aslb);
        if (!aslb.tA()) {
            try {
                final Object value = this.a.get();
                askk.b(value, "Future returned null");
                aslb.f(value);
            }
            finally {
                final Throwable t;
                asgz.c(t);
                if (!aslb.tA()) {
                    ashy.b(t);
                }
            }
        }
    }
}
