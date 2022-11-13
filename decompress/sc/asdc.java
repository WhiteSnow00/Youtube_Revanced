import java.util.Iterator;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asdc extends arty
{
    public final AtomicReference a;
    public final String b;
    public final asdf c;
    private final arty d;
    
    public asdc(final asdf c, final String b) {
        this.c = c;
        this.a = new AtomicReference((V)asdf.g);
        this.d = new ascz(this);
        b.getClass();
        this.b = b;
    }
    
    public final arua a(final arwo arwo, final artx artx) {
        if (this.a.get() != asdf.g) {
            return this.c(arwo, artx);
        }
        this.c.n.execute((Runnable)new asba(this, 19));
        if (this.a.get() != asdf.g) {
            return this.c(arwo, artx);
        }
        if (this.c.A.get()) {
            return new asda();
        }
        final asdb asdb = new asdb(this, aruo.b(), arwo, artx);
        this.c.n.execute((Runnable)new asat(this, asdb, 17));
        return asdb;
    }
    
    public final String b() {
        return this.b;
    }
    
    public final arua c(final arwo arwo, final artx artx) {
        final arvd arvd = this.a.get();
        if (arvd == null) {
            return this.d.a(arwo, artx);
        }
        if (arvd instanceof asdn) {
            final asdm b = ((asdn)arvd).b.b(arwo);
            artx d = artx;
            if (b != null) {
                d = artx.d(asdm.a, (Object)b);
            }
            return this.d.a(arwo, d);
        }
        return (arua)new asct(arvd, this.d, this.c.l, arwo, artx);
    }
    
    public final void d(final arvd arvd) {
        final arvd arvd2 = this.a.get();
        this.a.set(arvd);
        if (arvd2 == asdf.g) {
            final Collection w = this.c.w;
            if (w != null) {
                final Iterator iterator = w.iterator();
                while (iterator.hasNext()) {
                    ((asdb)iterator.next()).j();
                }
            }
        }
    }
}
