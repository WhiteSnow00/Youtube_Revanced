import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class atem extends AtomicBoolean implements asir
{
    private static final long serialVersionUID = 7514387411091976596L;
    final asif a;
    final aten b;
    
    public atem(final asif a, final aten b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void dispose() {
        if (this.compareAndSet(false, true)) {
            this.b.ag(this);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get();
    }
}
