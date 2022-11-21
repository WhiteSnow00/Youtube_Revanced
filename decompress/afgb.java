import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afgb extends afgk
{
    private final transient EnumMap b;
    
    public afgb(final EnumMap b) {
        this.b = b;
        adme.K(b.isEmpty() ^ true);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }
    
    @Override
    public final aflu a() {
        return (aflu)new afit((Iterator)this.b.entrySet().iterator());
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.b.containsKey(o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        Object b = o;
        if (o instanceof afgb) {
            b = ((afgb)o).b;
        }
        return this.b.equals(b);
    }
    
    @Override
    public final Object get(final Object o) {
        return this.b.get(o);
    }
    
    @Override
    public final int size() {
        return this.b.size();
    }
    
    @Override
    public final aflu to() {
        final Iterator iterator = this.b.keySet().iterator();
        iterator.getClass();
        Object o;
        if (iterator instanceof aflu) {
            o = iterator;
        }
        else {
            o = new afhy((Iterator)iterator);
        }
        return (aflu)o;
    }
    
    @Override
    public final void tp() {
    }
    
    @Override
    Object writeReplace() {
        return new afga(this.b);
    }
}
