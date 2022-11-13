import org.chromium.base.TraceEvent;
import android.os.SystemClock;
import android.os.Looper;
import J.N;
import org.chromium.base.ThreadUtils;
import android.os.MessageQueue$IdleHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubl implements MessageQueue$IdleHandler
{
    private static boolean a;
    private static aubl b;
    private long c;
    
    private aubl() {
    }
    
    public static void a() {
        if (ThreadUtils.c()) {
            if (N.MnfJQqTB()) {
                if (aubl.b == null) {
                    aubl.b = new aubl();
                }
                if (!aubl.a) {
                    Looper.myQueue().addIdleHandler((MessageQueue$IdleHandler)aubl.b);
                    aubl.a = true;
                }
            }
            else if (aubl.b != null && aubl.a) {
                Looper.myQueue().removeIdleHandler((MessageQueue$IdleHandler)aubl.b);
                aubl.a = false;
            }
            return;
        }
        ThreadUtils.a().post((Runnable)aeut.c);
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
