import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class askv extends AtomicReference implements asgo, asic
{
    private static final long serialVersionUID = -4101678820158072998L;
    final asgo a;
    final asgq b;
    
    public askv(final asgo a, final asgq b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void d(final asic asic) {
        if (asjg.f(this, asic)) {
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void tu() {
        this.b.Y((asgo)new asku(this, this.a));
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
