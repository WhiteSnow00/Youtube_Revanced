import android.os.StatFs;
import android.os.Environment;
import android.database.sqlite.SQLiteDiskIOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjd implements UncaughtExceptionHandler
{
    static final String a;
    public UncaughtExceptionHandler b;
    private final vbo c;
    
    static {
        a = tut.a("LowStorage");
    }
    
    public adjd(final vbo c) {
        this.c = c;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        aosy aosy;
        if ((aosy = this.c.b().s) == null) {
            aosy = aosy.a;
        }
        if (aosy.i) {
            try {
                if (t instanceof SQLiteDiskIOException && t.getMessage() != null && t.getMessage().contains("code 4874")) {
                    final String a = adjd.a;
                    final StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
                    final long availableBlocksLong = statFs.getAvailableBlocksLong();
                    final long blockSizeLong = statFs.getBlockSizeLong();
                    final StringBuilder sb = new StringBuilder("Caught exception for low storage space with bytes available: ");
                    sb.append(availableBlocksLong * blockSizeLong);
                    tut.m(a, sb.toString());
                }
            }
            catch (final RuntimeException ex) {
                tut.m(adjd.a, "Could not get available bytes: ".concat(ex.toString()));
            }
        }
        final UncaughtExceptionHandler b = this.b;
        if (b != null) {
            b.uncaughtException(thread, t);
        }
    }
}
