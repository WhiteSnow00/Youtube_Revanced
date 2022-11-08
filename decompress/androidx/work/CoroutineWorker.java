// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import android.content.Context;

public abstract class CoroutineWorker extends cmq
{
    public final atre a;
    public final ctj b;
    private final atpu g;
    
    public CoroutineWorker(final Context context, final WorkerParameters workerParameters) {
        context.getClass();
        workerParameters.getClass();
        super(context, workerParameters);
        this.a = aqql.q();
        (this.b = ctj.f()).addListener((Runnable)new cdi(this, 9), (Executor)super.d.h.c);
        this.g = atql.a;
    }
    
    public final ListenableFuture a() {
        final atre q = aqql.q();
        final atpz i = aume.i(((atky)this.g).plus((atli)q));
        final cmm cmm = new cmm((atrb)q, ctj.f());
        aujh.k(i, (atmp)new cmf(cmm, this, null));
        return (ListenableFuture)cmm;
    }
    
    public final ListenableFuture b() {
        aujh.k(aume.i(((atky)this.g).plus((atli)this.a)), (atmp)new cmg(this, null));
        return (ListenableFuture)this.b;
    }
    
    public abstract Object c(final atld p0);
    
    public final void d() {
        this.b.cancel(false);
    }
}
