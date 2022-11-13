import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asaw extends arbu
{
    public volatile boolean a;
    public List b;
    public final arbu c;
    
    public asaw(final arbu c, final byte[] array, final byte[] array2) {
        this.b = new ArrayList();
        this.c = c;
    }
    
    private final void H(final Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.b.add(runnable);
                return;
            }
            monitorexit(this);
            runnable.run();
        }
    }
    
    @Override
    public final void a(final Status status, final arwk arwk) {
        this.H((Runnable)new arfj(this, status, arwk, 4));
    }
    
    @Override
    public final void b(final arwk arwk) {
        if (this.a) {
            this.c.b(arwk);
            return;
        }
        this.H((Runnable)new asat(this, arwk, 3));
    }
    
    @Override
    public final void c(final Object o) {
        if (this.a) {
            this.c.c(o);
            return;
        }
        this.H((Runnable)new asat(this, o, 4));
    }
    
    @Override
    public final void d() {
        if (this.a) {
            this.c.d();
            return;
        }
        this.H(new arcu(this, 15));
    }
}
