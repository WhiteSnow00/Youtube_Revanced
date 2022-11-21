import android.util.Log;
import android.os.Looper;
import android.os.SystemClock;
import org.chromium.base.TraceEvent;
import android.os.MessageQueue$IdleHandler;

// 
// Decompiled by Procyon v0.6.0
// 

final class aueg extends auef implements MessageQueue$IdleHandler
{
    private long a;
    private long b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    
    public aueg() {
    }
    
    private final void c() {
        if (TraceEvent.m() && !this.f) {
            this.a = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler((MessageQueue$IdleHandler)this);
            this.f = true;
            return;
        }
        if (this.f && !TraceEvent.m()) {
            Looper.myQueue().removeIdleHandler((MessageQueue$IdleHandler)this);
            this.f = false;
        }
    }
    
    private static void d(final int n, final String s) {
        TraceEvent.i("TraceEvent.LooperMonitor:IdleStats", s);
        Log.println(n, "TraceEvent_LooperMonitor", s);
    }
    
    @Override
    public final void a(final String s) {
        if (this.e == 0) {
            TraceEvent.f("Looper.queueIdle");
        }
        this.b = SystemClock.elapsedRealtime();
        this.c();
        super.a(s);
    }
    
    @Override
    public final void b(final String s) {
        final long n = SystemClock.elapsedRealtime() - this.b;
        if (n > 16L) {
            final StringBuilder sb = new StringBuilder("observed a task that took ");
            sb.append(n);
            sb.append("ms: ");
            sb.append(s);
            d(5, sb.toString());
        }
        super.b(s);
        this.c();
        ++this.c;
        ++this.e;
    }
    
    public final boolean queueIdle() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        long a;
        if ((a = this.a) == 0L) {
            this.a = elapsedRealtime;
            a = elapsedRealtime;
        }
        final long n = elapsedRealtime - a;
        ++this.d;
        final int e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append(e);
        sb.append(" tasks since last idle.");
        TraceEvent.e("Looper.queueIdle", sb.toString());
        if (n > 48L) {
            final int c = this.c;
            final int d = this.d;
            final int e2 = this.e;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(c);
            sb2.append(" tasks and ");
            sb2.append(d);
            sb2.append(" idles processed so far, ");
            sb2.append(e2);
            sb2.append(" tasks bursted and ");
            sb2.append(n);
            sb2.append("ms elapsed since last idle");
            d(3, sb2.toString());
        }
        this.a = elapsedRealtime;
        this.e = 0;
        return true;
    }
}
