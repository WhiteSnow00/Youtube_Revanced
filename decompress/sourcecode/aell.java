import android.telephony.TelephonyManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aell implements arjd
{
    private final atjj a;
    
    public aell(final atjj a) {
        this.a = a;
    }
    
    public static TelephonyManager c(final Context context) {
        final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        telephonyManager.getClass();
        return telephonyManager;
    }
    
    public static aell d(final atjj atjj) {
        return new aell(atjj);
    }
    
    public final TelephonyManager b() {
        return c((Context)((arje)this.a).a);
    }
}
