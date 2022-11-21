import java.util.Collection;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class affh extends affd implements Queue
{
    protected affh() {
    }
    
    @Override
    protected /* bridge */ Collection c() {
        throw null;
    }
    
    protected abstract Queue d();
    
    @Override
    public final Object element() {
        return this.d().element();
    }
    
    @Override
    public boolean offer(final Object o) {
        return this.d().offer(o);
    }
    
    @Override
    public final Object peek() {
        return this.d().peek();
    }
    
    @Override
    public final Object poll() {
        return this.d().poll();
    }
    
    @Override
    public final Object remove() {
        return this.d().remove();
    }
}
