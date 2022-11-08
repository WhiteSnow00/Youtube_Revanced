import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asme implements asgo
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public asme(final acb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asme(final asmf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        if (this.b != 0) {
            ((acb)this.a).d(t);
            return;
        }
        ((asmf)this.a).a.dispose();
        ((asmf)this.a).b.b(t);
    }
    
    public final void d(final asic asic) {
        if (this.b != 0) {
            final Object a = this.a;
            asic.getClass();
            ((acb)a).a((Runnable)new tjb(asic, 7), (Executor)afsl.a);
            return;
        }
        ((asmf)this.a).a.c(asic);
    }
    
    public final void tu() {
        if (this.b != 0) {
            ((acb)this.a).c(null);
            return;
        }
        ((asmf)this.a).a.dispose();
        ((asmf)this.a).b.tu();
    }
}
