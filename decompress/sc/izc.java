import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class izc implements fpl
{
    final izd a;
    
    public izc(final izd a) {
        this.a = a;
    }
    
    public final void a(final long n) {
        final Iterator iterator = this.a.c.iterator();
        while (iterator.hasNext()) {
            ((fpl)iterator.next()).a(n);
        }
    }
    
    public final void b(final long n, final boolean b) {
        final Iterator iterator = this.a.c.iterator();
        while (iterator.hasNext()) {
            ((fpl)iterator.next()).b(n, b);
        }
    }
}
