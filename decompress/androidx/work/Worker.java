// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;

public abstract class Worker extends cmq
{
    public ctj a;
    
    public Worker(final Context context, final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    public final ListenableFuture a() {
        final ctj f = ctj.f();
        this.h().execute(new cdi(f, 11));
        return (ListenableFuture)f;
    }
    
    public final ListenableFuture b() {
        this.a = ctj.f();
        this.h().execute(new cdi(this, 10));
        return (ListenableFuture)this.a;
    }
    
    public abstract ckx c();
}
