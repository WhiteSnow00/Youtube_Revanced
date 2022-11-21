import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqr implements Executor
{
    public final Object a;
    private final int b;
    
    public bqr(final Handler a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bqr(final cco a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bqr(final zrn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        final int b = this.b;
        if (b == 0) {
            ((Handler)this.a).post(runnable);
            return;
        }
        if (b == 1) {
            ((Handler)this.a).post(runnable);
            return;
        }
        if (b == 2) {
            ((Handler)this.a).post(runnable);
            return;
        }
        if (b == 3) {
            ((Handler)this.a).post(runnable);
            return;
        }
        if (b != 4) {
            ((zrn)this.a).a();
            return;
        }
        ((Handler)this.a).post(runnable);
    }
}
