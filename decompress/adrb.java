import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

final class adrb implements afwr
{
    final String a;
    final Object b;
    final Object c;
    private final int d;
    
    public adrb(final adqn c, final aqzv b, final String a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adrb(final adre c, final String b, final String a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final Object o) {
        if (this.d != 0) {
            final admm admm = (admm)o;
            return;
        }
        ((adre)this.c).c((String)this.b, (adro)o, this.a);
    }
    
    @Override
    public final void rF(final Throwable t) {
        if (this.d != 0) {
            ((aqzv)this.b).e();
            ((adqn)this.c).s(this.a, (aqzv)this.b, Double.POSITIVE_INFINITY);
            return;
        }
        if (((adre)this.c).g((String)this.b, this.a) == 3 && !(t instanceof CancellationException)) {
            final Iterator iterator = ((CopyOnWriteArrayList)((adre)this.c).i).iterator();
            while (iterator.hasNext()) {
                ((adrd)iterator.next()).p((String)this.b);
            }
        }
    }
}
