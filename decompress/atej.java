import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atej extends AtomicReference implements asln
{
    private static final long serialVersionUID = 7463222674719692880L;
    final asku a;
    
    public atej(final asku a, final atek atek) {
        this.a = a;
        this.lazySet(atek);
    }
    
    @Override
    public final void dispose() {
        final atek atek = this.getAndSet(null);
        if (atek != null) {
            atek.f(this);
        }
    }
    
    @Override
    public final boolean tz() {
        return this.get() == null;
    }
}
