import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adf extends ade
{
    public int m;
    
    public adf(final adn adn) {
        super(adn);
        int l;
        if (adn instanceof adj) {
            l = 2;
        }
        else {
            l = 3;
        }
        this.l = l;
    }
    
    public final void c(final int f) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = f;
        final Iterator iterator = this.j.iterator();
        while (iterator.hasNext()) {
            ((adc)iterator.next()).f();
        }
    }
}
