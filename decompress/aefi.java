import android.content.res.Resources$NotFoundException;
import org.xmlpull.v1.XmlPullParser;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefi
{
    private static final aefs c;
    private final Context a;
    private final String b;
    
    static {
        c = new aefs("SplitInstallInfoProvider", null);
    }
    
    public aefi(final Context a) {
        this.a = a;
        this.b = a.getPackageName();
    }
    
    public final PackageInfo a() {
        try {
            return this.a.getPackageManager().getPackageInfo(this.b, 128);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            aefi.c.h("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }
    
    public final Set b() {
        final PackageInfo a = this.a();
        if (a != null && a.applicationInfo != null) {
            return this.c(a);
        }
        return new HashSet();
    }
    
    public final Set c(final PackageInfo packageInfo) {
        final HashSet set = new HashSet();
        for (final String s : this.d(packageInfo)) {
            if (!s.startsWith("config.") && !s.contains(".config.")) {
                set.add(s);
            }
        }
        return set;
    }
    
    public final Set d(final PackageInfo packageInfo) {
        final Bundle metaData = packageInfo.applicationInfo.metaData;
        final HashSet set = new HashSet();
        if (metaData != null) {
            final String string = metaData.getString("com.android.dynamic.apk.fused.modules");
            if (string != null && !string.isEmpty()) {
                Collections.addAll(set, string.split(",", -1));
                set.remove("");
                set.remove("base");
            }
        }
        final String[] splitNames = packageInfo.splitNames;
        if (splitNames != null) {
            Arrays.toString(splitNames);
            Collections.addAll(set, splitNames);
        }
        final aeff aeff = aefg.a.get();
        if (aeff != null) {
            set.addAll(aeff.a());
        }
        return set;
    }
    
    public final aefs e(final Bundle bundle) {
        if (bundle == null) {
            aefi.c.j("No metadata found in Context.", new Object[0]);
            return null;
        }
        final int int1 = bundle.getInt("com.android.vending.splits");
        if (int1 == 0) {
            aefi.c.j("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            final aefs r = aegu.r((XmlPullParser)this.a.getResources().getXml(int1), new aefs());
            if (r == null) {
                aefi.c.j("Can't parse languages metadata.", new Object[0]);
            }
            return r;
        }
        catch (final Resources$NotFoundException ex) {
            aefi.c.j("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }
}
