import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkl
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final adjy e;
    public final Handler f;
    public final AtomicReference g;
    public final AtomicReference h;
    public final adkp i;
    public ScheduledExecutorService j;
    public String k;
    
    public adkl(final adkp i, final adjy e, final tov tov, final atnb atnb, final atnb atnb2) {
        this.k = null;
        this.i = i;
        final tpt tpt = (tpt)i.e;
        this.a = tpt.c();
        this.b = tpt.b();
        this.c = tpt.f();
        this.d = Math.max(tpt.e(), 50L);
        this.e = e;
        this.j = (ScheduledExecutorService)i.b;
        final int n = (int)tov.e(tov.aE);
        if (n == 1) {
            this.j = (ScheduledExecutorService)atnb2.a();
        }
        else if (n == 2) {
            this.j = (ScheduledExecutorService)atnb.a();
        }
        else if (n == 3) {
            this.j = Executors.newScheduledThreadPool(1, (ThreadFactory)new tfm(-1, "anrV2", 0));
        }
        else if (n == 5) {
            this.j = Executors.newScheduledThreadPool(1, (ThreadFactory)new tfm(0, "anrV2Critical", 0));
        }
        else if (n == 6) {
            this.j = Executors.newScheduledThreadPool(1, (ThreadFactory)new tfm(1, "anrV2Background", 0));
        }
        this.f = new Handler(((Context)i.c).getMainLooper());
        this.g = new AtomicReference();
        this.h = new AtomicReference((V)new adkc(((oco)i.d).g(), false));
    }
}
