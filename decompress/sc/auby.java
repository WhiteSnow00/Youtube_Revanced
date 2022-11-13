import java.util.concurrent.atomic.AtomicReference;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.List;
import android.content.pm.PackageManager;
import android.util.Log;
import android.text.TextUtils;
import app.revanced.integrations.patches.InappBrowserPatch;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import android.content.Intent;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auby
{
    private static String a;
    
    public static String a(final Context context) {
        final String a = auby.a;
        if (a != null) {
            return a;
        }
        final PackageManager packageManager = context.getPackageManager();
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        final ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String packageName;
        if (resolveActivity != null) {
            packageName = resolveActivity.activityInfo.packageName;
        }
        else {
            packageName = null;
        }
        final List queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        final ArrayList list = new ArrayList();
        for (final ResolveInfo resolveInfo : queryIntentActivities) {
            final Intent intent2 = new Intent();
            intent2.setAction(InappBrowserPatch.getInappBrowser("android.support.customtabs.action.CustomTabsService"));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                list.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (list.isEmpty()) {
            auby.a = null;
        }
        else if (list.size() == 1) {
            auby.a = (String)list.get(0);
        }
        else {
            Label_0334: {
                if (!TextUtils.isEmpty((CharSequence)packageName)) {
                    Label_0317: {
                        try {
                            final List queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                            if (queryIntentActivities2 != null) {
                                if (queryIntentActivities2.size() != 0) {
                                    Block_20: {
                                        for (final ResolveInfo resolveInfo2 : queryIntentActivities2) {
                                            final IntentFilter filter = resolveInfo2.filter;
                                            if (filter != null && filter.countDataAuthorities() != 0 && filter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                                break Block_20;
                                            }
                                        }
                                        break Label_0317;
                                    }
                                    break Label_0334;
                                }
                            }
                        }
                        catch (final RuntimeException ex) {
                            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                        }
                    }
                    if (list.contains(packageName)) {
                        auby.a = packageName;
                        return auby.a;
                    }
                }
            }
            if (list.contains("com.android.chrome")) {
                auby.a = "com.android.chrome";
            }
            else if (list.contains("com.chrome.beta")) {
                auby.a = "com.chrome.beta";
            }
            else if (list.contains("com.chrome.dev")) {
                auby.a = "com.chrome.dev";
            }
            else if (list.contains("com.google.android.apps.chrome")) {
                auby.a = "com.google.android.apps.chrome";
            }
        }
        return auby.a;
    }
    
    public static void b(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static final Class c(final atow atow) {
        atow.getClass();
        return ((atnv)atow).a();
    }
    
    public static final Class d(final atow atow) {
        atow.getClass();
        final Class a = ((atnv)atow).a();
        if (!a.isPrimitive()) {
            return a;
        }
        final String name = a.getName();
        Class<Double> clazz = a;
        if (name != null) {
            switch (name.hashCode()) {
                default: {
                    clazz = a;
                    break;
                }
                case 109413500: {
                    clazz = a;
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
                }
                case 97526364: {
                    clazz = a;
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                }
                case 64711720: {
                    clazz = a;
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                }
                case 3625364: {
                    clazz = a;
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                }
                case 3327612: {
                    clazz = a;
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                }
                case 3052374: {
                    clazz = a;
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                }
                case 3039496: {
                    clazz = a;
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                }
                case 104431: {
                    clazz = a;
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                }
                case -1325958191: {
                    clazz = a;
                    if (name.equals("double")) {
                        clazz = Double.class;
                        break;
                    }
                    break;
                }
            }
        }
        return clazz;
    }
    
    public static boolean e(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
}
