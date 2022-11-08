import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReferenceArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgn extends AtomicReferenceArray implements Runnable, Callable, asic
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
    
    public atgn(final Runnable e, final asjf asjf) {
        super(3);
        this.e = e;
        this.lazySet(0, asjf);
    }
    
    public final void a(final Future future) {
        Object value;
        do {
            value = this.get(1);
            if (value == atgn.d) {
                return;
            }
            if (value == atgn.b) {
                future.cancel(false);
                return;
            }
            if (value == atgn.c) {
                future.cancel(true);
            }
        } while (!this.compareAndSet(1, value, future));
    }
    
    @Override
    public final Object call() {
        this.run();
        return null;
    }
    
    public final void dispose() {
        while (true) {
            Future value;
            Object b;
            boolean b2;
            do {
                value = this.get(1);
                if (value != atgn.d) {
                    b = atgn.b;
                    if (value != b) {
                        final Object c = atgn.c;
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
                asjf value2;
                Object a;
                do {
                    value2 = this.get(0);
                    if (value2 != atgn.d) {
                        a = atgn.a;
                        if (value2 != a) {
                            if (value2 != null) {
                                continue;
                            }
                        }
                    }
                    return;
                } while (!this.compareAndSet(0, value2, (asjf)a));
                value2.d((asic)this);
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
                    aulo.r(t);
                    this.lazySet(2, null);
                    final asjf value = this.get(0);
                    if (value != atgn.a) {
                        if (this.compareAndSet(0, value, atgn.d) && value != null) {
                            value.d((asic)this);
                        }
                    }
                    Object value2;
                    do {
                        value2 = this.get(1);
                    } while (value2 != atgn.b && value2 != atgn.c && !this.compareAndSet(1, value2, atgn.d));
                }
                finally {
                    this.lazySet(2, null);
                    final asjf value3 = this.get(0);
                    if (value3 != atgn.a) {
                        if (this.compareAndSet(0, value3, atgn.d) && value3 != null) {
                            value3.d((asic)this);
                        }
                    }
                Label_0192:
                    while (true) {
                        final Object value4 = this.get(1);
                        if (value4 != atgn.b && value4 != atgn.c && !this.compareAndSet(1, value4, atgn.d)) {
                            continue;
                        }
                        break Label_0192;
                    }
                    while (true) {}
                }
            }
        }
    }
    
    public final boolean tx() {
        final Object value = this.get(0);
        return value == atgn.a || value == atgn.d;
    }
}
