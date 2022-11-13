import android.content.pm.ApplicationInfo;
import com.google.firebase.FirebaseCommonRegistrar;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agib implements agno
{
    public static final agib a;
    public static final agib b;
    public static final agib c;
    public static final agib d;
    private final int e;
    
    static {
        d = new agib(3);
        c = new agib(2);
        b = new agib(1);
        a = new agib(0);
    }
    
    private agib(final int e) {
        this.e = e;
    }
    
    @Override
    public final String a(final Object o) {
        final int e = this.e;
        String s = "";
        if (e == 0) {
            final ApplicationInfo applicationInfo = ((Context)o).getApplicationInfo();
            if (applicationInfo != null) {
                s = String.valueOf(applicationInfo.minSdkVersion);
            }
            return s;
        }
        if (e == 1) {
            final ApplicationInfo applicationInfo2 = ((Context)o).getApplicationInfo();
            if (applicationInfo2 != null) {
                s = String.valueOf(applicationInfo2.targetSdkVersion);
            }
            return s;
        }
        if (e != 2) {
            final Context context = (Context)o;
            final String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (installerPackageName != null) {
                s = FirebaseCommonRegistrar.a(installerPackageName);
            }
            return s;
        }
        final Context context2 = (Context)o;
        String s2;
        if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            s2 = "tv";
        }
        else if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            s2 = "watch";
        }
        else if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            s2 = "auto";
        }
        else {
            s2 = s;
            if (context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                s2 = "embedded";
            }
        }
        return s2;
    }
}
