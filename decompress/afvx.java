import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvx
{
    public static final Logger a;
    public final afvv b;
    public final afxb c;
    private final AtomicReference d;
    
    static {
        a = Logger.getLogger(afvx.class.getName());
    }
    
    private afvx(final ListenableFuture listenableFuture) {
        this.d = new AtomicReference((V)afvw.a);
        this.b = new afvv();
        this.c = afxb.m(listenableFuture);
    }
    
    public afvx(final suu suu, final Executor executor, final byte[] array, final byte[] array2) {
        this.d = new AtomicReference((V)afvw.a);
        this.b = new afvv();
        final afyc d = afyc.d((Callable)new afvs(this, suu, 0, null, null));
        executor.execute((Runnable)d);
        this.c = (afxb)d;
    }
    
    @Deprecated
    public static afvx a(final ListenableFuture listenableFuture, final Executor executor) {
        executor.getClass();
        final afvx afvx = new afvx(afxr.m(listenableFuture));
        afxr.v(listenableFuture, (afwr)new nqh(afvx, executor, 3), afwd.a);
        return afvx;
    }
    
    public static afvx b(final ListenableFuture listenableFuture) {
        return new afvx(listenableFuture);
    }
    
    public static void f(final Closeable closeable, final Executor executor) {
        if (closeable != null) {
            try {
                executor.execute(new aevy(closeable, 7));
            }
            catch (final RejectedExecutionException ex) {
                final Logger a = afvx.a;
                if (a.isLoggable(Level.WARNING)) {
                    a.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), ex);
                }
                f(closeable, afwd.a);
            }
        }
    }
    
    private final boolean i(final afvw afvw, final afvw afvw2) {
        final AtomicReference d = this.d;
        while (!d.compareAndSet(afvw, afvw2)) {
            if (d.get() != afvw) {
                return false;
            }
        }
        return true;
    }
    
    public final afvx c(final afvu afvu, final Executor executor) {
        return this.g((afxb)afvh.f((ListenableFuture)this.c, (afvq)new afvt(this, afvu, 2), executor));
    }
    
    public final void d(final afvv afvv) {
        this.e(afvw.a, afvw.b);
        afvv.a(this.b, afwd.a);
    }
    
    public final void e(final afvw afvw, final afvw afvw2) {
        adme.Z(this.i(afvw, afvw2), "Expected state to be %s, but it was %s", afvw, afvw2);
    }
    
    @Override
    protected final void finalize() {
        if (this.d.get().equals(afvw.a)) {
            afvx.a.logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            this.h();
        }
    }
    
    public final afvx g(final afxb afxb) {
        final afvx afvx = new afvx((ListenableFuture)afxb);
        this.d(afvx.b);
        return afvx;
    }
    
    public final afxb h() {
        if (this.i(afvw.a, afvw.c)) {
            afvx.a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", this);
            ((afvd)this.c).addListener(new aevy(this, 8), afwd.a);
        }
        else {
            final int ordinal = this.d.get().ordinal();
            if (ordinal == 0) {
                throw new AssertionError();
            }
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (ordinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return this.c;
    }
    
    @Override
    public final String toString() {
        final afbg ae = adme.ae(this);
        ae.b("state", this.d.get());
        ae.a(this.c);
        return ae.toString();
    }
}
