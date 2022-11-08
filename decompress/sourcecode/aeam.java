import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeam
{
    public static final aeby c;
    private static final Intent d;
    public final aebd a;
    public final String b;
    
    static {
        c = new aeby("PrewarmService", (byte[])null);
        d = new Intent("com.google.android.play.core.prewarm.BIND_PREWARM_SERVICE").setPackage("com.android.vending");
    }
    
    public aeam(final Context context) {
        if (aecm.a(context)) {
            this.a = new aebd(context.getApplicationContext(), aeam.c, "PrewarmService", aeam.d, (aeba)adzy.c, null, null, null);
        }
        else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }
}
