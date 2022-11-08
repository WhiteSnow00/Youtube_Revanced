import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class atiw extends AtomicBoolean implements asic
{
    private static final long serialVersionUID = 3562861878281475070L;
    final ashj a;
    final atix b;
    
    public atiw(final ashj a, final atix b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        if (this.compareAndSet(false, true)) {
            this.b.aR(this);
        }
    }
    
    public final boolean tx() {
        return this.get();
    }
}
