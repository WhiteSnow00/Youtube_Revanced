import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.function.Function;
import j$.util.Map$_CC;
import java.util.function.BiFunction;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.SortedMap;
import java.util.Collection;
import java.io.Serializable;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afgm implements Map, Serializable, j$.util.Map
{
    public static final int a = 0;
    private transient afhk b;
    private transient afhk c;
    private transient affy d;
    
    public static afgj h() {
        return new afgj();
    }
    
    public static afgj i(final int n) {
        adzw.H(n, "expectedSize");
        return new afgj(n);
    }
    
    public static afgm j(final Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection)iterable).size();
        }
        else {
            size = 4;
        }
        final afgj afgj = new afgj(size);
        afgj.j(iterable);
        return afgj.c();
    }
    
    public static afgm k(final Map map) {
        if (map instanceof afgm && !(map instanceof SortedMap)) {
            final afgm afgm = (afgm)map;
            afgm.tp();
            return afgm;
        }
        return j(map.entrySet());
    }
    
    public static afgm l() {
        return afkc.b;
    }
    
    public static afgm m(final Object o, final Object o2) {
        adzw.F(o, o2);
        return (afgm)afkc.a(1, new Object[] { o, o2 });
    }
    
    public static afgm n(final Object o, final Object o2, final Object o3, final Object o4) {
        adzw.F(o, o2);
        adzw.F(o3, o4);
        return (afgm)afkc.a(2, new Object[] { o, o2, o3, o4 });
    }
    
    public static afgm o(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6) {
        adzw.F(o, o2);
        adzw.F(o3, o4);
        adzw.F(o5, o6);
        return (afgm)afkc.a(3, new Object[] { o, o2, o3, o4, o5, o6 });
    }
    
    public static afgm p(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8) {
        adzw.F(o, o2);
        adzw.F(o3, o4);
        adzw.F(o5, o6);
        adzw.F(o7, o8);
        return (afgm)afkc.a(4, new Object[] { o, o2, o3, o4, o5, o6, o7, o8 });
    }
    
    public static afgm q(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10) {
        adzw.F(o, o2);
        adzw.F(o3, o4);
        adzw.F(o5, o6);
        adzw.F(o7, o8);
        adzw.F(o9, o10);
        return (afgm)afkc.a(5, new Object[] { o, o2, o3, o4, o5, o6, o7, o8, o9, o10 });
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object compute(final Object o, final BiFunction biFunction) {
        return Map$_CC.$default$compute((Map)this, o, biFunction);
    }
    
    @Override
    public final Object computeIfAbsent(final Object o, final Function function) {
        return Map$_CC.$default$computeIfAbsent((Map)this, o, function);
    }
    
    @Override
    public final Object computeIfPresent(final Object o, final BiFunction biFunction) {
        return Map$_CC.$default$computeIfPresent((Map)this, o, biFunction);
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.get(o) != null;
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.e().contains(o);
    }
    
    public abstract affy d();
    
    public affy e() {
        affy d;
        if ((d = this.d) == null) {
            d = this.d();
            this.d = d;
        }
        return d;
    }
    
    @Override
    public final /* bridge */ Set entrySet() {
        return this.r();
    }
    
    @Override
    public boolean equals(final Object o) {
        return agpx.L(this, o);
    }
    
    @Override
    public final void forEach(final BiConsumer biConsumer) {
        Map$_CC.$default$forEach((Map)this, biConsumer);
    }
    
    public abstract afhk g();
    
    @Override
    public abstract Object get(final Object p0);
    
    @Override
    public final Object getOrDefault(Object value, final Object o) {
        value = this.get(value);
        if (value != null) {
            return value;
        }
        return o;
    }
    
    @Override
    public final int hashCode() {
        return agra.F((Set)this.r());
    }
    
    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public final /* bridge */ Set keySet() {
        return this.s();
    }
    
    @Override
    public final Object merge(final Object o, final Object o2, final BiFunction biFunction) {
        return Map$_CC.$default$merge((Map)this, o, o2, biFunction);
    }
    
    @Deprecated
    @Override
    public final Object put(final Object o, final Object o2) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final void putAll(final Map map) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object putIfAbsent(final Object o, final Object o2) {
        return Map$_CC.$default$putIfAbsent((Map)this, o, o2);
    }
    
    public final afhk r() {
        afhk b;
        if ((b = this.b) == null) {
            b = this.tn();
            this.b = b;
        }
        return b;
    }
    
    @Deprecated
    @Override
    public final Object remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean remove(final Object o, final Object o2) {
        return Map$_CC.$default$remove((Map)this, o, o2);
    }
    
    @Override
    public final Object replace(final Object o, final Object o2) {
        return Map$_CC.$default$replace((Map)this, o, o2);
    }
    
    @Override
    public final boolean replace(final Object o, final Object o2, final Object o3) {
        return Map$_CC.$default$replace((Map)this, o, o2, o3);
    }
    
    @Override
    public final void replaceAll(final BiFunction biFunction) {
        Map$_CC.$default$replaceAll((Map)this, biFunction);
    }
    
    public final afhk s() {
        afhk c;
        if ((c = this.c) == null) {
            c = this.g();
            this.c = c;
        }
        return c;
    }
    
    public abstract afhk tn();
    
    public aflu to() {
        throw null;
    }
    
    @Override
    public final String toString() {
        final int size = this.size();
        adzw.H(size, "size");
        final StringBuilder sb = new StringBuilder((int)Math.min(size * 8L, 1073741824L));
        sb.append('{');
        final Iterator<Entry<Object, Object>> iterator = this.entrySet().iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Entry<Object, V> entry = (Entry<Object, V>)iterator.next();
            if (n == 0) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            n = 0;
        }
        sb.append('}');
        return sb.toString();
    }
    
    public abstract void tp();
    
    @Override
    public /* bridge */ Collection values() {
        return this.e();
    }
    
    Object writeReplace() {
        return new afgl(this);
    }
}
