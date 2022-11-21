import android.app.AlertDialog$Builder;
import java.util.Iterator;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.provider.Settings$Secure;
import android.content.pm.ApplicationInfo;
import android.content.ComponentName;
import android.view.Window;
import android.os.PowerManager;
import android.app.Activity;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.app.ActivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class areo
{
    public static final String a = "areo";
    
    private areo() {
    }
    
    public static void a(final int n) {
        Method method = null;
        try {
            method = ActivityManager.class.getMethod("setVrThread", Integer.TYPE);
            try {
                method.invoke(null, n);
                return;
            }
            catch (final RuntimeException method) {}
            catch (final IllegalAccessException method) {}
            catch (final InvocationTargetException ex) {}
            Log.e(areo.a, "Failed to invoke setVrThread: ".concat(method.toString()));
            return;
        }
        catch (final RuntimeException method) {}
        catch (final NoSuchMethodException ex2) {}
        "NMR1".equals(Build$VERSION.CODENAME);
        Log.e(areo.a, "Failed to acquire setVrThread method: ".concat(method.toString()));
    }
    
    public static void b(final Activity activity, final boolean sustainedPerformanceMode) {
        if (!((PowerManager)activity.getSystemService("power")).isSustainedPerformanceModeSupported()) {
            return;
        }
        final Window window = activity.getWindow();
        if (window == null) {
            Log.e(areo.a, "Activity does not have a window");
            return;
        }
        window.setSustainedPerformanceMode(sustainedPerformanceMode);
    }
    
    public static boolean c(final Activity activity, final boolean b) {
        if (((Context)activity).getPackageManager().hasSystemFeature("android.software.vr.mode")) {
            final ComponentName componentName = new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService");
            try {
                activity.setVrModeEnabled(b, componentName);
                return true;
            }
            catch (final UnsupportedOperationException ex) {
                Log.w(areo.a, "Failed to set VR mode: ".concat(ex.toString()));
            }
            catch (final PackageManager$NameNotFoundException ex2) {
                Log.w(areo.a, "No VR service component: ".concat(ex2.toString()));
                if (((Context)activity).getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                    final Iterator iterator = ((Context)activity).getPackageManager().getInstalledApplications(0).iterator();
                    while (true) {
                        while (iterator.hasNext()) {
                            if (((ApplicationInfo)iterator.next()).packageName.equals("com.google.vr.vrcore")) {
                                final String string = Settings$Secure.getString(((Context)activity).getContentResolver(), "enabled_vr_listeners");
                                final ComponentName componentName2 = new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService");
                                int n;
                                if (string != null && string.contains(componentName2.flattenToString())) {
                                    n = 0;
                                }
                                else {
                                    n = -2;
                                }
                                if (!areq.l()) {
                                    if (n == -1) {
                                        d((Context)activity, 2132017885, 2132018130, (DialogInterface$OnClickListener)new xhc((Context)activity, 14));
                                        return false;
                                    }
                                    if (n == -2) {
                                        d((Context)activity, 2132017884, 2132018131, (DialogInterface$OnClickListener)new xhc((Context)activity, 15));
                                        return false;
                                    }
                                }
                                Log.w(areo.a, "Failed to handle missing VrCore package.");
                            }
                        }
                        int n = -1;
                        continue;
                    }
                }
            }
        }
        return false;
    }
    
    private static void d(final Context context, final int message, final int n, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 2132083261);
        alertDialog$Builder.setMessage(message).setTitle(2132017883).setPositiveButton(n, dialogInterface$OnClickListener).setNegativeButton(2132017612, (DialogInterface$OnClickListener)new gyt(18));
        alertDialog$Builder.create().show();
    }
}
