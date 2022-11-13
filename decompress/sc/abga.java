import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class abga implements abfs
{
    final abgb a;
    private final Set b;
    
    public abga(final abgb a) {
        this.a = a;
        this.b = new CopyOnWriteArraySet();
    }
    
    public final void a(int a, final int n, final int n2) {
        synchronized (this.a) {
            a = this.a.a(0, n);
            this.a.c();
            this.d(a, n2);
        }
    }
    
    public final void b(int a, int a2, final int n, final int n2) {
        final abgb a3 = this.a;
        monitorenter(a3);
        try {
            a = this.a.a(a, a2);
            a2 = this.a.a(n, n2);
            this.a.c();
            if (a != a2) {
                final Iterator iterator = this.b.iterator();
                while (iterator.hasNext()) {
                    ((tfw)iterator.next()).e(a, a2);
                }
            }
            monitorexit(a3);
        }
        finally {
            monitorexit(a3);
            while (true) {}
        }
    }
    
    public final void c(int a, final int n, final int n2) {
        synchronized (this.a) {
            a = this.a.a(a, n);
            this.a.c();
            this.e(a, n2);
        }
    }
    
    final void d(final int n, final int n2) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((tfw)iterator.next()).qO(n, n2);
        }
    }
    
    final void e(final int n, final int n2) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((tfw)iterator.next()).tg(n, n2);
        }
    }
}
