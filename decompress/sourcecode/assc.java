import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class assc extends asgt
{
    final Object b;
    final asjc c;
    
    public assc(final Object b, final asjc c) {
        this.b = b;
        this.c = c;
    }
    
    public final void at(final aujp aujp) {
        try {
            final aujo aujo = (aujo)this.c.a(this.b);
            asjv.b((Object)aujo, "The mapper returned a null Publisher");
            if (aujo instanceof Callable) {
                try {
                    final Object call = ((Callable<Object>)aujo).call();
                    if (call == null) {
                        athe.d(aujp);
                        return;
                    }
                    aujp.f((aujq)new athf(aujp, call));
                    return;
                }
                finally {
                    final Throwable t;
                    asey.d(t);
                    athe.f(t, aujp);
                    return;
                }
            }
            aujo.as(aujp);
        }
        finally {
            final Throwable t2;
            athe.f(t2, aujp);
        }
    }
}
