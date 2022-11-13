import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adiw
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final adii e;
    public final Handler f;
    public final AtomicReference g;
    public final AtomicReference h;
    public final adiz i;
    public ScheduledExecutorService j;
    public String k;
    
    public adiw(final adiz i, final adii e, final tnu tnu, final atke atke, final atke atke2) {
        this.k = null;
        this.i = i;
        final tos tos = (tos)i.e;
        this.a = tos.c();
        this.b = tos.b();
        this.c = tos.f();
        this.d = Math.max(tos.e(), 50L);
        this.e = e;
        this.j = (ScheduledExecutorService)i.b;
        final int n = (int)tnu.e(tnu.aE);
        if (n == 1) {
            this.j = (ScheduledExecutorService)atke2.a();
        }
        else if (n == 2) {
            this.j = (ScheduledExecutorService)atke.a();
        }
        else if (n == 3) {
            this.j = Executors.newScheduledThreadPool(1, (ThreadFactory)new tej(-1, "anrV2", 0));
        }
        else if (n == 5) {
            this.j = Executors.newScheduledThreadPool(1, (ThreadFactory)new tej(0, "anrV2Critical", 0));
        }
        else if (n == 6) {
            this.j = Executors.newScheduledThreadPool(1, (ThreadFactory)new tej(1, "anrV2Background", 0));
        }
        this.f = new Handler(((Context)i.c).getMainLooper());
        this.g = new AtomicReference();
        this.h = new AtomicReference((V)new adim(((oby)i.d).g(), false));
    }
}
