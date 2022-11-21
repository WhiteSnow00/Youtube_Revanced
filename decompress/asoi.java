import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class asoi extends AtomicBoolean implements asln
{
    private static final long serialVersionUID = 8943152917179642732L;
    final asjz a;
    final asoj b;
    
    public asoi(final asoj b, final asjz a) {
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
    public final boolean tz() {
        return this.get();
    }
}
