import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class astw extends AtomicReference implements Runnable, aukg
{
    private static final long serialVersionUID = -2809475196591179431L;
    final aukf a;
    volatile boolean b;
    
    public astw(final aukf a) {
        this.a = a;
    }
    
    public final void e(final long n) {
        if (athz.h(n)) {
            this.b = true;
        }
    }
    
    @Override
    public final void run() {
        if (this.get() != asjv.a) {
            if (this.b) {
                this.a.tu((Object)0L);
                this.lazySet(asjw.a);
                this.a.tx();
                return;
            }
            this.lazySet(asjw.a);
            this.a.b((Throwable)new asja("Can't deliver value due to lack of requests"));
        }
    }
    
    public final void tt() {
        asjv.b((AtomicReference)this);
    }
}
