import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class ieb extends icy
{
    private final zvp a;
    private final zki b;
    private final Executor c;
    
    public ieb(final zvp a, final zki b, final Executor c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final ListenableFuture o(final vdv vdv, final zzl zzl) {
        return (ListenableFuture)aete.f(this.a.b(this.b.c(), zzl.a())).g((aexg)new etw(vdv, zzl, 10), this.c);
    }
    
    public final ListenableFuture c(final aack aack) {
        return this.a.a(this.b.c());
    }
    
    public final ListenableFuture f(final vdv vdv, final zzl zzl) {
        return this.o(vdv, zzl);
    }
    
    public final ListenableFuture g(final vdv vdv, final String s) {
        return afld.k((Callable)new hlc(vdv, s, 17), this.c);
    }
    
    public final ListenableFuture j(final vdv vdv, final zzl zzl) {
        return this.o(vdv, zzl);
    }
}
