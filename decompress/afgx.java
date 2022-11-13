import java.util.ListIterator;
import java.util.List;
import java.io.Serializable;
import java.util.AbstractSequentialList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afgx extends AbstractSequentialList implements Serializable
{
    private static final long serialVersionUID = 0L;
    final List a;
    final aezf b;
    
    public afgx(final List a, final aezf b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        return (ListIterator)new afgw(this, (ListIterator)this.a.listIterator(n));
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
