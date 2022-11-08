import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebw
{
    public static final aeby c;
    private static final Intent d;
    public final String a;
    public aebd b;
    
    static {
        c = new aeby("SplitInstallService", (byte[])null);
        d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    }
    
    public aebw(final Context context) {
        final String packageName = context.getPackageName();
        this.a = packageName;
        if (aecm.a(context)) {
            this.b = new aebd(adwd.N(context), aebw.c, "SplitInstallService", aebw.d, (aeba)adzy.e, null, null, null);
        }
    }
}
