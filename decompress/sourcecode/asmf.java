import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class asmf implements Runnable
{
    final asib a;
    final asgo b;
    final /* synthetic */ asmh c;
    private final AtomicBoolean d;
    
    public asmf(final asmh c, final AtomicBoolean d, final asib a, final asgo b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            this.a.b();
            final asgq e = this.c.e;
            if (e == null) {
                final asgo b = this.b;
                final asmh c = this.c;
                b.b(new TimeoutException(athp.c(c.b, c.c)));
                return;
            }
            e.Y((asgo)new asme(this, 0));
        }
    }
}
