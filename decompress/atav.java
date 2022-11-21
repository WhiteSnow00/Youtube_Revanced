import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class atav extends AtomicBoolean implements asku, asln
{
    private static final long serialVersionUID = -8223395059921494546L;
    final asku a;
    final int b;
    final int c;
    final Callable d;
    asln e;
    final ArrayDeque f;
    long g;
    
    public atav(final asku a, final Callable d) {
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
    public final void d(final asln e) {
        if (asmr.g(this.e, e)) {
            this.e = e;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.e.dispose();
    }
    
    @Override
    public final void tt(final Object o) {
        ++this.g;
        final long n = this.c;
        try {
            this.f.offer(((atkz)this.d).b());
            final Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                final Collection collection = (Collection)iterator.next();
                collection.add(o);
                if (this.b <= collection.size()) {
                    iterator.remove();
                    this.a.tt(collection);
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
    public final void tw() {
        while (!this.f.isEmpty()) {
            this.a.tt(this.f.poll());
        }
        this.a.tw();
    }
    
    @Override
    public final boolean tz() {
        return this.e.tz();
    }
}
