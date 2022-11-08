import android.os.StatFs;
import android.os.Environment;
import android.database.sqlite.SQLiteDiskIOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfl implements UncaughtExceptionHandler
{
    static final String a;
    public UncaughtExceptionHandler b;
    private final uyf c;
    
    static {
        a = trn.a("LowStorage");
    }
    
    public adfl(final uyf c) {
        this.c = c;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        aook aook;
        if ((aook = this.c.b().s) == null) {
            aook = aook.a;
        }
        if (aook.i) {
            try {
                if (t instanceof SQLiteDiskIOException && t.getMessage() != null && t.getMessage().contains("code 4874")) {
                    final String a = adfl.a;
                    final StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
                    final long availableBlocksLong = statFs.getAvailableBlocksLong();
                    final long blockSizeLong = statFs.getBlockSizeLong();
                    final StringBuilder sb = new StringBuilder("Caught exception for low storage space with bytes available: ");
                    sb.append(availableBlocksLong * blockSizeLong);
                    trn.m(a, sb.toString());
                }
            }
            catch (final RuntimeException ex) {
                trn.m(adfl.a, "Could not get available bytes: ".concat(ex.toString()));
            }
        }
        final UncaughtExceptionHandler b = this.b;
        if (b != null) {
            b.uncaughtException(thread, t);
        }
    }
}
