import java.util.Iterator;
import java.util.Map;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahbw extends AbstractSet
{
    final /* synthetic */ ahbx a;
    
    public ahbw(final ahbx a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final boolean contains(Object value) {
        final Map.Entry entry = (Map.Entry)value;
        value = this.a.get(entry.getKey());
        final Object value2 = entry.getValue();
        boolean b = true;
        if (value != value2) {
            if (value != null) {
                if (!value.equals(value2)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    @Override
    public final Iterator iterator() {
        return new ahbv(this.a);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final Map.Entry entry = (Map.Entry)o;
        if (this.contains(entry)) {
            this.a.remove(entry.getKey());
            return true;
        }
        return false;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
