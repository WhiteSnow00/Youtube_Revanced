import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class aslo extends AtomicReference implements asln
{
    private static final long serialVersionUID = 6537757548749041217L;
    
    public aslo(final Object o) {
        asng.b(o, "value is null");
        super(o);
    }
    
    protected abstract void a(final Object p0);
    
    @Override
    public final void dispose() {
        if (this.get() != null) {
            final Object andSet = this.getAndSet(null);
            if (andSet != null) {
                this.a(andSet);
            }
        }
    }
    
    @Override
    public final boolean tz() {
        return this.get() == null;
    }
}
