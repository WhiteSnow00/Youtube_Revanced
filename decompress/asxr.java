import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxr extends AtomicReference implements Iterator, ashy, asir
{
    private static final long serialVersionUID = 6695226475494099826L;
    final atgh a;
    final Lock b;
    final Condition c;
    volatile boolean d;
    volatile Throwable e;
    
    public asxr(final int n) {
        this.a = new atgh(n);
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
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
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
        while (!this.tA()) {
            final boolean d = this.d;
            final boolean i = this.a.i();
            if (d) {
                final Throwable e = this.e;
                if (e != null) {
                    throw atih.b(e);
                }
                if (i) {
                    return false;
                }
            }
            else if (i) {
                try {
                    final boolean x = atqx.x;
                    this.b.lock();
                    try {
                        while (!this.d && this.a.i() && !this.tA()) {
                            this.c.await();
                        }
                    }
                    finally {
                        this.b.unlock();
                    }
                }
                catch (final InterruptedException ex) {
                    asjv.b((AtomicReference)this);
                    this.f();
                    throw atih.b((Throwable)ex);
                }
            }
            return true;
        }
        final Throwable e2 = this.e;
        if (e2 == null) {
            return false;
        }
        throw atih.b(e2);
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            return this.a.tw();
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void tu(final Object o) {
        this.a.j(o);
        this.f();
    }
    
    @Override
    public final void tx() {
        this.d = true;
        this.f();
    }
}
