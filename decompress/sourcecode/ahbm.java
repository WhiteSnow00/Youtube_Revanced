import java.util.NoSuchElementException;
import java.util.ArrayDeque;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahbm implements Iterator
{
    private final ArrayDeque a;
    private agxz b;
    
    public ahbm(final agyc agyc) {
        if (agyc instanceof ahbo) {
            final ahbo ahbo = (ahbo)agyc;
            (this.a = new ArrayDeque(ahbo.g)).push(ahbo);
            this.b = this.b(ahbo.e);
            return;
        }
        this.a = null;
        this.b = (agxz)agyc;
    }
    
    private final agxz b(agyc e) {
        while (e instanceof ahbo) {
            final ahbo ahbo = (ahbo)e;
            this.a.push(ahbo);
            final int h = ahbo.h;
            e = ahbo.e;
        }
        return (agxz)e;
    }
    
    public final agxz a() {
        final agxz b = this.b;
        if (b != null) {
            agxz b2;
            do {
                final ArrayDeque a = this.a;
                final agxz agxz = b2 = null;
                if (a == null) {
                    break;
                }
                if (a.isEmpty()) {
                    b2 = agxz;
                    break;
                }
                final ahbo ahbo = this.a.pop();
                final int h = ahbo.h;
                b2 = this.b(ahbo.f);
            } while (((agyc)b2).H());
            this.b = b2;
            return b;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final boolean hasNext() {
        return this.b != null;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
