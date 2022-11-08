import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aszq extends ashe
{
    final Future a;
    
    public aszq(final Future a) {
        this.a = a;
    }
    
    public final void f(final ashj ashj) {
        final askm askm = new askm(ashj);
        ashj.d((asic)askm);
        if (!askm.tx()) {
            try {
                final Object value = this.a.get();
                asjv.b(value, "Future returned null");
                askm.f(value);
            }
            finally {
                final Throwable t;
                asey.d(t);
                if (!askm.tx()) {
                    ashj.b(t);
                }
            }
        }
    }
}
