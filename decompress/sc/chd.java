import java.io.IOException;
import android.util.Log;
import java.io.FileOutputStream;
import java.util.concurrent.locks.ReentrantLock;
import java.util.HashMap;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.Lock;
import java.io.File;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chd
{
    public static final Map a;
    public final boolean b;
    private final File c;
    private final Lock d;
    private FileChannel e;
    
    static {
        a = new HashMap();
    }
    
    public chd(final String s, final File file) {
        s.getClass();
        this.b = false;
        final File c = new File(file, s.concat(".lck"));
        this.c = c;
        final String absolutePath = c.getAbsolutePath();
        absolutePath.getClass();
        final Map a = chd.a;
        synchronized (a) {
            Object value;
            if ((value = a.get(absolutePath)) == null) {
                value = new ReentrantLock();
                a.put(absolutePath, value);
            }
            final Lock d = (Lock)value;
            monitorexit(a);
            this.d = d;
        }
    }
    
    public final void a(final boolean b) {
        this.d.lock();
        if (b) {
            try {
                final File parentFile = this.c.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                final FileChannel channel = new FileOutputStream(this.c).getChannel();
                channel.lock();
                this.e = channel;
            }
            catch (final IOException ex) {
                this.e = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", (Throwable)ex);
            }
        }
    }
    
    public final void b() {
        while (true) {
            try {
                final FileChannel e = this.e;
                if (e != null) {
                    e.close();
                }
                this.d.unlock();
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
}
