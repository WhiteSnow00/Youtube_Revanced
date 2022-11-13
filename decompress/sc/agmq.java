import java.util.List;
import android.content.pm.PackageManager;
import android.content.Intent;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.pm.PackageInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmq
{
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e;
    
    public agmq(final Context a) {
        this.e = 0;
        this.a = a;
    }
    
    public static String e(final agia agia) {
        final String c = agia.e().c;
        if (c != null) {
            return c;
        }
        final String b = agia.e().b;
        if (!b.startsWith("1:")) {
            return b;
        }
        final String[] split = b.split(":");
        if (split.length < 2) {
            return null;
        }
        final String s = split[1];
        if (s.isEmpty()) {
            return null;
        }
        return s;
    }
    
    private final PackageInfo g(final String s) {
        try {
            return this.a.getPackageManager().getPackageInfo(s, 0);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(ex.toString()));
            return null;
        }
    }
    
    private final void h() {
        synchronized (this) {
            final PackageInfo g = this.g(this.a.getPackageName());
            if (g != null) {
                this.b = Integer.toString(g.versionCode);
                this.c = g.versionName;
            }
        }
    }
    
    final int a() {
        synchronized (this) {
            if (this.d == 0) {
                final PackageInfo g = this.g("com.mgoogle.android.gms");
                if (g != null) {
                    this.d = g.versionCode;
                }
            }
            return this.d;
        }
    }
    
    final int b() {
        synchronized (this) {
            final int e = this.e;
            if (e != 0) {
                return e;
            }
            final PackageManager packageManager = this.a.getPackageManager();
            if (packageManager.checkPermission("com.mgoogle.android.c2dm.permission.SEND", "com.mgoogle.android.gms") == -1) {
                Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                return 0;
            }
            final Intent intent = new Intent("com.mgoogle.iid.TOKEN_REQUEST");
            intent.setPackage("com.mgoogle.android.gms");
            final List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                return this.e = 2;
            }
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            return this.e = 2;
        }
    }
    
    public final String c() {
        synchronized (this) {
            if (this.b == null) {
                this.h();
            }
            return this.b;
        }
    }
    
    final String d() {
        synchronized (this) {
            if (this.c == null) {
                this.h();
            }
            return this.c;
        }
    }
    
    final boolean f() {
        return this.b() != 0;
    }
}
