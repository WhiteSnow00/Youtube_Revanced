import java.util.Observer;
import java.util.Observable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkn extends Observable implements Observer
{
    public final zff a;
    public final zff b;
    public final zff c;
    public final zff d;
    
    @Deprecated
    public abkn() {
        final abko a = abko.a;
        throw null;
    }
    
    public abkn(final zff zff, final zff zff2, final zff zff3, final zff zff4) {
        this(zff, zff2, zff3, zff4, null);
    }
    
    public abkn(final zff a, final zff b, final zff c, final zff d, final byte[] array) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        a.addObserver((Observer)this);
        b.addObserver((Observer)this);
        c.addObserver((Observer)this);
        d.addObserver((Observer)this);
    }
    
    @Override
    public final void update(final Observable observable, final Object o) {
        this.setChanged();
        if (observable == this.a) {
            this.notifyObservers(0);
            return;
        }
        if (observable == this.b) {
            this.notifyObservers(1);
            return;
        }
        if (observable == this.c) {
            this.notifyObservers(2);
            return;
        }
        if (observable == this.d) {
            this.notifyObservers(3);
        }
    }
}
