import android.os.PowerManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelk implements arjd
{
    private final atjj a;
    
    public aelk(final atjj a) {
        this.a = a;
    }
    
    public static PowerManager c(final Context context) {
        final PowerManager powerManager = (PowerManager)context.getSystemService("power");
        powerManager.getClass();
        return powerManager;
    }
    
    public static aelk d(final atjj atjj) {
        return new aelk(atjj);
    }
    
    public final PowerManager b() {
        return c((Context)((arje)this.a).a);
    }
}
