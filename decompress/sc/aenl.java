import android.telephony.TelephonyManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aenl implements arls
{
    private final atke a;
    
    public aenl(final atke a) {
        this.a = a;
    }
    
    public static TelephonyManager c(final Context context) {
        final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        telephonyManager.getClass();
        return telephonyManager;
    }
    
    public static aenl d(final atke atke) {
        return new aenl(atke);
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final TelephonyManager b() {
        return c((Context)((arlt)this.a).a);
    }
}
