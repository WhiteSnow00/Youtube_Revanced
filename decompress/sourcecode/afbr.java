import java.util.Collection;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afbr extends afbn implements Queue
{
    protected afbr() {
    }
    
    protected abstract Queue d();
    
    public final Object element() {
        return this.d().element();
    }
    
    public boolean offer(final Object o) {
        return this.d().offer(o);
    }
    
    public final Object peek() {
        return this.d().peek();
    }
    
    public final Object poll() {
        return this.d().poll();
    }
    
    public final Object remove() {
        return this.d().remove();
    }
}
