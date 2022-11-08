import java.util.Observer;
import java.util.Observable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abhn extends Observable implements Observer
{
    public final zbr a;
    public final zbr b;
    public final zbr c;
    public final zbr d;
    
    @Deprecated
    public abhn() {
        final abho a = abho.a;
        throw null;
    }
    
    public abhn(final zbr zbr, final zbr zbr2, final zbr zbr3, final zbr zbr4) {
        this(zbr, zbr2, zbr3, zbr4, null);
    }
    
    public abhn(final zbr a, final zbr b, final zbr c, final zbr d, final byte[] array) {
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
