import java.io.ObjectOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public class afdx extends afdj implements affl
{
    private static final long serialVersionUID = 0L;
    private final transient afdu emptySet;
    
    public afdx(final afcw afcw, final int n) {
        super(afcw, n);
        this.emptySet = c(null);
    }
    
    public static afdv b() {
        return new afdv();
    }
    
    private static afdu c(final Comparator comparator) {
        Object o;
        if (comparator == null) {
            o = afgq.a;
        }
        else {
            o = afea.G(comparator);
        }
        return (afdu)o;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final Comparator comparator = (Comparator)objectInputStream.readObject();
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
                Object o;
                if (comparator == null) {
                    o = new afds();
                }
                else {
                    o = new afdy(comparator);
                }
                for (int j = 0; j < int2; ++j) {
                    ((afds)o).h(objectInputStream.readObject());
                }
                final afdu g = ((afds)o).g();
                if (g.size() != int2) {
                    new StringBuilder("Duplicate key-value pairs exist for key ").append(object);
                    throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(String.valueOf(object)));
                }
                h.g(object, (Object)g);
                n += int2;
                ++i;
            }
            try {
                afdh.a.N(this, h.c());
                afdh.b.M(this, n);
                afdw.a.N(this, c(comparator));
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
        final afdu emptySet = this.emptySet;
        Comparator a;
        if (emptySet instanceof afea) {
            a = ((afea)emptySet).a;
        }
        else {
            a = null;
        }
        objectOutputStream.writeObject(a);
        aesy.v((affl)this, objectOutputStream);
    }
    
    public final afdu a(final Object o) {
        return (afdu)agot.P((Object)this.map.get(o), (Object)this.emptySet);
    }
}
