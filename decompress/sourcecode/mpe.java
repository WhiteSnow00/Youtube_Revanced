import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ApplicationInfo;
import android.content.pm.Signature;
import android.util.Log;
import android.content.pm.PackageInfo;
import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mpe
{
    private static mpe a;
    private static volatile Set b;
    private final Object c;
    private volatile Object d;
    
    public mpe() {
        this.c = new Object();
    }
    
    public mpe(final Context context) {
        this.c = context.getApplicationContext();
    }
    
    public static mpe a(final Context context) {
        kgk.aL((Object)context);
        synchronized (mpe.class) {
            if (mpe.a == null) {
                moz.a(context);
                mpe.a = new mpe(context);
            }
            return mpe.a;
        }
    }
    
    static final mtn e(final PackageInfo packageInfo, final mtn... array) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        final Signature[] signatures = packageInfo.signatures;
        int i = 0;
        final mow mow = new mow(signatures[0].toByteArray());
        while (i < array.length) {
            if (array[i].equals((Object)mow)) {
                return array[i];
            }
            ++i;
        }
        return null;
    }
    
    public static final boolean f(final PackageInfo packageInfo, final boolean b) {
        boolean b2 = b;
        Label_0065: {
            if (b) {
                b2 = b;
                if (packageInfo != null) {
                    if (!"com.android.vending".equals(packageInfo.packageName)) {
                        b2 = b;
                        if (!"com.mgoogle.android.gms".equals(packageInfo.packageName)) {
                            break Label_0065;
                        }
                    }
                    final ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    b2 = (applicationInfo != null && (applicationInfo.flags & 0x81) != 0x0);
                }
            }
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            mtn mtn;
            if (b2) {
                mtn = e(packageInfo, moy.a);
            }
            else {
                mtn = e(packageInfo, moy.a[0]);
            }
            if (mtn != null) {
                return true;
            }
        }
        return false;
    }
    
    private final mpa h(final String d) {
        mpa mpa = null;
        if (d == null) {
            mpa = mpa.a();
        }
        else if (d.equals(this.d)) {
            mpa = mpa.a;
        }
        else {
            Label_0202: {
                if (moz.b()) {
                    final mpa mpa2 = moz.d(d, mpd.e((Context)this.c));
                    break Label_0202;
                }
                try {
                    final PackageInfo packageInfo = ((Context)this.c).getPackageManager().getPackageInfo(d, 64);
                    final boolean e = mpd.e((Context)this.c);
                    mpa mpa2;
                    if (packageInfo == null) {
                        mpa2 = mpa.a();
                    }
                    else if (packageInfo.signatures != null && packageInfo.signatures.length == 1) {
                        final mow mow = new mow(packageInfo.signatures[0].toByteArray());
                        final String packageName = packageInfo.packageName;
                        mpa2 = moz.c(packageName, (mtn)mow, e, false);
                        if (mpa2.b && packageInfo.applicationInfo != null && (packageInfo.applicationInfo.flags & 0x2) != 0x0 && moz.c(packageName, (mtn)mow, false, true).b) {
                            mpa2 = mpa.a();
                        }
                    }
                    else {
                        mpa2 = mpa.a();
                    }
                    if (mpa2.b) {
                        this.d = d;
                        return mpa2;
                    }
                    mpa = mpa2;
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    mpa = mpa.b();
                }
            }
        }
        return mpa;
    }
    
    public final boolean b(final PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (f(packageInfo, false)) {
            return true;
        }
        if (f(packageInfo, true)) {
            if (mpd.e((Context)this.c)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
    
    public final boolean c(final String s) {
        return this.h(s).b;
    }
    
    public final boolean d(int i) {
        final String[] packagesForUid = ((Context)this.c).getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null) {
            final int length = packagesForUid.length;
            if (length != 0) {
                mpa mpa = null;
                for (i = 0; i < length; ++i) {
                    mpa = this.h(packagesForUid[i]);
                    if (mpa.b) {
                        return mpa.b;
                    }
                }
                kgk.aL((Object)mpa);
                return mpa.b;
            }
        }
        mpa mpa = mpa.a();
        return mpa.b;
    }
    
    public final Object g(final otw otw) {
        if (this.d == null) {
            synchronized (this.c) {
                if (this.d == null) {
                    this.d = otw.a();
                }
            }
        }
        return this.d;
    }
}
