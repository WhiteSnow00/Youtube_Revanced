import java.util.concurrent.ScheduledFuture;
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

public abstract class afvd extends afye implements ListenableFuture
{
    private static final Logger a;
    private static final Object b;
    static final boolean g;
    public static final afuo h;
    public volatile afus listeners;
    public volatile Object value;
    public volatile afvc waiters;
    
    static {
        boolean boolean1;
        try {
            boolean1 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        }
        catch (final SecurityException h2) {
            boolean1 = false;
        }
        g = boolean1;
        a = Logger.getLogger(afvd.class.getName());
        Object h2 = null;
        Object o = null;
        Object o2 = null;
        Label_0138: {
            try {
                h2 = new afvb();
                o = null;
                o2 = null;
                break Label_0138;
            }
            catch (final Error h2) {}
            catch (final RuntimeException ex) {}
            try {
                final afuu afuu = new afuu((AtomicReferenceFieldUpdater)AtomicReferenceFieldUpdater.newUpdater(afvc.class, Thread.class, "thread"), (AtomicReferenceFieldUpdater)AtomicReferenceFieldUpdater.newUpdater(afvc.class, afvc.class, "next"), (AtomicReferenceFieldUpdater)AtomicReferenceFieldUpdater.newUpdater(afvd.class, afvc.class, "waiters"), (AtomicReferenceFieldUpdater)AtomicReferenceFieldUpdater.newUpdater(afvd.class, afus.class, "listeners"), (AtomicReferenceFieldUpdater)AtomicReferenceFieldUpdater.newUpdater(afvd.class, Object.class, "value"));
                o2 = null;
                o = h2;
                h2 = afuu;
                break Label_0138;
            }
            catch (final Error o) {}
            catch (final RuntimeException ex2) {}
            final afuw afuw = new afuw();
            o2 = o;
            o = h2;
            h2 = afuw;
        }
        h = (afuo)h2;
        if (o2 != null) {
            final Logger a2 = afvd.a;
            a2.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", (Throwable)o);
            a2.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", (Throwable)o2);
        }
        b = new Object();
    }
    
    protected afvd() {
    }
    
    private static Object c(final Future future) {
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
    
    private final void d(final StringBuilder sb) {
        try {
            final Object c = c((Future)this);
            sb.append("SUCCESS, result=[");
            if (c == null) {
                sb.append("null");
            }
            else if (c == this) {
                sb.append("this future");
            }
            else {
                sb.append(((afvd)c).getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(c)));
            }
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
    
    private final void e(final StringBuilder sb) {
        final int length = sb.length();
        sb.append("PENDING");
        Object o = this.value;
        if (o instanceof afuv) {
            sb.append(", setFuture=[");
            this.f(sb, ((afuv)o).b);
            sb.append("]");
        }
        else {
            Label_0085: {
                try {
                    o = afbj.c(this.np());
                    break Label_0085;
                }
                catch (final StackOverflowError o) {}
                catch (final RuntimeException ex) {}
                o = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(((afuv)o).getClass())));
            }
            if (o != null) {
                sb.append(", info=[");
                sb.append((String)o);
                sb.append("]");
            }
        }
        if (this.isDone()) {
            sb.delete(length, sb.length());
            this.d(sb);
        }
    }
    
    private final void f(final StringBuilder sb, final Object stackOverflowError) {
        while (true) {
            if (stackOverflowError == this) {
                try {
                    sb.append("this future");
                    return;
                    sb.append(stackOverflowError);
                    return;
                }
                catch (final StackOverflowError stackOverflowError) {}
                catch (final RuntimeException ex) {}
                sb.append("Exception thrown from implementation: ");
                sb.append(stackOverflowError.getClass());
                return;
            }
            continue;
        }
    }
    
