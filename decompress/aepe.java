import android.telephony.TelephonyManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aepe implements arom
{
    private final atnb a;
    
    public aepe(final atnb a) {
        this.a = a;
    }
    
    public static TelephonyManager c(final Context context) {
        final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        telephonyManager.getClass();
        return telephonyManager;
    }
    
    public static aepe d(final atnb atnb) {
        return new aepe(atnb);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final TelephonyManager b() {
        return c((Context)((aron)this.a).a);
    }
}
