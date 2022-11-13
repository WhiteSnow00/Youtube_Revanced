import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class afjn extends afjo
{
    private static final long serialVersionUID = 0L;
    
    public afjn(final Collection collection, final Object o) {
        super(collection, o);
    }
    
    public final Iterator iterator() {
        return (Iterator)new afjm(this, super.iterator());
    }
}
