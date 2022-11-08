import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.SettableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class pqd implements Runnable
{
    final Runnable a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ pqe d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ pqg g;
    
    public pqd(final pqg g, final Runnable b, final SettableFuture c, final pqe d, final long e, final TimeUnit f) {
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = this;
    }
    
    @Override
    public final void run() {
        ((afsu)this.g).execute((Runnable)new pqc(this, this.b, this.c, this.d, this.e, this.f));
    }
}
