import java.util.Set;
import java.util.Iterator;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afhg extends AbstractMap
{
    public afhg() {
    }
    
    public abstract Iterator a();
    
    @Override
    public void clear() {
        agpc.L(this.a());
    }
    
    @Override
    public final Set entrySet() {
        return (Set)new afhf(this);
    }
}
