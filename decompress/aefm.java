import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import java.io.File;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefm implements arom
{
    private final int a;
    private final Object b;
    
    public aefm(final aefs b, final int a, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public aefm(final atnb b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public static aefm b(final atnb atnb) {
        return new aefm(atnb, 6);
    }
    
    @Override
    public final Object a() {
        final int a = this.a;
        if (a != 0) {
            if (a != 1) {
                if (a == 2) {
                    final aefj e = aefj.e((Context)((aefs)this.b).a);
                    e.getClass();
                    return e;
                }
                if (a == 3) {
                    final aefc aefc = (aefc)((atnb)this.b).a();
                    aefc.getClass();
                    return aefc;
                }
                if (a == 4) {
                    return new aefq(((aecx)this.b).b());
                }
                if (a != 5) {
                    return aftz.w((Looper)((atnb)this.b).a());
                }
                return new aefs(((aecx)this.b).b());
            }
            else {
                final File file = (File)((atnb)this.b).a();
                if (file == null) {
                    return null;
                }
                return aegf.a(file);
            }
        }
        else {
            final Context b = ((aecx)this.b).b();
            try {
                final Bundle metaData = b.getPackageManager().getApplicationInfo(b.getPackageName(), 128).metaData;
                if (metaData != null) {
                    final String string = metaData.getString("local_testing_dir");
                    if (string != null) {
                        return new File(b.getExternalFilesDir((String)null), string);
                    }
                }
                return null;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                return null;
            }
        }
    }
}