    public static Object g(final ListenableFuture error) {
        if (error instanceof afux) {
            afup afup;
            final Object o = afup = (afup)((afvd)error).value;
            if (o instanceof afup) {
                final afup afup2 = (afup)o;
                afup = (afup)o;
                if (afup2.c) {
                    final Throwable d = afup2.d;
                    if (d != null) {
                        afup = new afup(false, d);
                    }
                    else {
                        afup = afup.b;
                    }
                }
            }
            afup.getClass();
            return afup;
        }
        if (error instanceof afye) {
            final Throwable h = ((afye)error).h();
            if (h != null) {
                return new afur(h);
            }
        }
        final boolean cancelled = ((ListenableFuture)error).isCancelled();
        if ((afvd.g ^ true) & cancelled) {
            final afup b = afup.b;
            b.getClass();
            return b;
        }
        try {
            final Object c = c((Future)error);
            if (cancelled) {
                final String value = String.valueOf(error);
                final StringBuilder sb = new StringBuilder("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(value);
                return new afup(false, new IllegalArgumentException(sb.toString()));
            }
            Object b2;
            if ((b2 = c) == null) {
                b2 = afvd.b;
            }
            return b2;
        }
        catch (final Error error) {
            goto Label_0203;
        }
        catch (final RuntimeException ex) {}
        catch (final CancellationException ex2) {
            if (!cancelled) {
                return new afur(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(error))), ex2));
            }
            return new afup(false, ex2);
        }
        catch (final ExecutionException ex3) {
            if (cancelled) {
                return new afup(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(error))), ex3));
            }
            return new afur(ex3.getCause());
        }
    }
    
    public static void i(final afvd afvd, boolean b) {
        final afus afus = null;
        afvd a = afvd;
        afus next = afus;
    Label_0006:
        while (true) {
            for (afvc afvc = afvd.h.b(a, afvc.a); afvc != null; afvc = afvc.next) {
                final Thread thread = afvc.thread;
                if (thread != null) {
                    afvc.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (b) {
                a.j();
            }
            a.b();
            afus a2 = afvd.h.a(a, afus.a);
            afus afus2;
            while (true) {
                afus2 = next;
                if (a2 == null) {
                    break;
                }
                final afus next2 = a2.next;
                a2.next = next;
                next = a2;
                a2 = next2;
            }
            while (afus2 != null) {
                next = afus2.next;
                final Runnable b2 = afus2.b;
                b2.getClass();
                if (b2 instanceof afuv) {
                    final afuv afuv = (afuv)b2;
                    a = afuv.a;
                    if (a.value == afuv && afvd.h.f(a, afuv, g(afuv.b))) {
                        b = false;
                        continue Label_0006;
                    }
                }
                else {
                    final Executor c = afus2.c;
                    c.getClass();
                    m(b2, c);
                }
                afus2 = next;
            }
            break;
        }
    }
    
    private static void m(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger a = afvd.a;
            final Level severe = Level.SEVERE;
            final String string = runnable.toString();
            final String string2 = executor.toString();
            final StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(string);
            sb.append(" with executor ");
            sb.append(string2);
            a.logp(severe, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), ex);
        }
    }
    
    private final void n(afvc waiters) {
        waiters.thread = null;
    Label_0005:
        while (true) {
            waiters = this.waiters;
            if (waiters != afvc.a) {
                afvc afvc = null;
                while (waiters != null) {
                    final afvc next = waiters.next;
                    afvc afvc2;
                    if (waiters.thread != null) {
                        afvc2 = waiters;
                    }
                    else if (afvc != null) {
                        afvc.next = next;
                        afvc2 = afvc;
                        if (afvc.thread == null) {
                            continue Label_0005;
                        }
                    }
                    else {
                        afvc2 = afvc;
                        if (!afvd.h.g(this, waiters, next)) {
                            continue Label_0005;
                        }
                    }
                    waiters = next;
                    afvc = afvc2;
                }
                break;
            }
            break;
        }
    }
    
    private static final Object o(final Object o) {
        if (o instanceof afup) {
            final Throwable d = ((afup)o).d;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ex.initCause(d);
            throw ex;
        }
        if (!(o instanceof afur)) {
            Object o2;
            if ((o2 = o) == afvd.b) {
                o2 = null;
            }
            return o2;
        }
        throw new ExecutionException(((afur)o).b);
    }
    
    public void addListener(final Runnable runnable, final Executor executor) {
        runnable.getClass();
        executor.getClass();
        if (!this.isDone()) {
            afus next = this.listeners;
            if (next != afus.a) {
                final afus afus = new afus(runnable, executor);
                do {
                    afus.next = next;
                    if (afvd.h.e(this, next, afus)) {
                        return;
                    }
                } while ((next = this.listeners) != afus.a);
            }
        }
        m(runnable, executor);
    }
    
    protected void b() {
    }
    
    public boolean cancel(final boolean b) {
        final Object value = this.value;
        final boolean b2 = value instanceof afuv;
        boolean b3 = false;
        if (b2 | value == null) {
            afup afup;
            if (afvd.g) {
                afup = new afup(b, new CancellationException("Future.cancel() was called."));
            }
            else {
                afup afup2;
                if (b) {
                    afup2 = afup.a;
                }
                else {
                    afup2 = afup.b;
                }
                afup2.getClass();
                afup = afup2;
            }
            b3 = false;
            afvd afvd = this;
            Object o = value;
            Label_0196: {
                ListenableFuture b4;
                while (true) {
                    if (afvd.h.f(afvd, o, afup)) {
                        i(afvd, b);
                        if (!(o instanceof afuv)) {
                            break Label_0196;
                        }
                        b4 = ((afuv)o).b;
                        if (!(b4 instanceof afux)) {
                            break;
                        }
                        afvd = (afvd)b4;
                        o = afvd.value;
                        if (!(o == null | o instanceof afuv)) {
                            break Label_0196;
                        }
                        b3 = true;
                    }
                    else {
                        if (!((o = afvd.value) instanceof afuv)) {
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
    
    public Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object value = this.value;
        if (value != null & (value instanceof afuv ^ true)) {
            return o(value);
        }
        afvc afvc = this.waiters;
        if (afvc != afvc.a) {
            final afvc afvc2 = new afvc();
            do {
                afvc2.a(afvc);
                if (afvd.h.g(this, afvc, afvc2)) {
                    Object value2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            this.n(afvc2);
                            throw new InterruptedException();
                        }
                        value2 = this.value;
                    } while (!(value2 != null & (value2 instanceof afuv ^ true)));
                    return o(value2);
                }
            } while ((afvc = this.waiters) != afvc.a);
        }
        final Object value3 = this.value;
        value3.getClass();
        return o(value3);
    }
    
    public Object get(long convert, final TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(convert);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object value = this.value;
        final int n = 1;
        if (value != null & (value instanceof afuv ^ true)) {
            return o(value);
        }
        long n2;
        if (nanos > 0L) {
            n2 = System.nanoTime() + nanos;
        }
        else {
            n2 = 0L;
        }
        long n3 = nanos;
        Label_0267: {
            if (nanos >= 1000L) {
                afvc afvc = this.waiters;
                if (afvc != afvc.a) {
                    final afvc afvc2 = new afvc();
                    do {
                        afvc2.a(afvc);
                        if (afvd.h.g(this, afvc, afvc2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    this.n(afvc2);
                                    throw new InterruptedException();
                                }
                                final Object value2 = this.value;
                                if (value2 != null & (value2 instanceof afuv ^ true)) {
                                    return o(value2);
                                }
                                n3 = (nanos = n2 - System.nanoTime());
                            } while (n3 >= 1000L);
                            this.n(afvc2);
                            break Label_0267;
                        }
                    } while ((afvc = this.waiters) != afvc.a);
                }
                final Object value3 = this.value;
                value3.getClass();
                return o(value3);
            }
        }
        while (n3 > 0L) {
            final Object value4 = this.value;
            if (value4 != null & (value4 instanceof afuv ^ true)) {
                return o(value4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            n3 = n2 - System.nanoTime();
        }
        final String string = this.toString();
        final String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        final String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
        final StringBuilder sb = new StringBuilder("Waited ");
        sb.append(convert);
        sb.append(" ");
        sb.append(lowerCase2);
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
    
    @Override
    public final Throwable h() {
        if (this instanceof afux) {
            final Object value = this.value;
            if (value instanceof afur) {
                return ((afur)value).b;
            }
        }
        return null;
    }
    
    public boolean isCancelled() {
        return this.value instanceof afup;
    }
    
    public boolean isDone() {
        final Object value = this.value;
        final boolean b = value instanceof afuv;
        boolean b2 = true;
        if (value == null) {
            b2 = false;
        }
        return b2 & (b ^ true);
    }
    
    protected void j() {
    }
    
    final void k(final Future future) {
        if (future != null & this.isCancelled()) {
            future.cancel(this.l());
        }
    }
    
    protected final boolean l() {
        final Object value = this.value;
        return value instanceof afup && ((afup)value).c;
    }
    
    protected String np() {
        if (this instanceof ScheduledFuture) {
            final long delay = ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS);
            final StringBuilder sb = new StringBuilder("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }
    
    public boolean set(final Object o) {
        Object b = o;
        if (o == null) {
            b = afvd.b;
        }
        if (afvd.h.f(this, null, b)) {
            i(this, false);
            return true;
        }
        return false;
    }
    
    protected boolean setException(final Throwable t) {
        t.getClass();
        if (afvd.h.f(this, null, new afur(t))) {
            i(this, false);
            return true;
        }
        return false;
    }
    
    public boolean setFuture(final ListenableFuture error) {
        error.getClass();
        Object o;
        if ((o = this.value) == null) {
            if (((ListenableFuture)error).isDone()) {
                if (afvd.h.f(this, null, g((ListenableFuture)error))) {
                    i(this, false);
                    return true;
                }
                return false;
            }
            else {
                final afuv afuv = new afuv(this, (ListenableFuture)error);
                if (afvd.h.f(this, null, afuv)) {
                    try {
                        ((ListenableFuture)error).addListener((Runnable)afuv, (Executor)afwd.a);
                        return true;
                    }
                    catch (final Error error) {}
                    catch (final RuntimeException ex) {}
                    afur a;
                    try {
                        a = new afur(error);
                    }
                    catch (final RuntimeException | Error runtimeException | Error) {
                        a = afur.a;
                    }
                    afvd.h.f(this, afuv, a);
                    return true;
                }
                o = this.value;
            }
        }
        if (o instanceof afup) {
            ((ListenableFuture)error).cancel(((afup)o).c);
        }
        return false;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(this.getClass().getSimpleName());
        }
        else {
            sb.append(this.getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.isCancelled()) {
            sb.append("CANCELLED");
        }
        else if (this.isDone()) {
            this.d(sb);
        }
        else {
            this.e(sb);
        }
        sb.append("]");
        return sb.toString();
    }
}
