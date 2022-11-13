import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.io.EOFException;
import java.io.RandomAccessFile;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeoy implements qkk
{
    public final Context a;
    public final atke b;
    public final afvs c;
    public final arkg d;
    public final atke e;
    public final atke f;
    private final sqq g;
    
    public aeoy(final Context a, final sqq g, final atke b, final afvs c, final arkg d, final atke f, final atke e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static int b(final RandomAccessFile randomAccessFile) {
        try {
            return randomAccessFile.readInt();
        }
        catch (final EOFException ex) {
            return -1;
        }
        finally {
            randomAccessFile.seek(0L);
        }
    }
    
    public static void d(final RandomAccessFile randomAccessFile, final int n) {
        randomAccessFile.writeInt(n);
        randomAccessFile.seek(0L);
    }
    
    public final void a() {
        if (!qkd.b()) {
            return;
        }
        if (!this.g.H()) {
            return;
        }
        this.c(true);
    }
    
    public final void c(final boolean b) {
        final aetf o = aeux.o("StartupAfterPackageReplaced");
        try {
            final ListenableFuture r = afwm.r(aeun.c((afty)new aeox(this, b)), (Executor)this.c);
            final aelq aelq = (aelq)this.d.a();
            o.a(r);
            final TimeUnit seconds = TimeUnit.SECONDS;
            r.addListener(aeun.h((Runnable)new adqz((Future)aelq.d.e(aeun.h((Runnable)new adqz(r, seconds, 11)), 30L, seconds), r, 12)), (Executor)aelq.c);
            o.close();
        }
        finally {
            try {
                o.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                agpc.al(t, t2);
            }
        }
    }
}
