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

public final class aeqr implements qle
{
    public final Context a;
    public final atnb b;
    public final afxj c;
    public final arna d;
    public final atnb e;
    public final atnb f;
    private final srr g;
    
    public aeqr(final Context a, final srr g, final atnb b, final afxj c, final arna d, final atnb f, final atnb e, final byte[] array, final byte[] array2, final byte[] array3) {
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
        if (!qkx.b()) {
            return;
        }
        if (!this.g.H()) {
            return;
        }
        this.c(true);
    }
    
    public final void c(final boolean b) {
        final aeux o = aewp.o("StartupAfterPackageReplaced");
        try {
            final ListenableFuture q = afxr.q(aewf.c((afvp)new aeqq(this, b)), this.c);
            final aenj aenj = (aenj)this.d.a();
            o.a(q);
            final TimeUnit seconds = TimeUnit.SECONDS;
            q.addListener(aewf.h(new adra(aenj.d.e(aewf.h(new adra(q, seconds, 13)), 30L, seconds), q, 14)), (Executor)aenj.c);
            o.close();
        }
        finally {
            try {
                o.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                aegu.M(t, t2);
            }
        }
    }
}
