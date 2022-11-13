import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fks
{
    public final AtomicInteger a;
    public final asiq b;
    public final ashi c;
    public final Executor d;
    public final oby e;
    public long f;
    
    public fks(final ashi c, final Executor d, final oby e) {
        this.a = new AtomicInteger(0);
        this.b = new asiq();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = e.d();
    }
}
