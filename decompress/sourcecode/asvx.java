import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvx extends AtomicReference implements asgz
{
    private static final long serialVersionUID = 8663801314800248617L;
    final asvw a;
    
    public asvx(final asvw a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        final asvw a = this.a;
        if (asjg.b(a)) {
            a.a.b(t);
            return;
        }
        aulo.r(t);
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void tp(final Object o) {
        this.a.c();
    }
    
    public final void tu() {
        this.a.c();
    }
}
