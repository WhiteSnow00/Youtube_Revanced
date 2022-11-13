import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqf implements iqk
{
    public final fln a;
    public final fln b;
    private final iqk c;
    private final Executor d;
    
    public iqf(final fln a, final fln b, final iqk c, final Executor d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final ListenableFuture g() {
        return aftq.f((ListenableFuture)afvk.m(this.c.g()), (aftz)new ila(this, 6), this.d);
    }
}
