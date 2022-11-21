import java.util.Set;
import java.util.concurrent.Executor;
import java.util.UUID;
import com.google.common.util.concurrent.ListenableFuture;
import androidx.work.WorkerParameters;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cmu
{
    public Context c;
    public WorkerParameters d;
    public volatile boolean e;
    public boolean f;
    
    public cmu(final Context c, final WorkerParameters d) {
        if (c == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (d != null) {
            this.c = c;
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("WorkerParameters is null");
    }
    
    public ListenableFuture a() {
        final ctn f = ctn.f();
        f.d((Throwable)new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return (ListenableFuture)f;
    }
    
    public abstract ListenableFuture b();
    
    public void d() {
    }
    
    public final UUID g() {
        return this.d.a;
    }
    
    public final Executor h() {
        return this.d.e;
    }
    
    public final void i() {
        this.e = true;
        this.d();
    }
    
    public final cml ln() {
        return this.d.b;
    }
    
    public final Set lo() {
        return this.d.c;
    }
}
