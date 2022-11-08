import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovf implements ashj
{
    final /* synthetic */ ashj a;
    final /* synthetic */ mck b;
    private final AtomicBoolean c;
    
    public ovf(final mck b, final ashj a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        this.c = new AtomicBoolean();
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void d(final asic asic) {
        this.a.d(asic);
    }
    
    public final void tr(final Object o) {
        if (this.c.compareAndSet(false, true)) {
            try {
                ((asix)this.b.a).a(o);
            }
            catch (final Exception ex) {
                throw new otf("Error happened with doOnFirst Action", ex);
            }
        }
        this.a.tr(o);
    }
    
    public final void tu() {
        this.a.tu();
    }
}
