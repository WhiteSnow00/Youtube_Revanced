import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class askx extends AtomicBoolean implements asic
{
    private static final long serialVersionUID = 8943152917179642732L;
    final asgo a;
    final /* synthetic */ asky b;
    
    public askx(final asky b, final asgo a) {
        this.b = b;
        this.a = a;
    }
    
    public final void dispose() {
        if (this.compareAndSet(false, true)) {
            this.b.aa(this);
        }
    }
    
    public final boolean tx() {
        return this.get();
    }
}
