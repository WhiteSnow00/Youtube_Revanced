import com.google.protos.youtube.api.innertube.AppIsInstalledCommandOuterClass;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Map;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gou implements vau
{
    private final vax a;
    private final Executor b;
    private final PackageManager c;
    
    public gou(final vax a, final Executor b, final Context context) {
        this.a = a;
        this.b = b;
        final PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.c = packageManager;
    }
    
    public final void b(final ahsv ahsv, final Map map) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = this.c.getApplicationInfo(ahsv.c, 0);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            applicationInfo = null;
        }
        if (applicationInfo != null && (!ahsv.e || applicationInfo.enabled)) {
            if ((ahsv.b & 0x8) != 0x0) {
                final vax a = this.a;
                aioe aioe;
                if ((aioe = ahsv.f) == null) {
                    aioe = aioe.a;
                }
                a.c(aioe, map);
            }
        }
        else if ((ahsv.b & 0x10) != 0x0) {
            final vax a2 = this.a;
            aioe aioe2;
            if ((aioe2 = ahsv.g) == null) {
                aioe2 = aioe.a;
            }
            a2.c(aioe2, map);
        }
        if ((ahsv.b & 0x20) != 0x0) {
            final vax a3 = this.a;
            aioe aioe3;
            if ((aioe3 = ahsv.h) == null) {
                aioe3 = aioe.a;
            }
            a3.c(aioe3, map);
        }
    }
    
    public final void mE(final aioe aioe, final Map map) {
        if (!((agzd)aioe).rs((agyr)AppIsInstalledCommandOuterClass.appIsInstalledCommand)) {
            return;
        }
        final ahsv ahsv = (ahsv)((agzd)aioe).rr((agyr)AppIsInstalledCommandOuterClass.appIsInstalledCommand);
        if (!ahsv.c.isEmpty()) {
            if (ahsv.d) {
                this.b(ahsv, map);
                return;
            }
            this.b.execute((Runnable)new vo(this, ahsv, map, 19));
        }
    }
}
