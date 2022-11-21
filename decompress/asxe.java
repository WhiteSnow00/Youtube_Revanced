import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxe extends AtomicReference implements asln
{
    private static final long serialVersionUID = -5791853038359966195L;
    final askk a;
    
    public asxe(final askk a, final asxf asxf) {
        super(asxf);
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        final asxf asxf = this.getAndSet(null);
        if (asxf != null) {
            asxf.ai(this);
        }
    }
    
    @Override
    public final boolean tz() {
        return this.get() == null;
    }
}
