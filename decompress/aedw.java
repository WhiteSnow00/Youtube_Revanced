import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aedw
{
    public static final aefs c;
    private static final Intent d;
    public final aeex a;
    public final String b;
    
    static {
        c = new aefs("OverlayDisplayService", null);
        d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    }
    
    public aedw(final Context context) {
        if (aegg.a(context)) {
            this.a = new aeex(context.getApplicationContext(), aedw.c, "OverlayDisplayService", aedw.d, aeds.a, null, null);
        }
        else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }
    
    public final void a(final aeec aeec, final aeeb aeeb, final int n) {
        if (this.a == null) {
            aedw.c.h("error: %s", "Play Store not found.");
            return;
        }
        final noj noj = new noj();
        this.a.f(new aedv(this, noj, aeec, n, aeeb, noj, null), noj);
    }
}
