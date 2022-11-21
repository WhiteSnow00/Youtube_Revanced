import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aspp implements asjz
{
    final Object a;
    private final int b;
    
    public aspp(final acd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aspp(final aspq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b != 0) {
            ((acd)this.a).d(t);
            return;
        }
        ((aspq)this.a).a.dispose();
        ((aspq)this.a).b.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        if (this.b != 0) {
            final Object a = this.a;
            asln.getClass();
            ((acd)a).a((Runnable)new tpk(asln, 5), (Executor)afwd.a);
            return;
        }
        ((aspq)this.a).a.c(asln);
    }
    
    @Override
    public final void tw() {
        if (this.b != 0) {
            ((acd)this.a).c((Object)null);
            return;
        }
        ((aspq)this.a).a.dispose();
        ((aspq)this.a).b.tw();
    }
}
