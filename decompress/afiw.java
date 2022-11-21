import java.util.Set;
import java.util.Iterator;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afiw extends AbstractMap
{
    public afiw() {
    }
    
    public abstract Iterator a();
    
    @Override
    public void clear() {
        agpx.ac(this.a());
    }
    
    @Override
    public final Set entrySet() {
        return (Set)new afiv(this);
    }
}
