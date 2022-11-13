import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asbb implements asae
{
    public final asae a;
    public volatile boolean b;
    public List c;
    
    public asbb(final asae a) {
        this.c = new ArrayList();
        this.a = a;
    }
    
    private final void b(final Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
                return;
            }
            monitorexit(this);
            runnable.run();
        }
    }
    
    @Override
    public final void a(final Status status, final asad asad, final arwk arwk) {
        this.b(new aaxa(this, status, asad, arwk, 7));
    }
    
    @Override
    public final void c(final arwk arwk) {
        this.b((Runnable)new asat(this, arwk, 11));
    }
    
    @Override
    public final void d(final asft asft) {
        if (this.b) {
            this.a.d(asft);
            return;
        }
        this.b((Runnable)new asat(this, asft, 10));
    }
    
    @Override
    public final void e() {
        if (this.b) {
            this.a.e();
            return;
        }
        this.b((Runnable)new asba(this, 3));
    }
}
