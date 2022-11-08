import android.content.pm.ApplicationInfo;
import android.os.Build$VERSION;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import java.util.List;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.AppDeepLinkEndpointOuterClass;
import java.util.Map;
import android.content.Intent;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class got implements vau, szw
{
    private static final Pattern a;
    private static final Pattern b;
    private final vax c;
    private final PackageManager d;
    private final fax e;
    private final Context f;
    private final tdg g;
    private final vwb h;
    
    static {
        a = Pattern.compile("(?i)android-app://([^/]+)/?(?:([^/]+)/([^/?#]*)(.+)?)?");
        b = Pattern.compile("(?i)https://play.google.com/apps/launch\\?id=([^/]+)/?(?:([^/]+)/([^/?#]*)(.+)?)?");
    }
    
    public got(final vwb h, final fax e, final tdg g, final vax c, final Context f, final byte[] array, final byte[] array2) {
        h.getClass();
        this.h = h;
        e.getClass();
        this.e = e;
        this.g = g;
        c.getClass();
        this.c = c;
        final PackageManager packageManager = f.getPackageManager();
        packageManager.getClass();
        this.d = packageManager;
        this.f = f;
    }
    
    public final void b(final int n, final int n2, final Intent intent) {
    }
    
    public final void mE(aioe aioe, final Map map) {
        if (!((agzd)aioe).rs((agyr)AppDeepLinkEndpointOuterClass.appDeepLinkEndpoint)) {
            return;
        }
        final ahsu ahsu = (ahsu)((agzd)aioe).rr((agyr)AppDeepLinkEndpointOuterClass.appDeepLinkEndpoint);
        this.h.p(tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"), ahpu.e);
        final HashMap hashMap = new HashMap();
        final Object m = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (m != null) {
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", m);
        }
        this.e.a(aijk.b, (List)ahsu.g, hashMap);
        final int b = ahsu.b;
        ApplicationInfo applicationInfo = null;
        if ((b & 0x2) != 0x0) {
            aioe = (aioe)Uri.parse(ahsu.d);
        }
        else {
            aioe = null;
        }
        if (!ahsu.c.isEmpty() && aioe != null && got.b.matcher(((Uri)aioe).toString()).matches()) {
            final Intent intent = new Intent("android.intent.action.VIEW", (Uri)aioe);
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            intent.addFlags(262144);
            try {
                this.f.startActivity(intent);
                return;
            }
            catch (final ActivityNotFoundException ex) {
                this.c.b((List)ahsu.f);
                if ((ahsu.b & 0x8) != 0x0) {
                    final vax c = this.c;
                    if ((aioe = ahsu.e) == null) {
                        aioe = aioe.a;
                    }
                    c.a(aioe);
                }
                return;
            }
        }
        final boolean empty = ahsu.c.isEmpty();
        int n2;
        final int n = n2 = 0;
        if (!empty) {
            try {
                applicationInfo = this.d.getApplicationInfo(ahsu.c, 0);
            }
            catch (final PackageManager$NameNotFoundException ex2) {}
            n2 = n;
            if (applicationInfo != null) {
                n2 = n;
                if (applicationInfo.enabled) {
                    n2 = 1;
                }
            }
        }
        if (Build$VERSION.SDK_INT >= 30) {
            if (!ahsu.c.isEmpty()) {
                if (aioe != null) {
                    final Intent intent2 = new Intent("android.intent.action.VIEW", (Uri)aioe);
                    intent2.setPackage(ahsu.c);
                    intent2.addFlags(268435456);
                    intent2.addFlags(262144);
                    try {
                        this.f.startActivity(intent2);
                        return;
                    }
                    catch (final ActivityNotFoundException ex3) {
                        this.c.d((List)ahsu.f, map);
                        if ((ahsu.b & 0x8) != 0x0) {
                            final vax c2 = this.c;
                            if ((aioe = ahsu.e) == null) {
                                aioe = aioe.a;
                            }
                            c2.c(aioe, map);
                        }
                        return;
                    }
                }
            }
            if ((ahsu.b & 0x8) != 0x0) {
                final vax c3 = this.c;
                if ((aioe = ahsu.e) == null) {
                    aioe = aioe.a;
                }
                c3.c(aioe, map);
            }
        }
        else {
            Label_0652: {
                Label_0645: {
                    if (n2 != 0) {
                        if (aioe != null) {
                            if (!got.a.matcher(((Uri)aioe).toString()).matches()) {
                                final Intent intent3 = new Intent("android.intent.action.VIEW", (Uri)aioe);
                                intent3.setPackage(ahsu.c);
                                intent3.addFlags(268435456);
                                intent3.addFlags(262144);
                                if (this.d.resolveActivity(intent3, 65536) != null) {
                                    this.g.c(intent3, 908, (szw)this);
                                    break Label_0645;
                                }
                            }
                        }
                        final Intent launchIntentForPackage = this.d.getLaunchIntentForPackage(ahsu.c);
                        if (launchIntentForPackage != null) {
                            launchIntentForPackage.addFlags(268435456);
                            launchIntentForPackage.addFlags(262144);
                            try {
                                this.f.startActivity(launchIntentForPackage);
                                break Label_0645;
                            }
                            catch (final ActivityNotFoundException ex4) {
                                this.c.d((List)ahsu.f, map);
                                break Label_0652;
                            }
                        }
                        this.c.d((List)ahsu.f, map);
                        break Label_0652;
                    }
                }
                if ((n2 ^ 0x1) == 0x0) {
                    return;
                }
            }
            if ((ahsu.b & 0x8) != 0x0) {
                final vax c4 = this.c;
                if ((aioe = ahsu.e) == null) {
                    aioe = aioe.a;
                }
                c4.c(aioe, map);
            }
        }
    }
}
