import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzj
{
    public static final aeby e;
    private static final Intent f;
    public aebd a;
    public final String b;
    public final Context c;
    public final adcr d;
    
    static {
        e = new aeby("AppUpdateService", (byte[])null);
        f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    }
    
    public adzj(final Context c, final adcr d, final byte[] array, final byte[] array2) {
        this.b = c.getPackageName();
        this.c = c;
        this.d = d;
        if (aecm.a(c)) {
            this.a = new aebd(adwd.N(c), adzj.e, "AppUpdateService", adzj.f, (aeba)adzy.b, null, null, null);
        }
    }
    
    public static int a(final Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }
    
    public static Bundle b() {
        final Bundle bundle = new Bundle();
        bundle.putAll(adzm.a());
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }
    
    public static nly c() {
        adzj.e.k("onError(%d)", -9);
        return nmr.b((Exception)new adzr(-9));
    }
    
    public static HashSet d(final ArrayList list) {
        final HashSet set = new HashSet();
        if (list != null) {
            set.addAll(list);
        }
        return set;
    }
}
