import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asmt implements ashd
{
    final Object a;
    private final int b;
    
    public asmt(final acc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asmt(final asmu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b != 0) {
            ((acc)this.a).d(t);
            return;
        }
        ((asmu)this.a).a.dispose();
        ((asmu)this.a).b.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (this.b != 0) {
            final Object a = this.a;
            asir.getClass();
            ((acc)a).a((Runnable)new tla(asir, 8), (Executor)afum.a);
            return;
        }
        ((asmu)this.a).a.c(asir);
    }
    
    @Override
    public final void tx() {
        if (this.b != 0) {
            ((acc)this.a).c((Object)null);
            return;
        }
        ((asmu)this.a).a.dispose();
        ((asmu)this.a).b.tx();
    }
}
