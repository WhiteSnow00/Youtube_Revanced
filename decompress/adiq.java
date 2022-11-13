import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adiq
{
    public final long a;
    public final long b;
    public final long c;
    public final adig d;
    public final Handler e;
    public final AtomicReference f;
    public final AtomicReference g;
    public final adiz h;
    public ScheduledExecutorService i;
    
    public adiq(final adiz h, final adig d, final tnu tnu, final atke atke, final atke atke2) {
        this.h = h;
        final tos tos = (tos)h.e;
        this.a = tos.b();
        this.b = tos.f();
        this.c = Math.max(tos.e(), 50L);
        this.d = d;
        this.i = (ScheduledExecutorService)h.b;
        final int n = (int)tnu.e(tnu.aE);
        if (n == 1) {
            this.i = (ScheduledExecutorService)atke2.a();
        }
        else if (n == 2) {
            this.i = (ScheduledExecutorService)atke.a();
        }
        else if (n == 3) {
            this.i = Executors.newScheduledThreadPool(1, (ThreadFactory)new tej(-1, "anrV2", 0));
        }
        else if (n == 5) {
            this.i = Executors.newScheduledThreadPool(1, (ThreadFactory)new tej(0, "anrV2Critical", 0));
        }
        else if (n == 6) {
            this.i = Executors.newScheduledThreadPool(1, (ThreadFactory)new tej(1, "anrV2Background", 0));
        }
        this.e = new Handler(((Context)h.c).getMainLooper());
        this.f = new AtomicReference();
        this.g = new AtomicReference((V)new adim(((oby)h.d).g(), false));
    }
}
