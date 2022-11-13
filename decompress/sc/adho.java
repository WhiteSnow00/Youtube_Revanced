import android.os.StatFs;
import android.os.Environment;
import android.database.sqlite.SQLiteDiskIOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adho implements UncaughtExceptionHandler
{
    static final String a;
    public UncaughtExceptionHandler b;
    private final vaf c;
    
    static {
        a = ttr.a("LowStorage");
    }
    
    public adho(final vaf c) {
        this.c = c;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        aoqn aoqn;
        if ((aoqn = this.c.b().s) == null) {
            aoqn = aoqn.a;
        }
        if (aoqn.i) {
            try {
                if (t instanceof SQLiteDiskIOException && t.getMessage() != null && t.getMessage().contains("code 4874")) {
                    final String a = adho.a;
                    final StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
                    final long availableBlocksLong = statFs.getAvailableBlocksLong();
                    final long blockSizeLong = statFs.getBlockSizeLong();
                    final StringBuilder sb = new StringBuilder("Caught exception for low storage space with bytes available: ");
                    sb.append(availableBlocksLong * blockSizeLong);
                    ttr.m(a, sb.toString());
                }
            }
            catch (final RuntimeException ex) {
                ttr.m(adho.a, "Could not get available bytes: ".concat(ex.toString()));
            }
        }
        final UncaughtExceptionHandler b = this.b;
        if (b != null) {
            b.uncaughtException(thread, t);
        }
    }
}
