import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwv
{
    public boolean a;
    public boolean b;
    public final AtomicInteger c;
    public final ListenableFuture[] d;
    public volatile int e;
    
    public afwv(final ListenableFuture[] d) {
        this.a = false;
        this.b = true;
        this.e = 0;
        this.d = d;
        this.c = new AtomicInteger(d.length);
    }
    
    public final void a() {
        if (this.c.decrementAndGet() == 0 && this.a) {
            for (final ListenableFuture listenableFuture : this.d) {
                if (listenableFuture != null) {
                    listenableFuture.cancel(this.b);
                }
            }
        }
    }
}
