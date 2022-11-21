import java.util.Iterator;
import java.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgo extends afhk
{
    final afgk a;
    
    public afgo() {
    }
    
    public afgo(final afgk a) {
        this.a = a;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }
    
    @Override
    public final boolean a() {
        return false;
    }
    
    @Override
    public final boolean contains(final Object o) {
        if (o instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)o;
            final Object value = this.a.get(entry.getKey());
            if (value != null && value.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final /* bridge */ Iterator iterator() {
        return (Iterator)this.k();
    }
    
    @Override
    public final aflu k() {
        return this.a.a();
    }
    
    @Override
    public final boolean l() {
        return false;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    Object writeReplace() {
        return new afgn(this.a);
    }
}
