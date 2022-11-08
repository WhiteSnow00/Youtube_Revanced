import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import androidx.work.WorkerParameters;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aepq implements aekn
{
    private final aepp a;
    
    public aepq(final aepp a) {
        this.a = a;
    }
    
    public final ListenableFuture a(final WorkerParameters workerParameters) {
        return afrp.e(this.a.f(), (aexg)aekx.d, (Executor)afsl.a);
    }
}
