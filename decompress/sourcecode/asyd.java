import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asyd extends ashe
{
    final Callable a;
    
    public asyd(final Callable a) {
        this.a = a;
    }
    
    public final void f(final ashj ashj) {
        try {
            final ashh ashh = this.a.call();
            asjv.b((Object)ashh, "null ObservableSource supplied");
            ashh.aJ(ashj);
        }
        finally {
            final Throwable t;
            asey.d(t);
            asjh.g(t, ashj);
        }
    }
}
