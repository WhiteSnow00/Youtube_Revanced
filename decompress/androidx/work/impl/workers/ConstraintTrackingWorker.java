// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.workers;

import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;
import androidx.work.WorkerParameters;

public final class ConstraintTrackingWorker extends cmq implements cpb
{
    public final WorkerParameters a;
    public final Object b;
    public volatile boolean g;
    public cmq h;
    public final ctj i;
    
    public ConstraintTrackingWorker(final Context context, final WorkerParameters a) {
        context.getClass();
        a.getClass();
        super(context, a);
        this.a = a;
        this.b = new Object();
        this.i = ctj.f();
    }
    
    public final ListenableFuture b() {
        this.h().execute(new cdi(this, 14));
        return (ListenableFuture)this.i;
    }
    
    public final void d() {
        final cmq h = this.h;
        if (h != null && !h.e) {
            h.i();
        }
    }
    
    public final void e(final List list) {
    }
    
    public final void f(final List list) {
        cmr.a();
        final String a = ctm.a;
        new StringBuilder("Constraints changed for ").append(list);
        list.toString();
        synchronized (this.b) {
            this.g = true;
        }
    }
}
