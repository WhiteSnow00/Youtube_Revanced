import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class abge implements abfs
{
    private final int a;
    private final Set b;
    
    public abge(final int a) {
        this.a = a;
        this.b = new CopyOnWriteArraySet();
    }
    
    public final void a(final int n, final int n2, final int n3) {
        if (this.a != n) {
            return;
        }
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((tfw)iterator.next()).qO(n2, n3);
        }
    }
    
    public final void b(final int n, final int n2, int n3, final int n4) {
        final int a = this.a;
        boolean b = false;
        if (a == n3) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (a == n) {
            b = true;
        }
        if (!b && n3 == 0) {
            return;
        }
        if (b && n3 != 0) {
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((tfw)iterator.next()).e(n2, n4);
            }
        }
        else if (b) {
            final Iterator iterator2 = this.b.iterator();
            while (iterator2.hasNext()) {
                ((tfw)iterator2.next()).tg(n2, 1);
            }
        }
        else {
            final Iterator iterator3 = this.b.iterator();
            while (iterator3.hasNext()) {
                ((tfw)iterator3.next()).qO(n4, 1);
            }
        }
    }
    
    public final void c(final int n, final int n2, final int n3) {
        if (this.a != n) {
            return;
        }
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((tfw)iterator.next()).tg(n2, n3);
        }
    }
}
