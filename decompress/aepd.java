import android.os.PowerManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aepd implements arom
{
    private final atnb a;
    
    public aepd(final atnb a) {
        this.a = a;
    }
    
    public static PowerManager c(final Context context) {
        final PowerManager powerManager = (PowerManager)context.getSystemService("power");
        powerManager.getClass();
        return powerManager;
    }
    
    public static aepd d(final atnb atnb) {
        return new aepd(atnb);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final PowerManager b() {
        return c((Context)((aron)this.a).a);
    }
}
