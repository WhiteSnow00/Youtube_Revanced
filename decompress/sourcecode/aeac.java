import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeac
{
    public static final aeby c;
    private static final Intent d;
    public final aebd a;
    public final String b;
    
    static {
        c = new aeby("OverlayDisplayService", (byte[])null);
        d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    }
    
    public aeac(final Context context) {
        if (aecm.a(context)) {
            this.a = new aebd(context.getApplicationContext(), aeac.c, "OverlayDisplayService", aeac.d, (aeba)adzy.a, null, null, null);
        }
        else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }
    
    public final void a(final aeai aeai, final aeah aeah, final int n) {
        if (this.a == null) {
            aeac.c.k("error: %s", "Play Store not found.");
            return;
        }
        final nmo nmo = new nmo();
        this.a.f((aeau)new aeab(this, nmo, aeai, n, aeah, nmo, (byte[])null), nmo);
    }
}
