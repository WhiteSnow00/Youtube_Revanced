import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afcl extends afcu
{
    private final transient EnumMap b;
    
    public afcl(final EnumMap b) {
        this.b = b;
        agot.u(b.isEmpty() ^ true);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }
    
    public final afie a() {
        return (afie)new affd((Iterator)this.b.entrySet().iterator());
    }
    
    public final boolean containsKey(final Object o) {
        return this.b.containsKey(o);
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        Object b = o;
        if (o instanceof afcl) {
            b = ((afcl)o).b;
        }
        return this.b.equals(b);
    }
    
    public final Object get(final Object o) {
        return this.b.get(o);
    }
    
    public final int size() {
        return this.b.size();
    }
    
    public final afie tk() {
        final Iterator iterator = this.b.keySet().iterator();
        iterator.getClass();
        Object o;
        if (iterator instanceof afie) {
            o = iterator;
        }
        else {
            o = new afei((Iterator)iterator);
        }
        return (afie)o;
    }
    
    public final void tl() {
    }
    
    Object writeReplace() {
        return new afck(this.b);
    }
}
