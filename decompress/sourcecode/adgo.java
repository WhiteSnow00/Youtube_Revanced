import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgo
{
    public final long a;
    public final long b;
    public final long c;
    public final adge d;
    public final Handler e;
    public final AtomicReference f;
    public final AtomicReference g;
    public final adgw h;
    public ScheduledExecutorService i;
    
    public adgo(final adgw h, final adge d, final tlq tlq, final atjj atjj, final atjj atjj2) {
        this.h = h;
        final tmm tmm = (tmm)h.e;
        this.a = tmm.b();
        this.b = tmm.f();
        this.c = Math.max(tmm.e(), 50L);
        this.d = d;
        this.i = (ScheduledExecutorService)h.b;
        final int n = (int)tlq.e(tlq.aD);
        if (n == 1) {
            this.i = (ScheduledExecutorService)atjj2.a();
        }
        else if (n == 2) {
            this.i = (ScheduledExecutorService)atjj.a();
        }
        else if (n == 3) {
            this.i = Executors.newScheduledThreadPool(1, (ThreadFactory)new tce(-1, "anrV2", 0));
        }
        else if (n == 5) {
            this.i = Executors.newScheduledThreadPool(1, (ThreadFactory)new tce(0, "anrV2Critical", 0));
        }
        else if (n == 6) {
            this.i = Executors.newScheduledThreadPool(1, (ThreadFactory)new tce(1, "anrV2Background", 0));
        }
        this.e = new Handler(((Context)h.c).getMainLooper());
        this.f = new AtomicReference();
        this.g = new AtomicReference((V)new adgk(((oas)h.d).g(), false));
    }
}
