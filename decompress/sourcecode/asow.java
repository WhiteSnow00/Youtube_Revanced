import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asow extends AtomicReference implements asgo, asic
{
    private static final long serialVersionUID = 8606673141535671828L;
    final /* synthetic */ asox a;
    
    public asow(final asox a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        final asox a = this.a;
        a.d.d((asic)this);
        a.b(t);
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void tu() {
        final asox a = this.a;
        a.d.d((asic)this);
        a.tu();
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
