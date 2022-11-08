import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class afhn extends afho
{
    private static final long serialVersionUID = 0L;
    
    public afhn(final Collection collection, final Object o) {
        super(collection, o);
    }
    
    public final Iterator iterator() {
        return (Iterator)new afhm(this, super.iterator());
    }
}
