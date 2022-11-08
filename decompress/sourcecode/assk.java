import java.util.Collection;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class assk extends ashp implements asjx
{
    final asgt a;
    final Object b;
    private final /* synthetic */ int c;
    
    public assk(final asgt a, final int c) {
        this.c = c;
        final athk a2 = athk.a;
        this.a = a;
        this.b = a2;
    }
    
    public assk(final asgt a, final Object b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final asgt a() {
        final int c = this.c;
        if (c == 0) {
            final assi assi = new assi(this.a, this.b);
            final asjc j = aulo.j;
            return (asgt)assi;
        }
        if (c != 1) {
            final astk astk = new astk(this.a, (Callable)this.b);
            final asjc i = aulo.j;
            return (asgt)astk;
        }
        final asok asok = new asok(this.a, this.b, true);
        final asjc k = aulo.j;
        return (asgt)asok;
    }
    
    protected final void ae(final ashq ashq) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                try {
                    this.a.ar((asgw)new astl(ashq, ((athk)this.b).b()));
                    return;
                }
                finally {
                    final Throwable t;
                    asey.d(t);
                    asjh.h(t, ashq);
                    return;
                }
            }
            this.a.ar((asgw)new ason(ashq, this.b));
            return;
        }
        this.a.ar((asgw)new assj(ashq, this.b));
    }
}
