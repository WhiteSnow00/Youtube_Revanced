import java.util.Iterator;
import java.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class afex extends afft
{
    final afet a;
    
    public afex() {
    }
    
    public afex(final afet a) {
        this.a = a;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }
    
    public final boolean a() {
        return false;
    }
    
    public final boolean contains(final Object o) {
        if (o instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)o;
            final Object value = ((afev)this.a).get(entry.getKey());
            if (value != null && value.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return ((afev)this.a).hashCode();
    }
    
    public final /* bridge */ Iterator iterator() {
        return this.k();
    }
    
    public final afke k() {
        return this.a.a();
    }
    
    public final boolean l() {
        return false;
    }
    
    public final int size() {
        return ((Map)this.a).size();
    }
    
    Object writeReplace() {
        return new afew((afev)this.a);
    }
}
