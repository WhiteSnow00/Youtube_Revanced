import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbo extends AtomicReference implements Runnable, asln
{
    private static final long serialVersionUID = 6812032969491025141L;
    final Object a;
    final long b;
    final atbp c;
    final AtomicBoolean d;
    
    public atbo(final Object a, final long b, final atbp c) {
        this.d = new AtomicBoolean();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            final atbp c = this.c;
            final long b = this.b;
            final Object a = this.a;
            if (b == c.g) {
                c.a.tt(a);
                asmr.b(this);
            }
        }
    }
    
    @Override
    public final boolean tz() {
        return this.get() == asmr.a;
    }
}
