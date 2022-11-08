import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asyu extends ashe
{
    final Callable a;
    
    public asyu(final Callable a) {
        this.a = a;
    }
    
    public final void f(final ashj ashj) {
        final Throwable t;
        try {
            asjv.b((Object)this.a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        finally {
            asey.d(t);
        }
        asjh.g(t, ashj);
    }
}
