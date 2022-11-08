import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asth extends AtomicReference implements Runnable, aujq
{
    private static final long serialVersionUID = -2809475196591179431L;
    final aujp a;
    volatile boolean b;
    
    public asth(final aujp a) {
        this.a = a;
    }
    
    public final void e(final long n) {
        if (athh.h(n)) {
            this.b = true;
        }
    }
    
    @Override
    public final void run() {
        if (this.get() != asjg.a) {
            if (this.b) {
                this.a.tr((Object)0L);
                this.lazySet(asjh.a);
                this.a.tu();
                return;
            }
            this.lazySet(asjh.a);
            this.a.b((Throwable)new asil("Can't deliver value due to lack of requests"));
        }
    }
    
    public final void tq() {
        asjg.b(this);
    }
}
