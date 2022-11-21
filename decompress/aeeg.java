import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeeg
{
    public static final aefs c;
    private static final Intent d;
    public final aeex a;
    public final String b;
    
    static {
        c = new aefs("PrewarmService", null);
        d = new Intent("com.google.android.play.core.prewarm.BIND_PREWARM_SERVICE").setPackage("com.android.vending");
    }
    
    public aeeg(final Context context) {
        if (aegg.a(context)) {
            this.a = new aeex(context.getApplicationContext(), aeeg.c, "PrewarmService", aeeg.d, aeds.c, null, null);
        }
        else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }
}
