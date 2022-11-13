import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afek extends afet
{
    private final transient EnumMap b;
    
    public afek(final EnumMap b) {
        this.b = b;
        adkp.H(b.isEmpty() ^ true);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }
    
    public final afke a() {
        return (afke)new afhc((Iterator)this.b.entrySet().iterator());
    }
    
    public final boolean containsKey(final Object o) {
        return this.b.containsKey(o);
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        Object b = o;
        if (o instanceof afek) {
            b = ((afek)o).b;
        }
        return this.b.equals(b);
    }
    
    public final Object get(final Object o) {
        return this.b.get(o);
    }
    
    public final int size() {
        return this.b.size();
    }
    
    public final afke tp() {
        final Iterator iterator = this.b.keySet().iterator();
        iterator.getClass();
        Object o;
        if (iterator instanceof afke) {
            o = iterator;
        }
        else {
            o = new afgh((Iterator)iterator);
        }
        return (afke)o;
    }
    
    public final void tq() {
    }
    
    Object writeReplace() {
        return new afej(this.b);
    }
}
