import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefq
{
    public static final aefs c;
    private static final Intent d;
    public final String a;
    public aeex b;
    
    static {
        c = new aefs("SplitInstallService", null);
        d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    }
    
    public aefq(final Context context) {
        final String packageName = context.getPackageName();
        this.a = packageName;
        if (aegg.a(context)) {
            this.b = new aeex(aegu.q(context), aefq.c, "SplitInstallService", aefq.d, aeds.e, null, null);
        }
    }
}
