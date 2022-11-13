import java.util.concurrent.TimeUnit;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aal implements ListenableFuture
{
    public List a;
    public List b;
    acc c;
    private final AtomicInteger d;
    private final ListenableFuture e;
    
    public aal(final List a, final Executor executor) {
        this.a = a;
        this.b = new ArrayList(a.size());
        this.d = new AtomicInteger(a.size());
        final int n = 0;
        this.e = sl.c((ace)new aak(this, 0));
        this.addListener((Runnable)new uy(this, 8), zu.a());
        if (!this.a.isEmpty()) {
            for (int i = 0; i < this.a.size(); ++i) {
                this.b.add(null);
            }
            final List a2 = this.a;
            for (int j = n; j < a2.size(); ++j) {
                final ListenableFuture listenableFuture = a2.get(j);
                listenableFuture.addListener((Runnable)new qo(this, j, listenableFuture, 6), executor);
            }
            return;
        }
        this.c.c((Object)new ArrayList(this.b));
    }
    
    private final void b() {
        final List a = this.a;
        Label_0071: {
            if (a != null && !this.isDone()) {
                final Iterator iterator = a.iterator();
                while (iterator.hasNext()) {
                    final ListenableFuture listenableFuture = (ListenableFuture)iterator.next();
                    while (!listenableFuture.isDone()) {
                        try {
                            listenableFuture.get();
                        }
                        catch (final InterruptedException iterator) {
                            throw iterator;
                        }
                        catch (final Error iterator) {
                            throw iterator;
                        }
                        finally {
                            continue;
                        }
                        break Label_0071;
                    }
                }
            }
        }
    }
    
    public final void a(int n, final Future future) {
        final List b = this.b;
        final boolean done = this.isDone();
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        final boolean b5 = false;
        boolean b6 = false;
        if (!done && b != null) {
            try {
                try {
                    afg.g(future.isDone(), "Tried to set value from future which is not done");
                    b.set(n, sg.h(future));
                    n = this.d.decrementAndGet();
                    if (n >= 0) {
                        b6 = true;
                    }
                    afg.g(b6, "Less than 0 remaining futures");
                    if (n != 0) {
                        return;
                    }
                    final List b7 = this.b;
                    if (b7 != null) {
                        this.c.c((Object)new ArrayList(b7));
                        return;
                    }
                    afg.f(this.isDone());
                    return;
                }
                finally {
                    n = this.d.decrementAndGet();
                    boolean b8 = b2;
                    if (n >= 0) {
                        b8 = true;
                    }
                    afg.g(b8, "Less than 0 remaining futures");
                    if (n == 0) {
                        final List b9 = this.b;
                        if (b9 != null) {
                            this.c.c((Object)new ArrayList(b9));
                        }
                        else {
                            afg.f(this.isDone());
                        }
                    }
                    final List b10;
                    this.c.c((Object)new ArrayList(b10));
                    return;
                    afg.g(true, "Less than 0 remaining futures");
                    iftrue(Label_0443:)(n != 0);
                    Block_11: {
                        break Block_11;
                        Label_0189: {
                            afg.f(this.isDone());
                        }
                        return;
                    }
                    b10 = this.b;
                    iftrue(Label_0189:)(b10 == null);
                }
            }
            catch (final Error error) {}
            catch (final RuntimeException ex) {
                n = this.d.decrementAndGet();
                boolean b11 = b3;
                if (n >= 0) {
                    b11 = true;
                }
                afg.g(b11, "Less than 0 remaining futures");
                if (n == 0) {
                    final List b12 = this.b;
                    if (b12 != null) {
                        this.c.c((Object)new ArrayList(b12));
                        return;
                    }
                    afg.f(this.isDone());
                    return;
                }
            }
            catch (final ExecutionException ex2) {
                n = this.d.decrementAndGet();
                boolean b13 = b4;
                if (n >= 0) {
                    b13 = true;
                }
                afg.g(b13, "Less than 0 remaining futures");
                if (n == 0) {
                    final List b14 = this.b;
                    if (b14 != null) {
                        this.c.c((Object)new ArrayList(b14));
                        return;
                    }
                    afg.f(this.isDone());
                    return;
                }
            }
            catch (final CancellationException ex3) {
                n = this.d.decrementAndGet();
                boolean b15 = b5;
                if (n >= 0) {
                    b15 = true;
                }
                afg.g(b15, "Less than 0 remaining futures");
                if (n == 0) {
                    final List b16 = this.b;
                    if (b16 != null) {
                        this.c.c((Object)new ArrayList(b16));
                        return;
                    }
                    afg.f(this.isDone());
                }
            }
            Label_0443: {
                return;
            }
        }
        afg.g(false, "Future was done before all dependencies completed");
    }
    
    public final void addListener(final Runnable runnable, final Executor executor) {
        this.e.addListener(runnable, executor);
    }
    
    public final boolean cancel(final boolean b) {
        final List a = this.a;
        if (a != null) {
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                ((ListenableFuture)iterator.next()).cancel(b);
            }
        }
        return this.e.cancel(b);
    }
    
    public final /* bridge */ Object get() {
        this.b();
        return this.e.get();
    }
    
    public final /* bridge */ Object get(final long n, final TimeUnit timeUnit) {
        return this.e.get(n, timeUnit);
    }
    
    public final boolean isCancelled() {
        return this.e.isCancelled();
    }
    
    public final boolean isDone() {
        return this.e.isDone();
    }
}
