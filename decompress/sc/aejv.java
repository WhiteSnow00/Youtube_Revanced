import java.util.List;
import android.os.Build;
import android.content.ComponentName;
import java.util.Set;
import android.content.Intent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejv
{
    public static final afkk a;
    public final boolean b;
    public final afeq c;
    
    static {
        a = afkk.m("com/google/apps/tiktok/account/api/controller/Config");
    }
    
    public aejv() {
    }
    
    public aejv(final boolean b, final afeq c) {
        this.b = b;
        this.c = c;
    }
    
    public static aeju a() {
        final aeju aeju = new aeju();
        aeju.c(false);
        aeju.b(aelj.class);
        return aeju;
    }
    
    public static aeju b(final Activity activity) {
        if (!c()) {
            final Intent intent = activity.getIntent();
            final Set categories = intent.getCategories();
            final ComponentName callingActivity = activity.getCallingActivity();
            if ((categories == null || categories.isEmpty()) && (callingActivity == null || activity.getPackageName().equals(callingActivity.getPackageName())) && (intent.getFlags() & 0x10000000) == 0x0 && intent.getData() == null) {
                if (intent.getClipData() == null) {
                    if (intent.getType() == null) {
                        ((afki)((afki)((afkg)aejv.a).h()).j("com/google/apps/tiktok/account/api/controller/Config", "forExternalActivity", 85, "Config.java")).t("External config used on invalid activity: %s", (Object)activity.getClass());
                    }
                }
            }
        }
        final aeju a = a();
        a.c(true);
        return a;
    }
    
    public static boolean c() {
        return "robolectric".equals(Build.FINGERPRINT);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aejv) {
            final aejv aejv = (aejv)o;
            if (this.b == aejv.b && agpi.V((List)this.c, aejv.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((n ^ 0xF4243) * 1000003 ^ this.c.hashCode()) * 1000003;
    }
    
    @Override
    public final String toString() {
        final boolean b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("Config{canSwitchAccounts=");
        sb.append(b);
        sb.append(", initialSelectors=");
        sb.append(value);
        sb.append(", overrideRequirements=null}");
        return sb.toString();
    }
}
