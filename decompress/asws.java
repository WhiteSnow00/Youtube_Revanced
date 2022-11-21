import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asws extends AtomicReference implements Runnable, aunb
{
    private static final long serialVersionUID = -2809475196591179431L;
    final auna a;
    volatile boolean b;
    
    public asws(final auna a) {
        this.a = a;
    }
    
    @Override
    public final void e(final long n) {
        if (atkw.h(n)) {
            this.b = true;
        }
    }
    
    @Override
    public final void run() {
        if (this.get() != asmr.a) {
            if (this.b) {
                this.a.tt(0L);
                this.lazySet(asms.a);
                this.a.tw();
                return;
            }
            this.lazySet(asms.a);
            this.a.b(new aslw("Can't deliver value due to lack of requests"));
        }
    }
    
    @Override
    public final void ts() {
        asmr.b(this);
    }
}
