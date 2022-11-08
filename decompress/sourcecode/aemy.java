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

public final class aemy implements qja
{
    public final Context a;
    public final atjj b;
    public final aftr c;
    public final arhr d;
    public final atjj e;
    public final atjj f;
    private final tdg g;
    
    public aemy(final Context a, final tdg g, final atjj b, final aftr c, final arhr d, final atjj f, final atjj e, final byte[] array, final byte[] array2, final byte[] array3) {
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
        if (!qit.b()) {
            return;
        }
        if (!this.g.P()) {
            return;
        }
        this.c(true);
    }
    
    public final void c(final boolean b) {
        final aere o = aesw.o("StartupAfterPackageReplaced");
        try {
            final ListenableFuture r = afva.r(aesm.c((afrx)new aemx(this, b)), (Executor)this.c);
            final aejp aejp = (aejp)this.d.a();
            o.a(r);
            final TimeUnit seconds = TimeUnit.SECONDS;
            r.addListener(aesm.h((Runnable)new adpd((Future)aejp.d.e(aesm.h((Runnable)new adpd(r, seconds, 9)), 30L, seconds), r, 10)), (Executor)aejp.c);
            o.close();
        }
        finally {
            try {
                o.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                adwd.aY(t, t2);
            }
        }
    }
}
