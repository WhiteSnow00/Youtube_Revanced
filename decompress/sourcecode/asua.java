import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asua extends AtomicReference implements asgo, asic
{
    private static final long serialVersionUID = 703409937383992161L;
    final asgz a;
    final ashb b;
    
    public asua(final asgz a, final ashb b) {
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
        this.b.ag((asgz)new asvf(this, this.a, 1));
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
