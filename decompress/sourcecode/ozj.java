import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozj
{
    mnm a;
    mnm b;
    private final Context c;
    private final Executor d;
    
    public ozj() {
    }
    
    public ozj(final Context c, final Executor d) {
        this.c = c;
        this.d = d;
    }
    
    public final mnm a(final oyx oyx) {
        synchronized (this) {
            int b = oyx.b;
            if (--b == 0 || b == 1) {
                if (this.a == null) {
                    this.a = mnm.a(this.c, "NOOP_LOG_SOURCE_NAME").a();
                }
                return this.a;
            }
            if (b != 2) {
                return null;
            }
            if (this.b == null) {
                this.b = mnm.c(this.c, "NOOP_LOG_SOURCE_NAME");
            }
            return this.b;
        }
    }
    
    public final ListenableFuture b(final ozi ozi, final ListenableFuture listenableFuture) {
        return afqv.f(afrp.f(listenableFuture, (afry)new iho(this, ozi.b, (aext)new eto(ozi, 20), ozi.a, 2), this.d), mpn.class, (afry)grl.h, (Executor)afsl.a);
    }
}
