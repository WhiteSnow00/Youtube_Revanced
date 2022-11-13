import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslm extends AtomicBoolean implements asir
{
    private static final long serialVersionUID = 8943152917179642732L;
    final ashd a;
    final asln b;
    
    public aslm(final asln b, final ashd a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        if (this.compareAndSet(false, true)) {
            this.b.aa(this);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get();
    }
}
