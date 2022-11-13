import java.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afhk extends AbstractMap
{
    private transient Set a;
    private transient Set b;
    private transient Collection c;
    
    public afhk() {
    }
    
    public abstract Set b();
    
    @Override
    public final Set entrySet() {
        Set a;
        if ((a = this.a) == null) {
            a = this.b();
            this.a = a;
        }
        return a;
    }
    
    public Set g() {
        return (Set)new afhh((Map)this);
    }
    
    @Override
    public Set keySet() {
        Set b;
        if ((b = this.b) == null) {
            b = this.g();
            this.b = b;
        }
        return b;
    }
    
    @Override
    public final Collection values() {
        Collection c;
        if ((c = this.c) == null) {
            c = new afhj(this);
            this.c = c;
        }
        return c;
    }
}
