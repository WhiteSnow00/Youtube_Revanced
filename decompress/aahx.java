import android.os.PowerManager;
import android.content.Context;
import android.os.PowerManager$WakeLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aahx implements aahq
{
    public final PowerManager$WakeLock a;
    public final aaks b;
    private Thread c;
    
    public aahx(final Context context, final aaks b) {
        final PowerManager powerManager = (PowerManager)context.getSystemService("power");
        powerManager.getClass();
        this.a = powerManager.newWakeLock(1, this.getClass().getName());
        this.b = b;
    }
    
    @Override
    public final void a(final aahl aahl) {
        ofo.a(this.c = new aahw(this, aahl));
        this.c.start();
    }
}
