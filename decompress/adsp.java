import android.content.pm.PackageInfo;
import android.os.Build$VERSION;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.pm.PackageManager;
import java.util.concurrent.TimeUnit;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.ArrayList;
import android.content.Context;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adsp
{
    private static final afma a;
    private static final Duration b;
    
    static {
        a = afma.m("com/google/android/livesharing/internal/CoActivityStartInfoProvider");
        b = Duration.ofSeconds(1L);
    }
    
    public static ggp a(final Context context, final adti adti) {
        final PackageManager packageManager = context.getPackageManager();
        final ArrayList list = new ArrayList();
        final afgh c = oec.c;
        for (int c2 = ((afjx)c).c, i = 0; i < c2; ++i) {
            final ocv ocv = c.get(i);
            final String s = (String)oec.b.get(ocv);
            s.getClass();
            try {
                if (packageManager.getApplicationInfo(s, 0).enabled) {
                    list.add(ocv);
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                ((afly)((afly)((aflw)adsp.a).f()).j("com/google/android/livesharing/internal/CoActivityStartInfoProvider", "isInstalled", 106, "CoActivityStartInfoProvider.java")).t("App Package %s is not installed", (Object)s);
            }
        }
        if (list.size() == 1) {
            final ocv ocv2 = list.get(0);
            return new ggp(c(ocv2), b(packageManager, ocv2) ^ true);
        }
        final int size = list.size();
        int j = 0;
        while (j < size) {
            final ocv ocv3 = (ocv)list.get(j);
            final String s2 = (String)oec.b.get(ocv3);
            s2.getClass();
            final ListenableFuture h = sl.h((acf)new ihl((adtl)adti, context, s2, 6));
            boolean b2 = false;
            Label_0355: {
                try {
                    final int b = ((adsk)h.get(adsp.b.toMillis(), TimeUnit.MILLISECONDS)).b;
                    if (b == 0) {
                        throw null;
                    }
                    if (b == 2 || b == 3) {
                        b2 = true;
                        break Label_0355;
                    }
                }
                catch (final Exception ex2) {
                    if (ex2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    ((afly)((afly)((afly)((aflw)adsp.a).h()).i((Throwable)ex2)).j("com/google/android/livesharing/internal/CoActivityStartInfoProvider", "isMeetingOngoing", 154, "CoActivityStartInfoProvider.java")).t("Fail to detect ongoing calls in app: %s.", (Object)s2);
                }
                b2 = false;
            }
            ++j;
            if (b2) {
                if (b(packageManager, ocv3)) {
                    ((afly)((afly)((aflw)adsp.a).f()).j("com/google/android/livesharing/internal/CoActivityStartInfoProvider", "getCoActivityStartInfo", 62, "CoActivityStartInfoProvider.java")).t("Package: %s hosting the ongoing meeting is updated.", (Object)s2);
                    return new ggp(c(ocv3), false);
                }
                ((afly)((afly)((aflw)adsp.a).f()).j("com/google/android/livesharing/internal/CoActivityStartInfoProvider", "getCoActivityStartInfo", 69, "CoActivityStartInfoProvider.java")).t("Package: %s hosting the ongoing meeting is outdated. Cannot connect.", (Object)s2);
                return new ggp(c(ocv3), true);
            }
        }
        final int size2 = list.size();
        int k = 0;
        while (k < size2) {
            final ocv ocv4 = (ocv)list.get(k);
            final boolean b3 = b(packageManager, ocv4);
            ++k;
            if (b3) {
                return new ggp(c(ocv4), false);
            }
        }
        return new ggp(c(ocv.a), false);
    }
    
    private static boolean b(final PackageManager packageManager, final ocv ocv) {
        final String s = (String)oec.b.get(ocv);
        s.getClass();
        try {
            final PackageInfo packageInfo = packageManager.getPackageInfo(s, 0);
            long longVersionCode;
            if (Build$VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
            }
            else {
                longVersionCode = packageInfo.versionCode;
            }
            final afma a = adsp.a;
            ((afly)((afly)((aflw)a).f()).j("com/google/android/livesharing/internal/CoActivityStartInfoProvider", "isVersionUpdated", 123, "CoActivityStartInfoProvider.java")).D((Object)s, longVersionCode);
            final Long n = (Long)oec.a.get(ocv);
            n.getClass();
            if (longVersionCode < n) {
                ((afly)((afly)((aflw)a).f()).j("com/google/android/livesharing/internal/CoActivityStartInfoProvider", "isVersionUpdated", 130, "CoActivityStartInfoProvider.java")).t("App Package %s is too old to support live sharing", (Object)s);
                return false;
            }
            return true;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            ((afly)((afly)((aflw)adsp.a).f()).j("com/google/android/livesharing/internal/CoActivityStartInfoProvider", "isVersionUpdated", 125, "CoActivityStartInfoProvider.java")).t("App Package %s is not installed", (Object)s);
            return false;
        }
    }
    
    private static ocy c(final ocv ocv) {
        final ahcr builder = ((ahcz)ocy.a).createBuilder();
        builder.copyOnWrite();
        ((ocy)builder.instance).c = "youtube";
        builder.copyOnWrite();
        ((ocy)builder.instance).b = ocv.getNumber();
        return (ocy)builder.build();
    }
}
