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
import java.nio.ByteBuffer;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public class auet
{
    private static String a;
    
    public static Object a(final Class clazz, final InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return clazz.cast(Proxy.newProxyInstance(auet.class.getClassLoader(), new Class[] { clazz }, invocationHandler));
    }
    
    public static void b(final ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return;
        }
        throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
    }
    
    public static void c(final ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return;
        }
        throw new IllegalArgumentException("ByteBuffer is already full.");
    }
    
    public static String d(final Context context) {
        final String a = auet.a;
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
            auet.a = null;
        }
        else if (list.size() == 1) {
            auet.a = (String)list.get(0);
        }
        else {
            Label_0332: {
                if (!TextUtils.isEmpty((CharSequence)packageName)) {
                    Label_0314: {
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
                                        break Label_0314;
                                    }
                                    break Label_0332;
                                }
                            }
                        }
                        catch (final RuntimeException ex) {
                            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                        }
                    }
                    if (list.contains(packageName)) {
                        auet.a = packageName;
                        return auet.a;
                    }
                }
            }
            if (list.contains("com.android.chrome")) {
                auet.a = "com.android.chrome";
            }
            else if (list.contains("com.chrome.beta")) {
                auet.a = "com.chrome.beta";
            }
            else if (list.contains("com.chrome.dev")) {
                auet.a = "com.chrome.dev";
            }
            else if (list.contains("com.google.android.apps.chrome")) {
                auet.a = "com.google.android.apps.chrome";
            }
        }
        return auet.a;
    }
    
    public static ator f(final boolean b) {
        return new ator(b, atov.a, null);
    }
    
    public static atot g(final long n) {
        return new atot(n, (auet)atov.a, (byte[])null);
    }
    
    public static atou h(final Object o) {
        return new atou(o, (auet)atov.a, (byte[])null);
    }
    
    public static atos i() {
        return new atos((auet)atov.a, (byte[])null);
    }
    
    public static int j(final int n) {
        return 1 << 32 - Integer.numberOfLeadingZeros(n - 1);
    }
}
