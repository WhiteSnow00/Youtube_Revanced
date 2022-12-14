import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataSink;

// 
// Decompiled by Procyon v0.6.0
// 

public final class augs extends UploadDataSink
{
    public final AtomicInteger a;
    public final UploadDataProvider b;
    public ByteBuffer c;
    public long d;
    public long e;
    public final HttpURLConnection f;
    public WritableByteChannel g;
    public OutputStream h;
    final augx i;
    private final Executor j;
    private final Executor k;
    private final AtomicBoolean l;
    
    public augs(final augx i, final Executor executor, final Executor k, final HttpURLConnection f, final auhq b) {
        this.i = i;
        this.a = new AtomicInteger(3);
        this.j = new afxl(this, executor, 3);
        this.k = k;
        this.b = b;
        this.l = new AtomicBoolean(false);
        this.f = f;
    }
    
    public final void a(final augy augy) {
        try {
            this.j.execute(this.i.e(augy));
        }
        catch (final RejectedExecutionException ex) {
            this.f(ex);
        }
    }
    
    public final void b() {
        this.k.execute(this.c(new augq(this, 2)));
    }
    
    protected final Runnable c(final augy augy) {
        return this.i.d(augy);
    }
    
    public final void d() {
        if (this.g != null && this.l.compareAndSet(false, true)) {
            this.g.close();
        }
    }
    
    protected final void e() {
        this.d();
        this.i.m();
    }
    
    public final void f(final Throwable t) {
        this.i.j(t);
    }
    
    public final void onReadError(final Exception ex) {
        this.f(ex);
    }
    
    public final void onReadSucceeded(final boolean b) {
        if (this.a.compareAndSet(0, 2)) {
            this.k.execute(this.c(new augr(this, b, 1)));
            return;
        }
        final int value = this.a.get();
        final StringBuilder sb = new StringBuilder("onReadSucceeded() called when not awaiting a read result; in state: ");
        sb.append(value);
        throw new IllegalStateException(sb.toString());
    }
    
    public final void onRewindError(final Exception ex) {
        this.f(ex);
    }
    
    public final void onRewindSucceeded() {
        if (this.a.compareAndSet(1, 2)) {
            this.b();
            return;
        }
        final int value = this.a.get();
        final StringBuilder sb = new StringBuilder("onRewindSucceeded() called when not awaiting a rewind; in state: ");
        sb.append(value);
        throw new IllegalStateException(sb.toString());
    }
}
