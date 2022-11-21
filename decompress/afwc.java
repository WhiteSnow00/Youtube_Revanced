import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwc extends afvk
{
    private afwb c;
    
    public afwc(final affy affy, final boolean b, final Executor executor, final afvp afvp) {
        super(affy, b, false);
        this.c = (afwb)new afvz(this, afvp, executor);
        this.n();
    }
    
    public afwc(final affy affy, final boolean b, final Executor executor, final Callable callable) {
        super(affy, b, false);
        this.c = (afwb)new afwa(this, callable, executor);
        this.n();
    }
    
    static /* bridge */ void p(final afwc afwc) {
        afwc.c = null;
    }
    
    public final void d(final int n, final Object o) {
    }
    
    protected final void j() {
        final afwb c = this.c;
        if (c != null) {
            c.h();
        }
    }
    
    public final void m() {
        final afwb c = this.c;
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
