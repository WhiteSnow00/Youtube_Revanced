import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atan extends AtomicReference implements Iterator, asku, asln
{
    private static final long serialVersionUID = 6695226475494099826L;
    final atje a;
    final Lock b;
    final Condition c;
    volatile boolean d;
    volatile Throwable e;
    
    public atan(final int n) {
        this.a = new atje(n);
        final ReentrantLock b = new ReentrantLock();
        this.b = b;
        this.c = b.newCondition();
    }
    
    @Override
    public final void b(final Throwable e) {
        this.e = e;
        this.d = true;
        this.f();
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
        this.f();
    }
    
    final void f() {
        this.b.lock();
        try {
            this.c.signalAll();
        }
        finally {
            this.b.unlock();
        }
    }
    
    @Override
    public final boolean hasNext() {
        while (!this.tz()) {
            final boolean d = this.d;
            final boolean i = this.a.i();
            if (d) {
                final Throwable e = this.e;
                if (e != null) {
                    throw atle.b(e);
                }
                if (i) {
                    return false;
                }
            }
            else if (i) {
                try {
                    final boolean x = aqvq.x;
                    this.b.lock();
                    try {
                        while (!this.d && this.a.i() && !this.tz()) {
                            this.c.await();
                        }
                    }
                    finally {
                        this.b.unlock();
                    }
                }
                catch (final InterruptedException ex) {
                    asmr.b(this);
                    this.f();
                    throw atle.b(ex);
                }
            }
            return true;
        }
        final Throwable e2 = this.e;
        if (e2 == null) {
            return false;
        }
        throw atle.b(e2);
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            return this.a.tv();
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
    
    @Override
    public final void tt(final Object o) {
        this.a.j(o);
        this.f();
    }
    
    @Override
    public final void tw() {
        this.d = true;
        this.f();
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
