import org.chromium.base.TraceEvent;
import android.os.SystemClock;
import android.os.Looper;
import J.N;
import org.chromium.base.ThreadUtils;
import android.os.MessageQueue$IdleHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auav implements MessageQueue$IdleHandler
{
    private static boolean a;
    private static auav b;
    private long c;
    
    private auav() {
    }
    
    public static void a() {
        if (ThreadUtils.c()) {
            if (N.MnfJQqTB()) {
                if (auav.b == null) {
                    auav.b = new auav();
                }
                if (!auav.a) {
                    Looper.myQueue().addIdleHandler((MessageQueue$IdleHandler)auav.b);
                    auav.a = true;
                }
            }
            else if (auav.b != null && auav.a) {
                Looper.myQueue().removeIdleHandler((MessageQueue$IdleHandler)auav.b);
                auav.a = false;
            }
            return;
        }
        ThreadUtils.a().post((Runnable)aess.c);
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
