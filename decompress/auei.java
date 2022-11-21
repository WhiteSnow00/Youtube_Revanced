import org.chromium.base.TraceEvent;
import android.os.SystemClock;
import android.os.Looper;
import J.N;
import org.chromium.base.ThreadUtils;
import android.os.MessageQueue$IdleHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auei implements MessageQueue$IdleHandler
{
    private static boolean a;
    private static auei b;
    private long c;
    
    private auei() {
    }
    
    public static void a() {
        if (ThreadUtils.c()) {
            if (N.MnfJQqTB()) {
                if (auei.b == null) {
                    auei.b = new auei();
                }
                if (!auei.a) {
                    Looper.myQueue().addIdleHandler((MessageQueue$IdleHandler)auei.b);
                    auei.a = true;
                }
            }
            else if (auei.b != null && auei.a) {
                Looper.myQueue().removeIdleHandler((MessageQueue$IdleHandler)auei.b);
                auei.a = false;
            }
            return;
        }
        ThreadUtils.a().post((Runnable)aewl.c);
    }
    
    public final boolean queueIdle() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long c = this.c;
        if (c == 0L || elapsedRealtime - c > 1000L) {
            this.c = elapsedRealtime;
            TraceEvent.l();
        }
        return true;
    }
}
