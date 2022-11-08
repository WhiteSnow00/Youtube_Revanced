import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asuo implements asgz
{
    final /* synthetic */ AtomicReference a;
    private final /* synthetic */ int b;
    
    public asuo(final asum a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asuo(final asup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        if (this.b != 0) {
            ((asum)this.a).a.b(t);
            return;
        }
        ((asup)this.a).a.b(t);
    }
    
    public final void d(final asic asic) {
        if (this.b != 0) {
            asjg.f(this.a, asic);
            return;
        }
        asjg.f(this.a, asic);
    }
    
    public final void tp(final Object o) {
        if (this.b != 0) {
            ((asum)this.a).a.tp(o);
            return;
        }
        ((asup)this.a).a.tp(o);
    }
    
    public final void tu() {
        if (this.b != 0) {
            ((asum)this.a).a.tu();
            return;
        }
        ((asup)this.a).a.tu();
    }
}
