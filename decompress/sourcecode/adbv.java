import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbv implements adbu
{
    public final wvu a;
    public final adfc b;
    public final uyi c;
    private final adbq d;
    private final ScheduledExecutorService e;
    
    public adbv(final adbq d, final wvu a, final uyi c, final zhb zhb, final adfc b, final asho asho, final ScheduledExecutorService e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = e;
        if (c.V()) {
            ((asgt)zhb.e).P(asho).al((asix)new abtm(this, 17));
        }
    }
    
    @Override
    public final ListenableFuture a() {
        final ListenableFuture b = this.d.b();
        ListenableFuture listenableFuture;
        if (!this.c.T() && !this.c.U()) {
            listenableFuture = afva.m(afcr.q());
        }
        else {
            listenableFuture = this.d.a();
        }
        return afva.E(b, listenableFuture).j(aesm.i((Callable)new yxq(this, b, listenableFuture, 8)), (Executor)this.e);
    }
}
