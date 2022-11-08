import android.os.PowerManager;
import android.content.Context;
import android.os.PowerManager$WakeLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaee implements aadx
{
    public final PowerManager$WakeLock a;
    public final aaha b;
    private Thread c;
    
    public aaee(final Context context, final aaha b) {
        final PowerManager powerManager = (PowerManager)context.getSystemService("power");
        powerManager.getClass();
        this.a = powerManager.newWakeLock(1, this.getClass().getName());
        this.b = b;
    }
    
    public final void a(final aads aads) {
        odr.a(this.c = (Thread)new aaed(this, (Runnable)aads));
        this.c.start();
    }
}
