import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkl
{
    public final AtomicInteger a;
    public final asib b;
    public final asgt c;
    public final Executor d;
    public final oas e;
    public long f;
    
    public fkl(final asgt c, final Executor d, final oas e) {
        this.a = new AtomicInteger(0);
        this.b = new asib();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = e.d();
    }
}
