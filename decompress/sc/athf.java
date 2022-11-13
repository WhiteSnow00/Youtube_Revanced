import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReferenceArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class athf extends AtomicReferenceArray implements Runnable, Callable, asir
{
    static final Object a;
    static final Object b;
    static final Object c;
    static final Object d;
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable e;
    
    static {
        a = new Object();
        b = new Object();
        c = new Object();
        d = new Object();
    }
    
    public athf(final Runnable e, final asju asju) {
        super(3);
        this.e = e;
        this.lazySet(0, asju);
    }
    
    public final void a(final Future future) {
        Object value;
        do {
            value = this.get(1);
            if (value == athf.d) {
                return;
            }
            if (value == athf.b) {
                future.cancel(false);
                return;
            }
            if (value == athf.c) {
                future.cancel(true);
            }
        } while (!this.compareAndSet(1, value, future));
    }
    
    @Override
    public final Object call() {
        this.run();
        return null;
    }
    
    @Override
    public final void dispose() {
        while (true) {
            Future value;
            Object b;
            boolean b2;
            do {
                value = this.get(1);
                if (value != athf.d) {
                    b = athf.b;
                    if (value != b) {
                        final Object c = athf.c;
                        if (value != c) {
                            b2 = (this.get(2) != Thread.currentThread());
                            if (b2) {
                                b = c;
                                continue;
                            }
                            continue;
                        }
                    }
                }
                asju value2;
                Object a;
                do {
                    value2 = this.get(0);
                    if (value2 != athf.d) {
                        a = athf.a;
                        if (value2 != a) {
                            if (value2 != null) {
                                continue;
                            }
                        }
                    }
                    return;
                } while (!this.compareAndSet(0, value2, (asju)a));
                value2.d((asir)this);
                return;
            } while (!this.compareAndSet(1, value, (Future)b));
            if (value != null) {
                value.cancel(b2);
            }
            continue;
        }
    }
    
    @Override
    public final void run() {
        this.lazySet(2, Thread.currentThread());
        Label_0025: {
            try {
                this.e.run();
                break Label_0025;
            }
            finally {
                try {
                    final Throwable t;
                    atqx.j(t);
                    this.lazySet(2, null);
                    final asju value = this.get(0);
                    if (value != athf.a) {
                        if (this.compareAndSet(0, value, athf.d) && value != null) {
                            value.d((asir)this);
                        }
                    }
                    Object value2;
                    do {
                        value2 = this.get(1);
                    } while (value2 != athf.b && value2 != athf.c && !this.compareAndSet(1, value2, athf.d));
                }
                finally {
                    this.lazySet(2, null);
                    final asju value3 = this.get(0);
                    if (value3 != athf.a) {
                        if (this.compareAndSet(0, value3, athf.d) && value3 != null) {
                            value3.d((asir)this);
                        }
                    }
                Label_0192:
                    while (true) {
                        final Object value4 = this.get(1);
                        if (value4 != athf.b && value4 != athf.c && !this.compareAndSet(1, value4, athf.d)) {
                            continue;
                        }
                        break Label_0192;
                    }
                    while (true) {}
                }
            }
        }
    }
    
    @Override
    public final boolean tA() {
        final Object value = this.get(0);
        return value == athf.a || value == athf.d;
    }
}
