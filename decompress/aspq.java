import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspq implements Runnable
{
    final aslm a;
    final asjz b;
    final asps c;
    private final AtomicBoolean d;
    
    public aspq(final asps c, final AtomicBoolean d, final aslm a, final asjz b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            this.a.b();
            final askb e = this.c.e;
            if (e == null) {
                final asjz b = this.b;
                final asps c = this.c;
                b.b(new TimeoutException(atle.c(c.b, c.c)));
                return;
            }
            e.Y(new aspp(this, 0));
        }
    }
}
