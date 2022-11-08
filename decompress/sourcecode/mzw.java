import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.os.Build;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mzw implements aeyr
{
    protected final Context a;
    private final mzu b;
    
    public mzw(final Context a, final mzu b) {
        this.a = a;
        this.b = b;
    }
    
    public final mzv b() {
        final Context a = this.a;
        final mzu b = this.b;
        final String fingerprint = Build.FINGERPRINT;
        if (fingerprint == null) {
            throw new NullPointerException("Null fingerprint");
        }
        final String brand = Build.BRAND;
        if (brand == null) {
            throw new NullPointerException("Null brand");
        }
        final String product = Build.PRODUCT;
        if (product == null) {
            throw new NullPointerException("Null product");
        }
        final String device = Build.DEVICE;
        if (device == null) {
            throw new NullPointerException("Null device");
        }
        final String model = Build.MODEL;
        if (model == null) {
            throw new NullPointerException("Null model");
        }
        final String manufacturer = Build.MANUFACTURER;
        if (manufacturer == null) {
            throw new NullPointerException("Null manufacturer");
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        final String base_OS = Build$VERSION.BASE_OS;
        if (base_OS != null) {
            final mzs mzs = new mzs(fingerprint, brand, product, device, model, manufacturer, base_OS, sdk_INT);
            final mzy mzy = new mzy(mzx.a("ro.vendor.build.fingerprint"), mzx.a("ro.boot.verifiedbootstate"), mzx.b());
            final String packageName = a.getPackageName();
            final PackageManager packageManager = a.getPackageManager();
            aexq aexq;
            try {
                aexq = aexq.k((Object)(long)packageManager.getPackageInfo(packageName, 0).versionCode);
            }
            catch (final PackageManager$NameNotFoundException ex) {
                aexq = aewp.a;
            }
            return new mzv(mzs, mzy, b, new mzt(packageName, aexq), System.currentTimeMillis());
        }
        throw new NullPointerException("Null baseOs");
    }
}
