import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class abeh implements abdz
{
    final /* synthetic */ abei a;
    private final Set b;
    
    public abeh(final abei a) {
        this.a = a;
        this.b = new CopyOnWriteArraySet();
    }
    
    public final void a(int b, final int n, final int n2) {
        synchronized (this.a) {
            b = this.a.b(0, n);
            this.a.d();
            this.d(b, n2);
        }
    }
    
    public final void b(int b, int b2, final int n, final int n2) {
        final abei a = this.a;
        monitorenter(a);
        try {
            b = this.a.b(b, b2);
            b2 = this.a.b(n, n2);
            this.a.d();
            if (b != b2) {
                final Iterator iterator = this.b.iterator();
                while (iterator.hasNext()) {
                    ((tds)iterator.next()).e(b, b2);
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void c(int b, final int n, final int n2) {
        synchronized (this.a) {
            b = this.a.b(b, n);
            this.a.d();
            this.e(b, n2);
        }
    }
    
    final void d(final int n, final int n2) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((tds)iterator.next()).qJ(n, n2);
        }
    }
    
    final void e(final int n, final int n2) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((tds)iterator.next()).ta(n, n2);
        }
    }
}
