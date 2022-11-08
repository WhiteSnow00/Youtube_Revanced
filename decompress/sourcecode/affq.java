import java.util.Set;
import java.util.SortedMap;
import java.util.NavigableMap;
import java.util.List;
import java.util.Collection;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class affq extends aezb
{
    private static final long serialVersionUID = 0L;
    transient aeyr c;
    
    public affq(final Map map, final aeyr c) {
        super(map);
        this.c = c;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (aeyr)objectInputStream.readObject();
        ((aezr)this).n((Map)objectInputStream.readObject());
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(((aezr)this).a);
    }
    
    public final Map k() {
        final Map a = ((aezr)this).a;
        Object o;
        if (a instanceof NavigableMap) {
            o = new aezi((aezr)this, (NavigableMap)a);
        }
        else if (a instanceof SortedMap) {
            o = new aezl((aezr)this, (SortedMap)a);
        }
        else {
            o = new aeze((aezr)this, a);
        }
        return (Map)o;
    }
    
    public final Set l() {
        final Map a = ((aezr)this).a;
        Object o;
        if (a instanceof NavigableMap) {
            o = new aezj((aezr)this, (NavigableMap)a);
        }
        else if (a instanceof SortedMap) {
            o = new aezm((aezr)this, (SortedMap)a);
        }
        else {
            o = new aezh((aezr)this, a);
        }
        return (Set)o;
    }
}
