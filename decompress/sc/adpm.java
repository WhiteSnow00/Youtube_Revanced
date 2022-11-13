import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

final class adpm implements afva
{
    final String a;
    final Object b;
    final Object c;
    private final int d;
    
    public adpm(final adoy c, final aqxa b, final String a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adpm(final adpp c, final String b, final String a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void b(final Object o) {
        if (this.d != 0) {
            final adkx adkx = (adkx)o;
            return;
        }
        ((adpp)this.c).c((String)this.b, (adpy)o, this.a);
    }
    
    public final void rF(final Throwable t) {
        if (this.d != 0) {
            ((aqxa)this.b).e();
            ((adoy)this.c).s(this.a, (aqxa)this.b, Double.POSITIVE_INFINITY);
            return;
        }
        if (((adpp)this.c).g((String)this.b, this.a) == 3 && !(t instanceof CancellationException)) {
            final Iterator iterator = ((CopyOnWriteArrayList)((adpp)this.c).i).iterator();
            while (iterator.hasNext()) {
                ((adpo)iterator.next()).p((String)this.b);
            }
        }
    }
}
