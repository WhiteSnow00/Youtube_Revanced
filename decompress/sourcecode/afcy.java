import java.util.Iterator;
import java.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class afcy extends afdu
{
    final /* synthetic */ afcu a;
    
    public afcy() {
    }
    
    public afcy(final afcu a) {
        this.a = a;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }
    
    public final boolean a() {
        return false;
    }
    
    public final boolean contains(Object value) {
        if (value instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)value;
            value = ((afcw)this.a).get(entry.getKey());
            if (value != null && value.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return ((afcw)this.a).hashCode();
    }
    
    public final afie k() {
        return this.a.a();
    }
    
    public final boolean l() {
        return false;
    }
    
    public final int size() {
        return ((afcw)this.a).size();
    }
    
    Object writeReplace() {
        return new afcx((afcw)this.a);
    }
}
