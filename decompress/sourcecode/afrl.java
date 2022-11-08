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

public abstract class afrl extends aful implements ListenableFuture
{
    private static final Logger a;
    private static final Object b;
    static final boolean g;
    public static final afqw h;
    public volatile afra listeners;
    public volatile Object value;
    public volatile afrk waiters;
    
    static {
        boolean boolean1;
        try {
            boolean1 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        }
        catch (final SecurityException h2) {
            boolean1 = false;
        }
        g = boolean1;
        a = Logger.getLogger(afrl.class.getName());
        Object h2 = null;
        Throwable t = null;
        Object o = null;
        Label_0138: {
            try {
                h2 = new afrj();
                o = (t = null);
                break Label_0138;
            }
            catch (final Error h2) {}
            catch (final RuntimeException ex) {}
            try {
                final afrc afrc = new afrc(AtomicReferenceFieldUpdater.newUpdater(afrk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(afrk.class, afrk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(afrl.class, afrk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(afrl.class, afra.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(afrl.class, Object.class, "value"));
                t = null;
                o = h2;
                h2 = afrc;
                break Label_0138;
            }
            catch (final Error o) {}
            catch (final RuntimeException ex2) {}
            final afre afre = new afre();
            t = (Throwable)o;
            o = h2;
            h2 = afre;
        }
        h = (afqw)h2;
        if (t != null) {
            final Logger a2 = afrl.a;
            a2.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", (Throwable)o);
            a2.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", t);
        }
        b = new Object();
    }
    
    protected afrl() {
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
                sb.append(((afrl)c).getClass().getName());
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
        if (o instanceof afrd) {
            sb.append(", setFuture=[");
            this.f(sb, ((afrd)o).b);
            sb.append("]");
        }
        else {
            Label_0085: {
                try {
                    o = aexs.c(this.ns());
                    break Label_0085;
                }
                catch (final StackOverflowError o) {}
                catch (final RuntimeException ex) {}
                o = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(((afrd)o).getClass())));
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
        if (error instanceof afrf) {
            afqx afqx;
            final Object o = afqx = (afqx)((afrl)error).value;
            if (o instanceof afqx) {
                final afqx afqx2 = (afqx)o;
                afqx = (afqx)o;
                if (afqx2.c) {
                    final Throwable d = afqx2.d;
                    if (d != null) {
                        afqx = new afqx(false, d);
                    }
                    else {
                        afqx = afqx.b;
                    }
                }
            }
            afqx.getClass();
            return afqx;
        }
        if (error instanceof aful) {
            final Throwable h = ((aful)error).h();
            if (h != null) {
                return new afqz(h);
            }
        }
        final boolean cancelled = ((ListenableFuture)error).isCancelled();
        if ((afrl.g ^ true) & cancelled) {
            final afqx b = afqx.b;
            b.getClass();
            return b;
        }
        try {
            final Object c = c((Future)error);
            if (cancelled) {
                final String value = String.valueOf(error);
                final StringBuilder sb = new StringBuilder("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(value);
                return new afqx(false, (Throwable)new IllegalArgumentException(sb.toString()));
            }
            Object b2;
            if ((b2 = c) == null) {
                b2 = afrl.b;
            }
            return b2;
        }
        catch (final Error error) {
            goto Label_0204;
        }
        catch (final RuntimeException ex) {}
        catch (final CancellationException ex2) {
            if (!cancelled) {
                return new afqz((Throwable)new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(error))), ex2));
            }
            return new afqx(false, (Throwable)ex2);
        }
        catch (final ExecutionException ex3) {
            if (cancelled) {
                return new afqx(false, (Throwable)new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(error))), ex3));
            }
            return new afqz(ex3.getCause());
        }
    }
    
    public static void i(final afrl afrl, boolean b) {
        final afra afra = null;
        afrl a = afrl;
        afra next = afra;
    Label_0006:
        while (true) {
            for (afrk afrk = afrl.h.b(a, afrk.a); afrk != null; afrk = afrk.next) {
                final Thread thread = afrk.thread;
                if (thread != null) {
                    afrk.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (b) {
                a.j();
            }
            a.b();
            afra a2 = afrl.h.a(a, afra.a);
            afra afra2;
            while (true) {
                afra2 = next;
                if (a2 == null) {
                    break;
                }
                final afra next2 = a2.next;
                a2.next = next;
                next = a2;
                a2 = next2;
            }
            while (afra2 != null) {
                next = afra2.next;
                final Runnable b2 = afra2.b;
                b2.getClass();
                if (b2 instanceof afrd) {
                    final afrd afrd = (afrd)b2;
                    a = afrd.a;
                    if (a.value == afrd && afrl.h.f(a, (Object)afrd, g(afrd.b))) {
                        b = false;
                        continue Label_0006;
                    }
                }
                else {
                    final Executor c = afra2.c;
                    c.getClass();
                    m(b2, c);
                }
                afra2 = next;
            }
            break;
        }
    }
    
    private static void m(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger a = afrl.a;
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
    
    private final void n(afrk waiters) {
        waiters.thread = null;
    Label_0005:
        while (true) {
            waiters = this.waiters;
            if (waiters != afrk.a) {
                afrk afrk = null;
                while (waiters != null) {
                    final afrk next = waiters.next;
                    afrk afrk2;
                    if (waiters.thread != null) {
                        afrk2 = waiters;
                    }
                    else if (afrk != null) {
                        afrk.next = next;
                        afrk2 = afrk;
                        if (afrk.thread == null) {
                            continue Label_0005;
                        }
                    }
                    else {
                        afrk2 = afrk;
                        if (!afrl.h.g(this, waiters, next)) {
                            continue Label_0005;
                        }
                    }
                    waiters = next;
                    afrk = afrk2;
                }
                break;
            }
            break;
        }
    }
    
    private static final Object o(final Object o) {
        if (o instanceof afqx) {
            final Throwable d = ((afqx)o).d;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ex.initCause(d);
            throw ex;
        }
        if (!(o instanceof afqz)) {
            Object o2;
            if ((o2 = o) == afrl.b) {
                o2 = null;
            }
            return o2;
        }
        throw new ExecutionException(((afqz)o).b);
    }
    
    public void addListener(final Runnable runnable, final Executor executor) {
        runnable.getClass();
        executor.getClass();
        if (!this.isDone()) {
            afra next = this.listeners;
            if (next != afra.a) {
                final afra afra = new afra(runnable, executor);
                do {
                    afra.next = next;
                    if (afrl.h.e(this, next, afra)) {
                        return;
                    }
                } while ((next = this.listeners) != afra.a);
            }
        }
        m(runnable, executor);
    }
    
    protected void b() {
    }
    
    public boolean cancel(final boolean b) {
        final Object value = this.value;
        boolean b2 = false;
        if (value == null | value instanceof afrd) {
            afqx afqx;
            if (afrl.g) {
                afqx = new afqx(b, (Throwable)new CancellationException("Future.cancel() was called."));
            }
            else {
                afqx afqx2;
                if (b) {
                    afqx2 = afqx.a;
                }
                else {
                    afqx2 = afqx.b;
                }
                afqx2.getClass();
                afqx = afqx2;
            }
            b2 = false;
            afrl afrl = this;
            Object o = value;
            Label_0194: {
                ListenableFuture b3;
                while (true) {
                    if (afrl.h.f(afrl, o, (Object)afqx)) {
                        i(afrl, b);
                        if (!(o instanceof afrd)) {
                            break Label_0194;
                        }
                        b3 = ((afrd)o).b;
                        if (!(b3 instanceof afrf)) {
                            break;
                        }
                        afrl = (afrl)b3;
                        o = afrl.value;
                        if (!(o == null | o instanceof afrd)) {
                            break Label_0194;
                        }
                        b2 = true;
                    }
                    else {
                        if (!((o = afrl.value) instanceof afrd)) {
                            return b2;
                        }
                        continue;
                    }
                }
                b3.cancel(b);
            }
            b2 = true;
        }
        return b2;
    }
    
    public Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object value = this.value;
        if (value != null & (value instanceof afrd ^ true)) {
            return o(value);
        }
        afrk afrk = this.waiters;
        if (afrk != afrk.a) {
            final afrk afrk2 = new afrk();
            do {
                afrk2.a(afrk);
                if (afrl.h.g(this, afrk, afrk2)) {
                    Object value2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            this.n(afrk2);
                            throw new InterruptedException();
                        }
                        value2 = this.value;
                    } while (!(value2 != null & (value2 instanceof afrd ^ true)));
                    return o(value2);
                }
            } while ((afrk = this.waiters) != afrk.a);
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
        if (value != null & (value instanceof afrd ^ true)) {
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
                afrk afrk = this.waiters;
                if (afrk != afrk.a) {
                    final afrk afrk2 = new afrk();
                    do {
                        afrk2.a(afrk);
                        if (afrl.h.g(this, afrk, afrk2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    this.n(afrk2);
                                    throw new InterruptedException();
                                }
                                final Object value2 = this.value;
                                if (value2 != null & (value2 instanceof afrd ^ true)) {
                                    return o(value2);
                                }
                                n3 = (nanos = n2 - System.nanoTime());
                            } while (n3 >= 1000L);
                            this.n(afrk2);
                            break Label_0267;
                        }
                    } while ((afrk = this.waiters) != afrk.a);
                }
                final Object value3 = this.value;
                value3.getClass();
                return o(value3);
            }
        }
        while (n3 > 0L) {
            final Object value4 = this.value;
            if (value4 != null & (value4 instanceof afrd ^ true)) {
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
        if (this instanceof afrf) {
            final Object value = this.value;
            if (value instanceof afqz) {
                return ((afqz)value).b;
            }
        }
        return null;
    }
    
    public boolean isCancelled() {
        return this.value instanceof afqx;
    }
    
    public boolean isDone() {
        final Object value = this.value;
        return (value instanceof afrd ^ true) & value != null;
    }
    
    protected void j() {
    }
    
    public final void k(final Future future) {
        if (future != null & this.isCancelled()) {
            future.cancel(this.l());
        }
    }
    
    protected final boolean l() {
        final Object value = this.value;
        return value instanceof afqx && ((afqx)value).c;
    }
    
    protected String ns() {
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
            b = afrl.b;
        }
        if (afrl.h.f(this, (Object)null, b)) {
            i(this, false);
            return true;
        }
        return false;
    }
    
    protected boolean setException(final Throwable t) {
        t.getClass();
        if (afrl.h.f(this, (Object)null, (Object)new afqz(t))) {
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
                if (afrl.h.f(this, (Object)null, g((ListenableFuture)error))) {
                    i(this, false);
                    return true;
                }
                return false;
            }
            else {
                final afrd afrd = new afrd(this, (ListenableFuture)error);
                if (afrl.h.f(this, (Object)null, (Object)afrd)) {
                    try {
                        ((ListenableFuture)error).addListener((Runnable)afrd, (Executor)afsl.a);
                        return true;
                    }
                    catch (final Error error) {}
                    catch (final RuntimeException ex) {}
                    afqz a;
                    try {
                        a = new afqz((Throwable)error);
                    }
                    catch (final RuntimeException | Error runtimeException | Error) {
                        a = afqz.a;
                    }
                    afrl.h.f(this, (Object)afrd, (Object)a);
                    return true;
                }
                o = this.value;
            }
        }
        if (o instanceof afqx) {
            ((ListenableFuture)error).cancel(((afqx)o).c);
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
