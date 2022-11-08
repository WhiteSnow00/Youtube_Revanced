import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atei extends ashp
{
    final Callable a;
    
    public atei(final Callable a) {
        this.a = a;
    }
    
    protected final void ae(final ashq ashq) {
        final Throwable t;
        try {
            asjv.b((Object)((asjs)this.a).a, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        finally {
            asey.d(t);
        }
        asjh.h(t, ashq);
    }
}
