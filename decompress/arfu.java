import android.content.DialogInterface$OnCancelListener;
import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import android.app.Activity;
import android.content.pm.ApplicationInfo;
import java.util.Iterator;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.DialogInterface$OnClickListener;
import android.util.Log;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfu
{
    static {
        final String a = arfl.a;
    }
    
    public static void a(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        final Intent intent = new Intent();
        intent.setAction("com.google.vrtoolkit.cardboard.CONFIGURE").addFlags(268435456);
        final List queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        final ArrayList list = new ArrayList();
        final Iterator iterator = queryIntentActivities.iterator();
        Integer n = null;
        while (iterator.hasNext()) {
            final ResolveInfo resolveInfo = (ResolveInfo)iterator.next();
            final String packageName = resolveInfo.activityInfo.packageName;
            if (areq.k(packageName)) {
                final int priority = resolveInfo.priority;
                int n2 = 0;
                Label_0160: {
                    try {
                        final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 0);
                        int flags;
                        if (applicationInfo != null) {
                            flags = applicationInfo.flags;
                        }
                        else {
                            flags = 0;
                        }
                        if ((flags & 0x1) == 0x0) {
                            n2 = priority;
                            if ((flags & 0x80) == 0x0) {
                                break Label_0160;
                            }
                        }
                        n2 = priority + 1;
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        n2 = priority;
                    }
                }
                if (n == null) {
                    n = n2;
                }
                else if (n2 > n) {
                    n = n2;
                    list.clear();
                }
                else if (n2 < n) {
                    continue;
                }
                final Intent intent2 = new Intent(intent);
                intent2.setClassName(packageName, resolveInfo.activityInfo.name);
                list.add(intent2);
            }
        }
        final List j = areq.j(context);
        if (j == null || j.isEmpty()) {
            if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                final Activity c = areq.c(context);
                if (c == null) {
                    Log.w(arfl.a, "An Activity Context is required, aborting storage permission request.");
                }
                else {
                    c.requestPermissions(new String[] { "android.permission.READ_EXTERNAL_STORAGE" }, 239);
                }
            }
        }
        if (list.isEmpty()) {
            final xhc xhc = new xhc(context, 17);
            final AlertDialog$Builder c2 = c(context);
            c2.setTitle(2132020175).setMessage(2132017879).setPositiveButton(2132018130, (DialogInterface$OnClickListener)xhc).setNegativeButton(2132017612, (DialogInterface$OnClickListener)null);
            d(context, c2.create());
            return;
        }
        Intent intent3 = intent;
        if (list.size() == 1) {
            intent3 = (Intent)list.get(0);
        }
        context.startActivity(intent3);
    }
    
    public static AlertDialog b(final Context context, final Runnable runnable) {
        final xhc xhc = new xhc(context, 16);
        final AlertDialog$Builder c = c(context);
        c.setTitle(2132017880).setMessage(2132017878).setCancelable(false).setPositiveButton(2132017877, (DialogInterface$OnClickListener)xhc).setNegativeButton(2132017876, (DialogInterface$OnClickListener)new gyt(19));
        if (runnable != null) {
            c.setOnCancelListener((DialogInterface$OnCancelListener)new far(runnable, 16));
        }
        final AlertDialog create = c.create();
        create.setCanceledOnTouchOutside(false);
        d(context, create);
        return create;
    }
    
    private static AlertDialog$Builder c(final Context context) {
        return new AlertDialog$Builder(context, 2132083261);
    }
    
    private static void d(final Context context, final AlertDialog alertDialog) {
        alertDialog.getWindow().setFlags(8, 8);
        alertDialog.show();
        final Activity c = areq.c(context);
        if (c != null) {
            alertDialog.getWindow().getDecorView().setSystemUiVisibility(c.getWindow().getDecorView().getSystemUiVisibility());
        }
        alertDialog.getWindow().clearFlags(8);
    }
}
