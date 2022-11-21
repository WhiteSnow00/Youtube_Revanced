import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class aahh implements Executor
{
    final aahj a;
    private final Handler b;
    
    public aahh(final aahj a) {
        this.a = a;
        this.b = new Handler(a.getMainLooper());
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.b.post(runnable);
    }
}
