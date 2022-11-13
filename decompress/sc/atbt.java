import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbt extends AtomicReference implements Runnable, asjm
{
    private static final long serialVersionUID = -4552101107598366241L;
    final atbv a;
    asir b;
    long c;
    boolean d;
    boolean e;
    
    public atbt(final atbv a) {
        this.a = a;
    }
    
    @Override
    public final /* bridge */ void a(final Object o) {
        final asir asir = (asir)o;
        asjv.h(this, asir);
        synchronized (this.a) {
            if (this.e) {
                ((asjy)this.a.a).tB(asir);
            }
        }
    }
    
    @Override
    public final void run() {
        this.a.c(this);
    }
}
