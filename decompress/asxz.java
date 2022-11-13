import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxz extends AtomicBoolean implements ashy, asir
{
    private static final long serialVersionUID = -8223395059921494546L;
    final ashy a;
    final int b;
    final int c;
    final Callable d;
    asir e;
    final ArrayDeque f;
    long g;
    
    public asxz(final ashy a, final Callable d) {
        this.a = a;
        this.b = 2;
        this.c = 1;
        this.d = d;
        this.f = new ArrayDeque();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.f.clear();
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir e) {
        if (asjv.g(this.e, e)) {
            this.e = e;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.e.dispose();
    }
    
    @Override
    public final boolean tA() {
        return this.e.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        ++this.g;
        final long n = this.c;
        try {
            this.f.offer(((atic)this.d).b());
            final Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                final Collection collection = (Collection)iterator.next();
                collection.add(o);
                if (this.b <= collection.size()) {
                    iterator.remove();
                    this.a.tu(collection);
                }
            }
        }
        finally {
            this.f.clear();
            this.e.dispose();
            final Throwable t;
            this.a.b(t);
        }
    }
    
    @Override
    public final void tx() {
        while (!this.f.isEmpty()) {
            this.a.tu(this.f.poll());
        }
        this.a.tx();
    }
}
