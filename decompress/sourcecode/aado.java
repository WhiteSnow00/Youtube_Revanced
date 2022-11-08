import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class aado implements Executor
{
    final /* synthetic */ aadq a;
    private final Handler b;
    
    public aado(final aadq a) {
        this.a = a;
        this.b = new Handler(a.getMainLooper());
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.b.post(runnable);
    }
}
