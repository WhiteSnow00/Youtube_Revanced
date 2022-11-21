import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import androidx.work.WorkerParameters;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetj implements aeoh
{
    private final aeth a;
    
    public aetj(final aeth a) {
        this.a = a;
    }
    
    public final ListenableFuture a(final WorkerParameters workerParameters) {
        return afvh.e(this.a.f(), (afax)aemh.h, (Executor)afwd.a);
    }
    
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        return afxr.k(new UnsupportedOperationException("A NoAccountWorker or AccountWorker used by a TikTokWorkSpec with setExpedited() must override getForegroundInfoAsync() in order to support API levels < 31."));
    }
}
