import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class asid extends AtomicReference implements asic
{
    private static final long serialVersionUID = 6537757548749041217L;
    
    public asid(final Object o) {
        asjv.b(o, "value is null");
        super(o);
    }
    
    protected abstract void a(final Object p0);
    
    public final void dispose() {
        if (this.get() != null) {
            final Object andSet = this.getAndSet(null);
            if (andSet != null) {
                this.a(andSet);
            }
        }
    }
    
    public final boolean tx() {
        return this.get() == null;
    }
}
