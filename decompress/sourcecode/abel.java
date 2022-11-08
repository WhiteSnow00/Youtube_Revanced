import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class abel implements abdz
{
    private final int a;
    private final Set b;
    
    public abel(final int a) {
        this.a = a;
        this.b = new CopyOnWriteArraySet();
    }
    
    public final void a(final int n, final int n2, final int n3) {
        if (this.a != n) {
            return;
        }
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((tds)iterator.next()).qJ(n2, n3);
        }
    }
    
    public final void b(int n, final int n2, final int n3, final int n4) {
        final int a = this.a;
        boolean b = false;
        if (a == n) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (a == n3) {
            b = true;
        }
        if (n == 0 && !b) {
            return;
        }
        if (n != 0 && b) {
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((tds)iterator.next()).e(n2, n4);
            }
        }
        else if (n != 0) {
            final Iterator iterator2 = this.b.iterator();
            while (iterator2.hasNext()) {
                ((tds)iterator2.next()).ta(n2, 1);
            }
        }
        else {
            final Iterator iterator3 = this.b.iterator();
            while (iterator3.hasNext()) {
                ((tds)iterator3.next()).qJ(n4, 1);
            }
        }
    }
    
    public final void c(final int n, final int n2, final int n3) {
        if (this.a != n) {
            return;
        }
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((tds)iterator.next()).ta(n2, n3);
        }
    }
}
