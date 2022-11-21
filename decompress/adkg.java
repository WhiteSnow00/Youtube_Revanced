import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkg
{
    public final long a;
    public final long b;
    public final long c;
    public final adjw d;
    public final Handler e;
    public final AtomicReference f;
    public final AtomicReference g;
    public final adkp h;
    public ScheduledExecutorService i;
    
    public adkg(final adkp h, final adjw d, final tov tov, final atnb atnb, final atnb atnb2) {
        this.h = h;
        final tpt tpt = (tpt)h.e;
        this.a = tpt.b();
        this.b = tpt.f();
        this.c = Math.max(tpt.e(), 50L);
        this.d = d;
        this.i = (ScheduledExecutorService)h.b;
        final int n = (int)tov.e(tov.aE);
        if (n == 1) {
            this.i = (ScheduledExecutorService)atnb2.a();
        }
        else if (n == 2) {
            this.i = (ScheduledExecutorService)atnb.a();
        }
        else if (n == 3) {
            this.i = Executors.newScheduledThreadPool(1, (ThreadFactory)new tfm(-1, "anrV2", 0));
        }
        else if (n == 5) {
            this.i = Executors.newScheduledThreadPool(1, (ThreadFactory)new tfm(0, "anrV2Critical", 0));
        }
        else if (n == 6) {
            this.i = Executors.newScheduledThreadPool(1, (ThreadFactory)new tfm(1, "anrV2Background", 0));
        }
        this.e = new Handler(((Context)h.c).getMainLooper());
        this.f = new AtomicReference();
        this.g = new AtomicReference((V)new adkc(((oco)h.d).g(), false));
    }
}
