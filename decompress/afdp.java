import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afdp implements afjb
{
    private transient Set a;
    private transient Collection b;
    private transient Map c;
    
    @Override
    public final boolean equals(final Object o) {
        boolean b;
        if (o == this) {
            b = true;
        }
        else {
            if (o instanceof afjb) {
                return this.v().equals(((afjb)o).v());
            }
            b = false;
        }
        return b;
    }
    
    public abstract Collection h();
    
    @Override
    public final int hashCode() {
        return this.v().hashCode();
    }
    
    public Iterator i() {
        throw null;
    }
    
    public abstract Map k();
    
    public abstract Set l();
    
    @Override
    public boolean p(final Object o, final Object o2) {
        throw null;
    }
    
    @Override
    public final String toString() {
        return this.v().toString();
    }
    
    @Override
    public Collection u() {
        Collection b;
        if ((b = this.b) == null) {
            b = this.h();
            this.b = b;
        }
        return b;
    }
    
    @Override
    public Map v() {
        Map c;
        if ((c = this.c) == null) {
            c = this.k();
            this.c = c;
        }
        return c;
    }
    
    @Override
    public Set w() {
        Set a;
        if ((a = this.a) == null) {
            a = this.l();
            this.a = a;
        }
        return a;
    }
    
    public boolean x(final Object o) {
        final Iterator iterator = this.v().values().iterator();
        while (iterator.hasNext()) {
            if (((Collection)iterator.next()).contains(o)) {
                return true;
            }
        }
        return false;
    }
}
