import java.util.List;
import java.io.ObjectOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public class afcs extends afdj implements afer
{
    private static final long serialVersionUID = 0L;
    
    public afcs(final afcw afcw, final int n) {
        super(afcw, n);
    }
    
    public static afcs b(final affl affl) {
        if (((aezr)affl).b == 0) {
            return (afcs)afbg.a;
        }
        return c(affl.v().entrySet());
    }
    
    public static afcs c(final Collection collection) {
        if (collection.isEmpty()) {
            return (afcs)afbg.a;
        }
        final afct afct = new afct(collection.size());
        final Iterator iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator.next();
            final Object key = entry.getKey();
            final afcr o = afcr.o((Collection)entry.getValue());
            if (!o.isEmpty()) {
                afct.g(key, (Object)o);
                n += o.size();
            }
        }
        return new afcs(afct.c(), n);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        if (int1 >= 0) {
            final afct h = afcw.h();
            int i = 0;
            int n = 0;
            while (i < int1) {
                final Object object = objectInputStream.readObject();
                final int int2 = objectInputStream.readInt();
                if (int2 <= 0) {
                    final StringBuilder sb = new StringBuilder("Invalid value count ");
                    sb.append(int2);
                    throw new InvalidObjectException(sb.toString());
                }
                final afcm d = afcr.d();
                for (int j = 0; j < int2; ++j) {
                    d.h(objectInputStream.readObject());
                }
                h.g(object, (Object)d.g());
                n += int2;
                ++i;
            }
            try {
                afdh.a.N(this, h.c());
                afdh.b.M(this, n);
                return;
            }
            catch (final IllegalArgumentException ex) {
                throw (InvalidObjectException)new InvalidObjectException(ex.getMessage()).initCause(ex);
            }
        }
        final StringBuilder sb2 = new StringBuilder("Invalid key count ");
        sb2.append(int1);
        throw new InvalidObjectException(sb2.toString());
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        aesy.v((affl)this, objectOutputStream);
    }
    
    public final afcr a(final Object o) {
        afcr q;
        if ((q = (afcr)this.map.get(o)) == null) {
            q = afcr.q();
        }
        return q;
    }
}
