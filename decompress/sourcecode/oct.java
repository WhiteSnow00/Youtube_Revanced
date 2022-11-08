import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.SettableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oct implements Runnable
{
    final Runnable a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ ocu d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ pqg g;
    
    public oct(final pqg g, final Runnable b, final SettableFuture c, final ocu d, final long e, final TimeUnit f, final byte[] array) {
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
        ((afsu)this.g).execute((Runnable)new ocs(this, this.b, this.c, this.d, this.e, this.f));
    }
}
