import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afsk extends afrs
{
    private afsj c;
    
    public afsk(final afci afci, final boolean b, final Executor executor, final afrx afrx) {
        super(afci, b, false);
        this.c = new afsh(this, afrx, executor);
        this.n();
    }
    
    public afsk(final afci afci, final boolean b, final Executor executor, final Callable callable) {
        super(afci, b, false);
        this.c = new afsi(this, callable, executor);
        this.n();
    }
    
    public final void d(final int n, final Object o) {
    }
    
    protected final void j() {
        final afsj c = this.c;
        if (c != null) {
            c.h();
        }
    }
    
    public final void m() {
        final afsj c = this.c;
        if (c != null) {
            c.f();
        }
    }
    
    public final void o(final int n) {
        super.o(n);
        if (n == 1) {
            this.c = null;
        }
    }
}
