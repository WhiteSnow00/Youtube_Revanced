import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atiu extends AtomicReference implements asic
{
    private static final long serialVersionUID = -7650903191002190468L;
    final asgz a;
    
    public atiu(final asgz a, final ativ ativ) {
        this.a = a;
        this.lazySet(ativ);
    }
    
    public final void dispose() {
        final ativ ativ = this.getAndSet(null);
        if (ativ != null) {
            ativ.ai(this);
        }
    }
    
    public final boolean tx() {
        return this.get() == null;
    }
}
