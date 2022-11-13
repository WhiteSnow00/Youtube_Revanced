import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvd implements asho
{
    final AtomicReference a;
    private final int b;
    
    public asvd(final asvb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asvd(final asve a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b != 0) {
            ((asvb)this.a).a.b(t);
            return;
        }
        ((asve)this.a).a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (this.b != 0) {
            asjv.f(this.a, asir);
            return;
        }
        asjv.f(this.a, asir);
    }
    
    @Override
    public final void ts(final Object o) {
        if (this.b != 0) {
            ((asvb)this.a).a.ts(o);
            return;
        }
        ((asve)this.a).a.ts(o);
    }
    
    @Override
    public final void tx() {
        if (this.b != 0) {
            ((asvb)this.a).a.tx();
            return;
        }
        ((asve)this.a).a.tx();
    }
}
