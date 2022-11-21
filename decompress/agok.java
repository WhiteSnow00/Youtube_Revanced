import android.content.pm.ServiceInfo;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.content.Intent;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agok
{
    private static agok d;
    public Boolean a;
    public Boolean b;
    public final Queue c;
    private String e;
    
    private agok() {
        this.e = null;
        this.a = null;
        this.b = null;
        this.c = new ArrayDeque();
    }
    
    public static agok a() {
        synchronized (agok.class) {
            if (agok.d == null) {
                agok.d = new agok();
            }
            return agok.d;
        }
    }
    
    public final String b(final Context context, final Intent intent) {
        synchronized (this) {
            final String e = this.e;
            if (e != null) {
                return e;
            }
            final ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService == null || resolveService.serviceInfo == null) {
                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                return null;
            }
            final ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    this.e = String.valueOf(context.getPackageName()).concat(String.valueOf(serviceInfo.name));
                }
                else {
                    this.e = serviceInfo.name;
                }
                return this.e;
            }
            final String packageName = serviceInfo.packageName;
            final String name = serviceInfo.name;
            final StringBuilder sb = new StringBuilder("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(packageName);
            sb.append("/");
            sb.append(name);
            Log.e("FirebaseMessaging", sb.toString());
            return null;
        }
    }
    
    public final boolean c(final Context context) {
        if (this.a == null) {
            this.a = (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.a.booleanValue();
        return this.a;
    }
}
