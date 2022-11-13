import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atfa extends asie
{
    final Callable a;
    
    public atfa(final Callable a) {
        this.a = a;
    }
    
    protected final void af(final asif asif) {
        final Throwable t;
        try {
            askk.b((Object)((askh)this.a).a, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        finally {
            asgz.c(t);
        }
        asjw.h(t, asif);
    }
}
