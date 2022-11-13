import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipz implements Callable
{
    public final iqb a;
    public final ListenableFuture b;
    public final ListenableFuture c;
    public final ListenableFuture d;
    public final ListenableFuture e;
    public final ListenableFuture f;
    public final ListenableFuture g;
    public final imt h;
    public final int i;
    
    public ipz(final iqb a, final ListenableFuture b, final ListenableFuture c, final ListenableFuture d, final ListenableFuture e, final ListenableFuture f, final ListenableFuture g, final imt h, final int i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final Object call() {
        return this.a.c((afeq)afwm.u((Future)this.b), (ajhp)afwm.u((Future)this.c), (boolean)afwm.u((Future)this.d), (boolean)afwm.u((Future)this.e), (boolean)afwm.u((Future)this.f), (boolean)afwm.u((Future)this.g), this.h, this.i);
    }
}
