import java.util.concurrent.Executor;
import android.os.PowerManager;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import android.os.PowerManager$WakeLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaeh implements aadx
{
    public final PowerManager$WakeLock a;
    public final aaha b;
    private final ScheduledExecutorService c;
    
    public aaeh(final Context context, final ScheduledExecutorService c, final aaha b) {
        this.c = c;
        final PowerManager powerManager = (PowerManager)context.getSystemService("power");
        powerManager.getClass();
        this.a = powerManager.newWakeLock(1, this.getClass().getName());
        this.b = b;
    }
    
    public final void a(final aads aads) {
        afva.p((Runnable)new zst(this, aads, 13), (Executor)this.c).addListener((Runnable)new zsh(this, 16), (Executor)this.c);
    }
    
    public final void b() {
        try {
            this.a.release();
        }
        catch (final RuntimeException ex) {
            trn.l("[Offline] Wakelock already released.");
        }
    }
}
