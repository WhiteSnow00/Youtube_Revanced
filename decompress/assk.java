import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class assk extends AtomicReference implements asjz, asln
{
    private static final long serialVersionUID = 8606673141535671828L;
    final assl a;
    
    public assk(final assl a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final assl a = this.a;
        a.d.d(this);
        a.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void tw() {
        final assl a = this.a;
        a.d.d(this);
        a.tw();
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
