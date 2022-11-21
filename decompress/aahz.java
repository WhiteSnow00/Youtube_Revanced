import java.util.concurrent.Executor;
import android.os.PowerManager;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import android.os.PowerManager$WakeLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aahz implements aahq
{
    public final PowerManager$WakeLock a;
    public final aaks b;
    private final ScheduledExecutorService c;
    
    public aahz(final Context context, final ScheduledExecutorService c, final aaks b) {
        this.c = c;
        final PowerManager powerManager = (PowerManager)context.getSystemService("power");
        powerManager.getClass();
        this.a = powerManager.newWakeLock(1, this.getClass().getName());
        this.b = b;
    }
    
    @Override
    public final void a(final aahl aahl) {
        afxr.o((Runnable)new zwj(this, aahl, 18), this.c).addListener((Runnable)new zvy(this, 17), (Executor)this.c);
    }
    
    public final void b() {
        try {
            this.a.release();
        }
        catch (final RuntimeException ex) {
            tut.l("[Offline] Wakelock already released.");
        }
    }
}
