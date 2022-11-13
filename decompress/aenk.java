import android.os.PowerManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aenk implements arls
{
    private final atke a;
    
    public aenk(final atke a) {
        this.a = a;
    }
    
    public static PowerManager c(final Context context) {
        final PowerManager powerManager = (PowerManager)context.getSystemService("power");
        powerManager.getClass();
        return powerManager;
    }
    
    public static aenk d(final atke atke) {
        return new aenk(atke);
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final PowerManager b() {
        return c((Context)((arlt)this.a).a);
    }
}
