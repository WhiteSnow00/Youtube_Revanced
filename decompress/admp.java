import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admp implements Runnable
{
    public final long a;
    public final long b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public admp(final adms c, final String d, final long a, final long b, final int e) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public admp(final tgk c, final long a, final xbt d, final long b, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (this.e == 0) {
            final Object c = this.c;
            final Object d = this.d;
            final long a = this.a;
            final long b = this.b;
            final Iterator iterator = ((adms)c).a.iterator();
            while (iterator.hasNext()) {
                ((admt)iterator.next()).b((String)d, a, b);
            }
            return;
        }
        final Object c2 = this.c;
        final long a2 = this.a;
        final Object d2 = this.d;
        final long b2 = this.b;
        final thp thp = (thp)c2;
        if (thp.j()) {
            ((xbt)d2).d(((tgk)c2).f(), b2 - (a2 - thp.h()));
            return;
        }
        ((xbt)d2).d(((tgk)c2).f(), b2);
    }
}
