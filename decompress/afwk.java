import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwk
{
    public asdz a;
    private final AtomicReference b;
    
    private afwk() {
        this.b = new AtomicReference((V)afxe.a);
        this.a = new asdz((byte[])null, (byte[])null);
    }
    
    public static afwk a() {
        return new afwk();
    }
    
    public final ListenableFuture b(final afvp afvp, final Executor executor) {
        afvp.getClass();
        executor.getClass();
        final afwj afwj = new afwj(executor, this);
        final aewb aewb = new aewb(afwj, afvp, 2);
        final SettableFuture create = SettableFuture.create();
        final ListenableFuture listenableFuture = this.b.getAndSet(create);
        final afyc c = afyc.c((afvp)aewb);
        listenableFuture.addListener((Runnable)c, (Executor)afwj);
        final ListenableFuture m = afxr.m((ListenableFuture)c);
        final afwg afwg = new afwg(c, create, listenableFuture, m, afwj);
        m.addListener((Runnable)afwg, (Executor)afwd.a);
        ((afvd)c).addListener(afwg, afwd.a);
        return m;
    }
}
