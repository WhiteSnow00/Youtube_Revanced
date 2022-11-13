import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addy implements addx
{
    public final wxx a;
    public final adhf b;
    public final vai c;
    private final addt d;
    private final ScheduledExecutorService e;
    
    public addy(final addt d, final wxx a, final vai c, final ziy ziy, final adhf b, final asid asid, final ScheduledExecutorService e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = e;
        if (c.W()) {
            ((ashi)ziy.e).P(asid).am((asjm)new acpc(this, 2));
        }
    }
    
    public final ListenableFuture a() {
        final ListenableFuture b = this.d.b();
        ListenableFuture listenableFuture;
        if (!this.c.U() && !this.c.V()) {
            listenableFuture = afwm.m((Object)afeq.q());
        }
        else {
            listenableFuture = this.d.a();
        }
        return afwm.L(new ListenableFuture[] { b, listenableFuture }).j(aeun.i((Callable)new veu(this, b, listenableFuture, 11)), this.e);
    }
}
