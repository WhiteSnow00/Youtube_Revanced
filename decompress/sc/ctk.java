import java.util.concurrent.TimeoutException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ctk implements ListenableFuture
{
    static final boolean a;
    static final ctb b;
    public static final Object c;
    private static final Logger g;
    volatile Object d;
    volatile ctf e;
    volatile ctj f;
    
    static {
        a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        g = Logger.getLogger(ctk.class.getName());
        cti b2;
        try {
            final ctg ctg = new ctg(AtomicReferenceFieldUpdater.newUpdater(ctj.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ctj.class, ctj.class, "c"), AtomicReferenceFieldUpdater.newUpdater(ctk.class, ctj.class, "f"), AtomicReferenceFieldUpdater.newUpdater(ctk.class, ctf.class, "e"), AtomicReferenceFieldUpdater.newUpdater(ctk.class, Object.class, "d"));
        }
        finally {
            b2 = new cti();
        }
        b = b2;
        final Throwable t;
        if (t != null) {
            ctk.g.log(Level.SEVERE, "SafeAtomicHelper is broken!", t);
        }
        c = new Object();
    }
    
    protected ctk() {
    }
    
    static Object a(final ListenableFuture listenableFuture) {
        if (listenableFuture instanceof ctk) {
            Object o2;
            final Object o = o2 = ((ctk)listenableFuture).d;
            if (o instanceof ctc) {
                final ctc ctc = (ctc)o;
                o2 = o;
                if (ctc.c) {
                    final Throwable d = ctc.d;
                    if (d != null) {
                        o2 = new ctc(false, d);
                    }
                    else {
                        o2 = ctc.b;
                    }
                }
            }
            return o2;
        }
        final boolean cancelled = listenableFuture.isCancelled();
        if ((ctk.a ^ true) & cancelled) {
            return ctc.b;
        }
        try {
            Object o3;
            if ((o3 = h((Future)listenableFuture)) == null) {
                o3 = ctk.c;
            }
            return o3;
        }
        catch (final CancellationException ex) {
            if (!cancelled) {
                new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ").append(listenableFuture);
                return new cte((Throwable)new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), ex));
            }
            return new ctc(false, (Throwable)ex);
        }
        catch (final ExecutionException ex2) {
            return new cte(ex2.getCause());
        }
        finally {
            final Throwable t;
            return new cte(t);
        }
    }
    
    static void b(final ctk ctk) {
        final ctf ctf = null;
        ctk a = ctk;
        ctf d = ctf;
    Label_0006:
        while (true) {
            ctj ctj = a.f;
            if (ctk.b.e(a, ctj, ctj.a)) {
                while (ctj != null) {
                    final Thread b = ctj.b;
                    if (b != null) {
                        ctj.b = null;
                        LockSupport.unpark(b);
                    }
                    ctj = ctj.c;
                }
                ctf e;
                do {
                    e = a.e;
                } while (!ctk.b.c(a, e, ctf.a));
                ctf d2 = e;
                ctf ctf3;
                while (true) {
                    final ctf ctf2 = d2;
                    ctf3 = d;
                    if (ctf2 == null) {
                        break;
                    }
                    d2 = ctf2.d;
                    ctf2.d = d;
                    d = ctf2;
                }
                while (ctf3 != null) {
                    d = ctf3.d;
                    final Runnable b2 = ctf3.b;
                    if (b2 instanceof cth) {
                        final cth cth = (cth)b2;
                        a = cth.a;
                        if (a.d == cth && ctk.b.d(a, (Object)cth, a(cth.b))) {
                            continue Label_0006;
                        }
                    }
                    else {
                        k(b2, ctf3.c);
                    }
                    ctf3 = d;
                }
                break;
            }
        }
    }
    
    static void c(final Object o) {
        o.getClass();
    }
    
    public static ctk f() {
        return new ctk();
    }
    
    private static Object h(final Future future) {
        int n = 0;
        while (true) {
            try {
                final Object value = future.get();
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
                return value;
            }
            catch (final InterruptedException ex) {
                n = 1;
                continue;
            }
            finally {
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }
    
    private final String i(final Object o) {
        if (o == this) {
            return "this future";
        }
        return String.valueOf(o);
    }
    
    private final void j(final StringBuilder sb) {
        try {
            final Object h = h((Future)this);
            sb.append("SUCCESS, result=[");
            sb.append(this.i(h));
            sb.append("]");
        }
        catch (final RuntimeException ex) {
            sb.append("UNKNOWN, cause=[");
            sb.append(ex.getClass());
            sb.append(" thrown from get()]");
        }
        catch (final CancellationException ex2) {
            sb.append("CANCELLED");
        }
        catch (final ExecutionException ex3) {
            sb.append("FAILURE, cause=[");
            sb.append(ex3.getCause());
            sb.append("]");
        }
    }
    
    private static void k(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger g = ctk.g;
            final Level severe = Level.SEVERE;
            final StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            g.log(severe, sb.toString(), ex);
        }
    }
    
    private final void l(ctj f) {
        f.b = null;
    Label_0005:
        while (true) {
            f = this.f;
            if (f != ctj.a) {
                ctj ctj = null;
                while (f != null) {
                    final ctj c = f.c;
                    ctj ctj2;
                    if (f.b != null) {
                        ctj2 = f;
                    }
                    else if (ctj != null) {
                        ctj.c = c;
                        ctj2 = ctj;
                        if (ctj.b == null) {
                            continue Label_0005;
                        }
                    }
                    else {
                        ctj2 = ctj;
                        if (!ctk.b.e(this, f, c)) {
                            continue Label_0005;
                        }
                    }
                    f = c;
                    ctj = ctj2;
                }
                break;
            }
            break;
        }
    }
    
    private static final Object m(final Object o) {
        if (o instanceof ctc) {
            final Throwable d = ((ctc)o).d;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ex.initCause(d);
            throw ex;
        }
        if (!(o instanceof cte)) {
            Object o2;
            if ((o2 = o) == ctk.c) {
                o2 = null;
            }
            return o2;
        }
        throw new ExecutionException(((cte)o).b);
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        c(runnable);
        c(executor);
        ctf d = this.e;
        if (d != ctf.a) {
            final ctf ctf = new ctf(runnable, executor);
            do {
                ctf.d = d;
                if (ctk.b.c(this, d, ctf)) {
                    return;
                }
            } while ((d = this.e) != ctf.a);
        }
        k(runnable, executor);
    }
    
    public final boolean cancel(final boolean b) {
        Object o = this.d;
        final boolean b2 = o instanceof cth;
        boolean b3 = false;
        if (b2 | o == null) {
            ctc ctc;
            if (ctk.a) {
                ctc = new ctc(b, (Throwable)new CancellationException("Future.cancel() was called."));
            }
            else if (b) {
                ctc = ctc.a;
            }
            else {
                ctc = ctc.b;
            }
            b3 = false;
            ctk ctk = this;
            Label_0181: {
                ListenableFuture b4;
                while (true) {
                    if (ctk.b.d(ctk, o, (Object)ctc)) {
                        b(ctk);
                        if (!(o instanceof cth)) {
                            break Label_0181;
                        }
                        b4 = ((cth)o).b;
                        if (!(b4 instanceof ctk)) {
                            break;
                        }
                        ctk = (ctk)b4;
                        o = ctk.d;
                        if (!(o == null | o instanceof cth)) {
                            break Label_0181;
                        }
                        b3 = true;
                    }
                    else {
                        if (!((o = ctk.d) instanceof cth)) {
                            return b3;
                        }
                        continue;
                    }
                }
                b4.cancel(b);
            }
            b3 = true;
        }
        return b3;
    }
    
    public final void d(final Throwable t) {
        if (ctk.b.d(this, (Object)null, (Object)new cte(t))) {
            b(this);
        }
    }
    
    public final void e(final ListenableFuture listenableFuture) {
        c(listenableFuture);
        Object o;
        if ((o = this.d) == null) {
            if (listenableFuture.isDone()) {
                if (ctk.b.d(this, (Object)null, a(listenableFuture))) {
                    b(this);
                }
                return;
            }
            else {
                final cth cth = new cth(this, listenableFuture);
                if (ctk.b.d(this, (Object)null, (Object)cth)) {
                    try {
                        listenableFuture.addListener((Runnable)cth, (Executor)ctl.a);
                        return;
                    }
                    finally {
                        cte a = null;
                        try {
                            final Throwable t;
                            final cte cte = new cte(t);
                        }
                        finally {
                            a = cte.a;
                        }
                        ctk.b.d(this, (Object)cth, (Object)a);
                        return;
                    }
                }
                o = this.d;
            }
        }
        if (o instanceof ctc) {
            listenableFuture.cancel(((ctc)o).c);
        }
    }
    
    public final void g(final Object o) {
        Object c = o;
        if (o == null) {
            c = ctk.c;
        }
        if (ctk.b.d(this, (Object)null, c)) {
            b(this);
        }
    }
    
    public final Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object d = this.d;
        if (d != null & (d instanceof cth ^ true)) {
            return m(d);
        }
        ctj ctj = this.f;
        if (ctj != ctj.a) {
            final ctj ctj2 = new ctj();
            do {
                ctj2.a(ctj);
                if (ctk.b.e(this, ctj, ctj2)) {
                    Object d2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            this.l(ctj2);
                            throw new InterruptedException();
                        }
                        d2 = this.d;
                    } while (!(d2 != null & (d2 instanceof cth ^ true)));
                    return m(d2);
                }
            } while ((ctj = this.f) != ctj.a);
        }
        return m(this.d);
    }
    
    public final Object get(long convert, final TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(convert);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object d = this.d;
        final int n = 1;
        if (d != null & (d instanceof cth ^ true)) {
            return m(d);
        }
        long n2;
        if (nanos > 0L) {
            n2 = System.nanoTime() + nanos;
        }
        else {
            n2 = 0L;
        }
        long n3 = nanos;
        Label_0254: {
            if (nanos >= 1000L) {
                ctj ctj = this.f;
                if (ctj != ctj.a) {
                    final ctj ctj2 = new ctj();
                    do {
                        ctj2.a(ctj);
                        if (ctk.b.e(this, ctj, ctj2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    this.l(ctj2);
                                    throw new InterruptedException();
                                }
                                final Object d2 = this.d;
                                if (d2 != null & (d2 instanceof cth ^ true)) {
                                    return m(d2);
                                }
                                n3 = (nanos = n2 - System.nanoTime());
                            } while (n3 >= 1000L);
                            this.l(ctj2);
                            break Label_0254;
                        }
                    } while ((ctj = this.f) != ctj.a);
                }
                return m(this.d);
            }
        }
        while (n3 > 0L) {
            final Object d3 = this.d;
            if (d3 != null & (d3 instanceof cth ^ true)) {
                return m(d3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            n3 = n2 - System.nanoTime();
        }
        final String string = this.toString();
        final String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        final StringBuilder sb = new StringBuilder("Waited ");
        sb.append(convert);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
        String s2;
        final String s = s2 = sb.toString();
        if (n3 + 1000L < 0L) {
            final String concat = s.concat(" (plus ");
            final long n4 = -n3;
            convert = timeUnit.convert(n4, TimeUnit.NANOSECONDS);
            final long n5 = n4 - timeUnit.toNanos(convert);
            int n6 = n;
            if (convert != 0L) {
                if (n5 > 1000L) {
                    n6 = n;
                }
                else {
                    n6 = 0;
                }
            }
            String concat2 = concat;
            if (convert > 0L) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(concat);
                sb2.append(convert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String s3 = sb2.toString();
                if (n6 != 0) {
                    s3 = s3.concat(",");
                }
                concat2 = s3.concat(" ");
            }
            String string2 = concat2;
            if (n6 != 0) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(concat2);
                sb3.append(n5);
                sb3.append(" nanoseconds ");
                string2 = sb3.toString();
            }
            s2 = string2.concat("delay)");
        }
        if (this.isDone()) {
            throw new TimeoutException(s2.concat(" but future completed as timeout expired"));
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(s2);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }
    
    public final boolean isCancelled() {
        return this.d instanceof ctc;
    }
    
    public final boolean isDone() {
        final Object d = this.d;
        final boolean b = d instanceof cth;
        boolean b2 = true;
        if (d == null) {
            b2 = false;
        }
        return b2 & (b ^ true);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.isCancelled()) {
            sb.append("CANCELLED");
        }
        else if (this.isDone()) {
            this.j(sb);
        }
        else {
            String s;
            try {
                final Object d = this.d;
                if (d instanceof cth) {
                    final StringBuilder sb2 = new StringBuilder("setFuture=[");
                    sb2.append(this.i(((cth)d).b));
                    sb2.append("]");
                    s = sb2.toString();
                }
                else {
                    s = null;
                }
            }
            catch (final RuntimeException ex) {
                final StringBuilder sb3 = new StringBuilder("Exception thrown from implementation: ");
                final Class<? extends RuntimeException> class1 = ex.getClass();
                sb3.append(class1);
                s = "Exception thrown from implementation: ".concat(String.valueOf(class1));
            }
            if (s != null && !s.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(s);
                sb.append("]");
            }
            else if (this.isDone()) {
                this.j(sb);
            }
            else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
