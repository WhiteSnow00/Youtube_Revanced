import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atbq extends ashe
{
    final Object a;
    final asjc b;
    
    public atbq(final Object a, final asjc b) {
        this.a = a;
        this.b = b;
    }
    
    public final void f(final ashj ashj) {
        try {
            final ashh ashh = (ashh)this.b.a(this.a);
            asjv.b((Object)ashh, "The mapper returned a null ObservableSource");
            if (ashh instanceof Callable) {
                try {
                    final Object call = ((Callable<Object>)ashh).call();
                    if (call == null) {
                        asjh.d(ashj);
                        return;
                    }
                    final atbp atbp = new atbp(ashj, call);
                    ashj.d((asic)atbp);
                    atbp.run();
                    return;
                }
                finally {
                    final Throwable t;
                    asey.d(t);
                    asjh.g(t, ashj);
                    return;
                }
            }
            ashh.aJ(ashj);
        }
        finally {
            final Throwable t2;
            asjh.g(t2, ashj);
        }
    }
}
