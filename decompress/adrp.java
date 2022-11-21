import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adrp implements ListenableFuture
{
    public final String a;
    public final ListenableFuture b;
    public final adrf c;
    private final adrm d;
    
    public adrp(final String a, final adrm d, final adrf c, final ListenableFuture b) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public final adrp a(final adrh adrh) {
        final adrm d = this.d;
        final String a = this.a;
        final adrf c = this.c;
        return new adrp(a, d, c, afvh.f((ListenableFuture)this, (afvq)new vdx(d, a, adrh, c, 5), (Executor)afwd.a));
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        this.b.addListener(runnable, executor);
    }
    
    public final void b(final Runnable runnable) {
        this.addListener(runnable, this.d.c);
    }
    
    public final boolean cancel(final boolean b) {
        return this.b.cancel(b);
    }
    
    public final /* bridge */ Object get() {
        return this.b.get();
    }
    
    public final /* bridge */ Object get(final long n, final TimeUnit timeUnit) {
        return this.b.get(n, timeUnit);
    }
    
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }
    
    public final boolean isDone() {
        return this.b.isDone();
    }
}
