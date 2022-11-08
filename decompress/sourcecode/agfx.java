import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class agfx implements Executor
{
    private static final Handler a;
    
    static {
        a = new Handler(Looper.getMainLooper());
    }
    
    public agfx() {
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        agfx.a.post(runnable);
    }
}
