import java.util.Collection;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afdq extends afdm implements Queue
{
    protected afdq() {
    }
    
    protected /* bridge */ Collection c() {
        throw null;
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
