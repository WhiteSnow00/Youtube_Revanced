import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atep extends AtomicReference implements Runnable, asmi
{
    private static final long serialVersionUID = -4552101107598366241L;
    final ater a;
    asln b;
    long c;
    boolean d;
    boolean e;
    
    public atep(final ater a) {
        this.a = a;
    }
    
    @Override
    public final /* bridge */ void a(final Object o) {
        final asln asln = (asln)o;
        asmr.h(this, asln);
        synchronized (this.a) {
            if (this.e) {
                ((asmu)this.a.a).tA(asln);
            }
        }
    }
    
    @Override
    public final void run() {
        this.a.c(this);
    }
}
