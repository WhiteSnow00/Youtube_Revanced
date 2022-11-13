import android.content.Context;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfx extends atod implements atmv
{
    final Object a;
    private final int b;
    
    public cfx(final avv a, final int b) {
        this.b = b;
        this.a = a;
        super(0);
    }
    
    public cfx(final cfy a, final int b) {
        this.b = b;
        this.a = a;
        super(0);
    }
    
    public cfx(final cgz a, final int b) {
        this.b = b;
        this.a = a;
        super(0);
    }
    
    public cfx(final mam a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
        super(0);
    }
    
    public cfx(final nri a, final int b) {
        this.b = b;
        this.a = a;
        super(0);
    }
    
    public final Object invoke() {
        final int b = this.b;
        if (b == 0) {
            return ((cfy)this.a).e();
        }
        if (b == 1) {
            return avk.b((avv)this.a);
        }
        if (b == 2) {
            final cgz cgz = (cgz)this.a;
            final String b2 = cgz.b;
            cgy cgy;
            if (b2 != null && cgz.d) {
                final File noBackupFilesDir = cgz.a.getNoBackupFilesDir();
                noBackupFilesDir.getClass();
                final File file = new File(noBackupFilesDir, ((cgz)this.a).b);
                final Context a = ((cgz)this.a).a;
                final String absolutePath = file.getAbsolutePath();
                final elx elx = new elx((byte[])null);
                final cgz cgz2 = (cgz)this.a;
                cgy = new cgy(a, absolutePath, elx, cgz2.c, cgz2.e, null, null, null);
            }
            else {
                final Context a2 = cgz.a;
                final elx elx2 = new elx((byte[])null);
                final cgz cgz3 = (cgz)this.a;
                cgy = new cgy(a2, b2, elx2, cgz3.c, cgz3.e, null, null, null);
            }
            cdk.c(cgy, ((cgz)this.a).g);
            return cgy;
        }
        if (b == 3) {
            final mam mam = (mam)this.a;
            ((PackageManager)mam.a).setComponentEnabledSetting((ComponentName)mam.c, 2, 1);
            return atkq.a;
        }
        if (b != 4) {
            return new ntc((Class)this.a.getClass());
        }
        final mam mam2 = (mam)this.a;
        ((PackageManager)mam2.a).setComponentEnabledSetting((ComponentName)mam2.c, 1, 1);
        return atkq.a;
    }
}
