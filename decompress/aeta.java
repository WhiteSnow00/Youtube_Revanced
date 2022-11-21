import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeta
{
    public static final afma a;
    public final ReentrantReadWriteLock b;
    public final afxj c;
    public final oco d;
    public final AtomicBoolean e;
    public long f;
    private final Context g;
    
    static {
        a = afma.m("com/google/apps/tiktok/sync/impl/SyncManagerDataStore");
    }
    
    public aeta(final Context g, final afxj c, final oco d) {
        this.b = new ReentrantReadWriteLock();
        this.e = new AtomicBoolean(false);
        this.f = -1L;
        this.d = d;
        this.g = g;
        this.c = c;
    }
    
    public final aetl a() {
        final File file = new File(this.g.getFilesDir(), "103795117");
        this.b.readLock().lock();
        try {
            final boolean exists = file.exists();
            final aetl aetl = null;
            Closeable closeable = null;
            if (exists) {
                try {
                    final FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        final aetl aetl2 = (aetl)ahcz.parseDelimitedFrom(aetl.a, fileInputStream);
                        qem.z((Closeable)fileInputStream);
                    }
                    finally {
                        closeable = fileInputStream;
                    }
                }
                finally {}
                qem.z(closeable);
            }
            this.b.readLock().unlock();
            if (aetl == null) {
                return aetl.a;
            }
            return aetl;
        }
        finally {
            this.b.readLock().unlock();
        }
    }
    
    public final ListenableFuture b() {
        return afvh.e(this.c(), aewf.a((afax)new aemg(this, 12)), (Executor)this.c);
    }
    
    final ListenableFuture c() {
        if (this.e.get()) {
            return afxr.l(this.f);
        }
        return this.c.rz(aewf.i((Callable)new aenb(this, 5)));
    }
    
    final ListenableFuture d(final aetc aetc, final long n, final boolean b) {
        return this.c.rC(new aesx(this, aetc, n, b));
    }
    
    public final void e(final aetl aetl) {
        FileOutputStream fileOutputStream2;
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(new File(this.g.getFilesDir(), "103795117"));
            try {
                aetl.writeDelimitedTo((OutputStream)fileOutputStream);
                fileOutputStream.close();
                return;
            }
            finally {}
        }
        finally {
            fileOutputStream2 = null;
        }
        if (fileOutputStream2 != null) {
            fileOutputStream2.close();
        }
    }
    
    public final boolean f(final Throwable t) {
        c.i(((aflw)aeta.a).h(), "Could not read sync datastore. There was probably a write error. Wiping store.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", '\u01fd', "SyncManagerDataStore.java", t);
        this.b.writeLock().lock();
        try {
            final AtomicBoolean e = this.e;
            boolean b = false;
            e.set(false);
            long c = this.f;
            if (c <= 0L) {
                c = this.d.c();
            }
            final ahcr builder = aetl.a.createBuilder();
            builder.copyOnWrite();
            final aetl aetl = (aetl)builder.instance;
            aetl.b |= 0x1;
            aetl.c = c;
            final aetl aetl2 = (aetl)builder.build();
            try {
                try {
                    this.e(aetl2);
                    this.e.set(true);
                    b = true;
                }
                finally {}
            }
            catch (final IOException ex) {
                c.i(((aflw)aeta.a).g(), "Could not write to datastore to clear store.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", '\u0211', "SyncManagerDataStore.java", ex);
                this.e.set(false);
            }
            return b;
            this.e.set(true);
        }
        finally {
            this.b.writeLock().unlock();
        }
    }
}
