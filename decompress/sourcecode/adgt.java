import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgt
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final adgg e;
    public final Handler f;
    public final AtomicReference g;
    public final AtomicReference h;
    public final adgw i;
    public ScheduledExecutorService j;
    public String k;
    
    public adgt(final adgw i, final adgg e, final tlq tlq, final atjj atjj, final atjj atjj2) {
        this.k = null;
        this.i = i;
        final tmm tmm = (tmm)i.e;
        this.a = tmm.c();
        this.b = tmm.b();
        this.c = tmm.f();
        this.d = Math.max(tmm.e(), 50L);
        this.e = e;
        this.j = (ScheduledExecutorService)i.b;
        final int n = (int)tlq.e(tlq.aD);
        if (n == 1) {
            this.j = (ScheduledExecutorService)atjj2.a();
        }
        else if (n == 2) {
            this.j = (ScheduledExecutorService)atjj.a();
        }
        else if (n == 3) {
            this.j = Executors.newScheduledThreadPool(1, (ThreadFactory)new tce(-1, "anrV2", 0));
        }
        else if (n == 5) {
            this.j = Executors.newScheduledThreadPool(1, (ThreadFactory)new tce(0, "anrV2Critical", 0));
        }
        else if (n == 6) {
            this.j = Executors.newScheduledThreadPool(1, (ThreadFactory)new tce(1, "anrV2Background", 0));
        }
        this.f = new Handler(((Context)i.c).getMainLooper());
        this.g = new AtomicReference();
        this.h = new AtomicReference((V)new adgk(((oas)i.d).g(), false));
    }
}
